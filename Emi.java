import java.awt.*;
import java.awt.event.*;
public class Emi extends Frame implements ActionListener
{
Label l,l1,l2,l3;
TextField tf1,tf2,tf3,tf4;
Button b1;

Emi()
{
l = new Label("Principle");
l.setBounds(50,50,150,20);
tf1 = new TextField();
tf1.setBounds(200,50,150,20);
l1 = new Label("Rate");
l1.setBounds(50,100,150,20);
tf2 = new TextField();
tf2.setBounds(200,100,150,20);
l2 = new Label("Time");
l2.setBounds(50,150,150,20);
tf3 = new TextField();
tf3.setBounds(200,150,150,20);
l3 = new Label("EMI");
l3.setBounds(50,200,150,20);
tf4 = new TextField();
tf4.setBounds(200,200,150,20);
tf4.setEditable(false);
b1 = new Button("Click");
b1.setBounds(50,300,50,50);
b1.addActionListener(this);
add(l);
add(l1);
add(l2);
add(l3);
add(tf1);
add(tf2);
add(tf3);
add(tf4);
add(b1);
setSize(300,300);
setLayout(null);
setVisible(true);
}

public void actionPerformed(ActionEvent e)
{
String s1 = tf1.getText();
String s2 = tf2.getText();
String s3 = tf3.getText();
int p = Integer.parseInt(s1);
int r = Integer.parseInt(s2);
int t = Integer.parseInt(s3);
int d=0;
if(e.getSource()==b1)
{
d=p*r*t/100;
}
String result = String.valueOf(d);
tf4.setText(result);
}

public static void main(String args[])
{
new Emi();
}
}