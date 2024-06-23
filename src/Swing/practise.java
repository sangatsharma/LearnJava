package Swing;

import javax.swing.*;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.*;

public class practise implements ActionListener {
    JFrame f;
    JButton btn;

    JTextField j1, j2;

    practise() {
        f = new JFrame("odd even");
        j1 = new JTextField(20);
        j2 = new JTextField(20);
        btn = new JButton("Click");
        j1.setSize(40, 200);
        j2.setSize(40, 200);
        btn.setSize(40, 200);
        f.add(j1);
        f.add(j2);
        f.add(btn);
        f.setVisible(true);
        f.setSize(900, 900);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());
        btn.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae) {
        String st = j1.getText();
        int s = Integer.parseInt(st);
        if (s % 2 == 0) {
            j2.setText("Even number");
        } else {
            j2.setText("Odd number");
        }
        f.getContentPane().setBackground(Color.red);
        f.setUndecorated(true);
    }

    public static void main(String[] args) {
        new practise();
    }
}
