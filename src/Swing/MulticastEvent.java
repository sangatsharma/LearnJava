package Swing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MulticastDemo implements ActionListener
{
	JFrame frame;
    static int count=0;
    JButton newWindow;
    JButton closeAll;
    public static void main(String[] args)
    {
        MulticastDemo obj=new MulticastDemo();
    }
    MulticastDemo()
    {
        frame=new JFrame("Main Window");
        newWindow=new JButton("New Window");
        closeAll=new JButton("Close All Windows");

        frame.setVisible(true);
        frame.setSize(300,300);
        frame.setLayout(new FlowLayout());
        
        frame.add(newWindow);
        frame.add(closeAll);

        newWindow.addActionListener(this);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        CloseFrame f=new CloseFrame();
        count++;
        f.setTitle("Window "+count);
        f.setVisible(true);
        f.setSize(250,150);
        f.setLocation(40*count,40*count);
        closeAll.addActionListener(f);        
    }
    
}
class CloseFrame extends JFrame implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        setVisible(false);
    }
}