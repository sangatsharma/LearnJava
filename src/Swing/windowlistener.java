package Swing;
import java.awt.*;
import java.awt.event.*;


public class windowlistener extends WindowAdapter {
    Frame f;
    windowlistener(){
        f= new Frame("Window");
        f.addWindowListener(this);
        f.setVisible(true);
        f.setSize(400,400);
        f.setLayout(new FlowLayout());
    }
    public void windowClosing(WindowEvent ae){
       System.exit(0);
    }  
    
 public static void main(String[] args) {
        new windowlistener();
    }


}
