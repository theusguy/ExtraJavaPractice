/*********************************************************************************
Name: Amin Khan
Course: CS125-0X
Lab #: Lab 4
Submission Date: 10:00 pm, Thursday (10/9)
Brief Description: Frame for GUI 
*********************************************************************************/

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame{
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension d = tk.getScreenSize();
	
	public Frame () {
		setTitle("Test Scores GUI");
		setSize(300, 200);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
//		centerWindow(this);
		JPanel panel = new TestScoreGUI();
		this.add(panel);
	}
	
	public void centerWindow(JFrame frame) {
		int centeredWidth = ((int)d.getWidth() - frame.getWidth()/2);
		int centeredHeight = ((int)d.getHeight() - frame.getHeight()/2);
		setLocation(centeredWidth, centeredHeight);
	}
	
}
