package Swing;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField; 
import javax.swing.*;
public class panel {
 
 public static void main(String[] args) { 
 // Creating instance of JFrame
 
 JFrame frame = new JFrame("Swing Example");
 JPanel panel = new JPanel(); 

 // Setting the width and height of frame
 frame.setSize(3500, 200);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 /*Creating panel. Inside panels we can add text fields, buttons 
and other components. */
 
 // adding panel to frame
 frame.add(panel);
/* calling user defined method for adding components to the panel. */
 placeComponents(panel);
 // Setting the frame visibility to true
 frame.setVisible(true);
 }
 private static void placeComponents(JPanel panel) {
 panel.setLayout(null);
 // Creating JLabel
 JLabel userLabel = new JLabel("User");
 /*This method specifies the location and size of component. 
setBounds(x, y, width, height) here (x,y) are cordinates from the top 
left corner and remaining two arguments are the width and height of the 
component. */
 userLabel.setBounds(10,20,80,25);
 panel.add(userLabel);
 /* Creating text field where user is supposed to enter user 
name. */
 JTextField userText = new JTextField(20);
 userText.setBounds(100,20,165,25);
 panel.add(userText);
 // Same process for password label and text field.
 JLabel passwordLabel = new JLabel("Password");
 passwordLabel.setBounds(10,50,80,25);
 panel.add(passwordLabel);
 JPasswordField passwordText = new JPasswordField(20);
 passwordText.setBounds(100,50,165,25);
 panel.add(passwordText);
 // Creating login button
 JButton loginButton = new JButton("login");
 loginButton.setBounds(10, 80, 80, 25);
 panel.add(loginButton);
 
 }

}
