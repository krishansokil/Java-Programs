import java.awt.*;
import java.awt.event.*;
public class StudentEx extends Frame
{
Label l,l1,l2,l3,l4,l5;
TextField tf,tf1,tf2,tf3;
Checkbox cb1,cb2;

StudentEx()
{
l = new Label("Student Info");
l.setBounds(120,50,100,20);
l1 = new Label("First Name");
l1.setBounds(50,100,100,20);
l2 = new Label("Last Name");
l2.setBounds(50,150,100,20);
l3 = new Label("Roll no.");
l3.setBounds(50,200,100,20);
l4 = new Label("Gender");
l4.setBounds(50,250,100,20);
l5 = new Label("Course");
l5.setBounds(50,300,100,20);
TextField tf = new TextField();
tf.setBounds(150,100,150,20);
tf.setEditable(true);
TextField tf1 = new TextField();
tf1.setBounds(150,150,150,20);
tf1.setEditable(true);
TextField tf2 = new TextField();
tf2.setBounds(150,200,150,20);
tf2.setEditable(true);
CheckboxGroup cbg = new CheckboxGroup();
cb1 = new Checkbox("M",cbg,false);
cb2 = new Checkbox("F",cbg,false);
cb1.setBounds(150,250,100,20);
cb2.setBounds(250,250,100,20);
List li = new List();
li.setBounds(150,300,100,20);
li.add("BTECH");
li.add("MTECH");
li.add("BCA");
li.add("MCA");
li.add("BCOM");
li.add("MCOM");
Button b = new Button("Submit");
b.setBounds(50,400,100,20);
Button b1 = new Button("Cancel");
b1.setBounds(200,400,100,20);
b1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
System.exit(0);
}
});
add(l);
add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(tf);
add(tf1);
add(tf2);
add(cb1);
add(cb2);
add(li);
add(b);
add(b1);
setSize(300,300);
setLayout(null);
setVisible(true);
}

public static void main(String args[])
{
new StudentEx();
}
}