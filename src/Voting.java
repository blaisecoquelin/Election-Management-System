
import java.awt.Image;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Voting extends javax.swing.JFrame {

    
    public Voting() {
        initComponents();
        DisplayCandidates();
        BravoLbl.setVisible(false);
    }
    
    
    int VotingId;
    public Voting (int VoterId){
        
    
        initComponents();
        DisplayCandidates();
        BravoLbl.setVisible(false);
        VotingId = VoterId;
        //JOptionPane.showMessageDialog(this, VotingId);
        
    }

    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    Statement st = null;
    private void DisplayCandidates(){
    
        try{
            con =DriverManager.getConnection("jdbc:mysql://localhost:3306/final","root","");
            st = con.createStatement();
            rs = st.executeQuery("select * from candidatetbl");
            CandidatesTable.setModel(DbUtils.resultSetToTableModel(rs));
        
        }catch(Exception e){
        
        }
    
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CandidatesTable = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        CandidatePictureLbl = new javax.swing.JLabel();
        VoterBtn = new javax.swing.JButton();
        CnameLbl = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        BravoLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(243, 188, 0));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("ELECTIONS MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel4)
                .addContainerGap(205, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        jLabel5.setBackground(new java.awt.Color(2, 0, 3));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Voting Application");

        CandidatesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        CandidatesTable.setSelectionBackground(new java.awt.Color(243, 188, 0));
        CandidatesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CandidatesTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CandidatesTable);

        jButton4.setBackground(new java.awt.Color(102, 102, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back-49-32.png"))); // NOI18N
        jButton4.setText("Back");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Candidate:");

        CandidatePictureLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CandidatePictureLbl.setText("Photo:");

        VoterBtn.setBackground(new java.awt.Color(102, 204, 0));
        VoterBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        VoterBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vote-1-32.png"))); // NOI18N
        VoterBtn.setText("Vote");
        VoterBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VoterBtnMouseClicked(evt);
            }
        });

        CnameLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CnameLbl.setText("Names:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Candidates List");

        BravoLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BravoLbl.setForeground(new java.awt.Color(0, 153, 51));
        BravoLbl.setText("VOTE COUNTED");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(CnameLbl)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(298, 298, 298)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel5)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(CandidatePictureLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)
                                .addComponent(VoterBtn)
                                .addGap(57, 57, 57)
                                .addComponent(BravoLbl)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(346, 346, 346)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(13, 13, 13)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BravoLbl)
                            .addComponent(VoterBtn))
                        .addGap(0, 84, Short.MAX_VALUE))
                    .addComponent(CandidatePictureLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CnameLbl)
                .addGap(21, 21, 21)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private ImageIcon ResizePhoto(String ImagePath, byte[] pic){
    
        ImageIcon MyImage = null;
        if(ImagePath!=null){
        
            MyImage = new ImageIcon(ImagePath);
        }else{
        
            MyImage = new ImageIcon(pic);
        }
        
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(CandidatePictureLbl.getWidth(), CandidatePictureLbl.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    
    
    private void FetchPhoto(){
    
        String query = "select Cphoto from candidatetbl where CId="+key;
        Statement st;
        ResultSet rs;
        try{
        
            con =DriverManager.getConnection("jdbc:mysql://localhost:3306/final","root","");
            st = con.createStatement();
            rs = st.executeQuery(query);
            if(rs.next()){
            
                CandidatePictureLbl.setIcon(ResizePhoto(null,rs.getBytes("Cphoto")));
            }
            
        }catch(Exception e){
        
        }
    }
    
    
    int key =-1;
    int ElecId;
    private void CandidatesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CandidatesTableMouseClicked

        DefaultTableModel model = (DefaultTableModel) CandidatesTable.getModel();
        int Myindex = CandidatesTable.getSelectedRow();
        key = Integer.valueOf(model.getValueAt(Myindex, 0).toString());
        CnameLbl.setText(model.getValueAt(Myindex, 1).toString());
        ElecId = Integer.valueOf(model.getValueAt(Myindex, 5).toString());
        FetchPhoto();
        // TODO add your handling code here:
    }//GEN-LAST:event_CandidatesTableMouseClicked

    int VId ;
    Statement st1 = null;
    ResultSet rs1= null;
    
    private void  VCount(){
    
        try{
        
            st1 = con.createStatement();
            rs1 = st1.executeQuery("select MAX(VoteId) from votesTb1");
            rs1.next();
            VId = rs1.getInt(1) + 1;
        }catch(Exception ex){
        
            
        }
    }
    
    int VNumber;
    
    
    private void  VCheck(){
    
        try{
        
            st1 = con.createStatement();
            rs1 = st1.executeQuery("select * from votestbl where voterid= "+VotingId+" and electid = "+ElecId);
            if(rs1.next()){
            
                VNumber = 1;
            }else{
            
                VNumber = 0;
            }
            
        }catch(Exception ex){
        
            JOptionPane.showMessageDialog(this, ex);
        }
    }
    
    
    private void VoterBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoterBtnMouseClicked
        VCheck();
        if(key == -1){
        
            JOptionPane.showMessageDialog(this, "Select your candidate");
            
        }else if (VNumber > 0 ){
        
            JOptionPane.showMessageDialog(this, "You have already voted");
            
        }
        else{
        
            try{
                
                VCount();
                con =DriverManager.getConnection("jdbc:mysql://localhost:3306/final","root","");
                PreparedStatement Add =  con.prepareStatement("insert into votestbl values(?,?,?,?)");
                Add.setInt(1, VId);
                Add.setInt(2, VotingId);
                Add.setInt(3, ElecId);
                Add.setInt(4, key);
                
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Vote counted");
                con.close();
                BravoLbl.setVisible(true);
                DisplayCandidates();
                VoterBtn.setVisible(false);
            
            }catch(Exception e){
                
                JOptionPane.showMessageDialog(this, e);
                
            }
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_VoterBtnMouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked

        new Login().setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked
 
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
            java.util.logging.Logger.getLogger(Voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Voting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BravoLbl;
    private javax.swing.JLabel CandidatePictureLbl;
    private javax.swing.JTable CandidatesTable;
    private javax.swing.JLabel CnameLbl;
    private javax.swing.JButton VoterBtn;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
