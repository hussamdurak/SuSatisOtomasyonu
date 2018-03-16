/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class KullaniciDuzenle extends javax.swing.JFrame {

    String id = "";
    DB db = new DB();

    public KullaniciDuzenle(String id) {
        this.id = id;
        initComponents();

        try {
            String q = "select *from musteriler where mid = '" + id + "'";
            ResultSet rs = db.baglan().executeQuery(q);
            if (rs.next()) { // yukarıdaki sorgudan eb az bir adet var mı ?
                txtAdi.setText(rs.getString("mAdi"));
                txtSoyadi.setText(rs.getString("mSoyadi"));
                txtTelefon.setText(rs.getString("mTelefon"));
                txtAdres.setText(rs.getString("mAdres"));
                txtMail.setText(rs.getString("mMail"));
                txtSifre.setText(rs.getString("mSifre"));

            }
        } catch (Exception e) {
        } finally {
            db.kapat();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtAdi = new javax.swing.JTextField();
        txtSoyadi = new javax.swing.JTextField();
        txtTelefon = new javax.swing.JTextField();
        txtAdres = new javax.swing.JTextField();
        btnDuzenle = new javax.swing.JButton();
        txtMail = new javax.swing.JTextField();
        txtSifre = new javax.swing.JPasswordField();
        txtSifreTekrar = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Kullanıcı Duzenle"));

        jLabel2.setText("Ad");

        jLabel3.setText("Soyad");

        jLabel4.setText("Telefon");

        jLabel5.setText("Adres");

        jLabel6.setText("Şifre");

        jLabel7.setText("Tekrar Şifre");

        jLabel8.setText("E-Posta ");

        btnDuzenle.setText("Düzenle");
        btnDuzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDuzenleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSoyadi, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTelefon, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAdi)
                            .addComponent(txtAdres)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMail)
                            .addComponent(txtSifre)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDuzenle, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(txtSifreTekrar))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAdres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtSifreTekrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDuzenle)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_edit_256.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDuzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDuzenleActionPerformed

        String adi = txtAdi.getText().trim();
        String soyadi = txtSoyadi.getText().trim();
        String telefon = txtTelefon.getText().trim();
        String adres = txtAdres.getText().trim();
        String mail = txtMail.getText().trim();

        //String sifre = txtSifreTekrar.getText().trim();
        char[] sifDizi = txtSifre.getPassword();
        String sifre = String.valueOf(sifDizi);

        //String sifreTekrar = txtSifreTekrar.getText().trim();
        char[] sifTekrarDizi = txtSifreTekrar.getPassword();
        String sifreTekrar = String.valueOf(sifTekrarDizi);

        if (adi.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen adınızı giriniz");
            txtAdi.requestFocus();
            txtAdi.setText("");
        } else if (soyadi.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen soyadı giriniz");
            txtSoyadi.requestFocus();
            txtSoyadi.setText("");
        } else if (telefon.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen telefon numarınızı giriniz");
            txtTelefon.requestFocus();
            txtTelefon.setText("");
        } else if (adres.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen adresinizi giriniz");
            txtAdres.requestFocus();
            txtAdres.setText("");
        } else if (mail.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen e-posta adresinizi giriniz");
            txtMail.requestFocus();
            txtMail.setText("");
        } else if (sifre.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen şifrenizi giriniz");
            txtSifre.requestFocus();
            txtSifre.setText("");
        } else if (sifreTekrar.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen tekrardan şifrenizi giriniz");
            txtSifreTekrar.requestFocus();
            txtSifreTekrar.setText("");
        } else if (!sifre.equals(sifreTekrar)) {
            JOptionPane.showMessageDialog(rootPane, "Şifreleriniz aynı değil lütfen kontrol ediniz !");
            txtSifreTekrar.requestFocus();
            txtSifreTekrar.setText("");
        } else {
            try {

                String duzenleQuery = "update musteriler set mAdi = '" + adi + "', "
                        + "mSoyadi = '" + soyadi + "',mTelefon = '" + telefon + "', mAdres = '" + adres + "', mMail = '" + mail + "', "
                        + "mSifre = '" + sifre + "' where mid = '" + id + "'";
                int duzenleSonuc = db.baglan().executeUpdate(duzenleQuery);
                if (duzenleSonuc > 0) {
                    JOptionPane.showMessageDialog(rootPane, "Düzenleme işlemi başarılı ");
                    if (LoginPage.durum ==1) {
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
                System.err.println("Düzenleme Hatası : " + ex);
            } finally {
                db.kapat();
            }
        }


    }//GEN-LAST:event_btnDuzenleActionPerformed

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
            java.util.logging.Logger.getLogger(KullaniciDuzenle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KullaniciDuzenle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KullaniciDuzenle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KullaniciDuzenle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KullaniciDuzenle("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDuzenle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAdi;
    private javax.swing.JTextField txtAdres;
    private javax.swing.JTextField txtMail;
    private javax.swing.JPasswordField txtSifre;
    private javax.swing.JPasswordField txtSifreTekrar;
    private javax.swing.JTextField txtSoyadi;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables

}
