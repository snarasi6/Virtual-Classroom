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
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
class fview extends JFrame implements ActionListener
{
	JFrame f1;
	JPanel p1;
	JButton b1,b2,b3;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l0,l11;
	JTextField t1,t2,t3,t4,t5,t6;
	JPasswordField t7;
	JComboBox j1,j2,j3,j4,j5;
	String ss;
	String uu;
	fview(String u)
	{
		uu=u;
		Dimension dd=Toolkit.getDefaultToolkit().getScreenSize();

		String a[]={"MM","Jan","Feb","Mar","Apr","May","Jun","July","Aug","Sep","Oct","Nov","Dec"};
		String b[]={"---SELECT---","Male","Female"};
		String c[]={"---SELECT---","M.E","M.Tech","M.Sc","PHD"};
		

		Font ft=new Font("Adobe Gothic Std",Font.BOLD,30);

		f1=new JFrame(" Faculty Details");
		p1=new JPanel();
		//b1=new JButton("Register");
		b2=new JButton("Cancel");
		//b3=new JButton("Reset");
		l1=new JLabel("First Name");      			l2=new JLabel("Last Name");
		l3=new JLabel("DOB");   		  			l4=new JLabel("Gender");
		l5=new JLabel("E-Mail ID");  		  		l6=new JLabel("Mobile No");
		l7=new JLabel("Qualification");   			l8=new JLabel("Specialization");
		l9=new JLabel("User Name");			    l10=new JLabel("Password");
		l0=new JLabel("FACULTY DETAILS ");	l11=new JLabel("");
		t1=new JTextField(10); t2=new JTextField(10);
		t3=new JTextField(10); t4=new JTextField(10);
		t5=new JTextField(10);	t6=new JTextField(10);
		t7=new JPasswordField(10);
		j1=new JComboBox();		j2=new JComboBox(a);
		j3=new JComboBox();		j4=new JComboBox(b);
		j5=new JComboBox(c);	
		
		j1.addItem("DD");
		for(int i=1;i<=31;i++)
		{
			j1.addItem(i+"");
		}
		j3.addItem("YY");
		for(int i=1940;i<=1990;i++)
		{
			j3.addItem(i+"");
		}
		
			
			modify(uu);
		
		//f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setSize(dd.width,dd.height);
		f1.setResizable(false);
		l0.setForeground(Color.black);
		l11.setForeground(Color.red);
		l0.setFont(ft);
		p1.setBackground(Color.cyan);

		p1.setLayout(null);

		p1.add(l0);p1.add(l1);p1.add(l2);p1.add(l3);p1.add(l4);
		p1.add(l5);p1.add(l6);p1.add(l7);p1.add(l8);p1.add(l9);p1.add(l10);
		p1.add(t1);p1.add(t2);p1.add(t3);p1.add(t4);p1.add(t5);
		p1.add(j1);p1.add(j2);p1.add(j3);p1.add(j4);p1.add(j5);p1.add(t6);p1.add(t7);
		
                //p1.add(b1);
                p1.add(b2);
                //p1.add(b3);
                p1.add(l11);
		f1.add(p1);
		f1.setVisible(true);

		l0.setBounds(500,20,1000,30);
		l1.setBounds(330,80,100,30);t1.setBounds(450,80,200,30);l2.setBounds(680,80,100,30);t2.setBounds(790,80,200,30);
		l3.setBounds(330,130,100,30);j1.setBounds(450,130,60,30);j2.setBounds(520,130,60,30);j3.setBounds(590,130,60,30);l4.setBounds(680,130,100,30);j4.setBounds(790,130,200,30);
		l5.setBounds(330,180,100,30);t3.setBounds(450,180,200,30);l6.setBounds(680,180,100,30);t4.setBounds(790,180,200,30);
		l7.setBounds(330,230,100,30);j5.setBounds(450,230,200,30);l8.setBounds(680,230,100,30);t5.setBounds(790,230,200,30);
		l9.setBounds(330,280,100,30);t6.setBounds(450,280,200,30);l10.setBounds(680,280,100,30);t7.setBounds(790,280,200,30);
		//b1.setBounds(470,370,100,30);
                b2.setBounds(620,370,100,30);
                //b3.setBounds(770,370,100,30);
		l11.setBounds(500,450,200,20);

		//b1.addActionListener(this);
		b2.addActionListener(this);
		//b3.addActionListener(this);

        }

	public void actionPerformed(ActionEvent ae)
	{
		String s=ae.getActionCommand();
		
		
		if(s.equals("Cancel"))
		{
			f1.setVisible(false);
			new Fail("cancel");
		}
		
	}
	
	void modify(String u)
	{
		Connection con;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");  
  
//step2 create  the connection object  
con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521:xe","system","abi");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from t_account where uname='"+u+"'");
			if(rs.next())
			{
			t1.setText(rs.getString("fname"));
			t2.setText(rs.getString("lname"));
			j1.setSelectedItem(rs.getString("dd"));
			j2.setSelectedItem(rs.getString("mm"));
			j3.setSelectedItem(rs.getString("yy"));
			j4.setSelectedItem(rs.getString("gender"));
			t3.setText(rs.getString("emailid"));
			t4.setText(rs.getString("mob"));
			t5.setText(rs.getString("spec"));
			t6.setText(rs.getString("uname"));
			t7.setText(rs.getString("password"));
			j5.setSelectedItem(rs.getString("qualification"));
			t1.setEnabled(false);
                        t2.setEnabled(false);
                        t3.setEnabled(false);
                        t4.setEnabled(false);
                        t5.setEnabled(false);
                        t6.setEnabled(false);
			t7.setEnabled(false);
                        j1.setEnabled(false);
                        j2.setEnabled(false);
                        j3.setEnabled(false);
                        j4.setEnabled(false);
                        j5.setEnabled(false);
		}
	}

		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
