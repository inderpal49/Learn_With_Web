
package Learn_With_Web_Classes;

import databasequery.SqlQuery;
import java.sql.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Login extends javax.swing.JFrame {
    public void fun()
    {
    JOptionPane pane=new JOptionPane();    
    }
    private int closeMe()
    {
    WindowEvent evt=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(evt);
    return(11);
    }
    Dimension ssize=Toolkit.getDefaultToolkit().getScreenSize();
    public Login() {
        initComponents();
        this.setLocation((int)ssize.getWidth()/2-this.getWidth()/2,(int)ssize.getHeight()/2-this.getHeight()/2);
       /* if(!new SqlQuery().isTableExist("logins"))
        {       
           new SqlQuery().createTable("logins","email varchar2(30) primary key,password number not null,security_question varchar2(50) not null");
        }*/
                
                
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        luser = new javax.swing.JLabel();
        txtun = new javax.swing.JTextField();
        txtpass = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        forget = new javax.swing.JButton();
        server = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        lpass = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();
        usericon = new javax.swing.JLabel();
        log_container = new javax.swing.JLabel();
        back_container = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setMinimumSize(new java.awt.Dimension(830, 450));
        setPreferredSize(new java.awt.Dimension(830, 450));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(null);

        luser.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        luser.setText("User Name*");
        getContentPane().add(luser);
        luser.setBounds(100, 280, 74, 20);

        txtun.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtun);
        txtun.setBounds(190, 280, 163, 25);

        txtpass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtpass);
        txtpass.setBounds(190, 320, 163, 25);

        login.setBackground(new java.awt.Color(64, 213, 80));
        login.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login);
        login.setBounds(80, 360, 67, 23);

        forget.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        forget.setText("Forget");
        forget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgetActionPerformed(evt);
            }
        });
        getContentPane().add(forget);
        forget.setBounds(160, 360, 73, 23);

        server.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        server.setText("Server");
        server.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serverActionPerformed(evt);
            }
        });
        getContentPane().add(server);
        server.setBounds(240, 360, 71, 23);

        exit.setBackground(new java.awt.Color(255, 102, 102));
        exit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(320, 360, 55, 23);

        lpass.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lpass.setText("Password*");
        getContentPane().add(lpass);
        lpass.setBounds(100, 320, 74, 20);

        pass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Learn_With_Web_Classes/images/lpass.png"))); // NOI18N
        getContentPane().add(pass);
        pass.setBounds(360, 320, 20, 20);

        usericon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Learn_With_Web_Classes/images/luicon.png"))); // NOI18N
        getContentPane().add(usericon);
        usericon.setBounds(360, 280, 20, 20);

        log_container.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Learn_With_Web_Classes/images/log_panal.png"))); // NOI18N
        getContentPane().add(log_container);
        log_container.setBounds(30, 220, 410, 190);

        back_container.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Learn_With_Web_Classes/images/back_log.PNG"))); // NOI18N
        getContentPane().add(back_container);
        back_container.setBounds(0, 0, 830, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void forgetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgetActionPerformed
closeMe();
Forget fog=new Forget();
fog.setVisible(true);
    }//GEN-LAST:event_forgetActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
       int log=0;
       
         try 
         {
            Connect c=new Connect();           
            Connection conn=c.connectTo();
            Statement statement=conn.createStatement();           
            ResultSet resultSet=new SqlQuery().sqlQuery(conn,statement,"select * from logins");            
            while(resultSet.next())
            {
                
            if(txtun.getText().equalsIgnoreCase(resultSet.getString("email")) && txtpass.getText().equalsIgnoreCase(resultSet.getString("password")))
               {
                  log=1;
                  break;
               }
            }
            resultSet.close();
            conn.close();
           } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
         
         
            
            
           if(log==1)
            {
            closeMe();
            Home h=new Home();
            h.setVisible(true);
            h.setUser(txtun.getText());
            }
            else
            {
            DialogBox.okDialogError("Invalid Username or Password");
            }
        
      

    }//GEN-LAST:event_loginActionPerformed

    private void serverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serverActionPerformed
        
           closeMe(); 
           ServerLogs sl=new ServerLogs();
           sl.setVisible(true);          
          
    }//GEN-LAST:event_serverActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
    closeMe();           
    }//GEN-LAST:event_exitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back_container;
    private javax.swing.JButton exit;
    private javax.swing.JButton forget;
    private javax.swing.JLabel log_container;
    private javax.swing.JButton login;
    private javax.swing.JLabel lpass;
    private javax.swing.JLabel luser;
    private javax.swing.JLabel pass;
    private javax.swing.JButton server;
    private javax.swing.JTextField txtpass;
    private javax.swing.JTextField txtun;
    private javax.swing.JLabel usericon;
    // End of variables declaration//GEN-END:variables
}
