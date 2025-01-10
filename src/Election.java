
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Election extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    Statement st = null;
    
    
    public Election() {
        initComponents();
        DisplayElections();
    }

    
    
    
    @SuppressWarnings("unchecked")
    
    int EId ;
    Statement st1 = null;
    ResultSet rs1= null;
    
    private void  ElecCount(){
    
        try{
        
            st1 = con.createStatement();
            rs1 = st1.executeQuery("select MAX(EId) from ElectionTb1");
            rs1.next();
            EId = rs1.getInt(1) + 1;
        }catch(Exception ex){
        
            
        }
    }
    
    private void DisplayElections(){
    
        try{
            con =DriverManager.getConnection("jdbc:mysql://localhost:3306/final","root","");
            st = con.createStatement();
            rs = st.executeQuery("select * from electiontbl");
            ElectionsTable.setModel(DbUtils.resultSetToTableModel(rs));
        
        }catch(Exception e){
        
        }
    
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        plasticSplitPaneUI1 = new com.jgoodies.plaf.plastic.PlasticSplitPaneUI();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ElectionNameTb = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ElectionsTable = new javax.swing.JTable();
        AddButton = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        ElectionDate = new com.toedter.calendar.JDateChooser();
        Editbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(243, 188, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("ELECTIONS MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jLabel2.setBackground(new java.awt.Color(2, 0, 3));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Manage Elections");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Names:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Dates:");

        ElectionsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Name", "Date"
            }
        ));
        ElectionsTable.setRowHeight(25);
        ElectionsTable.setSelectionBackground(new java.awt.Color(243, 188, 0));
        ElectionsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ElectionsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ElectionsTable);

        AddButton.setBackground(new java.awt.Color(102, 204, 0));
        AddButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add-45-32.png"))); // NOI18N
        AddButton.setText("Add");
        AddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddButtonMouseClicked(evt);
            }
        });

        DeleteBtn.setBackground(new java.awt.Color(255, 51, 51));
        DeleteBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DeleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete-826-32.png"))); // NOI18N
        DeleteBtn.setText("Delete");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        BackBtn.setBackground(new java.awt.Color(102, 102, 255));
        BackBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BackBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back-49-32.png"))); // NOI18N
        BackBtn.setText("Back");
        BackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackBtnMouseClicked(evt);
            }
        });

        Editbtn.setBackground(new java.awt.Color(255, 153, 0));
        Editbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Editbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit-edit-3-32.png"))); // NOI18N
        Editbtn.setText("Update");
        Editbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ElectionDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(172, 172, 172))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BackBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Editbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DeleteBtn)
                                .addGap(18, 18, 18)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(ElectionNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ElectionNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ElectionDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DeleteBtn)
                            .addComponent(Editbtn)
                            .addComponent(AddButton))
                        .addGap(28, 28, 28)
                        .addComponent(BackBtn)
                        .addGap(61, 61, 61))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(166, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void AddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseClicked

        if(ElectionNameTb.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(this, "Enter Elections Name");
            
        }else{
        
            try{
                String Day = String.valueOf(ElectionDate.getDate().getDate());
                String Month = String.valueOf(ElectionDate.getDate().getMonth());
                String Year = String.valueOf(ElectionDate.getDate().getYear());
                String Edate = Day + "/" + Month + "/" + Year;
                ElecCount();
                con =DriverManager.getConnection("jdbc:mysql://localhost:3306/final","root","");
                PreparedStatement Add =  con.prepareStatement("insert into electiontbl values(?,?,?)");
                Add.setInt(1, EId);
                Add.setString(2, ElectionNameTb.getText());
                Add.setString(3, Edate);
                
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Election added succesfulyy");
                con.close();
                DisplayElections();
            
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }

        // TODO add your handling code here:
        
    }//GEN-LAST:event_AddButtonMouseClicked

    int key = -1;
    private void ElectionsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ElectionsTableMouseClicked

        DefaultTableModel model = (DefaultTableModel) ElectionsTable.getModel();
        int Myindex = ElectionsTable.getSelectedRow();
        key = Integer.valueOf(model.getValueAt(Myindex, 0).toString());
        ElectionNameTb.setText(model.getValueAt(Myindex, 1).toString());
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_ElectionsTableMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked

        if(key==-1){
        
            JOptionPane.showMessageDialog(this, "select the election to delete..");
        }else{
        
            try{
            con =DriverManager.getConnection("jdbc:mysql://localhost:3306/final","root","");
            String query = "Delete from Electiontbl where EId  ="+key;
            Statement Del = con.createStatement();
            Del.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Election deleted successfully");
            DisplayElections();    
            }catch(Exception e){
            
                JOptionPane.showMessageDialog(this, e);
            }
            
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void EditbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditbtnMouseClicked

        if(key==-1 || ElectionDate.getDate().toString().isEmpty()){
        
            JOptionPane.showMessageDialog(this, "Information missing...");
        }else{
        
            try{
            String Day = String.valueOf(ElectionDate.getDate().getDate());
            String Month = String.valueOf(ElectionDate.getDate().getMonth());
            String Year = String.valueOf(ElectionDate.getDate().getYear());
            String Edate = Day + "/" + Month + "/" + Year;
            con =DriverManager.getConnection("jdbc:mysql://localhost:3306/final","root","");
            String query = "update ElectionTbl set EName=?, EDate=? where EId=?";
            PreparedStatement updatequery = con.prepareStatement(query);
            updatequery.setString(1, ElectionNameTb.getText());
            updatequery.setString(2, Edate);
            updatequery.setInt(3, key);
            updatequery.executeUpdate();
            JOptionPane.showMessageDialog(this, "Election updated successfully");
            DisplayElections();    
            }catch(Exception e){
            
                JOptionPane.showMessageDialog(this, e);
            }
            
        }
        
    }//GEN-LAST:event_EditbtnMouseClicked

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked

        new MainMenu().setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_BackBtnMouseClicked

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Election.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Election.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Election.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Election.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Election().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton Editbtn;
    private com.toedter.calendar.JDateChooser ElectionDate;
    private javax.swing.JTextField ElectionNameTb;
    private javax.swing.JTable ElectionsTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.jgoodies.plaf.plastic.PlasticSplitPaneUI plasticSplitPaneUI1;
    // End of variables declaration//GEN-END:variables
}
