package Swing;

import java.awt.*;
import java.util.*;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class digitalclock extends Canvas/* Applet */ {
    Calendar c;
    int h, m, s;
    String time;
    JLabel l;

    digitalclock() {
        // void init(){
        c = Calendar.getInstance();
        h = c.get(Calendar.HOUR);
        m = c.get(Calendar.MINUTE);
        s = c.get(Calendar.SECOND);
        time = h + ":" + m + ":" + s;
        // }
        start();
    }

    public void start() {
        Thread t = new Thread() {
            public void run() {
                while (true) {
                    try {
                        sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    repaint();
                }
            }
        };
        t.start();
    }

    public void paint(Graphics g) {
        c = Calendar.getInstance();
        h = c.get(Calendar.HOUR);
        m = c.get(Calendar.MINUTE);
        s = c.get(Calendar.SECOND);
        time = h + ":" + m + ":" + s;
        g.setColor(Color.black);
        g.drawString(time, 50, 50);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.add(new digitalclock());
        f.setVisible(true);
        f.setBounds(30, 30, 600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
