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
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
class Home extends JFrame implements ActionListener
{
	JMenuBar b1;
	static JMenu m1,m2,m3,m4,m5,m6,m44;
	static JMenuItem i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14,i15,i33,i88,i99,i123,ii1,ii2,ii3,ii4,abi;
	JFrame f1;
	JPanel p1;
	
	static JLabel l1,l2,t1;
	Home()
	{	
		Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
		Font ft=new Font("Verdana",Font.BOLD,20);
		ImageIcon im=new ImageIcon("C:/Users/Srivatsan/Desktop/virtual/images/login.png");
		ImageIcon im1=new ImageIcon("C:/Users/Srivatsan/Desktop/virtual/images/logout.png");
		ImageIcon im2=new ImageIcon("C:/Users/Srivatsan/Desktop/virtual/images/pas.png");
		ImageIcon im3=new ImageIcon("C:/Users/Srivatsan/Desktop/virtual/images/exit.png");
		ImageIcon im4=new ImageIcon("C:/Users/Srivatsan/Desktop/virtual/images/si.png");
                ImageIcon im5=new ImageIcon("C:/Users/Srivatsan/Desktop/virtual/images/logo.jpg");
		ImageIcon im6=new ImageIcon("C:/Users/Srivatsan/Desktop/virtual/images/images1.jpg");
                ImageIcon im7=new ImageIcon("C:/Users/Srivatsan/Desktop/virtual/images/ac.png");
                ImageIcon im8=new ImageIcon("C:/Users/Srivatsan/Desktop/virtual/images/tc.png");
                ImageIcon im9=new ImageIcon("C:/Users/Srivatsan/Desktop/virtual/images/as.png");
                ImageIcon im10=new ImageIcon("C:/Users/Srivatsan/Desktop/virtual/images/af.png");
                ImageIcon im11=new ImageIcon("C:/Users/Srivatsan/Desktop/virtual/images/v.png");
                ImageIcon im12=new ImageIcon("C:/Users/Srivatsan/Desktop/virtual/images/m.png");
                ImageIcon im13=new ImageIcon("C:/Users/Srivatsan/Desktop/virtual/images/pay.png");
                ImageIcon im14=new ImageIcon("C:/Users/Srivatsan/Desktop/virtual/images/bro.png");
                ImageIcon im15=new ImageIcon("C:/Users/Srivatsan/Desktop/virtual/images/help.png");
                ImageIcon im16=new ImageIcon("C:/Users/Srivatsan/Desktop/virtual/images/abt.png");
                ImageIcon im17=new ImageIcon("C:/Users/Srivatsan/Desktop/virtual/images/sky.png");
                b1=new JMenuBar();
		m1=new JMenu("Student");
		m2=new JMenu("Staff");
		m3=new JMenu("Admin");
		m4=new JMenu("Conference");
                m44=new JMenu("Payment");
		m5=new JMenu("Browse");
		m6=new JMenu("Support");
                
		i1=new JMenuItem("Student Login",im);
		i2=new JMenuItem("Change Password",im2);
		i3=new JMenuItem("Logout",im1);
                i33=new JMenuItem("Attend Class",im7);
		i4=new JMenuItem("Exit",im3);
		i5=new JMenuItem("Signup",im4);

		i6=new JMenuItem("Faculty Login",im);
		i7=new JMenuItem("Register",im4);
		i88=new JMenuItem("Take Class",im8);
		i9=new JMenuItem("Password Modify",im2);
                i99=new JMenuItem("Logout",im1);

		i10=new JMenuItem("Admin Login",im);
		i11=new JMenuItem("Add Student",im9);
                i8=new JMenuItem("Add Faculty",im10);
		i12=new JMenuItem("View",im11);
		i13=new JMenuItem("Modify",im12);
                i123=new JMenuItem("Logout",im1);

		i14=new JMenuItem("Skype",im17);
		
                ii1=new JMenuItem("Mini Browser",im14);
                
                ii2=new JMenuItem("Help",im15);
                ii3=new JMenuItem("About",im16);
                 abi=new JMenuItem("Pay",im13);
              

		p1=new JPanel();
		l1=new JLabel(im5);
                l2=new JLabel();
		t1=new JLabel(im6);
                
                
		p1.setLayout(null);

p1.setBackground(Color.white);
		//m1.setMnemonic('s');
		l1.setFont(ft);
		l1.setForeground(Color.black);
		f1=new JFrame("Home Page");
		f1.setSize(d.width,d.height);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		m1.add(i1);
		m1.add(i5);
		m1.add(i2);
                m1.add(i33);
		m1.add(i3);
		m1.add(i4);

		m2.add(i6);
		m2.add(i7);
		
                m2.add(i88);
		m2.add(i9);
                m2.add(i99);

		m3.add(i10);
		m3.add(i11);
                m3.add(i8);
		m3.add(i12);
		m3.add(i13);
                m3.add(i123);

		m4.add(i14);
                m44.add(abi);
		//m4.add(i15);

                //m5.add(ii1);
                m6.add(ii2);
                m6.add(ii3);
                
		b1.add(m1);
		b1.add(m2);
		b1.add(m3);
		b1.add(m4);
                b1.add(m44);
		//b1.add(m5);
		b1.add(m6);
		l1.setBounds(130,-70,1000,200);
               //l2.setBounds(1000,-70,100,200);
		t1.setBounds(10,50,1000,500);
		f1.setJMenuBar(b1);

		p1.add(l1);
		p1.add(t1);
              
		f1.add(p1);
                 
                 
		f1.setVisible(true);
		i2.setEnabled(false);
		i3.setEnabled(false);
                i33.setEnabled(false);

		i7.setEnabled(true);
		i8.setEnabled(false);
                i88.setEnabled(false);
		i9.setEnabled(false);
                i99.setEnabled(false);

		i11.setEnabled(false);
                
		i12.setEnabled(false);
		i13.setEnabled(false);
                i123.setEnabled(false);
                
                

		m4.setEnabled(false);
                m44.setEnabled(false);
		m5.setEnabled(false);
		m6.setEnabled(true);

		i1.addActionListener(this);
		i2.addActionListener(this);
		i3.addActionListener(this);
                i33.addActionListener(this);
		i4.addActionListener(this);
		i5.addActionListener(this);
                i6.addActionListener(this);
		i7.addActionListener(this);
                i88.addActionListener(this);
		i9.addActionListener(this);
                i99.addActionListener(this);
                i8.addActionListener(this);
                i10.addActionListener(this);
		i11.addActionListener(this);
                i12.addActionListener(this);
                 i123.addActionListener(this);
		i13.addActionListener(this);
                i14.addActionListener(this);
                abi.addActionListener(this);
                
                 ii1.addActionListener(this);
                 ii2.addActionListener(this);
                 ii3.addActionListener(this);
                 ii4.addActionListener(this);
                 
               
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s=ae.getActionCommand();
		if(s.equals("Student Login"))
		{
			new Login();
		}
                if(s.equals("Admin Login"))
		{
			new alogin();
		}
                if(s.equals("Faculty Login"))
		{
			new fLogin();
		}
		if(s.equals("Change Password"))
		{
                    new pass();
		}
		if(s.equals("Logout"))
		{
			i1.setText("Student Login");
			i2.setEnabled(false);
			i3.setEnabled(false);
                        i33.setEnabled(false);
			i5.setEnabled(true);
			m4.setEnabled(false);
			m5.setEnabled(false);
			
			l1.setText("");
                        
                        i9.setEnabled(false);
                        i88.setEnabled(false);
                        i99.setEnabled(false);
			i6.setText("Faculty Login");
                        i7.setEnabled(true);
                        
                        
                        i10.setText("Admin Login");
                        i11.setEnabled(false);
                        m44.setEnabled(false);
                         i8.setEnabled(false);
		i12.setEnabled(false);
		i13.setEnabled(false);
                i123.setEnabled(false);
                i1.setEnabled(true);
                i6.setEnabled(true);
                i10.setEnabled(true);
		}
		if(s.equals("Exit"))
		{
			System.exit(0);
		}
		if(s.equals("Signup") || s.equals("Add"))
		{
			new Register("Add","");
		}
                if(s.equals("Register"))
                {
                    new fregister("Add","");
                }
		if(s.equals("Modify"))
		{
			new edit();
		}
                if(s.equals("Password Modify"))
		{
			new fpass();
		}
                if(s.equals("Attend Class")||s.equals("Take Class"))
                {
                    new MyClient();
                }
                if(s.equals("Add Faculty"))
                {
                     new fregister("Add","");
              
                }
                if(s.equals("Add Student"))
                {
                    new Register("Add","");
                }
                if(s.equals("View"))
                {
                    new view1();
                }
                
                if(s.equals("Skype"))
                {
                   // new pay();
                    try {
                        
                        Runtime runTime = Runtime.getRuntime();
                        Process process = runTime.exec("C:/Program Files (x86)/Skype/Phone/Skype.exe");
                    } catch (IOException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
                     
                }
                
                   if(s.equals("Pay"))
                    {
                        
                        new pay();
                        
                    }

                if(s.equals("Help"))
                {
                   String command="rundll32 url.dll,FileProtocolHandler http://www.google.com";
try{
Process p=Runtime.getRuntime().exec(command);
}
catch(IOException x) {System.out.println("You dont have a browser in your windows");}  

}
                if(s.equals("About"))
                {
                    String command="rundll32 url.dll,FileProtocolHandler https://en.wikipedia.org/wiki/Main_Page";
try{
Process p=Runtime.getRuntime().exec(command);
}
catch(IOException x) {System.out.println("You dont have a browser in your windows");}
                }
                if(s.equals("Mini Browser"))
                {
                    MiniBrowser b=new MiniBrowser();
                    b.show();
                }

                
	}
	public static void enabl(String n)
		{
			i2.setEnabled(true);
			i3.setEnabled(true);
                        i33.setEnabled(true);
			i1.setText(n);
			l1.setText(" Welcomes"+"  "+n);
			i5.setEnabled(false);
			m4.setEnabled(true);
                        m44.setEnabled(true);
			m5.setEnabled(true);
			m6.setEnabled(true);
                        i6.setEnabled(false);
                        m5.setEnabled(true);
                        i10.setEnabled(false);
		}
        public static void enabl1(String n)
		{
			
			i9.setEnabled(true);
                        i88.setEnabled(true);
                        i99.setEnabled(true);
			i6.setText(n);
			l1.setText(" Welcomes Professor "+"  "+n);
			i7.setEnabled(false);
			m6.setEnabled(true);
                         m44.setEnabled(false);
			m5.setEnabled(true);
			m4.setEnabled(true);
                        i1.setEnabled(false);
                        i10.setEnabled(false);
                        m5.setEnabled(true);
		}
         public static void enabl2(String n)
		{
			
			
			i10.setText("admin");
			l1.setText(" Welcomes Admin");
			i11.setEnabled(true);
			i8.setEnabled(true);
                        m5.setEnabled(true);
                           m4.setEnabled(false);
                        i12.setEnabled(true);
                         m44.setEnabled(false);
                        i13.setEnabled(true);
                          i123.setEnabled(true);
                          i1.setEnabled(false);
                          i6.setEnabled(false);
		}
		
	public static void main(String[] args) 
	{
			new Home();
	}
}

