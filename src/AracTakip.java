
import Fabrika_DB.DB;
import Fabrika_Method.ArkaPlanMethod;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class AracTakip extends javax.swing.JFrame implements Runnable {

    ArrayList<String> ls = new ArrayList<>();

    int thread;
    int say = 0;
    JLabel label = null;
    public static int j;
    int k = 0;
    JLabel label1 = null;

    int bak = 2;
    JProgressBar bar = null;
    ArkaPlanMethod ark = new ArkaPlanMethod();

    DB db = new DB();

    @Override
    public void run() {

        String query = "select BankThread from bankserver where BankAdi='" + MusteriKayit.Kullaniciİsim + "'and BankSoyadi='" + MusteriKayit.KullaniciSoyİsim + "'";
        try {
            ResultSet rs = db.baglan().executeQuery(query);
            while (rs.next()) {
                thread = Integer.valueOf(rs.getString("BankThread"));
                System.out.println("gelen thread değeri:" + rs.getString("BankThread"));
            }
        } catch (SQLException ex) {
            System.err.println("Thread Getirme Hatası :" + ex.getMessage());
        }
        j = thread;
        for (;;) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.err.println("");
            }

            if (say == 1) {
                j++;
                bar.setValue(j);
                if (j == 0 || j <= 5) {
                    jLabelAcıkla.setText("ARACINIZ BOYAMA İŞLEMİNE TABİ TUTULMAKTADIR.");
                    ark.imagee(label, "image\\aracboyama\\" + j + ".jpg");

                }
                if (j > 5 && j <= 10) {
                    jLabelAcıkla.setText("ARACINIZ MONTAJ İŞLEMİNDEDİR.");
                    ark.imagee(label, "image\\aractasarım\\" + j + ".jpg");

                }
                if (j > 10 && j <= 15) {

                    ark.imagee(label, "image\\bitmisarac\\" + j + ".jpg");
                    jLabelAcıkla.setText("ARACINIZIN ÜRETİM AŞAMASI TAMAMLANMIŞ,TEST SÜRÜŞÜNE GİRMİŞTİR..");

                }

            }

            if (say == 2) {
                k++;

                if (k == 0 || k <= 5) {
                    ark.imagee(label, "image\\PNG/0.PNG");
                }
                if (k > 5 && k <= 10) {
                    ark.imagee(label, "image\\PNG/5.PNG");
                }
                if (k > 10) {
                    ark.imagee(label, "image\\PNG/10.PNG");
                }
            }
        }

    }
    Thread th1 = null;
    Thread th2 = null;

    public AracTakip(int i, JLabel label, JLabel label1, JProgressBar bar) {
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("image/ev.png"));
        ark.imagee(jLabel1, "image/arka1.jpg");

        this.label = label;
        this.say = i;
        this.bar = bar;
        this.label1 = label1;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelArac = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelTanitim = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelAcıkla = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelArac, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelArac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(120, 97, 554, 465);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTanitim, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabelTanitim, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(692, 97, 628, 465);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/zxzx.png"))); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(64, 64));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1160, 10, 64, 64);
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(110, 640, 1197, 41);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cıkıs.png"))); // NOI18N
        jButton2.setPreferredSize(new java.awt.Dimension(64, 64));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(1260, 10, 64, 64);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1370, 770);

        jLabel2.setText("Araç Durum Sorgula");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1150, 80, 100, 14);

        jLabel3.setText("Çıkış Yap");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(1270, 80, 50, 14);

        jLabelAcıkla.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelAcıkla.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabelAcıkla);
        jLabelAcıkla.setBounds(130, 580, 530, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        th1 = new Thread(new AracTakip(1, jLabelArac, jLabelAcıkla, jProgressBar1));
        th2 = new Thread(new AracTakip(2, jLabelTanitim, jLabelAcıkla, jProgressBar1));
        th1.start();
        th2.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        th1.stop();
        th2.stop();
        String query = "update bankserver set BankThread='" + j + "' where BankAdi='" + MusteriKayit.Kullaniciİsim + "'and BankSoyadi='" + MusteriKayit.KullaniciSoyİsim + "'";
        try {
            int deger = db.baglan().executeUpdate(query);
            new ModellerSayfasi().setVisible(true);
            ModellerSayfasi.jLabelHos.setText(MusteriKayit.Kullaniciİsim + " " + MusteriKayit.KullaniciSoyİsim);
            ModellerSayfasi.jLabelKayit.setVisible(false);
            ModellerSayfasi.jLabelGiris.setVisible(false);
            ModellerSayfasi.jLabelkayit.setVisible(false);
            ModellerSayfasi.jLabelgiris.setVisible(false);
            dispose();
        } catch (SQLException ex) {
            System.err.println("güncelleme hatası:" + ex.getMessage());
        }


    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AracTakip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AracTakip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AracTakip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AracTakip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new AracTakip(0, null, null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelAcıkla;
    private javax.swing.JLabel jLabelArac;
    private javax.swing.JLabel jLabelTanitim;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables

}
