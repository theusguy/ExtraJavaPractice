import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class QuizCardBuilder {
	
	private JTextArea question;
	private JTextArea answer;
	private ArrayList<QuizCard> cardList;
	private JFrame frame;
	//Build and displays the GUI for the program
	
	public static void main(String[] args) {
		QuizCardBuilder builder = new QuizCardBuilder();
		builder.go();
		
	}
	public void go() {
		frame = new JFrame("Quiz Card Builder"); 
		JPanel mainPanel = new JPanel();
		Font bigFont = new Font("sanserif", Font.BOLD, 24);
		question = new JTextArea(6,20); 
		question.setLineWrap(true); 
		question.setWrapStyleWord(true);
		question.setFont(bigFont);
		
		JScrollPane qScroller = new JScrollPane(question) ;
		qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS); 
		qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		answer = new JTextArea(6, 20);
		answer.setLineWrap(true);
		answer.setWrapStyleWord(true);
		answer.setFont(bigFont);
		
		JScrollPane aScroller = new JScrollPane(answer); 
		aScroller. setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		aScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		JButton nextButton = new JButton("Next Card");
		
		cardList = new ArrayList<QuizCard>();
		
		JLabel qLabel = new JLabel("Question:" );
		JLabel aLabel = new JLabel("Answer:");
		
		mainPanel.add(qLabel);
		mainPanel.add(qScroller);
		mainPanel.add(aLabel);
		mainPanel.add(aScroller);
		mainPanel.add(nextButton);
		nextButton.addActionListener(new NextCardListener());
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem newMenultem = new JMenuItem("New");
		JMenuItem saveMenultem = new JMenuItem("Save"); 
		newMenultem.addActionListener(new NewMenuListener());
		
		saveMenultem.addActionListener(new SaveMenuListener()); 
		fileMenu.add(newMenultem);
		fileMenu.add(saveMenultem);
		menuBar.add(fileMenu);
		frame.setJMenuBar(menuBar);
		frame.getContentPane() .add (BorderLayout.CENTER, mainPanel);
		frame.setSize(500,600);
		frame.setVisible(true);
	}
	
	//inner class listening for user clicking the next card button
	private class NextCardListener implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
			//add the current card to the list and clear the text areas
			QuizCard card = new QuizCard(question.getText(), answer.getText());
			cardList.add(card);
			clearCard();
		}
		
	}
	
	//inner class listening for user clicking 'Save' to save all the cards
	private class SaveMenuListener implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
			//bring up a file dialog
			//let the user name and save the set 
			QuizCard card = new QuizCard(question.getText(), answer.getText());
			cardList.add(card);
			
			//
			JFileChooser fileSave = new JFileChooser();
			fileSave.showSaveDialog(frame);
			saveFile(fileSave.getSelectedFile());
			
		}
	}
	
	//inner class listening for user clicking 'New' to start a new list
	private class NewMenuListener implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
			//clear out the card list. and clear out the text areas
			cardList.clear();
			clearCard();
		}
	}
	
	private void clearCard() {
		question.setText("");
		answer.setText("");
		question.requestFocus();
	}
	
	//does the job of actually saving when SaveMenuListener takes action
	private void saveFile(File file) {
		//iterate through the list of cards, and write each one out to a text file
		//in a parseable way (in other words, with clear separations between parts)
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			
			for (QuizCard card: cardList) {
				writer.write(card.getQuestion() + "/");
				writer.write(card.getAnswer() + "\n");
			}
			writer.close();
		} catch (IOException ex) {
			System.out.println("couldn't write the cardList out");
			ex.printStackTrace();
		}
	}

}
