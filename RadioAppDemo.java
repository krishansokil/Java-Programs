import java.awt.*;
import java.awt.event.*;
class RadioApp extends Frame
{
Checkbox cb1,cb2,cb3,cb4,cb5;
Label l,ll;

RadioApp()
{
setSize(200,200);
setLayout(new FlowLayout());
CheckboxGroup cbg1 = new CheckboxGroup();
CheckboxGroup cbg2 = new CheckboxGroup();
cb1 = new Checkbox("C",cbg1,false);
cb2 = new Checkbox("CPP",cbg1,false);
cb3 = new Checkbox("Java",cbg2,false);
cb4 = new Checkbox("Oracle",cbg2,false);
cb5 = new Checkbox("Exit");
l = new Label();
ll = new Label();
add(l);
add(cb1);
add(cb2);
add(cb3);
add(cb4);
add(cb5);
add(ll);
cb1.addItemListener(new itl());
cb2.addItemListener(new itl());
cb3.addItemListener(new itl());
cb4.addItemListener(new itl());
cb5.addItemListener(new itl());
setVisible(true);
}

class itl implements ItemListener
{
public void itemStateChanged(ItemEvent ie)
{
Object obj = ie.getItemSelectable();
Checkbox cb = (Checkbox) obj;
if(cb.getState())
{
ll.setText("YOU HAVE SELECTED: "+cb.getLabel());
String lab = cb.getLabel();
if(lab.equalsIgnoreCase("exit"))
{
System.exit(0);
}
}
else
{
ll.setText("YOU HAVE SELECTED NONE");
}
}
}
};

class RadioAppDemo
{
public static void main(String args[])
{
new RadioApp();
}
};