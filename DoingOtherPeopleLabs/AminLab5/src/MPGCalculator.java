import javax.swing.*;
import java.awt.event.*;

public class MPGCalculator
{
    public static void main (String[] args)
    {
        MPGCalculatorDemo kc = new MPGCalculatorDemo();

    }
}

class MPGCalculatorDemo extends JFrame

{
    private JPanel panel;
    private JLabel messageLabel_gallons;
    private JLabel messageLabel_miles;
    private JTextField gallonsTextField;
    private JTextField milesTextField;
    private JButton mpgButton;
    private final int WINDOW_WIDTH = 400;
    private final int WINDOW_HEIGHT = 400;

    // constructor

    public MPGCalculatorDemo ()

    {
        setTitle ("MPG Calculator");

        setSize (WINDOW_WIDTH, WINDOW_HEIGHT);

        //specify what happens when the close button is clicked

        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

        buildPanel ();

        //add the panel to the frame's content pane.
        add (panel);

        //display the window
        setVisible(true);

    }

    //the buildpanel method adds a lable
    //text field, and a button to a panel

    private void buildPanel ()

    {
        //create a lable to display instructions
        messageLabel_gallons =
        new JLabel ("Enter number of gallons");
        gallonsTextField = new JTextField (10);


        //create label to display instructinos
        messageLabel_miles =
        new JLabel ("Enter number of miles");
        milesTextField = new JTextField (10);

        //create a button with the captions "Calculate".

        mpgButton = new JButton ("Calculate MPG");
        mpgButton.addActionListener (new CalculateMPG());
        //adding items to panel

        panel = new JPanel ();
        panel.add (messageLabel_gallons);
        panel.add (gallonsTextField);
        panel.add (messageLabel_miles);
        panel.add (milesTextField);
        panel.add (mpgButton);

    }

    public class CalculateMPG implements ActionListener
    {
        public void actionPerformed (ActionEvent e)

        {
        String inputone;
        String inputtwo;
        double mpg;

        //inpttting data

        inputone = gallonsTextField.getText ();
        inputtwo = milesTextField.getText ();
        mpg = (Double.parseDouble (inputtwo)
        /Double.parseDouble (inputone));

        //outputting using Messagebox

        JOptionPane.showMessageDialog (null, "Mpg of Car is:" + mpg);

        }

    }

}