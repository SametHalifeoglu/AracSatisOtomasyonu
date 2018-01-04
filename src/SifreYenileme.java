
import Fabrika_DB.DB;
import Fabrika_Method.ArkaPlanMethod;
import Fabrika_Method.HataAyiklamaMetodu;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class SifreYenileme extends javax.swing.JFrame {

    HataAyiklamaMetodu ham = new HataAyiklamaMetodu();
    DB db = new DB();

    ArkaPlanMethod ark=new ArkaPlanMethod();
    public SifreYenileme() {
        initComponents();
        ark.imagee(jLabelarka, "image/arka.jpg");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jTextFieldsifre = new javax.swing.JTextField();
        jTextFieldysifre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabelarka = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setResizable(false);

        jPanel2.setLayout(null);

        jLabel5.setText("Yeni şifre");

        jLabel6.setText("Yeni şifreyi tekrar giriniz");

        jButton3.setText("Kaydet");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldysifre, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                            .addComponent(jTextFieldsifre)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jButton3)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldsifre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldysifre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(53, 53, 53))
        );

        jPanel2.add(jPanel4);
        jPanel4.setBounds(430, 260, 522, 286);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tahmin edilmesi zor olan yeni bir şifre seçin");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(430, 210, 521, 29);
        jPanel2.add(jLabelarka);
        jLabelarka.setBounds(0, 0, 1370, 770);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (ham.SifreKontrol(jTextFieldsifre.getText()) && ham.SifreKontrol(jTextFieldysifre.getText())) {
            if (jTextFieldsifre.getText().equalsIgnoreCase(jTextFieldysifre.getText())) {
                String query = "update musterikayit set musSifre='" + jTextFieldysifre.getText() + "' where musMail='" + MusteriKayit.KullaniciMail + "'";
                try {
                    db.baglan().executeUpdate(query);
                    //modeldurum = true;
                    new MusteriKayit().setVisible(true);
                    dispose();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Şifeyi güncelleme hatası" + ex.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(this, "Şifreleriniz uyuşmamaktadır");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Lütfen şifrenizde sadece harf ve rakam kullanınız.");
        }

    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(SifreYenileme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SifreYenileme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SifreYenileme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SifreYenileme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SifreYenileme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelarka;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextFieldsifre;
    private javax.swing.JTextField jTextFieldysifre;
    // End of variables declaration//GEN-END:variables

}
