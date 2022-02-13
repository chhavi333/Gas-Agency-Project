import javax.swing.*;
import java.sql.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
//Gap4 User registration
public class Gap4 extends JFrame implements ActionListener
{   Button b1,b2; JTextField t1,t2,t3,t4,t5;
   Gap4()
   {
     JFrame f=new JFrame("User Registration");
     JLabel l1=new JLabel("Name");
     JLabel l2=new JLabel("Mobile no");
     JLabel l3=new JLabel("City");
     JLabel l4=new JLabel("ID card");
     JLabel l5=new JLabel("Email");

      t1=new JTextField();
      t2=new JTextField();
      t3=new JTextField();
     t4=new JTextField();
     t5=new JTextField();

     b1=new Button("Submit");
     b2=new Button("Main menu");

     f.setLayout(null); f.setVisible(true); f.setSize(480, 480);
     f.add(l1); f.add(t1);
     f.add(l2); f.add(t2);
     f.add(l3); f.add(t3);
     f.add(l4); f.add(t4);
     f.add(l5); f.add(t5);
     f.add(b1); f.add(b2);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    l1.setBounds(20, 30, 100, 30); 
    t1.setBounds(120, 30, 100, 30); 
    l2.setBounds(20, 80, 100, 30); 
    t2.setBounds(120, 80, 100, 30); 
    l3.setBounds(20, 130, 100, 30); 
    t3.setBounds(120, 130, 100, 30); 
    l4.setBounds(20, 180, 100, 30); 
    t4.setBounds(120, 180, 100, 30); 
    l5.setBounds(20, 230, 100, 30); 
    t5.setBounds(120, 230, 100, 30); 
    
    b1.setBounds(70, 300, 100, 30); b1.addActionListener(this);
    b2.setBounds(170, 300, 100, 30); b2.addActionListener(this);
    f.setBackground(Color.green);
   }


   public void actionPerformed(ActionEvent ae)
		{
		Button b=(Button)ae.getSource();
        if(b==b1)
		{
		JOptionPane.showMessageDialog(this,"Welcome to Insert record Module");
		try
		{
	Class.forName("com.mysql.cj.jdbc.Driver");
	JOptionPane.showMessageDialog(this,"Driver Loaded Successfully");
	Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/magic_db","root","sachdeva312");
	JOptionPane.showMessageDialog(this,"Connection Successfully");
	PreparedStatement pst=cn.prepareStatement("insert into reg_info values(?,?,?,?,?)");
	String name=t1.getText();
    int mobileno=Integer.parseInt(t2.getText());
	String city=t3.getText();
    String IDcard=t4.getText();
    String email=t5.getText();	
	pst.setString(1,name);
	pst.setInt(2,mobileno);
    pst.setString(3,city);
    pst.setString(4,IDcard);
    pst.setString(5,email);
	int x=pst.executeUpdate();
		if(x>0)
			{
		JOptionPane.showMessageDialog(this,"Registration Successful");
			t1.setText("");
			t2.setText("");
			t3.setText("");
            t4.setText("");
            t5.setText("");
			}
           
	}
    catch(ClassNotFoundException e)
		{
		System.out.println("Driver Not Available"+e.getMessage());
		}
	catch(SQLException e)
		{
		System.out.println("Connection error"+e.getMessage());
		}
	}
    else if(b==b2)
    {
      Gap3 obj=new Gap3();
      setVisible(true);
      this.dispose();
    }
	}

	public static void main(String s[])
		{
	new Gap4();
	}
}