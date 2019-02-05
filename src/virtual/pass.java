/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package virtual;

/**
 *
 * @author Srivatsan
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class pass extends JFrame implements ActionListener
{
	JFrame f1;
	JLabel l1,l2,l3,l4;
	JTextField t1;
	JPasswordField t2,t3; 
	JButton b1,b2;
	JPanel p1;
	pass()
	{	
		//Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
		f1=new JFrame("CHANGE PASSWORD");
		f1.setSize(400,300);
		//f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1=new JPanel();
		l1=new JLabel("Username:");
		l2=new JLabel("New Password :");
		l3=new JLabel("Confirm Password :");
                l4=new JLabel("");
		t1=new JTextField(10);
		t2=new JPasswordField(10);
                t3=new JPasswordField(10);
		b1=new JButton("Change");
		b2=new JButton("Cancel");
		p1.setLayout(null);
		f1.setResizable(false);
		f1.setLocationRelativeTo(null);
		l1.setBounds(100,50,100,20);
		t1.setBounds(220,50,100,20);
		l2.setBounds(100,80,100,20);
		t2.setBounds(220,80,100,20);
		l3.setBounds(100,110,120,20);
                t3.setBounds(220,110,100,20);
                l4.setBounds(100,140,120,20);
		b1.setBounds(120,170,80,20);
		b2.setBounds(220,170,80,20);
		p1.add(l1);
		p1.add(l2);
                p1.add(l3);
                p1.add(l4);
		p1.add(t1);
		p1.add(t2);
                p1.add(t3);
		p1.add(b1);
		p1.add(b2);
		
		f1.add(p1);
		f1.setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
public void actionPerformed(ActionEvent ae)
	{
		String s=ae.getActionCommand();
		if(s.equals("Change"))
		{		
			String a=t1.getText();
                   
			String b=t2.getText();
                        String c=t3.getText();
                        if(b.equals(c))
                        {
			if(validatelogin(a))
			{
				
				l3.setVisible(false);
				f1.setVisible(false);
				if(changepass(a,b))
                                {
                                    l4.setText("Password Changed Successfully");
                                    
                                }
				
			}
			else
			{
				l4.setText("Invalid Username");
			}
                        }
                        else
                        {
                            l4.setText("Password doesnot match");
                        }

		}
		if(s.equals("Cancel"))
		{
			l3.setText("MODIFICATION CANCELLED");
			f1.setVisible(false);
		}
	}
	boolean validatelogin(String a)
	{
		Connection con;
	try
	{
		
			Class.forName("oracle.jdbc.driver.OracleDriver");  
  
//step2 create  the connection object  
con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521:xe","system","abi");  
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from s_account where uname='"+a+"'");
		if(rs.next())
		{
			return true;
		}
		else
		{
			return false;
		}

	}
	catch (Exception e)
	{
		e.printStackTrace();
	}
	return false;
	}
        Boolean changepass(String a,String b)
        {Connection con;
	try
	{
		
			Class.forName("oracle.jdbc.driver.OracleDriver");  
  
//step2 create  the connection object  
con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521:xe","system","abi");  
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("update s_account set password='"+b+"' where uname='"+a+"'");
		if(rs.next())
		{
			return true;
		}
		else
		{
			return false;
		}

	}
	catch (Exception e)
	{
		e.printStackTrace();
	}
	return false;
            
        }
		
	
}

