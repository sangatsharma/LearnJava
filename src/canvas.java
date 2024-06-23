import java.awt.*;
import java.lang.*;

import javax.swing.JFrame;
public class canvas extends Canvas {
    int i=0;
    public void paint(Graphics g)
    {
        g.drawString("i = "+i, 100, 100);
     
        try{
            Thread.sleep(1000);
        }catch(InterruptedException ex){}
     
        i++;
        repaint();
    }
public static void main(String[] args) {
    JFrame j=new JFrame();
    j.add(new canvas());
    j.setVisible(true);
    j.setSize(500,500);
}
}
