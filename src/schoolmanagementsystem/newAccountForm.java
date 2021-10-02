/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package schoolmanagementsystem;


import java.awt.event.KeyEvent;
//import schoolmanagementsystem.Database.JConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import net.codejava.sql.JConnection;
import schoolmanagementsystem.Database.Accounts;

public class newAccountForm extends javax.swing.JFrame {
//    
//    Connection conn = null;
//    PreparedStatement pst = null;
    Accounts account;
    public newAccountForm() {
        this.setUndecorated(true);
        initComponents();
    }
    public newAccountForm(Accounts account) {
        this.setUndecorated(true);
        initComponents();
//        conn = JConnection.connectdb();
        this.account=account;
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
        jPanel2 = new javax.swing.JPanel();
        updateText6 = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        updateText5 = new javax.swing.JLabel();
        updateText2 = new javax.swing.JLabel();
        updateText3 = new javax.swing.JLabel();
        updateText4 = new javax.swing.JLabel();
        jTextPane2 = new javax.swing.JTextPane();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        idField = new javax.swing.JTextField();
        studentClassField = new javax.swing.JTextField();
        sectionField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        confirmPasswordField = new javax.swing.JPasswordField();
        passwordField = new javax.swing.JPasswordField();
        back_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        signupButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        updateText6.setBackground(new java.awt.Color(255, 255, 255));
        updateText6.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        updateText6.setForeground(new java.awt.Color(0, 0, 0));
        updateText6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateText6.setText("(must be at least 4 letters)");
        updateText6.setOpaque(true);
        jPanel2.add(updateText6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, 160, 20));

        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagementsystem/image/close.png"))); // NOI18N
        exitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        jPanel2.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 30, 30));

        updateText5.setBackground(new java.awt.Color(255, 255, 255));
        updateText5.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        updateText5.setForeground(new java.awt.Color(0, 0, 0));
        updateText5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateText5.setText("(must be unique)");
        updateText5.setOpaque(true);
        jPanel2.add(updateText5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 100, 30));

        updateText2.setBackground(new java.awt.Color(255, 255, 255));
        updateText2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        updateText2.setForeground(new java.awt.Color(0, 0, 0));
        updateText2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateText2.setText("(Must be less or equal 30 words)");
        updateText2.setOpaque(true);
        jPanel2.add(updateText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 180, 30));

        updateText3.setBackground(new java.awt.Color(255, 255, 255));
        updateText3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        updateText3.setForeground(new java.awt.Color(0, 0, 0));
        updateText3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateText3.setText("(1-10)");
        updateText3.setOpaque(true);
        jPanel2.add(updateText3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 40, 20));

        updateText4.setBackground(new java.awt.Color(255, 255, 255));
        updateText4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        updateText4.setForeground(new java.awt.Color(0, 0, 0));
        updateText4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateText4.setText("(a/b/c)");
        updateText4.setOpaque(true);
        jPanel2.add(updateText4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 40, 30));

        jTextPane2.setEditable(false);
        jTextPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTextPane2.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jTextPane2.setForeground(new java.awt.Color(0, 0, 0));
        jTextPane2.setText("100.");
        jTextPane2.setOpaque(false);
        jPanel2.add(jTextPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 50, 30));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 430, 20));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 430, 10));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 430, 10));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 430, 10));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 660, 430, 20));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 430, 10));

        idField.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        idField.setBorder(null);
        idField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        idField.setOpaque(false);
        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });
        idField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idFieldKeyPressed(evt);
            }
        });
        jPanel2.add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 380, 30));

        studentClassField.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        studentClassField.setBorder(null);
        studentClassField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        studentClassField.setOpaque(false);
        studentClassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentClassFieldActionPerformed(evt);
            }
        });
        studentClassField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                studentClassFieldKeyPressed(evt);
            }
        });
        jPanel2.add(studentClassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 430, 30));

        sectionField.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        sectionField.setBorder(null);
        sectionField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        sectionField.setOpaque(false);
        sectionField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sectionFieldKeyPressed(evt);
            }
        });
        jPanel2.add(sectionField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 430, 30));

        nameField.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        nameField.setBorder(null);
        nameField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nameField.setOpaque(false);
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        nameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameFieldKeyPressed(evt);
            }
        });
        jPanel2.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 430, -1));

        confirmPasswordField.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        confirmPasswordField.setBorder(null);
        confirmPasswordField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        confirmPasswordField.setOpaque(false);
        confirmPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPasswordFieldActionPerformed(evt);
            }
        });
        jPanel2.add(confirmPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, 440, 30));

        passwordField.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        passwordField.setBorder(null);
        passwordField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        passwordField.setOpaque(false);
        jPanel2.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 440, 30));

        back_btn.setBorder(null);
        back_btn.setBorderPainted(false);
        back_btn.setContentAreaFilled(false);
        back_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        jPanel2.add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 680, 70, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagementsystem/image/New Account Page_1.PNG"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 770));

        signupButton.setBorder(null);
        signupButton.setBorderPainted(false);
        signupButton.setContentAreaFilled(false);
        signupButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButtonActionPerformed(evt);
            }
        });
        jPanel2.add(signupButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 680, 170, 60));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//.......................Start Custom Functions....................//
    
    private void clearTextField() {
        nameField.setText("");
        studentClassField.setText("");
        sectionField.setText("");
        idField.setText("");
        passwordField.setText("");
        confirmPasswordField.setText("");
    }
    private void clearIdField() {
        idField.setText("");
    }
//.......................End Custom Functions....................//   
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        int input = JOptionPane.showConfirmDialog(null, "Do you want to proceed?", "Quit", JOptionPane.YES_NO_CANCEL_OPTION);
        if (input == 0) {
            System.exit(0);
        } 
    }//GEN-LAST:event_exitButtonActionPerformed

    private void studentClassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentClassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentClassFieldActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        dispose();
        new logInPage().setVisible(true);
    }//GEN-LAST:event_back_btnActionPerformed
    
    
    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void signupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupButtonActionPerformed
        String originalPass = passwordField.getText();
        if (originalPass.length() >= 4 && originalPass.equals(confirmPasswordField.getText())) {
            account.createResultfieldForStu("100."+idField.getText());
            int response=account.createStudentAccount(nameField.getText(),studentClassField.getText(),sectionField.getText(),"100."+idField.getText(),originalPass);
            switch (response) {

                case 1:
                    new logInPage().setVisible(true);
                    dispose();
                    break;
                default:
                    clearTextField();
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please set password correctly", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_signupButtonActionPerformed

    private void confirmPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmPasswordFieldActionPerformed

    private void nameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameFieldKeyPressed
         String name=nameField.getText();
        int length=name.length();
        
        char c = evt.getKeyChar();
        if((c>='a'&& c<='z')||(c>='A'&& c<='Z')||(c ==' ')){
            if(length<30){
                nameField.setEditable(true);
            }
            else{
                nameField.setEditable(false);
            }
        }
        else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                nameField.setEditable(true);
            }
            else{
                 nameField.setEditable(false);
            }
        }
    }//GEN-LAST:event_nameFieldKeyPressed

    private void studentClassFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_studentClassFieldKeyPressed
        // TODO add your handling code here:
                String classStu=studentClassField.getText();
        int length=classStu.length();
        
            char c = evt.getKeyChar();
        if(c>='0'&&c<='9'){
            if(length<2){
                studentClassField.setEditable(true);
            }
            else{
                studentClassField.setEditable(false);
            }
        }
        else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                studentClassField.setEditable(true);
            }
            else{
                 studentClassField.setEditable(false);
            }
        }
    }//GEN-LAST:event_studentClassFieldKeyPressed

    private void sectionFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sectionFieldKeyPressed
        // TODO add your handling code here:
               String sec=sectionField.getText();
        int length=sec.length();
        
        char c = evt.getKeyChar();
        if(c>='A'&&c<='Z'){
            if(length<1){
                sectionField.setEditable(true);
            }
            else{
                sectionField.setEditable(false);
            }
        }
        else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                sectionField.setEditable(true);
            }
            else{
                 sectionField.setEditable(false);
            }
        }
    }//GEN-LAST:event_sectionFieldKeyPressed

    private void idFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idFieldKeyPressed
        // TODO add your handling code here:
                String phoneNo=idField.getText();
        int length=phoneNo.length();
        
        char c = evt.getKeyChar();
        if(c>='0'&&c<='9'){
            if(length<6){
                idField.setEditable(true);
            }
            else{
                idField.setEditable(false);
            }
        }
        else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                idField.setEditable(true);
            }
            else{
                 idField.setEditable(false);
            }
        }
    }//GEN-LAST:event_idFieldKeyPressed

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFieldActionPerformed
    
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
            java.util.logging.Logger.getLogger(newAccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newAccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newAccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newAccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newAccountForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextField nameField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField sectionField;
    private javax.swing.JButton signupButton;
    private javax.swing.JTextField studentClassField;
    private javax.swing.JLabel updateText2;
    private javax.swing.JLabel updateText3;
    private javax.swing.JLabel updateText4;
    private javax.swing.JLabel updateText5;
    private javax.swing.JLabel updateText6;
    // End of variables declaration//GEN-END:variables
    
    private int len(String originalPass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
