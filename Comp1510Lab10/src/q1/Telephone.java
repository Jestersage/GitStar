package q1;

import javax.swing.*;

public class Telephone {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        JFrame frame = new JFrame("Telephone");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new TelephonePanel());
        frame.pack();
        frame.setVisible(true);
    }

}
