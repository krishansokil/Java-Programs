import java.awt.*;
import java.awt.event.*;
public class AwtDemo extends Frame
{
private Frame mainFrame;
private Label headerLabel;
private Label statusLabel;
private Panel controlPanel;

public AwtDemo()
{
prepareGUI();
}

public static void main(String args[])
{
AwtDemo f = new AwtDemo();
f.showButtonDemo();
}

private void prepareGUI()
{
mainFrame = new Frame("Java AWT");
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
statusLabel.setSize(300,100);
controlPanel = new Panel();
controlPanel.setLayout(new FlowLayout());
mainFrame.add(headerLabel);
mainFrame.add(statusLabel);
mainFrame.add(controlPanel);
mainFrame.setVisible(true);
}

public void showButtonDemo()
{
headerLabel.setText("HEADER");
Button okButton = new Button("Ok");
Button submitButton = new Button("Submit");
Button cancelButton = new Button("Cancel");
okButton.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
statusLabel.setText("Ok Button Clicked");
}
});
submitButton.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
statusLabel.setText("Submit Button Clicked");
}
});
cancelButton.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
statusLabel.setText("Cancel Button Clicked");
}
});
controlPanel.add(okButton);
controlPanel.add(submitButton);
controlPanel.add(cancelButton);
mainFrame.setVisible(true);
}
}