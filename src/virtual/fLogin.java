
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
class fLogin extends JFrame implements ActionListener
{
	JFrame f1;
	JLabel l1,l2,l3;
	JTextField t1;
	JPasswordField t2; 
	JButton b1,b2;
	JPanel p1;
	fLogin()
	{	
		//Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
		f1=new JFrame("LOGIN");
		f1.setSize(400,300);
		//f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1=new JPanel();
		l1=new JLabel("USER NAME :");
		l2=new JLabel("PASSWORD :");
		l3=new JLabel("");
		t1=new JTextField(10);
		t2=new JPasswordField(10);
		b1=new JButton("Sign in");
		b2=new JButton("Cancel");
		p1.setLayout(null);
		f1.setResizable(false);
		f1.setLocationRelativeTo(null);
		l1.setBounds(100,50,100,20);
		t1.setBounds(220,50,100,20);
		l2.setBounds(100,80,100,20);
		t2.setBounds(220,80,100,20);
		l3.setBounds(100,100,120,20);
		b1.setBounds(120,150,80,20);
		b2.setBounds(220,150,80,20);
		p1.add(l1);
		p1.add(l2);
		p1.add(t1);
		p1.add(t2);
		p1.add(b1);
		p1.add(b2);
		p1.add(l3);
		f1.add(p1);
		f1.setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
public void actionPerformed(ActionEvent ae)
	{
		String s=ae.getActionCommand();
		if(s.equals("Sign in"))
		{		
			String a=t1.getText();
			String b=t2.getText();
			if(validatelogin(a,b))
			{
				
				l3.setVisible(false);
				f1.setVisible(false);
				String n=displayname(b);
				Home.enabl1(n);
                                
			}
			else
			{
				l3.setText("LOGIN FAILED");
			}

		}
		if(s.equals("Cancel"))
		{
			l3.setText("LOGIN CANCELLED");
			f1.setVisible(false);
		}
	}
	boolean validatelogin(String a,String b)
	{
		Connection con;
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");  
  
//step2 create  the connection object  
con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521:xe","system","abi");  
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from t_account where uname='"+a+"' and password='"+b+"'");
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
	 public String displayname(String b)
		{
			Connection con;
			Statement st;
			ResultSet rs;
			String n="";
		try
		{
			
			Class.forName("oracle.jdbc.driver.OracleDriver");  
  
    con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abi"); 
			st=con.createStatement();
			rs=st.executeQuery("select fname from t_account where password='"+b+"'");
			if(rs.next())
			{
				n=rs.getString("fname");
				
			}

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return n;
		
		}
	
}



