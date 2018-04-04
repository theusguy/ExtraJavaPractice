import javax.swing.*;

public class SimpleGUI1 {
	public static void main(String[] args) {
		//Making a frame and button
		JFrame frame = new JFrame();
		JButton button = new JButton("click me");
		
		//Making sure program ends once window is closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//adding the button object onto jframes content pane
		frame.getContentPane().add(button);
		
		//customizing frame to 300 by 300 px
		frame.setSize(300, 300);
		
		//making it visible
		frame.setVisible(true);
	}

}
