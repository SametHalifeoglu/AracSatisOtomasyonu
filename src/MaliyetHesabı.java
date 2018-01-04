
import Fabrika_DB.DB;
import Fabrika_Method.ArkaPlanMethod;
import Fabrika_Method.DolarCek;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;




public class MaliyetHesabı extends javax.swing.JFrame {

    ArrayList<Object> ls=new ArrayList<>();
    DB db=new DB();
    DolarCek dc=new DolarCek();
    ArkaPlanMethod ark=new ArkaPlanMethod();
    public static float toplammaliyet;
    public MaliyetHesabı() {
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("image/ev.png"));
        ark.imagee(jLabelarka, "image/arka.jpg");
        jTextSeciliUrun.setText((DolarCek.seciliModel)+" "+DolarCek.seciliSeri );
        jTextUrunMaliyet.setText(dc.FiyatHesapla() + " TL");
        
        String query="select UrSure, UrisciMaliyet, UrEnerjiMaliyet, UrVergiKira from maliyettable where UrModel='"+DolarCek.seciliModel+"'";
        try {
            
            ResultSet rs=db.baglan().executeQuery(query);
            while(rs.next()){
                ls.add(rs.getString("UrSure"));
                ls.add(rs.getFloat("UrisciMaliyet"));
                ls.add(rs.getFloat("UrEnerjiMaliyet"));
                ls.add(rs.getFloat("UrVergiKira"));
            }
            jTextUrunSure.setText(""+ls.get(0) + " Gün");
            jTextisciMali.setText(""+ls.get(1) + " TL");
            jTextEnerjiMali.setText(""+ls.get(2)+ " TL");
            jTextVergi.setText(""+ls.get(3)+ " TL");
            float a=(float) ls.get(1);
            float b=(float) ls.get(2);
            float c=(float) ls.get(3);
            
            float maliyet =a+b+c;
            toplammaliyet=(DolarCek.para+ maliyet);
            
            System.out.println("toplam maliyet :" + maliyet);
            
        } catch (SQLException e) {
            System.err.println("Maliyet Çekme Hatası:" + e.getMessage());
        }
        
        
        
    }
    
     

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextSeciliUrun = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextUrunMaliyet = new javax.swing.JTextField();
        jTextUrunSure = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextisciMali = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextEnerjiMali = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextVergi = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextMaliyet = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabelarka = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Satış Fiyatı Hesaplama"));

        jLabel1.setText("Sipariş Edilen Model");

        jLabel2.setText("Tüm araç parçaları maliyeti");

        jLabel3.setText("Üretim Süresi");

        jLabel4.setText("İşçi Maliyeti");

        jLabel5.setText("Enerji Maliyeti");

        jLabel6.setText("Vegi +  Kira");

        jTextVergi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextVergiActionPerformed(evt);
            }
        });

        jLabel7.setText("Toplam Maliyet");

        jToggleButton1.setText("HESAPLA");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setText("YAZDIR");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextVergi, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(jTextEnerjiMali)
                            .addComponent(jTextisciMali)
                            .addComponent(jTextUrunSure)
                            .addComponent(jTextUrunMaliyet)
                            .addComponent(jTextSeciliUrun)
                            .addComponent(jTextMaliyet)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToggleButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton2)
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextSeciliUrun, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextUrunMaliyet, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextUrunSure, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextisciMali, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextEnerjiMali, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextVergi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextMaliyet, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(480, 120, 420, 460);
        getContentPane().add(jLabelarka);
        jLabelarka.setBounds(0, 0, 1370, 780);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextVergiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextVergiActionPerformed
        
    }//GEN-LAST:event_jTextVergiActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
       jTextMaliyet.setText(""+toplammaliyet + " TL");
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        new SiparisSayfasi().setVisible(true);
        SiparisSayfasi.jTextFiyat.setText(""+toplammaliyet + " TL");
        dispose();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

   
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
            java.util.logging.Logger.getLogger(MaliyetHesabı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MaliyetHesabı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MaliyetHesabı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MaliyetHesabı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MaliyetHesabı().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelarka;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextEnerjiMali;
    private javax.swing.JTextField jTextMaliyet;
    private javax.swing.JTextField jTextSeciliUrun;
    private javax.swing.JTextField jTextUrunMaliyet;
    private javax.swing.JTextField jTextUrunSure;
    private javax.swing.JTextField jTextVergi;
    private javax.swing.JTextField jTextisciMali;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables

}
