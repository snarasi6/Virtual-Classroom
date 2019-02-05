
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
class view1 extends JFrame implements ActionListener
{
	JFrame f1;
	
	JButton b1,b2;
	JPanel p1;
	view1()
	{	
		//Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
		f1=new JFrame("View");
		f1.setSize(400,300);
		//f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1=new JPanel();
		
		
		b1=new JButton("Student");
		b2=new JButton("Faculty");
		p1.setLayout(null);
		f1.setResizable(false);
		f1.setLocationRelativeTo(null);
		
		b1.setBounds(150,50,100,50);
		b2.setBounds(150,150,100,50);
		
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
		if(s.equals("Student"))
		{		
			new sedit();
                        f1.setVisible(false);
                        
			
		}
		if(s.equals("Faculty"))
		{
			new fedit();
                        f1.setVisible(false);
		}
	}
	
	
		
	
}


