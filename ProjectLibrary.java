import javax.swing.*;
import java.io.*;
import java.sql.*;
import javax.swing.JPopupMenu;
import java.awt.*;
import java.awt.event.*;
//import com.sun.javax.swing.plaf.motif.MotifLookAndFeel;

public class ProjectLibrary extends JFrame
{
JTextField id,phno,name,add,city,padd,eadd,class1,shift,progress,date;
JTextField bookTF,authorTF,priceTF,bcodeTF;
JTextField cdcodeTF,cdtitleTF,cdisbnTF,cdeditionTF,cdpubTF;
Container c;
JButton search,save,delete,exit,update;
JButton searBook,saveNow,update1;
JButton cdsearch,cdsave,cddelete,cdexit,cdupdate;
JLabel cdlogo,cdcode,cdtitle,cdisbn,cdedit,cdpub;
JOptionPane jp = new JOptionPane();
JMenuBar menuBar,menuBar1;
JMenu menu1,menu2;
JMenuItem menuItemN,menuItemB,menuItemC,menuItemH,menuItemA,menuItemE;
Cursor cur;

public ProjectLibrary()
{
super("Library Record System");
c = getContentPane();
c.setBackground(new Color(14,58,119));
c.setLayout(null);
setBounds(0,0,850,590);
setFont(new Font("verdana",3,14));
cur = new Cursor(Cursor.CROSSHAIR_CURSOR);
setCursor(cur);
ImageIcon coll = new ImageIcon("collicon.gif");
JLabel LogoColl = new JLabel(coll);
menuBar = new JMenuBar();
menu1 = new JMenu("Library");
menu1.setBackground(Color.white);
menu1.setMnemonic('L');
menu2 = new JMenu("Help");
menu2.setBackground(Color.white);
menu2.setMnemonic('H');

menuItemN = new JMenuItem("New",new ImageIcon("NEW.GIF"));
menuItemN.setBackground(Color.white);
menuItemN.setMnemonic('N');
menuItemB = new JMenuItem("Books",new ImageIcon("b.gif"));
menuItemB.setBackground(Color.white);
menuItemB.setMnemonic('B');
menuItemC = new JMenuItem("CD's",new ImageIcon("cd.PNG"));
menuItemC.setBackground(Color.white);
menuItemC.setMnemonic('C');
menuItemE = new JMenuItem("Exit",new ImageIcon("Exit.PNG"));
menuItemE.setBackground(Color.white);
menuItemE.setMnemonic('E');
menuItemH = new JMenuItem("Help library",new ImageIcon("help.gif"));
menuItemH.setBackground(Color.white);
menuItemH.setMnemonic('E');
menuItemA = new JMenuItem("About LRS");
setJMenuBar(menuBar);

JLabel lDate  = new JLabel("Issue Of Date: ");
lDate.setForeground(Color.white);
JLabel ph = new JLabel("Enter Phone Number: ");
ph.setForeground(Color.white);
JLabel lname = new JLabel("Student's Name: ");
lname.setForeground(Color.white);
JLabel address = new JLabel("Student's Address: ");
address.setForeground(Color.white);
JLabel lid = new JLabel("Book Code");
lid.setForeground(Color.white);
JLabel lcity = new JLabel("City");
lcity.setForeground(Color.white);
JLabel pad = new JLabel("Permanent Address");
pad.setForeground(Color.white);

JLabel leadd = new JLabel("Email Address");
leadd.setForeground(Color.white);
JLabel lclass = new JLabel("Class");
lclass.setForeground(Color.white);
JLabel lshift = new JLabel("Shift");
lshift.setForeground(Color.white);
JLabel lprogress = new JLabel("Progress");
lprogress.setForeground(Color.white);
ImageIcon next = new ImageIcon("next.gif");
JLabel next1 = new JLabel(next);
ImageIcon previous = new ImageIcon("Back.gif");
JLabel previous1 = new JLabel(previous);

ImageIcon background = new ImageIcon("backg.jpg");
JLabel img = new JLabel(background);

ImageIcon college = new ImageIcon("Movie1.PNG");
JLabel colLogo = new JLabel(college);

ImageIcon LineStraight = new ImageIcon("lineh.gif");
JLabel Line = new JLabel(LineStraight);

date = new JTextField();
date.setForeground(Color.black);
date.setBackground(Color.white);

phno = new JTextField();
phno.setForeground(Color.black);
phno.setBackground(Color.white);

name = new JTextField();
name.setForeground(Color.black);
name.setBackground(Color.white);

add = new JTextField();
add.setForeground(Color.black);
add.setBackground(Color.white);

eadd = new JTextField();
eadd.setForeground(Color.black);
eadd.setBackground(Color.white);

city = new JTextField();
city.setForeground(Color.black);
city.setBackground(Color.white);

padd = new JTextField();
padd.setForeground(Color.black);
padd.setBackground(Color.white);

id = new JTextField();
id.setForeground(Color.black);
id.setBackground(Color.white);

class1 = new JTextField();
class1.setForeground(Color.black);
class1.setBackground(Color.white);

shift = new JTextField();
shift.setForeground(Color.black);
shift.setBackground(Color.white);

progress = new JTextField();
progress.setForeground(Color.black);
progress.setBackground(Color.white);

search = new JButton("Search",new ImageIcon("search.gif"));
search.setBackground(Color.white);
search.setForeground(Color.pink);
save = new JButton("Save",new ImageIcon("Save.gif"));
save.setBackground(Color.white);
save.setForeground(Color.pink);
delete = new JButton("Delete",new ImageIcon("remove.gif"));
delete.setBackground(Color.white);
delete.setForeground(Color.pink);
exit = new JButton("Exit",new ImageIcon("EXIT.PNG"));
exit.setBackground(Color.white);
exit.setForeground(Color.pink);
update = new JButton("Update",new ImageIcon("update.gif"));
update.setBackground(Color.white);
update.setForeground(Color.pink);

search.setToolTipText("Search the record");
save.setToolTipText("Save the record");
delete.setToolTipText("Delete the record");
exit.setToolTipText("Exit from the library");
update.setToolTipText("Update the record");

lDate.setBounds(80,135,670,150);
LogoColl.setBounds(380,20,670,150);
lid.setBounds(80,240,150,20);
ph.setBounds(400,245,150,20);
lname.setBounds(80,285,150,20);
address.setBounds(400,290,150,20);
lcity.setBounds(400,330,150,20);
//pad.setBounds(400,375,150,20);
leadd.setBounds(400,415,150,20);
lclass.setBounds(80,330,150,20);
lshift.setBounds(80,380,150,20);
lprogress.setBounds(80,415,150,20);
next1.setBounds(650,478,180,54);
previous1.setBounds(10,478,190,54);
img.setBounds(90,100,20,40);
colLogo.setBounds(3,0,790,142);
Line.setBounds(2,2,48,1000);

date.setBounds(220,190,152,26);
id.setBounds(220,235,152,26);
phno.setBounds(550,245,152,26);
name.setBounds(220,280,152,26);
add.setBounds(550,290,152,26);
city.setBounds(550,330,152,26);
padd.setBounds(550,370,152,26);
eadd.setBounds(550,410,152,26);
class1.setBounds(220,325,152,26);
shift.setBounds(220,370,152,26);
progress.setBounds(220,415,152,26);
search.setBounds(160,490,105,30);
save.setBounds(270,490,90,30);
delete.setBounds(363,490,95,30);
update.setBounds(460,490,110,30);
exit.setBounds(575,490,95,30);

menu1.add(menuItemN);
menu1.add(menuItemB);
menu1.add(menuItemC);
menu1.add(menuItemE);
menuBar.add(menu1);

menu2.add(menuItemH);
menu2.add(menuItemA);
menuBar.add(menu2);

c.add(search);
c.add(save);
c.add(delete);
c.add(exit);
c.add(update);
c.add(LogoColl);
c.add(lDate);
c.add(ph);
c.add(lname);
c.add(address);
c.add(lid);
c.add(lcity);
//c.add(pad);
c.add(leadd);
c.add(lclass);
c.add(lshift);
c.add(lprogress);
c.add(next1);
c.add(previous1);
c.add(img);
c.add(colLogo);
c.add(date);
c.add(phno);
c.add(name);
c.add(add);
c.add(city);
c.add(padd);
c.add(id);
c.add(eadd);
c.add(class1);
c.add(progress);
c.add(shift);
c.add(Line);
setVisible(true);
}

public static void main(String args[])
{
	ProjectLibrary p4 = new ProjectLibrary();
}
}