
import Fabrika_DB.DB;
import Fabrika_Method.ArkaPlanMethod;
import Fabrika_Method.HataAyiklamaMetodu;
import Fabrika_Method.Methodlar;
import Fabrika_Property.MusteriProperty;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MusteriKayit extends javax.swing.JFrame {

    MusteriProperty mp = new MusteriProperty();
    Methodlar met = new Methodlar();
    HataAyiklamaMetodu ham = new HataAyiklamaMetodu();
    DB db = new DB();
    ArrayList<String> ls = new ArrayList<>();
    ArkaPlanMethod ark=new ArkaPlanMethod();

    public MusteriKayit() {
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("image/ev.png"));
        ark.imagee(jLabelarka, "image/arka.jpg");
        if (ModellerSayfasi.modeldurum == 1) {
            jTextAd.setEnabled(false);
            jTextSoyad.setEnabled(false);
            jTextTel.setEnabled(false);
            jTextUnvan.setEnabled(false);
            jTextSirket.setEnabled(false);
            jTextMail.setEnabled(false);
            jTextSifre.setEnabled(false);
        } else if (ModellerSayfasi.modeldurum == 2) {
            jTextGemail.setEnabled(false);
            jTextGpass.setEnabled(false);
            jButtonGiris.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextAd = new javax.swing.JTextField();
        jButtonMusteriKayit = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jTextSoyad = new javax.swing.JTextField();
        jTextTel = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jTextUnvan = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jTextSirket = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jTextMail = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jTextSifre = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jTextGemail = new javax.swing.JTextField();
        jButtonGiris = new javax.swing.JButton();
        jTextGpass = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabelDevam = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelarka = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel5.setText("Adınız");

        jButtonMusteriKayit.setBackground(new java.awt.Color(255, 255, 255));
        jButtonMusteriKayit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonMusteriKayit.setForeground(new java.awt.Color(0, 102, 255));
        jButtonMusteriKayit.setText("KAYIT OL");
        jButtonMusteriKayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMusteriKayitActionPerformed(evt);
            }
        });

        jLabel30.setText("Soyadınız");

        jLabel31.setText("Telefon Numarası");

        jLabel32.setText("Unvan");

        jLabel33.setText("Şirket");

        jLabel34.setText("E-Mail");

        jLabel35.setText("Şifre");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextAd)
                    .addComponent(jTextSoyad)
                    .addComponent(jTextTel)
                    .addComponent(jTextUnvan)
                    .addComponent(jTextSirket)
                    .addComponent(jTextMail)
                    .addComponent(jTextSifre)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31)
                            .addComponent(jLabel32)
                            .addComponent(jLabel33)
                            .addComponent(jLabel34)
                            .addComponent(jLabel35))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButtonMusteriKayit, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextAd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextTel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextUnvan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextSirket, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextMail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonMusteriKayit, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel6);
        jPanel6.setBounds(450, 130, 481, 518);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTextGemail.setText("E-Mail");
        jTextGemail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextGemailMouseClicked(evt);
            }
        });

        jButtonGiris.setText("OTURUM AÇIN");
        jButtonGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGirisActionPerformed(evt);
            }
        });

        jTextGpass.setText("Password");
        jTextGpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextGpassMouseClicked(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ŞİFREMİ UNUTTUM ?");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabelDevam.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDevam.setText("KAYIT OLMADAN DEVAM ET");
        jLabelDevam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelDevamMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextGemail, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jTextGpass, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonGiris)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDevam)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextGpass, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextGemail, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabelDevam))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(278, 0, 949, 93);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 170, 50);
        getContentPane().add(jLabelarka);
        jLabelarka.setBounds(0, 0, 1440, 770);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public static String Kullaniciİsim = "";
    public static String KullaniciSoyİsim = "";
    public static String KullaniciMail = "";
    public static String KullaniciSifre = "";
    public static String KullaniciKayit = "";


    private void jButtonGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGirisActionPerformed
        ls.clear();
        KullaniciMail = jTextGemail.getText().trim();
        KullaniciSifre = jTextGpass.getText().trim();
        String KayitliKisi = KullaniciMail + " " + KullaniciSifre;
        String query = "select musAd,musSoyadi,musMail,musSifre from musterikayit";
        try {
            ResultSet rs = db.baglan().executeQuery(query);
            while (rs.next()) {
                ls.add(rs.getString("musMail") + " " + rs.getString("musSifre"));
            }
            for (int i = 0; i < ls.size(); i++) {
                System.out.println(ls.size() - 1);
                if (KayitliKisi.equalsIgnoreCase(ls.get(i))) {
                    System.out.println("Çalistımmmm");
                    String query1 = "select musAd,musSoyadi from musterikayit where musMail='" + KullaniciMail + "' and musSifre='" + KullaniciSifre + "'";
                    try {
                        ResultSet rs1 = db.baglan().executeQuery(query1);
                        while (rs1.next()) {
                            Kullaniciİsim = rs1.getString("musAd").trim();
                            KullaniciSoyİsim = rs1.getString("musSoyadi").trim();
                        }
                        //System.out.println("gelen ad:" + rs1.getString("musAd") + "gelen soyad:" + rs1.getString("musSoyadi"));
                    } catch (SQLException e) {
                        System.err.println("Modeller sayfasına isim yazamadım: " + e.getMessage());
                    }
                    String query2 = "select BankKayit from bankserver  where BankAdi='" + Kullaniciİsim + "'and BankSoyadi='" + KullaniciSoyİsim + "'";
                    try {
                        ResultSet rs2 = db.baglan().executeQuery(query2);
                        while (rs2.next()) {
                            KullaniciKayit = rs2.getString("BankKayit");
                            if (KullaniciKayit.equals("1")) {
                                System.out.println("sdsdsdsds"+rs2.getString("BankKayit"));
                                ModellerSayfasi.combodurum = true;
                                System.out.println("gelen değer");
                            } else {
                                //ModellerSayfasi.jComboBox1.setVisible(false);
                            }
                        }
                    } catch (SQLException e) {
                        System.err.println("MusteriKayit query2 hatası:" + e.getMessage());
                    }
                    new ModellerSayfasi().setVisible(true);
                    ModellerSayfasi.jLabelGiris.setVisible(false);
                    ModellerSayfasi.jLabelKayit.setVisible(false);
                    ModellerSayfasi.jLabelgiris.setVisible(false);
                    ModellerSayfasi.jLabelkayit.setVisible(false);
                    ModellerSayfasi.jLabelHos.setText(Kullaniciİsim + " " + KullaniciSoyİsim);
//                    ModellerSayfasi.jLabelHos.setText(rs.getString("musAd") + " " + rs.getString("musSoyadi"));
//                    Kullaniciİsim = rs.getString("musAd");
//                    KullaniciSoyİsim = rs.getString("musSoyadi");
                    dispose();
                    break;
                } else if (i == (ls.size() - 1)) {
                    JOptionPane.showMessageDialog(this, "Geçersiz e-Mail yada şifre");
                    jTextGemail.setText("");
                    jTextGpass.setText("");

                }
            }

        } catch (SQLException ex) {
            System.err.println("Mail Getirme Hatası:" + ex.getMessage());
        }


    }//GEN-LAST:event_jButtonGirisActionPerformed

    private void jButtonMusteriKayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMusteriKayitActionPerformed
        if (ham.strKontrol(jTextAd.getText().trim())) {
            mp.setMusAdi(jTextAd.getText().trim().toUpperCase());
            if (ham.strKontrol(jTextSoyad.getText().trim())) {
                mp.setMusSoyadi(jTextSoyad.getText().trim().toUpperCase());
                if (ham.NumKontrol(jTextTel.getText().trim())) {
                    mp.setMusTel(jTextTel.getText().trim());
                    if (ham.strKontrol(jTextUnvan.getText().trim())) {
                        mp.setMusUnvan(jTextUnvan.getText().trim().toUpperCase());
                        if (ham.strKontrol(jTextSirket.getText().trim())) {
                            mp.setMusSirket(jTextSirket.getText().trim().toUpperCase());
                            if (ham.mailDogrulama(jTextMail.getText().trim())) {
                                mp.setMusMail(jTextMail.getText().trim());
                                if (ham.SifreKontrol(jTextSifre.getText().trim())) {
                                    mp.setMusSifre(jTextSifre.getText().trim());
                                    met.MusteriEkle(mp);
                                    jTextAd.setText("");
                                    jTextSoyad.setText("");
                                    jTextTel.setText("");
                                    jTextUnvan.setText("");
                                    jTextSirket.setText("");
                                    jTextMail.setText("");
                                    jTextSifre.setText("");
                                    new ModellerSayfasi().setVisible(true);
                                    ModellerSayfasi.jLabelGiris.setVisible(false);
                                    ModellerSayfasi.jLabelKayit.setVisible(false);
                                    ModellerSayfasi.jLabelgiris.setVisible(false);
                                    ModellerSayfasi.jLabelkayit.setVisible(false);
                                    ModellerSayfasi.jLabelHos.setText(mp.getMusAdi() + " " + mp.getMusSoyadi());
                                    Kullaniciİsim = mp.getMusAdi();
                                    KullaniciSoyİsim = mp.getMusSoyadi();
                                    dispose();

                                } else {
                                    JOptionPane.showMessageDialog(this, "Lütfen şifrenizde sadece karakter ve sayı kullanınız.");
                                }

                            } else {
                                JOptionPane.showMessageDialog(this, "Lütfen geçerli mail adresi giriniz");
                            }

                        } else {
                            JOptionPane.showMessageDialog(this, "Lütfen şirket isminizde sadece harf kullanın");
                        }

                    } else {
                        JOptionPane.showMessageDialog(this, "Lütfen Unvanınızda sadece harf kullanın");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Lütfen numaranızı 11 haneli ve başında 0 olmadan giriniz");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Lütfen ad ve soyad kısmına sadece harf");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Lütfen ad ve soyad kısmına sadece harf");
        }


    }//GEN-LAST:event_jButtonMusteriKayitActionPerformed

    private void jLabelDevamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDevamMouseClicked
        new ModellerSayfasi().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelDevamMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        new EmailTelDogrulamasi().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jTextGemailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextGemailMouseClicked
        jTextGemail.setText("");
    }//GEN-LAST:event_jTextGemailMouseClicked

    private void jTextGpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextGpassMouseClicked
        jTextGpass.setText("");
    }//GEN-LAST:event_jTextGpassMouseClicked

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
            java.util.logging.Logger.getLogger(MusteriKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusteriKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusteriKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusteriKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusteriKayit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGiris;
    private javax.swing.JButton jButtonMusteriKayit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelDevam;
    private javax.swing.JLabel jLabelarka;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextAd;
    private javax.swing.JTextField jTextGemail;
    private javax.swing.JTextField jTextGpass;
    private javax.swing.JTextField jTextMail;
    private javax.swing.JTextField jTextSifre;
    private javax.swing.JTextField jTextSirket;
    private javax.swing.JTextField jTextSoyad;
    private javax.swing.JTextField jTextTel;
    private javax.swing.JTextField jTextUnvan;
    // End of variables declaration//GEN-END:variables

}
