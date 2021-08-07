import java.awt.*;
import java.awt.event.*;
import java.awt.Color.*;
public class ActionListenerExample
{
public static void main(String args[])
{
Frame f = new Frame("ActionListener Example");
final TextField tf = new TextField();
tf.setBounds(50,50,150,20);
Button b = new Button("click here");
b.setBounds(50,100,60,30);
b.setBackground(Color.black);
b.setForeground(Color.yellow);
b.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
tf.setText("Welcome to Krishan");
}
});
f.add(b);
f.add(tf);
f.setSize(400,400);
f.setBackground(Color.orange);

f.setLayout(null);
f.setVisible(true);
}
}