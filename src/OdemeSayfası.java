
import Fabrika_DB.DB;
import Fabrika_Method.ArkaPlanMethod;
import Fabrika_Method.PayClass;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.TimerTask;
import java.util.Timer;
import javax.swing.JOptionPane;

public class OdemeSayfası extends javax.swing.JFrame {

//    public static String url = "C:\\Users\\java\\Documents\\NetBeansProjects\\Fabrika_Otomasyonu\\image\\";
//    public static String urlwis = "C:\\Users\\Java_sabah\\Desktop\\Fabrika_Otomasyonu\\image\\";
    PayClass pc = new PayClass();
    ArkaPlanMethod ark = new ArkaPlanMethod();
    DB db = new DB();

    Timer tm = new Timer();
    TimerTask is = new TimerTask() {
        @Override
        public void run() {
            jLabelZaman.setText(String.valueOf(i--));
        }
    };

    int i = 140;

    public OdemeSayfası() {

        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("image/ev.png"));
        ark.imagee(jLabelarka, "image/arka.jpg");
        jPanel2.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextKartAdi = new javax.swing.JTextField();
        jTextKartSoyadi = new javax.swing.JTextField();
        jTextKartNo = new javax.swing.JTextField();
        jTextKartTarih = new javax.swing.JTextField();
        jButtonKartOnay = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextKodGir = new javax.swing.JTextField();
        jButtonKodOnay = new javax.swing.JButton();
        jLabelZaman = new javax.swing.JLabel();
        jButtonVazgec = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelarka = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setPreferredSize(new java.awt.Dimension(570, 570));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Kart Sahibinin Adı");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Kart Numarası ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Son Kullanma Tarihi");

        jTextKartAdi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jTextKartSoyadi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jTextKartNo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jTextKartTarih.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jButtonKartOnay.setText("Onayla");
        jButtonKartOnay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKartOnayActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Onay Kodu"));

        jTextKodGir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextKodGir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextKodGirActionPerformed(evt);
            }
        });

        jButtonKodOnay.setText("Onayla");
        jButtonKodOnay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKodOnayActionPerformed(evt);
            }
        });

        jLabelZaman.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelZaman.setForeground(new java.awt.Color(51, 204, 0));
        jLabelZaman.setText("   ");

        jButtonVazgec.setText("Vazgeç");
        jButtonVazgec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVazgecActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\java\\Documents\\NetBeansProjects\\Fabrika_Otomasyonu\\image\\bitcoin.png")); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\java\\Documents\\NetBeansProjects\\Fabrika_Otomasyonu\\image\\paypall.png")); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\java\\Documents\\NetBeansProjects\\Fabrika_Otomasyonu\\image\\master.png")); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\java\\Documents\\NetBeansProjects\\Fabrika_Otomasyonu\\image\\maestro.png")); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\java\\Documents\\NetBeansProjects\\Fabrika_Otomasyonu\\image\\koruma.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jButtonVazgec)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonKodOnay))
                        .addComponent(jTextKodGir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelZaman, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)))
                .addGap(108, 108, 108))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabelZaman, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextKodGir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonVazgec)
                    .addComponent(jButtonKodOnay))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Kart Sahibinin Soyadı");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextKartTarih, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextKartNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextKartSoyadi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextKartAdi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addComponent(jButtonKartOnay, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextKartAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextKartSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextKartNo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextKartTarih, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jButtonKartOnay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(422, 422, 422)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabelarka, javax.swing.GroupLayout.PREFERRED_SIZE, 1370, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabelarka, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonKartOnayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKartOnayActionPerformed

        PayClass.KartAdi = jTextKartAdi.getText();
        PayClass.KartSoyadi = jTextKartSoyadi.getText();
        PayClass.KartNo = jTextKartNo.getText();
        PayClass.KartTarih = jTextKartTarih.getText();
        if (pc.Odeme()) {
            jPanel2.setVisible(true);
//            jButtonKodOnay.setEnabled(true);
//            jButtonVazgec.setEnabled(true);
            tm.schedule(is, 1000, 1000);
        }

    }//GEN-LAST:event_jButtonKartOnayActionPerformed

    private void jButtonKodOnayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKodOnayActionPerformed
        if (jTextKodGir.getText().equalsIgnoreCase(PayClass.deger)) {
            is.cancel();
            tm.cancel();
            jTextKodGir.setEnabled(false);
            jLabelZaman.setEnabled(false);
            ModellerSayfasi.combodurum = true;
            JOptionPane.showMessageDialog(this, "Ödemeniz başarı ile gerçekleştirilmiştir.");

            String query = "update bankserver set BankKayit='1' where BankAdi='" + MusteriKayit.Kullaniciİsim + "'and BankSoyadi='" + MusteriKayit.KullaniciSoyİsim + "'";
            try {
                db.baglan().executeUpdate(query);
            } catch (SQLException ex) {
                System.err.println("BankKayit güncelleme hatası.:" + ex.getMessage());
            }
            //new AracTakip(0, null, null).setVisible(true);
            new ModellerSayfasi().setVisible(true);
            ModellerSayfasi.jLabelHos.setText(MusteriKayit.Kullaniciİsim + " " + MusteriKayit.KullaniciSoyİsim);
            ModellerSayfasi.jLabelKayit.setVisible(false);
            ModellerSayfasi.jLabelGiris.setVisible(false);
            ModellerSayfasi.jLabelkayit.setVisible(false);
            ModellerSayfasi.jLabelgiris.setVisible(false);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Güvenlik Kodunuz yanlış girilmiştir.Lütfen bilgilerinizi kontrol ediniz\n" + PayClass.deger);

        }
    }//GEN-LAST:event_jButtonKodOnayActionPerformed

    private void jButtonVazgecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVazgecActionPerformed
        ModellerSayfasi.combodurum = true;
        new ModellerSayfasi().setVisible(true);
        ModellerSayfasi.jLabelHos.setText(MusteriKayit.Kullaniciİsim + " " + MusteriKayit.KullaniciSoyİsim);
        ModellerSayfasi.jLabelKayit.setVisible(false);
        ModellerSayfasi.jLabelGiris.setVisible(false);
        ModellerSayfasi.jLabelkayit.setVisible(false);
        ModellerSayfasi.jLabelgiris.setVisible(false);
        dispose();
    }//GEN-LAST:event_jButtonVazgecActionPerformed

    private void jTextKodGirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextKodGirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextKodGirActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OdemeSayfası.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OdemeSayfası.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OdemeSayfası.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OdemeSayfası.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OdemeSayfası().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonKartOnay;
    private javax.swing.JButton jButtonKodOnay;
    private javax.swing.JButton jButtonVazgec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelZaman;
    private javax.swing.JLabel jLabelarka;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextKartAdi;
    private javax.swing.JTextField jTextKartNo;
    private javax.swing.JTextField jTextKartSoyadi;
    private javax.swing.JTextField jTextKartTarih;
    private javax.swing.JTextField jTextKodGir;
    // End of variables declaration//GEN-END:variables

}
