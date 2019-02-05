
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
class pay extends JFrame implements ActionListener
{
	JFrame f1;
	JLabel l0,l1,l2,l3,l4,l5;
	JTextField t1,t2;
	JPasswordField t3; 
        JComboBox j1,j2;
	JButton b1,b2;
	JPanel p1;
	pay()
	{	
            String a[]={"MM","Jan","Feb","Mar","Apr","May","Jun","July","Aug","Sep","Oct","Nov","Dec"};
		//Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
		f1=new JFrame("Online Payment");
		f1.setSize(400,300);
		//f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1=new JPanel();
                l0=new JLabel("Fees to be paid : Rs.20000");
		l1=new JLabel("USER NAME :");
		l2=new JLabel("CARD NUMBER:");
		l3=new JLabel("EXPIRY DATE");
                l4=new JLabel("CVV ");
                l5=new JLabel(" ");
                
		t1=new JTextField(10);
                t2=new JTextField(10);
                
		t3=new JPasswordField(10);
                
                j1=new JComboBox(a);	
                j2=new JComboBox();
                
		b1=new JButton("Pay");
		b2=new JButton("Cancel");
                j2.addItem("YY");
		for(int i=2015;i<=2035;i++)
		{
			j2.addItem(i+"");
		}
		p1.setLayout(null);
		f1.setResizable(false);
		f1.setLocationRelativeTo(null);
                l0.setBounds(100,20,200,20);
		l1.setBounds(100,50,100,20);
		t1.setBounds(220,50,100,20);
		l2.setBounds(100,80,100,20);
		t2.setBounds(220,80,100,20);
		l3.setBounds(100,110,120,20);
                j1.setBounds(220,110,60,20);
                j2.setBounds(290,110,60,20);
                l4.setBounds(100,140,120,20);
                l5.setBounds(100,170,120,20);
                t3.setBounds(220,140,100,20);
		b1.setBounds(120,200,80,20);
		b2.setBounds(220,200,80,20);
                p1.add(l0);
		p1.add(l1);
		p1.add(l2);
                p1.add(l3);
                p1.add(l4);
		p1.add(t1);
		p1.add(t2);
                p1.add(t3);
                p1.add(j1);
                p1.add(j2);
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
		if(s.equals("Pay"))
		{		
			String a=t1.getText();
			//String b=t2.getText();
			if(validatelogin(a))
			{
				
				l3.setVisible(false);
				f1.setVisible(false);
				
				
			}
			else
			{
				l5.setText("Invalid Username");
			}

		}
		if(s.equals("Cancel"))
		{
			l3.setText("TRANSACTION CANCELLED");
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
	
		
	
}


