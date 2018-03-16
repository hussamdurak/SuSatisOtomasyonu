/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Siparis extends javax.swing.JFrame {

    DB db = new DB();

    public Siparis() {
        initComponents();
        txtMusteriNumarasi.setText(AdminPage.mid);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtMusteriNumarasi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTutar = new javax.swing.JTextField();
        btnSiparisKaydet = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_delivery_256.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Yeni Sipariş"));

        txtMusteriNumarasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMusteriNumarasiActionPerformed(evt);
            }
        });

        jLabel2.setText("Tutar");

        txtTutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTutarActionPerformed(evt);
            }
        });

        btnSiparisKaydet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_delivery_64.png"))); // NOI18N
        btnSiparisKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiparisKaydetActionPerformed(evt);
            }
        });

        jLabel3.setText("Müşteri Numarası");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTutar)
                    .addComponent(txtMusteriNumarasi)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 177, Short.MAX_VALUE)
                        .addComponent(btnSiparisKaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMusteriNumarasi, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTutar, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addComponent(btnSiparisKaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTutarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTutarActionPerformed


    private void btnSiparisKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiparisKaydetActionPerformed

        String durum = "Hazırlanıyor";
        String smid = txtMusteriNumarasi.getText().trim();
        String tutar = txtTutar.getText().trim();

        if (tutar.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen tutar giriniz");
            txtTutar.requestFocus();
            txtTutar.setText("");
        } else {
            try {
                String siparisMusteriId = txtMusteriNumarasi.getText();
                String yazQuery = "insert into siparisler values(null, '" + siparisMusteriId + "','" + durum + "', '" + tutar + "' ) ";
                int yazSonuc = db.baglan().executeUpdate(yazQuery);
                if (yazSonuc > 0) {
                    JOptionPane.showMessageDialog(rootPane, "Siparişiniz Kaydedildi Hazırlanıyor ");
                    txtTutar.setText("");
                    if (LoginPage.durum == 1) {
                        AdminPage ap = new AdminPage();
                        ap.setVisible(true);
                        dispose();
                    } else {
                        CustomerPage cp = new CustomerPage();
                        cp.setVisible(true);
                        dispose();
                    }

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Kayıt işlemi başarısız oldu !");
                }
            } catch (SQLException ex) {
                System.err.println("Yazma Hatası : " + ex);
            } finally {
                db.kapat();
            }
        }


    }//GEN-LAST:event_btnSiparisKaydetActionPerformed

    private void txtMusteriNumarasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMusteriNumarasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMusteriNumarasiActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int cevap = JOptionPane.showConfirmDialog(rootPane, "Kapatmak İstediğinizden Emin Misiniz ?", "Kapatma işlemi", JOptionPane.YES_NO_OPTION);
        if (cevap == 0) {
            if (LoginPage.durum == 1) {
                AdminPage ap = new AdminPage();
                ap.setVisible(true);
                dispose();
            } else {
                CustomerPage cp = new CustomerPage();
                cp.setVisible(true);
                dispose();
            }

        }
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(Siparis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Siparis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Siparis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Siparis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Siparis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSiparisKaydet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtMusteriNumarasi;
    private javax.swing.JTextField txtTutar;
    // End of variables declaration//GEN-END:variables

}
