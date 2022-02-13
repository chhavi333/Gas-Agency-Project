//This is the 1st page for my GAP V1 project.
import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon.*;
import java.awt.Frame.*;
import javax.swing.JFrame.*;
import java.awt.event.*;
import java.util.*;

public class Gap1 extends JFrame implements ActionListener
{
  Button b1,b2;
  /*public void paint(Graphics g) {  
  
    Toolkit t=Toolkit.getDefaultToolkit();  
    Image i=t.getImage("cylinderimg.jpg");  
    g.drawImage(i,1,1,this);    
}  */
JFrame f;
Gap1()
{
  JFrame f=new JFrame("GAP");
    f.setSize(400,400);
  f.setLayout(new BorderLayout());
   f.setVisible(true);

   /*JLabel background=new JLabel(new ImageIcon("D:\\Gap V1\\cylimg.jpg"));
   f.add(background);
   background.setLayout(new FlowLayout());*/

   f.setLayout(new BorderLayout());
   f.setContentPane(new JLabel(new ImageIcon("D:\\Gap V1\\cylimg.jpg")));
   f.setLayout(new FlowLayout());

  f.setBackground(Color.ORANGE);
  b1=new Button("Enter");
  b2=new Button("Exit");
  f.setLayout(null);

f.setLayout(new BorderLayout());
 b1.setBounds(150,150,100,30);
  b2.setBounds(150,200,100,30);
  f.setLayout(new FlowLayout());
  f.setLayout(null);
 f.add(b1); f.add(b2); 
  b1.addActionListener(this);
  b2.addActionListener(this);
}

public void actionPerformed(ActionEvent e)
{
 Button b=(Button)e.getSource();
if(b==b1)
{
   Gap2 obj=new Gap2();
    setVisible(true);
    this.dispose();
    JOptionPane.showMessageDialog(this,"Welcome to my mini Gas Agency Project!");
   }
else if(b==b2)
{
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  this.dispose();
}
 }
public static void main(String args[])
  { 
    new Gap1();
   }
 }
