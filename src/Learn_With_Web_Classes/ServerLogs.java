
package Learn_With_Web_Classes;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.io.*;
import javax.swing.JOptionPane;
public class ServerLogs extends javax.swing.JFrame {
    private void reset()
    {
    ss.setSelectedIndex(0);
    su.setText("");
    un.setText("");
    pass.setText("");    
    }
   Dimension ssize=Toolkit.getDefaultToolkit().getScreenSize();  //get screen size
   private void closeMe()   //close this frame on click
   {
   WindowEvent evt=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
   Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(evt);
   }
    public ServerLogs() {
        initComponents();
     this.setLocation((int)ssize.getWidth()/2-this.getWidth()/2,(int)ssize.getHeight()/2-this.getHeight()/2);  //set frame location
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logins = new javax.swing.JPanel();
        luser1 = new javax.swing.JLabel();
        su = new javax.swing.JTextField();
        un = new javax.swing.JTextField();
        luser = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        pass = new javax.swing.JTextField();
        luser2 = new javax.swing.JLabel();
        luser3 = new javax.swing.JLabel();
        sc = new javax.swing.JTextField();
        luser4 = new javax.swing.JLabel();
        ss = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Server Credientials");
        setMinimumSize(new java.awt.Dimension(617, 300));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(617, 300));
        getContentPane().setLayout(null);

        logins.setBackground(new java.awt.Color(51, 51, 51));
        logins.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(255, 255, 255)));

        luser1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        luser1.setForeground(new java.awt.Color(255, 255, 255));
        luser1.setText("Server Url *");

        su.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        un.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        luser.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        luser.setForeground(new java.awt.Color(255, 255, 255));
        luser.setText("Username*");

        save.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        pass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        luser2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        luser2.setForeground(new java.awt.Color(255, 255, 255));
        luser2.setText("Password*");

        luser3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        luser3.setForeground(new java.awt.Color(255, 255, 255));
        luser3.setText("Select Server  *");

        sc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sc.setEnabled(false);

        luser4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        luser4.setForeground(new java.awt.Color(255, 255, 255));
        luser4.setText("Server Class *");

        ss.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ss.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Server", "Oracle", "Sql", "Mysql", "Other" }));
        ss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Imprint MT Shadow", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Server Credientials");

        jPanel1.setPreferredSize(new java.awt.Dimension(0, 2));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Learn_With_Web_Classes/images/back_areo.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout loginsLayout = new javax.swing.GroupLayout(logins);
        logins.setLayout(loginsLayout);
        loginsLayout.setHorizontalGroup(
            loginsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginsLayout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addGroup(loginsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginsLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(back)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginsLayout.createSequentialGroup()
                        .addGroup(loginsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(loginsLayout.createSequentialGroup()
                                .addGroup(loginsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(loginsLayout.createSequentialGroup()
                                        .addComponent(luser2)
                                        .addGap(94, 94, 94))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginsLayout.createSequentialGroup()
                                        .addComponent(luser1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(83, 83, 83))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginsLayout.createSequentialGroup()
                                        .addGroup(loginsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(luser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(luser4, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(luser3, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(69, 69, 69)))
                                .addGroup(loginsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(sc)
                                        .addComponent(ss, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(su, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(un, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(loginsLayout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(save)))
                        .addGap(144, 144, 144))))
        );
        loginsLayout.setVerticalGroup(
            loginsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginsLayout.createSequentialGroup()
                .addGroup(loginsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(loginsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(luser3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(loginsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(luser4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(loginsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(su, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(luser1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(loginsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(luser, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(un, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(loginsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(luser2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(save)
                .addGap(97, 97, 97))
        );

        getContentPane().add(logins);
        logins.setBounds(0, 0, 617, 346);

        pack();
    }// </editor-fold>//GEN-END:initComponents
//save server crediential to file secure_data.dat
    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        if(sc.getText().isEmpty() || su.getText().isEmpty() || un.getText().isEmpty() || pass.getText().isEmpty())
               DialogBox.okDialogError("Fields Can't be Empty");
        else{
        Unp u1=new Unp();
        u1.setdata(sc.getText(),su.getText(),un.getText(),pass.getText());
        try {
            ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("secure_data.dat"));
            out.writeObject(u1);
            out.close();            
            DialogBox.okDialog("Crediential Saved");           
            reset();
        } catch (FileNotFoundException ex) {
            DialogBox.okDialogError("Login Crediential File Missing");          
        } catch (IOException ex) {
            DialogBox.okDialogError("Input_Output Error");
          
        } }
    }//GEN-LAST:event_saveActionPerformed

    private void ssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ssActionPerformed
        if(ss.getSelectedIndex()==0)
        {
        sc.enable(false);
        sc.setText("");
        }
        else if(ss.getSelectedIndex()==1)
        {
            sc.enable(false);
            sc.setText("oracle.jdbc.driver.OracleDriver");
        }
        else if(ss.getSelectedIndex()==2)
        {
            sc.enable(false);
            sc.setText("panding");
        }
        else if(ss.getSelectedIndex()==3)
        {
            sc.enable(false);
            sc.setText("com.mysql.jdbc.Driver");
        }
        else
        {
            sc.setText("");
            sc.enable(true);
        }
    }//GEN-LAST:event_ssActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
            closeMe();
            Login log=new Login();
            log.setVisible(true);
    }//GEN-LAST:event_backMouseClicked

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
            java.util.logging.Logger.getLogger(ServerLogs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServerLogs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServerLogs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServerLogs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServerLogs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel logins;
    private javax.swing.JLabel luser;
    private javax.swing.JLabel luser1;
    private javax.swing.JLabel luser2;
    private javax.swing.JLabel luser3;
    private javax.swing.JLabel luser4;
    private javax.swing.JTextField pass;
    private javax.swing.JButton save;
    private javax.swing.JTextField sc;
    private javax.swing.JComboBox<String> ss;
    private javax.swing.JTextField su;
    private javax.swing.JTextField un;
    // End of variables declaration//GEN-END:variables
}
