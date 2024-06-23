package Swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class bargraph extends Canvas {
    String subj[] = { "English", "maths", "Nepali", "Science" };
    int marks[] = { 70, 90, 65, 100 };

    public void paint(Graphics g) {

        for (int i = 0; i < 4; i++) {
            g.setColor(Color.black);
            g.drawString(subj[i], 50, 50 * i + 50);
            g.setColor(Color.RED);
            g.fillRect(100, 50 * i + 50, marks[i], 40);
  
        }

    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Bar Graph");
        f.add(new bargraph());
        f.setVisible(true);
        f.setSize(600, 600);
        JButton j1=new JButton("click");
        JButton j2=new JButton("click");
        f.add(j1);
        f.add(j2);
        j1.setBounds(10,200,50,50);
        j2.setBounds(10,400,50,50);
        f.setLayout(new FlowLayout());
        j1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                f.setBackground(Color.red);
                f.setUndecorated(true);
            }
        });
        // j2.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent ae){
        //         f.setBackground(Color.black);
        //         f.setUndecorated(true);
        //     }
        // });

    }
}
