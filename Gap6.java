import javax.swing.*;
import javax.swing.plaf.PanelUI;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Gap6 extends JFrame //implements ActionListener
{
    Gap6()
    {
Frame f=new Frame();
f.setVisible(true);
f.setSize(400, 400);
f.setLayout(null);
JPanel p1= new JPanel();
JPanel p2=new JPanel();
JLabel l1=new JLabel("So what");
Button b1=new Button("Mic");
Button b2=new Button("Drop");
//b1.setBounds(x, y, width, height);
p1.setBackground(Color.red);
p1.setBounds(100, 20, 100, 130);
p1.add(b1); p1.add(l1);
p2.setBackground(Color.blue);
p2.setBounds(200, 300, 100, 130);
p2.add(b2);
f.add(p1); f.add(p2);
    }
    public static void main(String[] args)
    {
new Gap6();
    }
}
