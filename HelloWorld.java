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
JLabel label1 = new JLabel("Привет, мир; это моя первая Java-программа на Ubuntu Linux");
panel1.add(label1);
this.add(panel1);
this.setTitle("Привет, мир");
this.setSize(500,500);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setVisible(true);
}
}