
package Learn_With_Web_Classes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Panding_Fess extends javax.swing.JFrame {
    String username;
    public void setUser(String username)
    {
    this.username=username;    
    }
    private void tussionFeeDetails(String id)
    {
    String sql="select sum(deposit_amount),sum(fees) from mydb.fess_details where id='"+id+"'";
    try{    
        Connect c=new Connect();
        Connection conn=c.connectTo();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery(sql);
        while(rs.next()){
        pf.setText(String.valueOf(Integer.parseInt(rs.getString("sum(fees)"))-Integer.parseInt(rs.getString("sum(deposit_amount)"))));
        break;
        }  
        rs.close();
        st.close();
        conn.close();
        
    }catch(SQLException ex){JOptionPane.showMessageDialog(null,"sql error","error",JOptionPane.DEFAULT_OPTION);}
    
    
    }
    private void computerFeeDetails(String id)
    {
    String sql="select sum(deposit_amount) from mydb.fess_details where id='"+id+"'";
    String sql1="select fees from mydb.fess_details where id='"+id+"'";
    try{  
        Connect c=new Connect();
        Connection conn=c.connectTo();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery(sql);      
        int r1=0,r2=0;
        while(rs.next()){            
        r1=Integer.parseInt(rs.getString("sum(deposit_amount)"));
        break;
        }
        rs.close();
        ResultSet rs1=st.executeQuery(sql1);
        while(rs1.next()){
        r2=Integer.parseInt(rs1.getString("fees"));
        break;
        }
        rs1.close();        
        st.close();
        conn.close();
        pf.setText(""+(r2-r1));
    }catch(SQLException ex){JOptionPane.showMessageDialog(null,"sql error","error",JOptionPane.DEFAULT_OPTION);}
     }
    private void feeCalculation()
    {    
        DefaultTableModel mod1=(DefaultTableModel)table.getModel(); 
        String id=mod1.getValueAt(table.getSelectedRow(),0).toString();
        String cat=mod1.getValueAt(table.getSelectedRow(),4).toString();
        if(cat.equalsIgnoreCase("tussion"))
         tussionFeeDetails(id);   
        else
         computerFeeDetails(id);        
        sname1.setText(mod1.getValueAt(table.getSelectedRow(),1).toString());
        fname1.setText(mod1.getValueAt(table.getSelectedRow(),2).toString());
    }
    private void closeMe()
    {
        WindowEvent meClose=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(meClose);
    }
    private ArrayList<Users> userList()
    {
    ArrayList<Users> userList=new ArrayList<>();
    
    try{
        Connect c=new Connect();
        Connection conn=c.connectTo();
    Statement st=conn.createStatement();
    ResultSet rs=st.executeQuery("select * from mydb.student_record");
    Users user;
    
    while(rs.next())
    {
    user=new Users(rs.getString("id"),rs.getString("student_name"),rs.getString("father_name"),rs.getString("mobile_no"),rs.getString("category"));
    userList.add(user);
    }
    st.close();
    rs.close();
    conn.close();  
    }catch(SQLException ex){System.out.println("sql exception");}    
    return userList; 
    }    
    private void showUser()
    {
        ArrayList<Users> list=userList();
    DefaultTableModel model=(DefaultTableModel)table.getModel();
    Object[] col=new Object[5];
    for(int i=0;i<list.size();i++)
    {
            col[0]=list.get(i).id();
            col[1]=list.get(i).sname();
            col[2]=list.get(i).fname();                        
            col[3]=list.get(i).mob();
            col[4]=list.get(i).category();
            model.addRow(col);           
    }}
    
Dimension ssize=Toolkit.getDefaultToolkit().getScreenSize();
    public Panding_Fess() {
        initComponents();
        this.setLocation((int)ssize.getWidth()/2-this.getWidth()/2,(int)ssize.getHeight()/2-this.getHeight()/2);
        showUser();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        result = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lsn1 = new javax.swing.JLabel();
        lfn1 = new javax.swing.JLabel();
        lfn3 = new javax.swing.JLabel();
        lfn4 = new javax.swing.JLabel();
        print = new javax.swing.JButton();
        rset1 = new javax.swing.JButton();
        sname1 = new javax.swing.JLabel();
        fname1 = new javax.swing.JLabel();
        pf = new javax.swing.JLabel();
        db1 = new javax.swing.JLabel();
        lfn5 = new javax.swing.JLabel();
        dd1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lsn2 = new javax.swing.JLabel();
        cpa = new javax.swing.JTextField();
        lsn3 = new javax.swing.JLabel();
        tpa = new javax.swing.JTextField();
        lsn4 = new javax.swing.JLabel();
        pa = new javax.swing.JTextField();
        filter = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        catg = new javax.swing.JComboBox<>();
        txtsearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(830, 450));
        setUndecorated(true);
        getContentPane().setLayout(null);

        result.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lsn1.setText("Student Name");

        lfn1.setText("Father's Name");

        lfn3.setText("Panding Fess");

        lfn4.setText("Last Dpt. By");

        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        rset1.setText("Reset");
        rset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rset1ActionPerformed(evt);
            }
        });

        sname1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        fname1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        pf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        db1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lfn5.setText("Last Dpt. Date");

        dd1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lfn3)
                                .addGap(32, 32, 32)
                                .addComponent(pf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lfn1)
                                    .addComponent(lsn1))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sname1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fname1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lfn5)
                                    .addComponent(lfn4))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(db1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dd1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(print)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rset1)
                        .addGap(26, 26, 26)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lsn1)
                    .addComponent(sname1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lfn1)
                    .addComponent(fname1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lfn3)
                    .addComponent(pf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dd1)
                    .addComponent(lfn5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lfn4)
                    .addComponent(db1))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rset1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Imprint MT Shadow", 0, 18)); // NOI18N
        jLabel5.setText("Panding Fees Details");

        lsn2.setText("Computer Panding Amount");

        cpa.setEditable(false);

        lsn3.setText("Tussion Panding Amount");

        tpa.setEditable(false);

        lsn4.setText("Total Panding Amount");

        pa.setEditable(false);

        javax.swing.GroupLayout resultLayout = new javax.swing.GroupLayout(result);
        result.setLayout(resultLayout);
        resultLayout.setHorizontalGroup(
            resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultLayout.createSequentialGroup()
                .addGroup(resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(resultLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lsn4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pa, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, resultLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resultLayout.createSequentialGroup()
                                .addGap(0, 8, Short.MAX_VALUE)
                                .addComponent(lsn2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cpa, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, resultLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, resultLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lsn3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tpa, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        resultLayout.setVerticalGroup(
            resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lsn2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tpa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lsn3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lsn4))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        getContentPane().add(result);
        result.setBounds(550, 60, 270, 380);

        filter.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Filter By-");

        catg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a category", "Id", "Student_Name", "Father_Name", "Mobile_no", " " }));
        catg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catgActionPerformed(evt);
            }
        });

        txtsearch.setEnabled(false);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student_id", "Student Name", "Father name", "Mobile", "Category"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(0).setPreferredWidth(40);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(4).setResizable(false);
        }

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout filterLayout = new javax.swing.GroupLayout(filter);
        filter.setLayout(filterLayout);
        filterLayout.setHorizontalGroup(
            filterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(catg, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(filterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(filterLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        filterLayout.setVerticalGroup(
            filterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(filterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(catg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(342, Short.MAX_VALUE))
            .addGroup(filterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, filterLayout.createSequentialGroup()
                    .addContainerGap(42, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        getContentPane().add(filter);
        filter.setBounds(10, 60, 530, 380);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Imprint MT Shadow", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Panding Fees ");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(290, 0, 277, 43);

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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Learn_With_Web_Classes/images/back_areo.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(770, 0, 40, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Learn_With_Web_Classes/images/pandingfee_back.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 830, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
       closeMe();
       Fees_Form fom=new Fees_Form();
       fom.setVisible(true);
       fom.setUser(username);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void catgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catgActionPerformed
       if(catg.getSelectedIndex()==0){
           txtsearch.setText("");
           txtsearch.enable(false);
           txtsearch.setBackground(Color.GRAY);
       }
       else
       {
           txtsearch.enable(true);           
           txtsearch.setBackground(Color.WHITE);
       }
    }//GEN-LAST:event_catgActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
if(txtsearch.getText().isEmpty())
    JOptionPane.showMessageDialog(null,"Fields can't be Empty","Error",JOptionPane.INFORMATION_MESSAGE);
else
{
        int log=0;
        DefaultTableModel model=(DefaultTableModel)table.getModel();
        Object[] col=new Object[5]; 
        try{
        Connect c=new Connect();
        Connection conn=c.connectTo();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select * from mydb.student_record");
        while(rs.next())
        {
        if(rs.getString(String.valueOf(catg.getSelectedItem())).equalsIgnoreCase(txtsearch.getText()))
        { 
            if(log==0)
            {while(model.getRowCount()>0)
               {
                   for(int i=0;i<model.getRowCount();i++){
                       model.removeRow(i);
                      }        
                }
            }
            col[0]=rs.getString("id");
            col[1]=rs.getString("student_name");
            col[2]=rs.getString("father_name");            
            col[3]=rs.getString("mobile_no");
            col[4]=rs.getString("Category");
            model.addRow(col);     
            log=1;        
        }               
        }       
        rs.close();
        st.close();        
        conn.close(); 
        if(log==0)
            JOptionPane.showMessageDialog(null,"Record Not Found","Dialog",JOptionPane.DEFAULT_OPTION);
        }catch(SQLException ex){System.out.println("sql exception");}  }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed

    }//GEN-LAST:event_printActionPerformed

    private void rset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rset1ActionPerformed
        sname1.setText("");
        fname1.setText("");
        dd1.setText("");        
        pf.setText("");
        db1.setText("");
    }//GEN-LAST:event_rset1ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        feeCalculation();
    }//GEN-LAST:event_tableMouseClicked

    private void tableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableKeyPressed

    }//GEN-LAST:event_tableKeyPressed

    private void tableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableKeyReleased
       feeCalculation();
    }//GEN-LAST:event_tableKeyReleased

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
            java.util.logging.Logger.getLogger(Panding_Fess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panding_Fess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panding_Fess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panding_Fess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panding_Fess().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> catg;
    private javax.swing.JTextField cpa;
    private javax.swing.JLabel db1;
    private javax.swing.JLabel dd1;
    private javax.swing.JPanel filter;
    private javax.swing.JLabel fname1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lfn1;
    private javax.swing.JLabel lfn3;
    private javax.swing.JLabel lfn4;
    private javax.swing.JLabel lfn5;
    private javax.swing.JLabel lsn1;
    private javax.swing.JLabel lsn2;
    private javax.swing.JLabel lsn3;
    private javax.swing.JLabel lsn4;
    private javax.swing.JTextField pa;
    private javax.swing.JLabel pf;
    private javax.swing.JButton print;
    private javax.swing.JPanel result;
    private javax.swing.JButton rset1;
    private javax.swing.JLabel sname1;
    private javax.swing.JTable table;
    private javax.swing.JTextField tpa;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
