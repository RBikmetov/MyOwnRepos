import javax.swing.*;
public class HelloWorld extends JFrame
{
public static void main(String[] args)
{
new HelloWorld();
}
public HelloWorld()
{
JPanel panel1 = new JPanel();
JLabel label1 = new JLabel("Hell in the World !!!");
panel1.add(label1);
this.add(panel1);
this.setTitle("What's going on?");
this.setSize(500,500);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setVisible(true);
}
}
