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
class Success 
{
	JFrame f1;
	JPanel p1;
	JLabel l1;
	Success(String a)
	{
		f1=new JFrame("");
		p1=new JPanel();
		l1=new JLabel("Registration Successful....!!!");
		if(a.equals("modify"))
		{
			l1.setText("Modification Successful....!!!");	
		}
		p1.setLayout(null);
		f1.setResizable(false);
		f1.setLocationRelativeTo(null);
		f1.setSize(300,200);
		l1.setForeground(Color.green);
		p1.add(l1);
		f1.add(p1);
		f1.setVisible(true);
		l1.setBounds(10,20,300,70);
	}
}