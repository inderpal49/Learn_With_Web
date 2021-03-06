package Learn_With_Web_Classes;
import databasequery.SqlQuery;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
public class Student extends javax.swing.JFrame {
    
    String username;
    public void setUser(String username)
    {
    this.username=username;
    ref.setText(username);
    }
    public void showDate()
 {
 java.util.Date d1=new java.util.Date();
 SimpleDateFormat s=new SimpleDateFormat("dd-MM-yyyy");
 doa.setText(s.format(d1));
 }
    
    private String setClass_Course()
    {
     String s;
     if(catg.getSelectedIndex()==1 && lcomc.getSelectedIndex()!=0)
     {
     s=String.valueOf(lcomc.getSelectedItem());
     return s;     
     }
     else if(catg.getSelectedIndex()==2 && lcourse.getSelectedIndex()!=0 && String.valueOf(lcourse.getSelectedItem())!="OTHER")
     {
     s=String.valueOf(lcourse.getSelectedItem());
     return s;
     }
     else
         return(loc.getText());   
   
    }
    private String setComputerFess(String s)
    {
    switch(s){
        case "Select a course":return "";
        case "Basic of Computer":return "1500";
        case "Telly":return "1500";
        case "Advance Excel":return "2500";
        case "Hardware and Networking":return "6000";
        case "C":return "1500";
        case "C++":return "1500";
        case "CORE JAVA":return "2000";
        case "ADVANCE JAVA":return "2000";
        case "C#":return "4000";
        case "ASP.NET":return "3500";
        case "PYTHON":return "2000";
        case "HTML,CSS":return "2500";
        case "JAVA SCRIPT":return "2000";
        case "PHP":return "3000";
        case "SQL SERVER":return "2500";
        case "MYSQL":return "2500";
        case "PHOTOSHOP":return "1500";  
        case "OTHER":return ""; 
    }
    return s;
    }
   
    private String setTussionFess(String s)
    {
    switch(s){
        case "Select a class":return "";
        case "nursary":return "100";
        case "L.K.G":return "100";
        case "U.K.G":return "100";
        case "1st":return "100";
        case "2nd":return "100";
        case "3rd":return "150";
        case "4th":return "200";
        case "5th":return "200";
        case "6th":return "250";
        case "7th":return "250";
        case "8th":return "300";
        case "9th":return "300";
        case "10th":return "400";
        case "11th":return "450";
        case "12th":return "500";      
    }
    return s;
    }
    
    private void closeMe()
    {
        WindowEvent meClose=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(meClose);
    }
    private void reset()
    {
    id.setText("");   
    sname.setText("");
    fname.setText("");
    dob.setText("");
    catg.setSelectedIndex(0);
    status.setSelectedIndex(0);
    loc.setText("");
    mob.setText("");
    fess.setText("");
    addr.setText("");
    doa.setText(""); 
    sn.setText("");
    fn.setText("");
    ref.setText(username);
    agree.setSelected(false);
    agree.setText("I agree all Terms and Conditions");
    agree.setForeground(Color.BLACK);
    }
    Dimension ssize=Toolkit.getDefaultToolkit().getScreenSize();
    public Student(){        
        initComponents();
        showDate();
        this.setLocation((int)ssize.getWidth()/2-this.getWidth()/2,(int)ssize.getHeight()/2-this.getHeight()/2);
          if(!new SqlQuery().isTableExist("student_record"))
        {       
           new SqlQuery().createTable("student_record","id number primary key,student_name varchar2(20),father_name varchar2(20),date_of_brith varchar2(20),category varchar2(20),class_course varchar2(20),fess varchar2(10),address varchar2(30),date_of_admission varchar2(15),mobile_no varchar2(20),status varchar2(20),refference_name varchar2(20)");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        search = new javax.swing.JButton();
        lsname = new javax.swing.JLabel();
        sn = new javax.swing.JTextField();
        fn = new javax.swing.JTextField();
        lfname = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        add = new javax.swing.JButton();
        dele = new javax.swing.JButton();
        upd = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        fname = new javax.swing.JTextField();
        lsn = new javax.swing.JLabel();
        lfn = new javax.swing.JLabel();
        lcatg = new javax.swing.JLabel();
        sname = new javax.swing.JTextField();
        catg = new javax.swing.JComboBox<>();
        mob = new javax.swing.JTextField();
        lclas = new javax.swing.JLabel();
        ldoa = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        doa = new javax.swing.JTextField();
        lfee = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lmob = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ref = new javax.swing.JTextField();
        dob = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        addr = new javax.swing.JTextArea();
        lcomc = new javax.swing.JComboBox<>();
        lcourse = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        loc = new javax.swing.JTextField();
        lfee1 = new javax.swing.JLabel();
        agree = new javax.swing.JCheckBox();
        jcb = new javax.swing.JCheckBox();
        fess = new javax.swing.JTextField();
        lsn1 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        bck = new javax.swing.JLabel();
        line = new javax.swing.JPanel();
        back_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(830, 450));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(830, 450));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel11.setFont(new java.awt.Font("Imprint MT Shadow", 0, 25)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Student Registration");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(290, 0, 240, 31);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        search.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        lsname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lsname.setText("Student Name*");

        lfname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lfname.setText("Father's name*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lsname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(lfname)
                .addGap(32, 32, 32)
                .addComponent(fn, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(search)
                .addGap(75, 75, 75))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lsname)
                    .addComponent(lfname)
                    .addComponent(fn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(70, 50, 700, 40);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        add.setBackground(new java.awt.Color(204, 204, 255));
        add.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add.setText("Add Student");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        dele.setBackground(new java.awt.Color(204, 204, 255));
        dele.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        dele.setText("Delete Student");
        dele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleActionPerformed(evt);
            }
        });

        upd.setBackground(new java.awt.Color(204, 204, 255));
        upd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        upd.setText("Update Student");
        upd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(204, 204, 255));
        reset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(add)
                .addGap(75, 75, 75)
                .addComponent(dele, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(upd)
                .addGap(85, 85, 85)
                .addComponent(reset)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add)
                    .addComponent(dele)
                    .addComponent(upd)
                    .addComponent(reset))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(70, 390, 700, 40);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 280));
        jPanel2.setLayout(null);

        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        jPanel2.add(fname);
        fname.setBounds(118, 67, 153, 25);

        lsn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lsn.setText("Student Name*");
        jPanel2.add(lsn);
        lsn.setBounds(12, 44, 87, 14);

        lfn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lfn.setText("Father's Name*");
        jPanel2.add(lfn);
        lfn.setBounds(12, 70, 88, 14);

        lcatg.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lcatg.setText("Category*");
        jPanel2.add(lcatg);
        lcatg.setBounds(12, 122, 59, 14);

        sname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snameActionPerformed(evt);
            }
        });
        jPanel2.add(sname);
        sname.setBounds(117, 41, 154, 25);

        catg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Category", "Tussion", "Computer" }));
        catg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catgActionPerformed(evt);
            }
        });
        jPanel2.add(catg);
        catg.setBounds(118, 119, 153, 25);
        jPanel2.add(mob);
        mob.setBounds(435, 141, 153, 25);

        lclas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lclas.setText("Class*");
        jPanel2.add(lclas);
        lclas.setBounds(12, 150, 36, 14);

        ldoa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ldoa.setText("Date of Admission*");
        jPanel2.add(ldoa);
        ldoa.setBounds(304, 118, 109, 14);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Address");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(306, 84, 50, 20);
        jPanel2.add(doa);
        doa.setBounds(435, 115, 153, 25);

        lfee.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lfee.setText("Fees*");
        jPanel2.add(lfee);
        lfee.setBounds(303, 40, 40, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Date of Brith");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(12, 96, 71, 14);

        lmob.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lmob.setText("Mobile No.*");
        jPanel2.add(lmob);
        lmob.setBounds(304, 144, 70, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Course*");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(12, 176, 46, 14);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Refference by");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(304, 202, 79, 14);

        ref.setEnabled(false);
        jPanel2.add(ref);
        ref.setBounds(436, 199, 152, 25);

        dob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobActionPerformed(evt);
            }
        });
        jPanel2.add(dob);
        dob.setBounds(118, 93, 153, 25);

        addr.setColumns(10);
        addr.setRows(1);
        addr.setTabSize(0);
        addr.setAutoscrolls(false);
        jScrollPane1.setViewportView(addr);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(434, 72, 154, 37);

        lcomc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a class", "nursary", "L.K.G", "U.K.G", "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th", "9th", "10th", "11th", "12th" }));
        lcomc.setEnabled(false);
        lcomc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lcomcActionPerformed(evt);
            }
        });
        jPanel2.add(lcomc);
        lcomc.setBounds(118, 147, 153, 25);

        lcourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a course", "Basic of Computer", "Telly", "Advance Excel", "Hardware and Networking", "C", "C++", "CORE JAVA", "ADVANCE JAVA", "C#", "ASP.NET", "PYTHON", "HTML,CSS", "JAVA SCRIPT", "PHP", "SQL SERVER", "MYSQL", "PHOTOSHOP", "OTHER", " ", " ", " " }));
        lcourse.setEnabled(false);
        lcourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lcourseActionPerformed(evt);
            }
        });
        jPanel2.add(lcourse);
        lcourse.setBounds(118, 173, 153, 25);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Other Course*");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(12, 199, 81, 20);

        loc.setEnabled(false);
        loc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locActionPerformed(evt);
            }
        });
        jPanel2.add(loc);
        loc.setBounds(118, 199, 153, 25);

        lfee1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lfee1.setText("Manual Fees* ");
        jPanel2.add(lfee1);
        lfee1.setBounds(300, 10, 90, 20);

        agree.setBackground(new java.awt.Color(204, 204, 204));
        agree.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        agree.setText("I agree all Terms and Conditions");
        jPanel2.add(agree);
        agree.setBounds(220, 248, 270, 23);

        jcb.setBackground(new java.awt.Color(204, 204, 204));
        jcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbActionPerformed(evt);
            }
        });
        jPanel2.add(jcb);
        jcb.setBounds(434, 13, 21, 21);

        fess.setEnabled(false);
        fess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fessActionPerformed(evt);
            }
        });
        jPanel2.add(fess);
        fess.setBounds(434, 41, 154, 25);

        lsn1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lsn1.setText("Student Id*");
        jPanel2.add(lsn1);
        lsn1.setBounds(12, 18, 67, 14);

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel2.add(id);
        id.setBounds(117, 15, 154, 25);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Status*");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(304, 170, 50, 20);

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a category", "Active", "De-active" }));
        jPanel2.add(status);
        status.setBounds(436, 167, 152, 25);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(110, 100, 610, 280);

        bck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Learn_With_Web_Classes/images/back_areo.png"))); // NOI18N
        bck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bckMouseClicked(evt);
            }
        });
        getContentPane().add(bck);
        bck.setBounds(770, 5, 50, 30);

        javax.swing.GroupLayout lineLayout = new javax.swing.GroupLayout(line);
        line.setLayout(lineLayout);
        lineLayout.setHorizontalGroup(
            lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        lineLayout.setVerticalGroup(
            lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        getContentPane().add(line);
        line.setBounds(0, 40, 830, 2);

        back_label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        back_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Learn_With_Web_Classes/images/images.jpg"))); // NOI18N
        getContentPane().add(back_label);
        back_label.setBounds(0, 0, 830, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void snameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_snameActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void dobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
if(agree.isSelected()){
  if(username.equalsIgnoreCase(ref.getText()))
   {
       if(id.getText().isEmpty()||fname.getText().isEmpty()||sname.getText().isEmpty()||fess.getText().isEmpty()||doa.getText().isEmpty()||mob.getText().isEmpty()||status.getSelectedIndex()==0)
        JOptionPane.showMessageDialog(null,"Mandatory Fields can't be Empty","Error",JOptionPane.INFORMATION_MESSAGE);
       else{
       String sql="insert into student_record(id,student_name,father_name,date_of_brith,category,class_course,fess,address,date_of_admission,mobile_no,status,refference_name)values(?,?,?,?,?,?,?,?,?,?,?,?)";
         Connect c=new Connect();
         Connection conn=c.connectTo();
        try
        {
        PreparedStatement pst=conn.prepareStatement(sql); 
        pst.setString(1,id.getText());
        pst.setString(2,sname.getText());
        pst.setString(3,fname.getText());
        pst.setString(4,dob.getText());
        pst.setString(5,String.valueOf(catg.getSelectedItem()));   
        pst.setString(6,setClass_Course());
        pst.setString(7,fess.getText());
        pst.setString(8,addr.getText());
        pst.setString(9,doa.getText());
        pst.setString(10,mob.getText());
        pst.setString(11,String.valueOf(status.getSelectedItem()));
        pst.setString(12,ref.getText());
        pst.executeUpdate();
        pst.close();
        conn.close();
        DialogBox.okDialog("Student Added Sucessfully");
       // JOptionPane.showMessageDialog(null,"Student Added Sucessfully","Dialog",JOptionPane.DEFAULT_OPTION);
        reset();
        }catch(SQLException ex){DialogBox.okDialogError("Student Id already Exixt");}
                } 
   }
   else
       DialogBox.okDialogError("You Have no right to add this Student By Another Refference");
}
else{
    agree.setForeground(Color.red);
    agree.setText("Please accept terms and Condition");}
    }//GEN-LAST:event_addActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
       reset();
       
    }//GEN-LAST:event_resetActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        int log=0;
        try{
        Connect c=new Connect();
        Connection conn=c.connectTo();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select * from student_record");
        while(rs.next())
        {
        if(rs.getString("student_name").equalsIgnoreCase(sn.getText()) && rs.getString("father_name").equalsIgnoreCase(fn.getText()))
        {
        id.setText(rs.getString("id"));
        sname.setText(rs.getString("student_name"));
        fname.setText(rs.getString("father_name"));
        dob.setText(rs.getString("date_of_brith"));
        if(rs.getString("category").equalsIgnoreCase("tussion"))
        { 
            catg.setSelectedIndex(1);
            String sk=rs.getString("class_course");
            lcomc.setSelectedItem(sk);
        }
        if(rs.getString("category").equalsIgnoreCase("Computer"))
        {
            catg.setSelectedIndex(2);
            String sk=rs.getString("class_course");
            if(setComputerFess(sk).equalsIgnoreCase(sk)){
                lcourse.setSelectedItem("OTHER");
                loc.setText(rs.getString("class_course"));            
            }
            else
            {
            lcourse.setSelectedItem(rs.getString("class_course"));
            
            }
        }     
        mob.setText(rs.getString("mobile_no"));
        fess.setText(rs.getString("fess"));
        addr.setText(rs.getString("address"));
        doa.setText(rs.getString("date_of_admission"));
        status.setSelectedItem(rs.getString("status"));
        ref.setText(rs.getString("refference_name"));
        log=1;
        break; 
        }               
        }       
        rs.close();
        st.close();        
        conn.close(); 
        if(log==0)
            JOptionPane.showMessageDialog(null,"Record Not Found","Dialog",JOptionPane.DEFAULT_OPTION);
        sn.setText("");
        fn.setText("");
        }catch(SQLException ex){System.out.println("sql exception");}
    }//GEN-LAST:event_searchActionPerformed

    private void deleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleActionPerformed
      if(username.equalsIgnoreCase(ref.getText()))
      {
        int log=0;        
        try{
        Connect c=new Connect();
        Connection conn=c.connectTo();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select * from student_record");
        while(rs.next())
        {
          if(rs.getString("id").equalsIgnoreCase(id.getText()) && rs.getString("student_name").equalsIgnoreCase(sname.getText())){
              log=1;
              rs.close();
              st.close();              
              break;}
        }
        if(log==1){         
         int i=JOptionPane.showConfirmDialog(null,"Are you Sure Want to delete This Record","Dialog",JOptionPane.YES_NO_OPTION);
         if(i==0){
         String sql="delete from student_record where id='"+id.getText()+"'";
         PreparedStatement pst=conn.prepareStatement(sql);
         pst.executeUpdate();
         conn.close();
         pst.close();
         JOptionPane.showMessageDialog(null,"Record Deleted","Dialog",JOptionPane.DEFAULT_OPTION);
         reset();
         }else
         conn.close();
          }
        else
        {
           DialogBox.okDialogError("No Record Found");
        }
            
        }catch(SQLException ex){JOptionPane.showMessageDialog(null,"SQL Querry Error","Dialog",JOptionPane.DEFAULT_OPTION);}
        
      }
      else
      {DialogBox.okDialogError("You Have no right to Delete this Student Record");}
    }//GEN-LAST:event_deleActionPerformed

    private void updActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updActionPerformed
      if(agree.isSelected()){
        if(username.equalsIgnoreCase(ref.getText())){
          
          if(id.getText().isEmpty()||fname.getText().isEmpty()||sname.getText().isEmpty()||fess.getText().isEmpty()||doa.getText().isEmpty()||mob.getText().isEmpty()||status.getSelectedIndex()==0)
        JOptionPane.showMessageDialog(null,"Mandatory Fields can't be Empty","Error",JOptionPane.INFORMATION_MESSAGE);
       else{
          int log=0;        
        try{
        Connect c=new Connect();
        Connection conn=c.connectTo();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select * from student_record");
        while(rs.next())
        {
          if(rs.getString("id").equalsIgnoreCase(id.getText())){
              log=1;
              rs.close();
              st.close();              
              break;}
        }
        if(log==1){         
         int i=JOptionPane.showConfirmDialog(null,"Are you Sure Want to Update This Record","Dialog",JOptionPane.YES_NO_OPTION);
         if(i==0){
         String sql="update student_record set student_name=?,father_name=?,date_of_brith=?,category=?,class_course=?,fess=?,address=?,date_of_admission=?,mobile_no=?,status=?,refference_name=? where id=?";
        PreparedStatement pst=conn.prepareStatement(sql);  
        pst.setString(1,sname.getText());
        pst.setString(2,fname.getText());
        pst.setString(3,dob.getText());
        pst.setString(4,String.valueOf(catg.getSelectedItem()));   
        pst.setString(5,setClass_Course());
        pst.setString(6,fess.getText());
        pst.setString(7,addr.getText());
        pst.setString(8,doa.getText());
        pst.setString(9,mob.getText());
        pst.setString(10,String.valueOf(status.getSelectedItem()));
        pst.setString(11,ref.getText());
        pst.setString(12,id.getText());
        pst.executeUpdate();
        pst.close();
        conn.close(); 
        JOptionPane.showMessageDialog(null,"Record Updated","Dialog",JOptionPane.DEFAULT_OPTION);
         reset();
         }
         else
         {conn.close();}
                         
          }
        else
        {
           DialogBox.okDialogError("No Record Found");
        }
            
        }catch(SQLException ex){JOptionPane.showMessageDialog(null,"SQL Querry Error","Dialog",JOptionPane.DEFAULT_OPTION);}
          }  
      }
      else
          DialogBox.okDialogError("You Have no right to Update this Student Record");
      }
        else{
    agree.setForeground(Color.red);
    agree.setText("Please accept terms and Condition");}
    }//GEN-LAST:event_updActionPerformed

    private void locActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locActionPerformed

    private void catgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catgActionPerformed
        if(catg.getSelectedIndex()==1){
            lcomc.enable(true);
            lcourse.enable(false);
            lcourse.setSelectedIndex(0);}
        else if(catg.getSelectedIndex()==2){
            lcomc.enable(false);
             lcomc.setSelectedIndex(0);
             lcourse.enable(true);
        }
        else{
            lcomc.enable(false);
            lcomc.setSelectedIndex(0);
            lcourse.enable(false);
            lcourse.setSelectedIndex(0);
        }
            
    }//GEN-LAST:event_catgActionPerformed

    private void lcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lcourseActionPerformed
String str=String.valueOf(lcourse.getSelectedItem());
if(str=="OTHER")
{
  fess.setText("");
  loc.enable(true);
  fess.enable(true);  
}
else
{
  loc.enable(false);
  fess.enable(false); 
fess.setText(setComputerFess(str));
}

    }//GEN-LAST:event_lcourseActionPerformed

    private void jcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbActionPerformed
    if(jcb.isSelected()==true)
      fess.enable(true);
    if(jcb.isSelected()==false)
        fess.enable(false);
    }//GEN-LAST:event_jcbActionPerformed

    private void fessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fessActionPerformed

    private void lcomcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lcomcActionPerformed
  fess.setText(setTussionFess(String.valueOf(lcomc.getSelectedItem())));
        
    }//GEN-LAST:event_lcomcActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void bckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bckMouseClicked
        closeMe();
        Home h=new Home();
        h.setVisible(true);
        h.setUser(username);
    }//GEN-LAST:event_bckMouseClicked

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
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextArea addr;
    private javax.swing.JCheckBox agree;
    private javax.swing.JLabel back_label;
    private javax.swing.JLabel bck;
    private javax.swing.JComboBox<String> catg;
    private javax.swing.JButton dele;
    private javax.swing.JTextField doa;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField fess;
    private javax.swing.JTextField fn;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox jcb;
    private javax.swing.JLabel lcatg;
    private javax.swing.JLabel lclas;
    private javax.swing.JComboBox<String> lcomc;
    private javax.swing.JComboBox<String> lcourse;
    private javax.swing.JLabel ldoa;
    private javax.swing.JLabel lfee;
    private javax.swing.JLabel lfee1;
    private javax.swing.JLabel lfn;
    private javax.swing.JLabel lfname;
    private javax.swing.JPanel line;
    private javax.swing.JLabel lmob;
    private javax.swing.JTextField loc;
    private javax.swing.JLabel lsn;
    private javax.swing.JLabel lsn1;
    private javax.swing.JLabel lsname;
    private javax.swing.JTextField mob;
    private javax.swing.JTextField ref;
    private javax.swing.JButton reset;
    private javax.swing.JButton search;
    private javax.swing.JTextField sn;
    private javax.swing.JTextField sname;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JButton upd;
    // End of variables declaration//GEN-END:variables
}
