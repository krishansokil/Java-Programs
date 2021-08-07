import java.awt.*;
import java.awt.event.*;
public class ListExample
{
ListExample()
{
Frame f = new Frame("List Example");
List l1 = new List();
l1.setBounds(100,100,75,75);
l1.add("Item 1");
l1.add("Item 2");
l1.add("Item 3");
l1.add("Item 4");
l1.add("Item 5");
f.add(l1);
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
}
public static void main(String args[])
{
new ListExample();
}
}