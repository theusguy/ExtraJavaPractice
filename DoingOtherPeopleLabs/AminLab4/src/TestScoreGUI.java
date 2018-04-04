/*********************************************************************************
Name: Amin Khan
Course: CS125-0X
Lab #: Lab 4
Submission Date: 10:00 pm, Thursday (10/9)
Brief Description: GUI class with all the buttons and textfield and label objects
*********************************************************************************/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestScoreGUI extends JPanel implements ActionListener{
	private JButton submit, clear, exit;
	private JTextField first, second, third;
	
	public TestScoreGUI() {
		//indenting everyhting
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		//First Test SCore
		add(new JLabel("Enter first test score: "));
		first = new JTextField(3);
		this.add(first);
		//Second tets score
		add(new JLabel("Enter second test score: "));
		second = new JTextField(3);
		this.add(second);
		//Third Test Score
		add(new JLabel("Enter third test score: "));
		third = new JTextField(3);
		this.add(third);
		//JButtons
		submit = new JButton("Submit");
		clear = new JButton("Clear");
		exit = new JButton("Exit");
		this.add(submit);
		this.add(clear);
		this.add(exit);
	}
	
	//Listening for Buttons clicked
	public void actionPerformed(ActionEvent e) {	//Implement event handling
		   Object source = e.getSource();		//Get the source of the event
		   if (source == submit) {	//If okButton triggered the event
		       int firstTestScore = Integer.parseInt(first.getText());
		       int secondTestScore = Integer.parseInt(second.getText());
		       int thirdTestScore = Integer.parseInt(third.getText());
		       if (first.getText().equals("") || second.getText().equals("") || third.getText().equals("")) {//If password is correct
		    	   JOptionPane.showMessageDialog(null, "Entry error!\nPlease check scores and try again...");
					System.exit(0);
		    	   
				}
				else {
					TestScores score = new TestScores(firstTestScore, secondTestScore, thirdTestScore);
					this.setVisible(false);	//Remove password display
					JOptionPane.showMessageDialog(null, "Average Test Scores: " + score.average() + "\tGrade: " + score.grade());
			         
					}
				}
				if (source == exit) {			//Event from exit button
					JOptionPane.showMessageDialog(null, "Goodbye!\nPlease Exit to close window...");
					System.exit(0);
				} 
				if (source == clear) {
					this.first.setText("");
					this.second.setText("");
					this.third.setText("");
				}
			}

}
