import java.awt.*;
import java.awt.event.*;
public class Calculator extends Frame 
{
Frame mainFrame;	
TextField tf;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24;
Calculator()
{
TextField tf = new TextField();
tf.setBounds(50,50,200,80);

b1 = new Button("%");
b1.setBounds(50,130,50,50);
b1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
tf.setText("1/100");
}
});
b2 = new Button("UR");
b2.setBounds(100,130,50,50);
b3 = new Button("x^2");
b3.setBounds(150,130,50,50);
b4 = new Button("1/x");
b4.setBounds(200,130,50,50);
b5 = new Button("CE");
b5.setBounds(50,180,50,50);
b5.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
tf.setText("0");
}
});
b6 = new Button("C");
b6.setBounds(100,180,50,50);
b6.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
tf.setText("0");
}
});
b7 = new Button("X");
b7.setBounds(150,180,50,50);
b8 = new Button("/");
b8.setBounds(200,180,50,50);
b8.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
tf.setText("/");
}
});
b9 = new Button("7");
b9.setBounds(50,230,50,50);
b9.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
tf.setText("7");
}
});
b10 = new Button("8");
b10.setBounds(100,230,50,50);
b10.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
tf.setText("8");
}
});
b11 = new Button("9");
b11.setBounds(150,230,50,50);
b11.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
tf.setText("9");
}
});
b12 = new Button("*");
b12.setBounds(200,230,50,50);
b12.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
tf.setText("*");
}
});
b13 = new Button("4");
b13.setBounds(50,280,50,50);
b13.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
tf.setText("4");
}
});
b14 = new Button("5");
b14.setBounds(100,280,50,50);
b14.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
tf.setText("5");
}
});
b15 = new Button("6");
b15.setBounds(150,280,50,50);
b15.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
tf.setText("6");
}
});
b16 = new Button("-");
b16.setBounds(200,280,50,50);
b16.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
tf.setText("-");
}
});
b17 = new Button("1");
b17.setBounds(50,330,50,50);
b17.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
tf.setText("1");
}
});
b18 = new Button("2");
b18.setBounds(100,330,50,50);
b18.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
tf.setText("2");
}
});
b19 = new Button("3");
b19.setBounds(150,330,50,50);
b19.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
tf.setText("3");
}
});
b20 = new Button("+");
b20.setBounds(200,330,50,50);
b20.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
tf.setText("+");
}
});
b21 = new Button("+-");
b21.setBounds(50,380,50,50);
b22 = new Button("0");
b22.setBounds(100,380,50,50);
b22.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
tf.setText("0");
}
});
b23 = new Button(".");
b23.setBounds(150,380,50,50);
b23.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
tf.setText(".");
}
});
b24 = new Button("=");
b24.setBounds(200,380,50,50);
add(tf);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);
add(b7);
add(b8);
add(b9);
add(b10);
add(b11);
add(b12);
add(b13);
add(b14);
add(b15);
add(b16);
add(b17);
add(b18);
add(b19);
add(b20);
add(b21);
add(b22);
add(b23);
add(b24);
setSize(300,300);
setLayout(null);
setVisible(true);
mainFrame.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent windowEvent)
{
System.exit(0);
}
});
}

public static void main(String args[])
{
new Calculator();
}
}

