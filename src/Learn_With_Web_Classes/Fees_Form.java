/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learn_With_Web_Classes;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

/**
 *
 * @author PAUL
 */
public class Fees_Form extends javax.swing.JFrame {
    String username;
    public void setUser(String username)
    {
    this.username=username;    
    }
    private void closeMe()
    {
    WindowEvent evt=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(evt);    
    }
    Dimension ssize=Toolkit.getDefaultToolkit().getScreenSize();
    public Fees_Form() {
        initComponents();
        this.setLocation((int)ssize.getWidth()/2-this.getWidth()/2,(int)ssize.getHeight()/2-this.getHeight()/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pf = new javax.swing.JButton();
        fd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(830, 450));
        setUndecorated(true);
        getContentPane().setLayout(null);

        pf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pf.setText("Panding Fees");
        pf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfActionPerformed(evt);
            }
        });
        getContentPane().add(pf);
        pf.setBounds(370, 250, 120, 23);

        fd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fd.setText("Fees Deposit");
        fd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fdActionPerformed(evt);
            }
        });
        getContentPane().add(fd);
        fd.setBounds(370, 210, 120, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Learn_With_Web_Classes/images/fee_form_back.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(230, 130, 410, 200);

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 826, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 45, 830, 2);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Imprint MT Shadow", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText(" Fees ");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(290, 0, 277, 43);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Learn_With_Web_Classes/images/back_areo.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(770, 0, 40, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Learn_With_Web_Classes/images/student_back.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 830, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
 closeMe();
        Home h=new Home();
h.setVisible(true);
h.setUser(username);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void fdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fdActionPerformed
        closeMe();
        Fees f=new Fees();
        f.setVisible(true);
        f.setUser(username);
    }//GEN-LAST:event_fdActionPerformed

    private void pfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfActionPerformed
        closeMe();
        Panding_Fess f=new Panding_Fess();
        f.setVisible(true);
        f.setUser(username);        
    }//GEN-LAST:event_pfActionPerformed

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
            java.util.logging.Logger.getLogger(Fees_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fees_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fees_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fees_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fees_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton pf;
    // End of variables declaration//GEN-END:variables
}