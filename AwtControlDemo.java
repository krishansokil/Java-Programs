import java.awt.*;
import java.awt.event.*;
public class AwtControlDemo extends Frame
{
private Frame mainFrame;
private Label headerLabel;
private Label statusLabel;
private Panel controlPanel;
public AwtControlDemo()
{
prepareGUI();
}
public static void main(String args[])
{
AwtControlDemo awtControlDemo = new AwtControlDemo();
awtControlDemo.showButtonDemo();
}
private void prepareGUI()
{
mainFrame = new Frame("Java AWT Examples");
mainFrame.setSize(400,400);
mainFrame.setLayout(new GridLayout(3,1));
mainFrame.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent windowEvent)
{
System.exit(0);
}
});
headerLabel = new Label();
headerLabel.setAlignment(Label.CENTER);
statusLabel = new Label();
statusLabel.setSize(350,100);
controlPanel = new Panel();
controlPanel.setLayout(new FlowLayout());
mainFrame.add(headerLabel);
mainFrame.add(controlPanel);
mainFrame.add(statusLabel);
mainFrame.setVisible(true);
}
private void showButtonDemo()
{
headerLabel.setText("Control in action: Button");
Button okButton = new Button("ok");
Button submitButton = new Button("submit");
Button cancelButton = new Button("cancel");
okButton.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
{
statusLabel.setText("SOME EXPA");
}
}
});
submitButton.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
statusLabel.setText("Monu is bad boy");
}
});
cancelButton.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
statusLabel.setText("Cancel Button clicked.");
}
});
controlPanel.add(okButton);
controlPanel.add(submitButton);
controlPanel.add(cancelButton);
mainFrame.setVisible(true);
}
}

