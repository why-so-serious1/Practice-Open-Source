import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Swingn2 implements ActionListener
{
JFrame jf;
JTextArea jtg;
JMenuBar jmb;
JMenu jm1,jm2,jm3;
JMenuItem jmi1,jmi2,jmi3,jmi4,jmi5,jmi6;
Swingn2()
{
jf=new JFrame("NOTEPAD");




jtg=new JTextArea();
jtg.setBounds(0,0,500,500);
jmb=new JMenuBar();
jm1=new JMenu("file");
jm2=new JMenu("edit");
jm3=new JMenu("help");
jmi1=new JMenuItem("new");
jmi2=new JMenuItem("open");
jmi3=new JMenuItem("exit");
jmi4=new JMenuItem("cut");
jmi5=new JMenuItem("copy");
jmi6=new JMenuItem("paste");







jm1.add(jmi1);
jm1.add(jmi2);
jm1.add(jmi3);
jm2.add(jmi4);
jm2.add(jmi5);
jm3.add(jmi6);
jf.add(jtg);
jmb.add(jm1);
jmb.add(jm2);
jmb.add(jm3);


jf.setJMenuBar(jmb);
jf.setSize(500,500);
jf.setVisible(true);

jmi4.addActionListener(this);
jmi5.addActionListener(this);
jmi6.addActionListener(this);
jmi1.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{


if(ae.getSource()==jmi4)
{
jtg.cut();
}
if(ae.getSource()==jmi5)
{
jtg.copy();
}
if(ae.getSource()==jmi6)
{
jtg.paste();
}
if(ae.getSource()==jmi1)
{
jf.setVisible(false);
jf.dispose();
new Swingn1();
}
} 
public static void main(String args[])
{
new Swingn2();
}}
