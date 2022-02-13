/*This is the 2nd page for my mini gas agency project. When the user clicks on Enter this page will open and the user will be required to enter the credentials.*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.color.*;
import java.awt.Frame.*;
import java.sql.*;
public class Gap2 extends JFrame implements ActionListener
{ 
    JFrame f; Label l1,l2; TextField t1,t2; Button b1,b2;
    Gap2()
    {
      setLayout(null);
        setSize(1000,1000);
        setVisible(true);
        f=new JFrame("LOGIN PAGE");
        f.setBackground(Color.YELLOW);
        //setLayout(new FlowLayout());
        l1=new Label("Username");
        l2=new Label("Password");
        t1=new TextField();
        t2=new TextField();
        t2.setEchoChar('*');
        b1=new Button("Login");
        b2=new Button("Exit");
        
        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        l1.setBounds(30,30,100,30);
        t1.setBounds(130,30,100,30);
        l2.setBounds(30,80,100,30);
        t2.setBounds(130,80,100,30);
        b1.setBounds(30,150,90,40);
        b2.setBounds(130,150,90,40);
       
       // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
public void actionPerformed(ActionEvent e)
 {
  Button b=(Button)e.getSource();
  String str=t1.getText();
  String str1=t2.getText();
  if(b==b1)
  {
   
    try
    {
 //if((str.equals(uname))&&(str1.equals(pword)))
    
  Class.forName("com.mysql.cj.jdbc.Driver");
JOptionPane.showMessageDialog(this,"Driver Loaded Successfully");
Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/magic_db","root","sachdeva312");
JOptionPane.showMessageDialog(this,"Connection Successfully");
  PreparedStatement ps = cn.prepareStatement("select * from login_info where uname=? and password=?");
      ps.setString(1, str);
      ps.setString(2, str1);
      ResultSet rs = ps.executeQuery();
      if (rs.next())
      {
      Gap3 obj=new Gap3();
      setVisible(true);
      this.dispose();
      }
    
  else
  {
    JOptionPane.showMessageDialog(this, "Lachimolala! Wrong credentials");
  }
}
  catch(ClassNotFoundException ae)
  {
  System.out.println("Driver Not Available"+ae.getMessage());
  }
catch(SQLException ae)
  {
  System.out.println("Connection error"+ae.getMessage());
  }
  }
  else if(b==b2)
  {
    //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();
  }
 }
    public static void main(String args[])
    {
        new Gap2();
    }
}
