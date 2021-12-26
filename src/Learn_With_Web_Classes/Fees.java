/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learn_With_Web_Classes;

import databasequery.SqlQuery;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
public class Fees extends javax.swing.JFrame {
    private String username;
    public void setUser(String s)
    {
    this.username=s;
    dpb.setText(s);    
    }
    private void setFields()
    {
    sname1.setText(sname.getText());
    fname1.setText(fname.getText());
    dd1.setText(date.getText());
    da.setText(ef.getText());
    db1.setText(dpb.getText());    
    }
    private void tussionFeeDetails()
    {
    String sql="select sum(deposit_amount),sum(fees) from fess_details where id='"+lid.getText()+"'";
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
        setFields();
    }catch(SQLException ex){JOptionPane.showMessageDialog(null,"sql error","error",JOptionPane.DEFAULT_OPTION);}
    
    
    }
    private void computerFeeDetails()
    {
    String sql="select sum(deposit_amount) from fess_details where id='"+lid.getText()+"'";
    try{  
        Connect c=new Connect();
       Connection conn=c.connectTo();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery(sql);
        while(rs.next()){
        pf.setText(String.valueOf(Integer.parseInt(fes.getText())-Integer.parseInt(rs.getString("sum(deposit_amount)"))));
        break;
        }  
        rs.close();
        st.close();
        conn.close();
        setFields();
    }catch(SQLException ex){JOptionPane.showMessageDialog(null,"sql error","error",JOptionPane.DEFAULT_OPTION);}
    
    
    }
    private void reset()
    {
    id.setText("");    
    fname.setText("");
    sname.setText("");
    catg.setText("");
    cls.setText("");
    fes.setText("");
    lid.setText("");
    ef.setText("");   
    date.setText(showDate());
    }
    public String showDate()
 {
 Date d=new Date();
 SimpleDateFormat s=new SimpleDateFormat("dd-MM-yyyy");
 date.setText(s.format(d));
 return(s.format(d)); 
 }
    private void closeMe()
    {
        WindowEvent meClose=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(meClose);
    }
    Dimension ssize=Toolkit.getDefaultToolkit().getScreenSize();
    public Fees() {
        //ref.setText(s);
        initComponents();
        date.setText(showDate());
        this.setLocation((int)ssize.getWidth()/2-this.getWidth()/2,(int)ssize.getHeight()/2-this.getHeight()/2);
        if(!new SqlQuery().isTableExist("fess_details"))
        {       
           new SqlQuery().createTable("fess_details","id number primary key,category varchar2(20),fees number,deposit_amount number,date_of_deposit varchar2(20),deposited_by varchar2(20)");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lsn = new javax.swing.JLabel();
        lfn = new javax.swing.JLabel();
        lcatg = new javax.swing.JLabel();
        lclas = new javax.swing.JLabel();
        lmob = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sname = new javax.swing.JLabel();
        fname = new javax.swing.JLabel();
        catg = new javax.swing.JLabel();
        cls = new javax.swing.JLabel();
        fes = new javax.swing.JLabel();
        lid = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        ef = new javax.swing.JTextField();
        deposit = new javax.swing.JButton();
        dpb = new javax.swing.JTextField();
        ldoa = new javax.swing.JLabel();
        lfee = new javax.swing.JLabel();
        rset = new javax.swing.JButton();
        date = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        lsn1 = new javax.swing.JLabel();
        lfn1 = new javax.swing.JLabel();
        lfn3 = new javax.swing.JLabel();
        lfn4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        print = new javax.swing.JButton();
        lfn5 = new javax.swing.JLabel();
        lfn6 = new javax.swing.JLabel();
        rset1 = new javax.swing.JButton();
        sname1 = new javax.swing.JLabel();
        fname1 = new javax.swing.JLabel();
        dd1 = new javax.swing.JLabel();
        da = new javax.swing.JLabel();
        pf = new javax.swing.JLabel();
        db1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lsname = new javax.swing.JLabel();
        searchr = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(830, 450));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lsn.setText("Student Name");

        lfn.setText("Father's Name");

        lcatg.setText("Category");

        lclas.setText("Class or Course");

        lmob.setText("student Id");

        jLabel5.setText("Fess");

        sname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        fname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        catg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        cls.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        fes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lcatg)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lsn)
                                .addComponent(lfn))
                            .addComponent(lclas)
                            .addComponent(jLabel5)
                            .addComponent(lmob))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(catg, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cls, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fes, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lid, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lsn)
                    .addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lfn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(catg, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lcatg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cls, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lclas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fes, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lid, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lmob))
                .addGap(13, 13, 13))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setText("Deposited  by");

        deposit.setText("Deposit");
        deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositActionPerformed(evt);
            }
        });

        dpb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dpb.setEnabled(false);

        ldoa.setText("Deposit Date*");

        lfee.setText("Enter Deposit Amount*");

        rset.setText("Reset");
        rset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lfee)
                            .addComponent(jLabel14)
                            .addComponent(ldoa, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(deposit)
                        .addGap(12, 12, 12)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ef)
                        .addComponent(dpb, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(date))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(rset)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ldoa)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lfee))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dpb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deposit)
                    .addComponent(rset))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lsn1.setText("Student Name");

        lfn1.setText("Father's Name");

        lfn3.setText("Panding Fess");

        lfn4.setText("Deposited By");

        jLabel1.setFont(new java.awt.Font("Imprint MT Shadow", 0, 18)); // NOI18N
        jLabel1.setText("Fees Details");

        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        lfn5.setText("Deposit Date");

        lfn6.setText("Deposit Amount");

        rset1.setText("Reset");
        rset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rset1ActionPerformed(evt);
            }
        });

        sname1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        fname1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        dd1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        da.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        pf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        db1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lfn3)
                        .addGap(32, 32, 32)
                        .addComponent(pf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lfn5)
                        .addGap(30, 30, 30)
                        .addComponent(dd1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lfn6)
                        .addGap(18, 18, 18)
                        .addComponent(da, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lfn4)
                        .addGap(32, 32, 32)
                        .addComponent(db1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lfn1)
                            .addComponent(lsn1))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(sname1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fname1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(print)
                .addGap(35, 35, 35)
                .addComponent(rset1)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lsn1)
                    .addComponent(sname1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lfn1)
                    .addComponent(fname1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lfn5)
                    .addComponent(dd1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lfn6)
                    .addComponent(da))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lfn3)
                    .addComponent(pf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lfn4)
                    .addComponent(db1))
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(print)
                    .addComponent(rset1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lsname.setText("Student Id*");

        searchr.setText("Search");
        searchr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(lsname)
                .addGap(26, 26, 26)
                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchr)
                .addGap(65, 65, 65))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lsname)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchr))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 50, 810, 390);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Imprint MT Shadow", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Fees Deposit");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(320, 0, 277, 43);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Learn_With_Web_Classes/images/back_areo.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(770, 0, 40, 40);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 45, 830, 2);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Learn_With_Web_Classes/images/fee_back.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 830, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchrActionPerformed
        int log=0;
        try{
            Connect c=new Connect();
            Connection conn=c.connectTo();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select * from student_record");
        while(rs.next())
        {
        if(rs.getString("id").equalsIgnoreCase(id.getText()))
        {
        sname.setText(rs.getString("student_name"));
        fname.setText(rs.getString("father_name"));
        catg.setText(rs.getString("category"));
        cls.setText(rs.getString("class_course"));
        lid.setText(rs.getString("id"));
        fes.setText(rs.getString("fess"));    
        log=1;
        break; 
        }               
        }       
        rs.close();
        st.close();        
        conn.close();        
        if(log==0)
        JOptionPane.showMessageDialog(null,"Record Not Found","Dialog",JOptionPane.DEFAULT_OPTION);
        id.setText("");        
        }catch(SQLException ex){JOptionPane.showMessageDialog(null,"SQL EXCEPTION","Error",JOptionPane.DEFAULT_OPTION);}        
               
    }//GEN-LAST:event_searchrActionPerformed

    private void depositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositActionPerformed
     
           String sql="insert into fess_details(id,category,fees,deposit_amount,date_of_deposit,deposited_by) values(?,?,?,?,?,?)";
        try{
        Connect c=new Connect();
        Connection conn=c.connectTo();
        PreparedStatement pst=conn.prepareStatement(sql);
        pst.setString(1,lid.getText());
        pst.setString(2,catg.getText());
        pst.setString(3,fes.getText());
        pst.setString(4,ef.getText());
        pst.setString(5,date.getText());
        pst.setString(6,dpb.getText());        
        pst.executeUpdate();
        pst.close();
        conn.close();
        JOptionPane.showMessageDialog(null,"Fees Deposited","Dialog",JOptionPane.DEFAULT_OPTION);
        if(catg.getText().equalsIgnoreCase("Tussion"))
          tussionFeeDetails();  
        else
         computerFeeDetails();  
        reset();        
        }catch(SQLException ex){System.out.println("sql exception");}
    }//GEN-LAST:event_depositActionPerformed

    private void rsetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsetActionPerformed
      
    }//GEN-LAST:event_rsetActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
  
    }//GEN-LAST:event_printActionPerformed

    private void rset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rset1ActionPerformed
        sname1.setText("");
        fname1.setText("");
        dd1.setText("");
        da.setText("");
        pf.setText("");
        db1.setText("");
    }//GEN-LAST:event_rset1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
       closeMe();
       Fees_Form fom=new Fees_Form();
       fom.setVisible(true);
       fom.setUser(username);
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(Fees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel catg;
    private javax.swing.JLabel cls;
    private javax.swing.JLabel da;
    private javax.swing.JTextField date;
    private javax.swing.JLabel db1;
    private javax.swing.JLabel dd1;
    private javax.swing.JButton deposit;
    private javax.swing.JTextField dpb;
    private javax.swing.JTextField ef;
    private javax.swing.JLabel fes;
    private javax.swing.JLabel fname;
    private javax.swing.JLabel fname1;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lcatg;
    private javax.swing.JLabel lclas;
    private javax.swing.JLabel ldoa;
    private javax.swing.JLabel lfee;
    private javax.swing.JLabel lfn;
    private javax.swing.JLabel lfn1;
    private javax.swing.JLabel lfn3;
    private javax.swing.JLabel lfn4;
    private javax.swing.JLabel lfn5;
    private javax.swing.JLabel lfn6;
    private javax.swing.JLabel lid;
    private javax.swing.JLabel lmob;
    private javax.swing.JLabel lsn;
    private javax.swing.JLabel lsn1;
    private javax.swing.JLabel lsname;
    private javax.swing.JLabel pf;
    private javax.swing.JButton print;
    private javax.swing.JButton rset;
    private javax.swing.JButton rset1;
    private javax.swing.JButton searchr;
    private javax.swing.JLabel sname;
    private javax.swing.JLabel sname1;
    // End of variables declaration//GEN-END:variables
}
