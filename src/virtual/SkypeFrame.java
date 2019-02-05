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
import java.awt.BorderLayout;
import java.awt.EventQueue;
 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
 
import com.skype.Call;
import com.skype.Skype;
import com.skype.SkypeException;
import com.skype.connector.*;
import java.awt.event.ActionEvent;
 
 
public class SkypeFrame extends JFrame {
 
        private JPanel contentPane;
        private JTextField textField;
 
        /**
         * Launch the application.
         */
        public static void main(String[] args)throws SkypeException {
                EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                try {
                                        SkypeFrame frame = new SkypeFrame();
                                        frame.setVisible(true);
                                } catch (Exception e) {
                                        e.printStackTrace();
                                }
                        }
                });
        }
 
        /**
         * Create the frame.
         */
        public SkypeFrame() {
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setBounds(100, 100, 450, 300);
                contentPane = new JPanel();
                contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
                contentPane.setLayout(new BorderLayout(0, 0));
                setContentPane(contentPane);
               
                textField = new JTextField();
                contentPane.add(textField, BorderLayout.SOUTH);
                textField.setColumns(10);
               
                JButton btnCall = new JButton("CALL");
               
                btnCall.addActionListener(new ActionListener() {
                        // call user
                        public void actionPerformed(ActionEvent arg0) {
                                String name1 = textField.getText();
                                try {
                                        String lulzec = Skype.getContactList().getFriend(name1).getCity();
                                        String lulzec1 = Skype.getContactList().getFriend(name1).getFullName();
                                        textField.setText(lulzec+"\t"+ lulzec1);
                                } catch (SkypeException e) {
               
                                        e.printStackTrace();
                                }
                       
                               
                        }
                });
                contentPane.add(btnCall, BorderLayout.CENTER);
        }
 
}
