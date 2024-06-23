package Swing;

import java.awt.*;
import javax.swing.*;

public class boxlayout {
    JFrame j;
    JPanel p;
    JButton btn[];

    boxlayout() {
        j = new JFrame();
        p = new JPanel();
        btn = new JButton[5];
        for (int i = 0; i < 5; i++) {
            btn[i] = new JButton("button " + i + 1);
            p.add(btn[i]);
            btn[i].setBounds(60,60,60,60);
        }

        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        j.add(p);
        j.setBounds(40, 40, 300, 300);
        // j.pack();
    }

    public static void main(String[] args) {
        boxlayout b = new boxlayout();
    }
}
