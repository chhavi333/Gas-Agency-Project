import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
//Gap3 Main menu
public class Gap3 extends Frame implements ActionListener
{ Frame f; Label l; Button b1,b2,b3; 
  Gap3()
  {  
      setVisible(true);
      setLayout(null);
      setSize(720,720);
     
       f=new Frame("Page 1");
       l=new Label("Main menu");
      b1=new Button("Registration");
      b2=new Button("Booking");
      b3=new Button("Customer Record");
     
      l.setBounds(175, 75, 100, 30);
      b1.setBounds(175, 125, 100, 30);
      b2.setBounds(175, 175, 100, 30);
      b3.setBounds(175, 225, 100, 50);

      add(l);
      add(b1);
      add(b2);
      add(b3);
      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      b3.setVisible(true);
//setBackground(Color.red);

 //f.setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
        }
public void actionPerformed(ActionEvent e)
{
Button b=(Button)e.getSource();
if(b==b1)
{
    JOptionPane.showMessageDialog(this, "Welcome to Registration module");
    Gap4 obj=new Gap4();
    setVisible(true);
    this.dispose();
}
else if(b==b2)
{
    JOptionPane.showMessageDialog(this, "Welcome to Booking module");
    this.dispose();
}
else if(b==b3)
{
    JOptionPane.showMessageDialog(this, "Welcome to Customer record module");
    this.dispose();
}
}

    public static void main(String[] args) 
    {
       new Gap3();
    }
}
