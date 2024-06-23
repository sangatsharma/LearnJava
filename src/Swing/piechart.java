package Swing;

import java.awt.*;
import javax.swing.*;

public class piechart extends Canvas {
    public void paint(Graphics g) {
        String subj[] = { "maths", "science", "nepali", "english" };
        int marks[] = { 50, 70, 80, 40 };
        int x = 50, y = 50, w = 300, h = 300;
        int startingangle = 0;
        int degree = 0;
        int percentage[] = new int[5];
        int total = marks[0] + marks[1] + marks[2] + marks[3];
        for (int i = 0; i < 4; i++)
            percentage[i] = marks[i] * 360 / total;

        // 1st
        g.setColor(Color.blue);
        g.drawString(subj[0], 50, 400);
        g.fillArc(x, y, w, h, startingangle, percentage[0]);

        // 2nd
        startingangle += percentage[0];
        g.setColor(Color.black);
        g.drawString(subj[1], 100, 400);
        g.fillArc(x, y, w, h, startingangle, percentage[1]);

        startingangle += percentage[1];
        g.setColor(Color.yellow);
        g.drawString(subj[2], 200, 400);
        g.fillArc(x, y, w, h, startingangle, percentage[2]);

        startingangle += percentage[2];
        g.setColor(Color.pink);
        g.drawString(subj[3], 300, 400);
        g.fillArc(x, y, w, h, startingangle, percentage[3]);

    }
    public static void main(String[] args) {
        JFrame j=new JFrame();
        j.add(new piechart());
        j.setVisible(true);
        j.setSize(800,800);
    }
}
