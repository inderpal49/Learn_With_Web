
package Learn_With_Web_Classes;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;


public class YesNoCancelDialog extends javax.swing.JFrame {
    public int buttonAction()
    {
    return(1);
    }
    public void dialogText(String txt)
    {
    dialog_text.setText(txt);
    }
    private void closeMe()
    {
    WindowEvent evt=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(evt);
    
    }

  Dimension ssize=Toolkit.getDefaultToolkit().getScreenSize();
    public YesNoCancelDialog() {
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

        jPanel1 = new javax.swing.JPanel();
        no = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        yes = new javax.swing.JButton();
        dialog_text = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(403, 175));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 175));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 175));
        jPanel1.setLayout(null);

        no.setText("No");
        no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noActionPerformed(evt);
            }
        });
        jPanel1.add(no);
        no.setBounds(240, 140, 73, 23);

        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel);
        cancel.setBounds(320, 140, 73, 23);

        yes.setText("Yes");
        yes.setDisplayedMnemonicIndex(2);
        yes.setName("1"); // NOI18N
        yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesActionPerformed(evt);
            }
        });
        jPanel1.add(yes);
        yes.setBounds(160, 140, 73, 23);

        dialog_text.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dialog_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(dialog_text);
        dialog_text.setBounds(60, 60, 300, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\PAUL\\Desktop\\dialog12.png")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(2, 2, 400, 170);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 410, 175);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesActionPerformed

    }//GEN-LAST:event_yesActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
           closeMe();
    }//GEN-LAST:event_cancelActionPerformed

    private void noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noActionPerformed
         // funReturn(0);
          closeMe();
    }//GEN-LAST:event_noActionPerformed

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
            java.util.logging.Logger.getLogger(YesNoCancelDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YesNoCancelDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YesNoCancelDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YesNoCancelDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YesNoCancelDialog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JLabel dialog_text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton no;
    private javax.swing.JButton yes;
    // End of variables declaration//GEN-END:variables
}
