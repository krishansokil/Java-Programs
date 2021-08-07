import java.awt.*;
class First extends Frame
{
First()
{
Button b = new Button("click me");
b.setBounds(100,80,80,30);
add(b);
setSize(300,300);
setLayout(null);
setVisible(true);
}
public static void main(String args[])
{
First f = new First();
}
}