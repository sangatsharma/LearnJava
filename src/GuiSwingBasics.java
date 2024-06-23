import javax.swing.JOptionPane;
public class GuiSwingBasics {
    public static void main(String[] args){
     String name=JOptionPane.showInputDialog("enter your name: ");
        JOptionPane.showMessageDialog(null,"your name is: "+name, "Info", 1);
    }
}
