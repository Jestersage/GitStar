package q1;

import java.awt.*;
import javax.swing.*;
/**
 * Layout a functionless GUI like telephone leypad with a title
 * Illustrate use of borderlayout and grid layout
 * @author George
 *
 */
public class TelephonePanel extends JPanel{

    public TelephonePanel(){

        //set borderlayout for this panel
        setLayout (new BorderLayout());
        setBackground(Color.gray);

        //create a JLabel with "Your telephone" title
        JLabel title = new JLabel("Your telephone");
        JPanel titlePanel = new JPanel();
        titlePanel.setLayout (new FlowLayout());

        //add title label to north of this panel
        titlePanel.add(title);
        add (titlePanel, BorderLayout.NORTH);

        //create panel to hold keypad and give it a 4x3 Grid layout
        JPanel keypad = new JPanel();

        keypad.setLayout(new GridLayout(4,3));

        //add buttons representign keys
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton bStar = new JButton("*");
        JButton b0 = new JButton("0");
        JButton bSharp = new JButton("#");

        keypad.add (b1);
        keypad.add (b2);
        keypad.add (b3);
        keypad.add (b4);
        keypad.add (b5);
        keypad.add (b6);
        keypad.add (b7);
        keypad.add (b8);
        keypad.add (b9);
        keypad.add (bStar);
        keypad.add (b0);
        keypad.add (bSharp);
        //add keypanel to this panel

        add (keypad, BorderLayout.CENTER);
    }


}
