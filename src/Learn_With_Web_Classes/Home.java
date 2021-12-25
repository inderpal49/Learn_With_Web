package Learn_With_Web_Classes;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class Home extends javax.swing.JFrame {
    String username;
    public void setUser(String username)
    {
    this.username=username;
    lwel.setText(username);
    }
    private void closeMe()
    {
    WindowEvent evt=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(evt);    
    }
 public void showDate()
 {
 Date d1=new Date();
 SimpleDateFormat s=new SimpleDateFormat("DD-MM-YYYY");
 ldate.setText(s.format(d1));
 }
 public void showTime()
 {
 new Timer(0,new ActionListener(){
 public void actionPerformed(ActionEvent e)
 {
 Date d=new Date();
 SimpleDateFormat s=new SimpleDateFormat("hh:mm:ss a");
 ltime.setText(s.format(d));
 
 }
 
 }).start();}
 
    Dimension ssize=Toolkit.getDefaultToolkit().getScreenSize();
    public Home() {
        initComponents();
         this.setLocation((int)ssize.getWidth()/2-this.getWidth()/2,(int)ssize.getHeight()/2-this.getHeight()/2);
         showUser();
         showDate();
         showTime();
         
    }
    
    private ArrayList<Users> userList()
    {
        int ts=0,tus=0,tcurr=0,ccurr=0;
    ArrayList<Users> userList=new ArrayList<>();
    
    try{
        Connect c=new Connect();
        Connection conn=c.connectTo();
    Statement st=conn.createStatement();
    ResultSet rs=st.executeQuery("select * from mydb.student_record");
    Users user;
    
    while(rs.next())
    {
     if(rs.getString("category").equalsIgnoreCase("tussion"))
        tus++; 
     if(rs.getString("status").equalsIgnoreCase("active") && rs.getString("category").equalsIgnoreCase("tussion"))
        tcurr++;     
     if(rs.getString("status").equalsIgnoreCase("active") && rs.getString("category").equalsIgnoreCase("computer"))
        ccurr++; 
    user=new Users(rs.getString("id"),rs.getString("student_name"),rs.getString("father_name"),rs.getString("category"),rs.getString("class_course"),rs.getString("fess"),rs.getString("date_of_admission"),rs.getString("mobile_no"),rs.getString("address"),rs.getString("status"));
    userList.add(user);
    ts++;
    }
    st.close();
    rs.close();
    conn.close();
    lts.setText(""+ts);
    tts.setText(""+tus);
    cts.setText(""+(ts-tus));
    tcr.setText(""+tcurr);
    td.setText(""+(tus-tcurr));
    ccs.setText(""+ccurr);
    cd.setText(""+((ts-tus-ccurr))); 
    
       
    }catch(SQLException ex){System.out.println("sql exception");}
    
    return userList; 
    }
    private void showUser()
    {
        ArrayList<Users> list=userList();
    DefaultTableModel model=(DefaultTableModel)table.getModel();
    Object[] col=new Object[10];
    for(int i=0;i<list.size();i++)
    {
            col[0]=list.get(i).id();
            col[1]=list.get(i).sname();
            col[2]=list.get(i).fname();
            col[3]=list.get(i).category();
            col[4]=list.get(i).course();
            col[5]=list.get(i).fees();
            col[6]=list.get(i).doa();
            col[7]=list.get(i).mob();
            col[8]=list.get(i).status();
            col[9]=list.get(i).address();            
            model.addRow(col);           
    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        search = new javax.swing.JButton();
        lsname = new javax.swing.JLabel();
        sn = new javax.swing.JTextField();
        refresh = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        aero = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ldate = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ltime = new javax.swing.JLabel();
        emp = new javax.swing.JButton();
        student = new javax.swing.JButton();
        account1 = new javax.swing.JButton();
        fees1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        tts = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tcr = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        td = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ccs = new javax.swing.JLabel();
        cts = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cd = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lts = new javax.swing.JLabel();
        lwel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(830, 450));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        search.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        lsname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lsname.setText("Student Name*");

        sn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snActionPerformed(evt);
            }
        });
        sn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                snKeyReleased(evt);
            }
        });

        refresh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        refresh.setText("Refresh Table");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lsname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(search)
                .addGap(28, 28, 28)
                .addComponent(refresh)
                .addGap(265, 265, 265))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lsname)
                    .addComponent(search)
                    .addComponent(refresh))
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(160, 70, 510, 40);

        name.setFont(new java.awt.Font("Imprint MT Shadow", 0, 48)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("Learn With Web");
        getContentPane().add(name);
        name.setBounds(220, 0, 360, 57);

        table.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Student Name", "Father Name", "Category", "Course", "Fees", "DOA", "Mobile", "Status", "Address"
            }
        ));
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(40);
            table.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 120, 810, 230);

        aero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Learn_With_Web_Classes/images/back_areo.png"))); // NOI18N
        aero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aeroMouseClicked(evt);
            }
        });
        getContentPane().add(aero);
        aero.setBounds(780, 0, 50, 40);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setMinimumSize(new java.awt.Dimension(810, 50));
        jPanel1.setLayout(null);

        ldate.setText("date");
        jPanel1.add(ldate);
        ldate.setBounds(720, 20, 80, 14);

        jLabel4.setText("Time-");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(690, 50, 40, 14);

        jLabel3.setText("Date-");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(690, 20, 40, 14);

        ltime.setText("Time");
        jPanel1.add(ltime);
        ltime.setBounds(720, 50, 80, 14);

        emp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        emp.setText("Employee");
        jPanel1.add(emp);
        emp.setBounds(110, 50, 90, 23);

        student.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        student.setText("Student");
        student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentActionPerformed(evt);
            }
        });
        jPanel1.add(student);
        student.setBounds(10, 10, 80, 23);

        account1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        account1.setText("Admin");
        account1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                account1ActionPerformed(evt);
            }
        });
        jPanel1.add(account1);
        account1.setBounds(110, 10, 90, 23);

        fees1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        fees1.setText("Fees");
        fees1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fees1ActionPerformed(evt);
            }
        });
        jPanel1.add(fees1);
        fees1.setBounds(10, 50, 80, 23);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(680, 0, 10, 80);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(100, 0, 10, 80);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(210, 0, 10, 80);

        tts.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tts.setText("Total");
        jPanel1.add(tts);
        tts.setBounds(450, 20, 50, 14);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Computer");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(550, 0, 70, 14);
        jPanel1.add(jSeparator4);
        jSeparator4.setBounds(500, 20, 180, 10);

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator5);
        jSeparator5.setBounds(300, 0, 10, 80);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Tussion");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(350, 0, 70, 14);

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator6);
        jSeparator6.setBounds(500, 0, 10, 80);
        jPanel1.add(jSeparator7);
        jSeparator7.setBounds(300, 20, 200, 10);

        jLabel6.setText("Student");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(310, 20, 90, 14);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Total Student");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(220, 10, 80, 14);

        tcr.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tcr.setText("Total ");
        jPanel1.add(tcr);
        tcr.setBounds(450, 40, 50, 14);

        jLabel10.setText("Deactive");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(310, 60, 80, 14);

        td.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        td.setText("Total");
        jPanel1.add(td);
        td.setBounds(450, 60, 50, 14);

        jLabel11.setText("Deactive");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(510, 60, 80, 14);

        ccs.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ccs.setText("Total ");
        jPanel1.add(ccs);
        ccs.setBounds(620, 40, 60, 14);

        cts.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cts.setText("Total ");
        jPanel1.add(cts);
        cts.setBounds(620, 20, 50, 14);

        jLabel12.setText("Student");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(510, 20, 80, 14);

        jLabel13.setText("Currently Reading");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(510, 40, 100, 14);

        cd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cd.setText("Total ");
        jPanel1.add(cd);
        cd.setBounds(620, 60, 50, 14);

        jLabel14.setText("Currently Reading");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(310, 40, 120, 14);

        lts.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lts.setText("50");
        jPanel1.add(lts);
        lts.setBounds(230, 30, 50, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 360, 810, 80);

        lwel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lwel.setForeground(new java.awt.Color(255, 255, 255));
        lwel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lwel.setText("demo");
        getContentPane().add(lwel);
        lwel.setBounds(20, 40, 80, 20);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Learn_With_Web_Classes/images/welcome.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 110, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Learn_With_Web_Classes/images/home_back.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 830, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aeroMouseClicked
        closeMe();
        Login l=new Login();
        l.setVisible(true);
    }//GEN-LAST:event_aeroMouseClicked

    private void account1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_account1ActionPerformed
        closeMe();
        NewUser u1=new NewUser();
        u1.setVisible(true);
        u1.setUser(username);
    }//GEN-LAST:event_account1ActionPerformed

    private void studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentActionPerformed
        closeMe();                
        Student stu=new Student();
        stu.setVisible(true);
        stu.setUser(username);
    }//GEN-LAST:event_studentActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        int log=0;
        DefaultTableModel model=(DefaultTableModel)table.getModel();
        Object[] col=new Object[10]; 
        try{
        Connect c=new Connect();
        Connection conn=c.connectTo();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select * from mydb.student_record");
        while(rs.next())
        {
        if(rs.getString("student_name").equalsIgnoreCase(sn.getText()))
        { 
            if(log==0)
            {while(model.getRowCount()>0)
        {
        for(int i=0;i<model.getRowCount();i++){
        model.removeRow(i);
        }        
        }}
            col[0]=rs.getString("id");
            col[1]=rs.getString("student_name");
            col[2]=rs.getString("father_name");
            col[3]=rs.getString("category");
            col[4]=rs.getString("class_course");
            col[5]=rs.getString("fess");
            col[6]=rs.getString("date_of_admission");
            col[7]=rs.getString("mobile_no");
            col[8]=rs.getString("status");
            col[9]= rs.getString("address");           
            model.addRow(col);     
    
             log=1;
       // break; 
        }               
        }       
        rs.close();
        st.close();        
        conn.close(); 
        if(log==0)
            JOptionPane.showMessageDialog(null,"Record Not Found","Dialog",JOptionPane.DEFAULT_OPTION);
        }catch(SQLException ex){System.out.println("sql exception");}   
    }//GEN-LAST:event_searchActionPerformed

    private void snKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_snKeyReleased
/*      DefaultTableModel model=(DefaultTableModel)table.getModel();
        Object[] col=new Object[10]; 
        try
        {
        Connect c=new Connect();
        Connection conn=c.connectTo();
        PreparedStatement st=conn.prepareStatement("select * from mydb.student_record where student_name=?");
        st.setString(1,sn.getText());        
        ResultSet rs=st.executeQuery();
        while(rs.next()){
            col[0]=rs.getString("id");
            col[1]=rs.getString("student_name");
            col[2]=rs.getString("father_name");
            col[3]=rs.getString("category");
            col[4]=rs.getString("class_course");
            col[5]=rs.getString("fess");
            col[6]=rs.getString("date_of_admission");
            col[7]=rs.getString("mobile_no");
            col[8]=rs.getString("status");
            col[9]= rs.getString("address");           
            model.addRow(col);}
        rs.close();
        st.close();
        }catch(SQLException ex){}
        */
        
    }//GEN-LAST:event_snKeyReleased

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
    DefaultTableModel model=(DefaultTableModel)table.getModel();
    {while(model.getRowCount()>0)
        {
        for(int i=0;i<model.getRowCount();i++){
        model.removeRow(i);
        }        
        }}
        showUser();       
    }//GEN-LAST:event_refreshActionPerformed

    private void snActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snActionPerformed
      
    }//GEN-LAST:event_snActionPerformed

    private void fees1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fees1ActionPerformed
        closeMe();
        Fees_Form fom=new Fees_Form();
        fom.setVisible(true);
        fom.setUser(username);
    }//GEN-LAST:event_fees1ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton account1;
    private javax.swing.JLabel aero;
    private javax.swing.JLabel ccs;
    private javax.swing.JLabel cd;
    private javax.swing.JLabel cts;
    private javax.swing.JButton emp;
    private javax.swing.JButton fees1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel ldate;
    private javax.swing.JLabel lsname;
    private javax.swing.JLabel ltime;
    private javax.swing.JLabel lts;
    private javax.swing.JLabel lwel;
    private javax.swing.JLabel name;
    private javax.swing.JButton refresh;
    private javax.swing.JButton search;
    private javax.swing.JTextField sn;
    private javax.swing.JButton student;
    private javax.swing.JTable table;
    private javax.swing.JLabel tcr;
    private javax.swing.JLabel td;
    private javax.swing.JLabel tts;
    // End of variables declaration//GEN-END:variables
}
