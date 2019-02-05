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
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import javax.activation.DataHandler;
 
import javax.activation.DataSource;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
 
public class fSendMail extends javax.mail.Authenticator
{
    private String mailhost ="smtp.gmail.com";  //"smtp.mail.yahoo.com"; //"smtp.gmail.com";
    private String user="virtualclassroomabi@gmail.com";
    private String password="virtualabi1";
    private Session session;  
 
 public fSendMail(){    
 
        Properties props = new Properties();
        props.setProperty("mail.transport.protocol", "smtp");
        props.setProperty("mail.smtp.host", mailhost);
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.starttls.enable","true");
        props.put("mail.smtp.debug", "true");
        props.put("mail.smtp.socketFactory.fallback", "false");
        props.setProperty("mail.smtp.quitwait", "false");  
 
        session = Session.getDefaultInstance(props, this);
    }  
 
    protected PasswordAuthentication getPasswordAuthentication()
    {
        return new PasswordAuthentication(user, password);
    }  
 
    public synchronized void sendMail(String subject, String body, String sender, String recipients) throws Exception
    {
        subject="Virtual Class Room  Faculty Registration Confirmation Mail";
        body="you have successfully registered....TEACHING MAKES A MAN PERFECT....Make the students to learn well...";
        sender=user;
        //recipients="abishek.ca08@gmail.com";
        MimeMessage message = new MimeMessage(session);
        DataHandler handler = new DataHandler(new ByteArrayDataSource(body.getBytes(), "text/plain"));
        message.setSender(new InternetAddress(sender));
        message.setSubject(subject);
        message.setDataHandler(handler);
        if (recipients.indexOf(',') > 0)
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipients));
        else
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recipients));
        Transport.send(message);
    }  
 
    public class ByteArrayDataSource implements DataSource {
        private byte[] data;
        private String type;  
 
        public ByteArrayDataSource(byte[] data, String type) {
            super();
            this.data = data;
            this.type = type;
        }  
 
        public ByteArrayDataSource(byte[] data) {
            super();
            this.data = data;
        }  
 
        public void setType(String type) {
            this.type = type;
        }  
 
        public String getContentType() {
            if (type == null)
                return "application/octet-stream";
            else
                return type;
        }  
 
        public InputStream getInputStream() throws IOException {
            return new ByteArrayInputStream(data);
        }  
 
        public String getName() {
            return "ByteArrayDataSource";
        }  
 
        public OutputStream getOutputStream() throws IOException {
            throw new IOException("Not Supported");
        }
    }
    
    
    /*public static void main(String ar[])
    {
    try
    {
    new SendMail().sendMail(null, null, null, null);
    System.out.println("sent");
    }
    
    catch(Exception e)
    {
        
    
        e.printStackTrace();
    }
}*/}
