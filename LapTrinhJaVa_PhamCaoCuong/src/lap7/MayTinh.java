/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lap7;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class MayTinh extends javax.swing.JFrame {

    /**
     * Creates new form Bai1
     */
    public MayTinh() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFirstNumber = new javax.swing.JLabel();
        txtFirstNumber = new javax.swing.JTextField();
        lblSecondNumber = new javax.swing.JLabel();
        txtSecondNumber = new javax.swing.JTextField();
        lblResult = new javax.swing.JLabel();
        txtResult = new javax.swing.JTextField();
        btnCong = new javax.swing.JButton();
        btnTru = new javax.swing.JButton();
        btnNhan = new javax.swing.JButton();
        btnChia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bai 1");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("frmBai1"); // NOI18N

        lblFirstNumber.setText("First Number");

        lblSecondNumber.setText("Second Number");

        lblResult.setText("Result");

        txtResult.setEnabled(false);

        btnCong.setText("+");
        btnCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCongActionPerformed(evt);
            }
        });

        btnTru.setText("-");
        btnTru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTruActionPerformed(evt);
            }
        });

        btnNhan.setText("*");
        btnNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanActionPerformed(evt);
            }
        });

        btnChia.setText("/");
        btnChia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblFirstNumber)
                        .addGap(26, 26, 26)
                        .addComponent(txtFirstNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSecondNumber)
                            .addComponent(lblResult)
                            .addComponent(btnCong))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSecondNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTru)
                                .addGap(31, 31, 31)
                                .addComponent(btnNhan)
                                .addGap(30, 30, 30)
                                .addComponent(btnChia)))))
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFirstNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSecondNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSecondNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCong)
                    .addComponent(btnTru)
                    .addComponent(btnNhan)
                    .addComponent(btnChia))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanActionPerformed
        // TODO add your handling code here:
        try{
            String sNum1 = txtFirstNumber.getText();        
            String sNum2 = txtSecondNumber.getText();
            int nResult = Integer.parseInt(sNum1) * Integer.parseInt(sNum2);
            String sResult = String.valueOf(nResult);
            txtResult.setText(sResult);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Moi ban nhap so vao 2 truong tren");
        }
    }//GEN-LAST:event_btnNhanActionPerformed

    private void btnCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCongActionPerformed
        // TODO add your handling code here:
        try{
            String sNum1 = txtFirstNumber.getText();        
            String sNum2 = txtSecondNumber.getText();
            int nResult = Integer.parseInt(sNum1) + Integer.parseInt(sNum2);
            String sResult = String.valueOf(nResult);
            txtResult.setText(sResult);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Moi ban nhap so vao 2 truong tren");
        }
    }//GEN-LAST:event_btnCongActionPerformed

    private void btnTruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTruActionPerformed
        // TODO add your handling code here:
        try {
            String sNum1 = txtFirstNumber.getText();        
            String sNum2 = txtSecondNumber.getText();
            int nResult = Integer.parseInt(sNum1) - Integer.parseInt(sNum2);
            String sResult = String.valueOf(nResult);
            txtResult.setText(sResult); 
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Moi ban nhap so vao 2 truong tren");
        }
    }//GEN-LAST:event_btnTruActionPerformed

    private void btnChiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiaActionPerformed
        // TODO add your handling code here:
        try {
            String sNum1 = txtFirstNumber.getText();        
            String sNum2 = txtSecondNumber.getText();
            
            if(Integer.parseInt(sNum2) != 0){
                float nResult = Float.parseFloat(sNum1) / Integer.parseInt(sNum2);
                String sResult = String.valueOf(nResult);
                txtResult.setText(sResult); 
            }else{
                JOptionPane.showMessageDialog(null, "Khong the chia cho so 0");
            }
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Moi ban nhap so vao 2 truong tren");
        }
        
    }//GEN-LAST:event_btnChiaActionPerformed
    
     
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
            java.util.logging.Logger.getLogger(MayTinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MayTinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MayTinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MayTinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MayTinh().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChia;
    private javax.swing.JButton btnCong;
    private javax.swing.JButton btnNhan;
    private javax.swing.JButton btnTru;
    private javax.swing.JLabel lblFirstNumber;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblSecondNumber;
    private javax.swing.JTextField txtFirstNumber;
    private javax.swing.JTextField txtResult;
    private javax.swing.JTextField txtSecondNumber;
    // End of variables declaration//GEN-END:variables
}
