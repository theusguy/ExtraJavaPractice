//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//public class ButtonPanel extends JPanel implements ActionListener{
//	private JButton submit, clear, exit;
//	
//	public ButtonPanel () {
//		submit = new JButton("Submit");
//		clear = new JButton("Clear");
//		exit = new JButton("Exit");
//		this.add(submit);
//		this.add(clear);
//		this.add(exit);
//		submit.addActionListener(this);
//		clear.addActionListener(this);
//		exit.addActionListener(this);
//	}
//	
//	public void actionPerformed(ActionEvent e) {
//		//Obtain source of triggered event
//		Object source = e.getSource();
//		if (source == submit) {
//			
//		} else if (source == clear){
//			
//		} else if (source == exit) {
//			JOptionPane.showMessageDialog(null, "Goodbye!\nPlease Exit to close window...");
//			System.exit(0);
//		}
//	}
//}
