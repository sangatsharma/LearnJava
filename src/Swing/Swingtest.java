package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Swingtest implements ActionListener
,FocusListener 
{
    JFrame frame = new JFrame("Click here");

    JLabel j1 = new JLabel("Username :");
    JTextField t1 = new JTextField(10);
    JButton btn = new JButton("Click Me");

    Swingtest() {
        frame.setLayout(new FlowLayout());
        frame.add(j1);
        frame.add(t1);
        frame.add(btn);
        frame.setBounds(300, 300, 500, 500);
        btn.addActionListener(this);
        t1.addFocusListener(this);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btn) {
            String t2 = t1.getText();
            t1.setText(t2.toUpperCase());
            t1.setBackground(Color.red);
        }
    }
    public void focusGained(FocusEvent ae){
        Font a=new Font("TimesRoman",Font.ITALIC,10);
       t1.setFont(a);
       t1.setForeground(Color.blue);
    
    }
    public void focusLost(FocusEvent ae){
        t1.setForeground(Color.black);
    }

    public static void main(String[] args) {
        Swingtest obj1 = new Swingtest();
    }

}
