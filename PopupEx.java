import java.awt.*;
import java.awt.event.*;
class PopupEx
{
PopupEx()
{
Frame f = new Frame("PopupMenu Example");
PopupMenu obj = new PopupMenu("Edit");
MenuItem cut = new MenuItem("Cut");
cut.setActionCommand("Cut");
MenuItem copy = new MenuItem("Copy");
copy.setActionCommand("Copy");
MenuItem paste = new MenuItem("Paste");
paste.setActionCommand("Paste");
obj.add(cut);
obj.add(copy);
obj.add(paste);
f.addMouseListener(new MouseAdapter()
{
public void mouseClicked(MouseEvent e)
{
obj.show(f , e.getX(), e.getY());
}
});
f.add(obj);
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
}

public static void main(String args[])
{
new PopupEx();
}
}