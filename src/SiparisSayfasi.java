
import Fabrika_Method.ArkaPlanMethod;
import Fabrika_Method.DolarCek;
import Fabrika_Method.FiyatResmiCek;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class SiparisSayfasi extends javax.swing.JFrame {

    DolarCek dc = new DolarCek();
    FiyatResmiCek frc = new FiyatResmiCek();
    ArkaPlanMethod ark = new ArkaPlanMethod();

    public SiparisSayfasi() {
        initComponents();
        ark.imagee(jLabel3, "image/arka1.jpg");

        if (!MusteriKayit.Kullaniciİsim.equalsIgnoreCase("")) {

            jLabelSipHos.setText(MusteriKayit.Kullaniciİsim + " " + MusteriKayit.KullaniciSoyİsim);
        }
        frc.ResimCek();
        JTableUrun.setModel(frc.SatirDoldur());

        BufferedImage image = null;
        try {

            image = ImageIO.read(new URL(frc.ResimCek().get(0)));
        } catch (IOException e) {
            System.err.println("Resim çekme hatası.." + e.getMessage());
        }
        ImageIcon imageIcon = new ImageIcon(fitimage(image, jLabelModelResim.getWidth(), jLabelModelResim.getHeight()));
        jLabelModelResim.setIcon(imageIcon);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        JTableUrun = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jButtonSiparis = new javax.swing.JButton();
        jButtonDestek = new javax.swing.JButton();
        jTextFiyat = new javax.swing.JTextField();
        jLabelModelResim = new javax.swing.JLabel();
        jButtonSagaKaydir = new javax.swing.JButton();
        jButtonSolaKaydir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelSipHos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        JTableUrun.setModel(new javax.swing.table.DefaultTableModel(
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
        JTableUrun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableUrunMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(JTableUrun);
        if (JTableUrun.getColumnModel().getColumnCount() > 0) {
            JTableUrun.getColumnModel().getColumn(0).setHeaderValue("Title 1");
            JTableUrun.getColumnModel().getColumn(1).setHeaderValue("Title 2");
            JTableUrun.getColumnModel().getColumn(2).setHeaderValue("Title 3");
            JTableUrun.getColumnModel().getColumn(3).setHeaderValue("Title 4");
        }

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Satış Fiyatı");

        jButtonSiparis.setBackground(new java.awt.Color(51, 51, 255));
        jButtonSiparis.setForeground(new java.awt.Color(0, 0, 204));
        jButtonSiparis.setText("Siparişi Ver");
        jButtonSiparis.setOpaque(false);
        jButtonSiparis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiparisActionPerformed(evt);
            }
        });

        jButtonDestek.setForeground(new java.awt.Color(0, 0, 204));
        jButtonDestek.setText("Canlı Destek");
        jButtonDestek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDestekActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jTextFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jButtonSiparis)
                .addGap(18, 18, 18)
                .addComponent(jButtonDestek))
            .addComponent(jLabelModelResim, javax.swing.GroupLayout.PREFERRED_SIZE, 944, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabelModelResim, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSiparis)
                            .addComponent(jButtonDestek))))
                .addGap(3, 3, 3))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(180, 100, 948, 596);

        jButtonSagaKaydir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/saggtıkk.png"))); // NOI18N
        jButtonSagaKaydir.setPreferredSize(new java.awt.Dimension(48, 48));
        jButtonSagaKaydir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSagaKaydirMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonSagaKaydir);
        jButtonSagaKaydir.setBounds(1138, 268, 48, 48);

        jButtonSolaKaydir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/solltıkk.png"))); // NOI18N
        jButtonSolaKaydir.setPreferredSize(new java.awt.Dimension(48, 48));
        jButtonSolaKaydir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSolaKaydirMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonSolaKaydir);
        jButtonSolaKaydir.setBounds(120, 250, 48, 48);

        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1070, 0, 0, 0);

        jLabelSipHos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelSipHos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSipHos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSipHosMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelSipHos);
        jLabelSipHos.setBounds(849, 11, 197, 32);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ANA SAYFA");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1073, 67, 62, 14);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1370, 770);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    int i = 0;
    private void jButtonSagaKaydirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSagaKaydirMouseClicked
        frc.ModelResmiYerlestir(jLabelModelResim);
    }//GEN-LAST:event_jButtonSagaKaydirMouseClicked

    private void jButtonSolaKaydirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSolaKaydirMouseClicked
        frc.ModelResmiYerlestir1(jLabelModelResim);
    }//GEN-LAST:event_jButtonSolaKaydirMouseClicked

    private void jButtonSiparisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiparisActionPerformed

        if (MusteriKayit.Kullaniciİsim.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Satın alma işlemlerinde sistemimize kayıt olmanız gereklidir.Sizi Müşteri kayıt sayfamıza yönlendiriyorum.Lütfen bekleyiniz.");
            new MusteriKayit().setVisible(true);
            dispose();
        } else {
            new OdemeSayfası().setVisible(true);
            dispose();
        }


    }//GEN-LAST:event_jButtonSiparisActionPerformed
    int deger = 0;
    private void JTableUrunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableUrunMouseClicked

        deger++;
        String yakit = "" + JTableUrun.getValueAt(JTableUrun.getSelectedRow(), 1);
        if (yakit.equals("null")) {
            DolarCek.seciliModel = "" + JTableUrun.getValueAt(JTableUrun.getSelectedRow(), 0);
        } else {
            DolarCek.seciliSeri = "" + JTableUrun.getValueAt(JTableUrun.getSelectedRow(), 0);
        }
        if (deger == 2) {
            deger = 0;
            new MaliyetHesabı().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_JTableUrunMouseClicked

    private void jButtonDestekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDestekActionPerformed
        new ArkaPlan().setVisible(true);
        new AnaDestek().setVisible(true);
        new MusteriDestek().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonDestekActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        if (MusteriKayit.KullaniciKayit.equalsIgnoreCase("1")) {
            ModellerSayfasi.combodurum = true;
            new ModellerSayfasi().setVisible(true);
            ModellerSayfasi.jLabelGiris.setVisible(false);
            ModellerSayfasi.jLabelKayit.setVisible(false);
            ModellerSayfasi.jLabelgiris.setVisible(false);
            ModellerSayfasi.jLabelkayit.setVisible(false);
            ModellerSayfasi.jLabelHos.setText(MusteriKayit.Kullaniciİsim + " " + MusteriKayit.KullaniciSoyİsim);
            dispose();
        } else {
            new ModellerSayfasi().setVisible(true);
            dispose();
        }


    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabelSipHosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSipHosMouseClicked

    }//GEN-LAST:event_jLabelSipHosMouseClicked

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
            java.util.logging.Logger.getLogger(SiparisSayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SiparisSayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SiparisSayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SiparisSayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SiparisSayfasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableUrun;
    private javax.swing.JButton jButtonDestek;
    private javax.swing.JButton jButtonSagaKaydir;
    private javax.swing.JButton jButtonSiparis;
    private javax.swing.JButton jButtonSolaKaydir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelModelResim;
    public static javax.swing.JLabel jLabelSipHos;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane5;
    public static javax.swing.JTextField jTextFiyat;
    // End of variables declaration//GEN-END:variables

    private Image fitimage(Image img, int w, int h) {
        BufferedImage resizedimage = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = resizedimage.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(img, 0, 0, w, h, null);
        g2.dispose();
        return resizedimage;
    }
}
