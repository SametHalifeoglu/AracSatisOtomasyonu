
import Fabrika_Method.ArkaPlanMethod;
import Fabrika_Method.FiyatResmiCek;
import Fabrika_Method.PaneDoldurma;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

public class ModellerSayfasi extends javax.swing.JFrame {

    ArkaPlanMethod ark = new ArkaPlanMethod();
    PaneDoldurma pd = new PaneDoldurma();
    public static int modeldurum ;
    ArrayList<String> ls = new ArrayList<>();
    public static boolean combodurum = false;

    public ModellerSayfasi() {
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("image/ev.png"));
        ark.imagee(arka, "image/arka1.jpg");
        labeldoldur();
        jComboBox1.setVisible(false);
        
        
        if (combodurum) {
            jComboBox1.setVisible(true);
            combodoldur();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelKompakt = new javax.swing.JPanel();
        jLabelm1 = new javax.swing.JLabel();
        jLabelm2 = new javax.swing.JLabel();
        jLabelm3 = new javax.swing.JLabel();
        jLabelm4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabelr1 = new javax.swing.JLabel();
        jLabelr2 = new javax.swing.JLabel();
        jLabelr3 = new javax.swing.JLabel();
        jLabelr4 = new javax.swing.JLabel();
        jPanelSedan = new javax.swing.JPanel();
        jLabelm5 = new javax.swing.JLabel();
        jLabelm6 = new javax.swing.JLabel();
        jLabelm7 = new javax.swing.JLabel();
        jLabelm8 = new javax.swing.JLabel();
        jLabelm9 = new javax.swing.JLabel();
        jLabelm10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabelr8 = new javax.swing.JLabel();
        jLabelr6 = new javax.swing.JLabel();
        jLabelr5 = new javax.swing.JLabel();
        jLabelr9 = new javax.swing.JLabel();
        jLabelr10 = new javax.swing.JLabel();
        jLabelr7 = new javax.swing.JLabel();
        jPanelEstate = new javax.swing.JPanel();
        jLabelr11 = new javax.swing.JLabel();
        jLabelr12 = new javax.swing.JLabel();
        jLabelm11 = new javax.swing.JLabel();
        jLabelm12 = new javax.swing.JLabel();
        jPanelCoupe = new javax.swing.JPanel();
        jLabelr13 = new javax.swing.JLabel();
        jLabelr14 = new javax.swing.JLabel();
        jLabelr15 = new javax.swing.JLabel();
        jLabelr18 = new javax.swing.JLabel();
        jLabelr17 = new javax.swing.JLabel();
        jLabelr16 = new javax.swing.JLabel();
        jLabelm13 = new javax.swing.JLabel();
        jLabelm14 = new javax.swing.JLabel();
        jLabelm15 = new javax.swing.JLabel();
        jLabelm16 = new javax.swing.JLabel();
        jLabelm17 = new javax.swing.JLabel();
        jLabelm18 = new javax.swing.JLabel();
        jPanelCabriolet = new javax.swing.JPanel();
        jLabelr19 = new javax.swing.JLabel();
        jLabelr20 = new javax.swing.JLabel();
        jLabelr21 = new javax.swing.JLabel();
        jLabelr22 = new javax.swing.JLabel();
        jLabelr23 = new javax.swing.JLabel();
        jLabelm19 = new javax.swing.JLabel();
        jLabelm20 = new javax.swing.JLabel();
        jLabelm21 = new javax.swing.JLabel();
        jLabelm22 = new javax.swing.JLabel();
        jLabelm23 = new javax.swing.JLabel();
        jPanelSUV = new javax.swing.JPanel();
        jLabelr24 = new javax.swing.JLabel();
        jLabelr25 = new javax.swing.JLabel();
        jLabelr26 = new javax.swing.JLabel();
        jLabelm24 = new javax.swing.JLabel();
        jLabelm25 = new javax.swing.JLabel();
        jLabelm26 = new javax.swing.JLabel();
        jPanelAMG = new javax.swing.JPanel();
        jLabelr27 = new javax.swing.JLabel();
        jLabelm27 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jLabelUser = new javax.swing.JLabel();
        jToggleButtonSol = new javax.swing.JToggleButton();
        jToggleButtonSag = new javax.swing.JToggleButton();
        jLabelGiris = new javax.swing.JLabel();
        jLabelKayit = new javax.swing.JLabel();
        jLabelgiris = new javax.swing.JLabel();
        jLabelkayit = new javax.swing.JLabel();
        jLabelHos = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        arka = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(null);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(500, 124));

        jLabelm1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelm1.setText("jLabel1");

        jLabelm2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelm2.setText("jLabel2");

        jLabelm3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelm3.setText("jLabel3");

        jLabelm4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelm4.setText("jLabel4");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Kompakt Fiyat Listesi");

        jLabelr1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelr1MouseClicked(evt);
            }
        });

        jLabelr2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelr2MouseClicked(evt);
            }
        });

        jLabelr3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelr3MouseClicked(evt);
            }
        });

        jLabelr4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelr4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelKompaktLayout = new javax.swing.GroupLayout(jPanelKompakt);
        jPanelKompakt.setLayout(jPanelKompaktLayout);
        jPanelKompaktLayout.setHorizontalGroup(
            jPanelKompaktLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKompaktLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanelKompaktLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelKompaktLayout.createSequentialGroup()
                        .addGroup(jPanelKompaktLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelr1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelm1)
                            .addComponent(jLabel10)
                            .addComponent(jLabelm4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addGroup(jPanelKompaktLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelr2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelm2))
                        .addGap(42, 42, 42)
                        .addGroup(jPanelKompaktLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelr3, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelm3))
                        .addGap(58, 58, 58))
                    .addGroup(jPanelKompaktLayout.createSequentialGroup()
                        .addComponent(jLabelr4, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelKompaktLayout.setVerticalGroup(
            jPanelKompaktLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKompaktLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanelKompaktLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelr3, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(jLabelr2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelr1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelKompaktLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelm1)
                    .addComponent(jLabelm2)
                    .addComponent(jLabelm3))
                .addGap(18, 18, 18)
                .addComponent(jLabelr4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelm4)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Kompakt", jPanelKompakt);

        jLabelm5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelm5.setText("jLabel5");

        jLabelm6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelm6.setText("jLabel6");

        jLabelm7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelm7.setText("jLabel7");

        jLabelm8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelm8.setText("jLabel8");

        jLabelm9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelm9.setText("jLabel9");

        jLabelm10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelm10.setText("jLabel11");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Sedan Fiyat Listesi");

        jLabelr8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelr8MouseClicked(evt);
            }
        });

        jLabelr6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelr6MouseClicked(evt);
            }
        });

        jLabelr5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelr5MouseClicked(evt);
            }
        });

        jLabelr9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelr9MouseClicked(evt);
            }
        });

        jLabelr10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelr10MouseClicked(evt);
            }
        });

        jLabelr7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelr7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelSedanLayout = new javax.swing.GroupLayout(jPanelSedan);
        jPanelSedan.setLayout(jPanelSedanLayout);
        jPanelSedanLayout.setHorizontalGroup(
            jPanelSedanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSedanLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanelSedanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSedanLayout.createSequentialGroup()
                        .addGroup(jPanelSedanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelm5)
                            .addComponent(jLabelr5, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelSedanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelr6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelSedanLayout.createSequentialGroup()
                                .addComponent(jLabelm6)
                                .addGap(0, 272, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSedanLayout.createSequentialGroup()
                        .addComponent(jLabelr8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelr9, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(jPanelSedanLayout.createSequentialGroup()
                        .addGroup(jPanelSedanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSedanLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel12))
                            .addComponent(jLabelm8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                        .addComponent(jLabelm9)
                        .addGap(297, 297, 297)))
                .addGroup(jPanelSedanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelm7)
                    .addGroup(jPanelSedanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabelr10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                        .addComponent(jLabelr7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabelm10))
                .addGap(81, 81, 81))
        );
        jPanelSedanLayout.setVerticalGroup(
            jPanelSedanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSedanLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel12)
                .addGap(31, 31, 31)
                .addGroup(jPanelSedanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelr5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelr6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelr7, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelSedanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelm5)
                    .addComponent(jLabelm6)
                    .addComponent(jLabelm7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanelSedanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelr8, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(jLabelr10, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(jLabelr9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelSedanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelm10)
                    .addComponent(jLabelm8)
                    .addComponent(jLabelm9))
                .addGap(39, 39, 39))
        );

        jTabbedPane1.addTab("Sedan", jPanelSedan);

        jLabelr11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelr11MouseClicked(evt);
            }
        });

        jLabelr12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelr12MouseClicked(evt);
            }
        });

        jLabelm11.setText("jLabel5");

        jLabelm12.setText("jLabel6");

        javax.swing.GroupLayout jPanelEstateLayout = new javax.swing.GroupLayout(jPanelEstate);
        jPanelEstate.setLayout(jPanelEstateLayout);
        jPanelEstateLayout.setHorizontalGroup(
            jPanelEstateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstateLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(jPanelEstateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelr11, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelm11))
                .addGap(105, 105, 105)
                .addGroup(jPanelEstateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelm12)
                    .addComponent(jLabelr12, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 299, Short.MAX_VALUE))
        );
        jPanelEstateLayout.setVerticalGroup(
            jPanelEstateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstateLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanelEstateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelr12, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(jLabelr11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelEstateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelm11)
                    .addComponent(jLabelm12))
                .addContainerGap(266, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Estate", jPanelEstate);

        jLabelr13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelr13MouseClicked(evt);
            }
        });

        jLabelr14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelr14MouseClicked(evt);
            }
        });

        jLabelr15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelr15MouseClicked(evt);
            }
        });

        jLabelr18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelr18MouseClicked(evt);
            }
        });

        jLabelr17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelr17MouseClicked(evt);
            }
        });

        jLabelr16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelr16MouseClicked(evt);
            }
        });

        jLabelm13.setText("jLabel5");

        jLabelm14.setText("jLabel6");

        jLabelm15.setText("jLabel7");

        jLabelm16.setText("jLabel8");

        jLabelm17.setText("jLabel9");

        jLabelm18.setText("jLabel11");

        javax.swing.GroupLayout jPanelCoupeLayout = new javax.swing.GroupLayout(jPanelCoupe);
        jPanelCoupe.setLayout(jPanelCoupeLayout);
        jPanelCoupeLayout.setHorizontalGroup(
            jPanelCoupeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCoupeLayout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addGroup(jPanelCoupeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelm13)
                    .addComponent(jLabelm16)
                    .addComponent(jLabelr16, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                    .addComponent(jLabelr13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addGroup(jPanelCoupeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelm14)
                    .addComponent(jLabelm17)
                    .addComponent(jLabelr14, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                    .addComponent(jLabelr17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(54, 54, 54)
                .addGroup(jPanelCoupeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelm18)
                    .addComponent(jLabelm15)
                    .addComponent(jLabelr15, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelr18, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );
        jPanelCoupeLayout.setVerticalGroup(
            jPanelCoupeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCoupeLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanelCoupeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelr13, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(jLabelr14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelr15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCoupeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelm15)
                    .addComponent(jLabelm14)
                    .addComponent(jLabelm13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(jPanelCoupeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelr16, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(jLabelr17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelr18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCoupeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelm18)
                    .addComponent(jLabelm17)
                    .addComponent(jLabelm16))
                .addGap(39, 39, 39))
        );

        jTabbedPane1.addTab("Coupe", jPanelCoupe);

        jLabelr19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelr19MouseClicked(evt);
            }
        });

        jLabelr20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelr20MouseClicked(evt);
            }
        });

        jLabelr21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelr21MouseClicked(evt);
            }
        });

        jLabelr22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelr22MouseClicked(evt);
            }
        });

        jLabelr23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelr23MouseClicked(evt);
            }
        });

        jLabelm19.setText("jLabel6");

        jLabelm20.setText("jLabel7");

        jLabelm21.setText("jLabel8");

        jLabelm22.setText("jLabel9");

        jLabelm23.setText("jLabel11");

        javax.swing.GroupLayout jPanelCabrioletLayout = new javax.swing.GroupLayout(jPanelCabriolet);
        jPanelCabriolet.setLayout(jPanelCabrioletLayout);
        jPanelCabrioletLayout.setHorizontalGroup(
            jPanelCabrioletLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCabrioletLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(jPanelCabrioletLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelm22)
                    .addComponent(jLabelm19)
                    .addComponent(jLabelr19, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                    .addComponent(jLabelr22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addGroup(jPanelCabrioletLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelm20)
                    .addComponent(jLabelm23)
                    .addComponent(jLabelr20, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                    .addComponent(jLabelr23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanelCabrioletLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelm21)
                    .addComponent(jLabelr21, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanelCabrioletLayout.setVerticalGroup(
            jPanelCabrioletLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCabrioletLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanelCabrioletLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelr20, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(jLabelr19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelr21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCabrioletLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelm20)
                    .addComponent(jLabelm21)
                    .addComponent(jLabelm19))
                .addGap(61, 61, 61)
                .addGroup(jPanelCabrioletLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelr23, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(jLabelr22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCabrioletLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelm22)
                    .addComponent(jLabelm23))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cabriolet", jPanelCabriolet);

        jLabelr24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelr24MouseClicked(evt);
            }
        });

        jLabelr25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelr25MouseClicked(evt);
            }
        });

        jLabelr26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelr26MouseClicked(evt);
            }
        });

        jLabelm24.setText("jLabel5");

        jLabelm25.setText("jLabel6");

        jLabelm26.setText("jLabel7");

        javax.swing.GroupLayout jPanelSUVLayout = new javax.swing.GroupLayout(jPanelSUV);
        jPanelSUV.setLayout(jPanelSUVLayout);
        jPanelSUVLayout.setHorizontalGroup(
            jPanelSUVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSUVLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanelSUVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelr24, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelm24))
                .addGap(87, 87, 87)
                .addGroup(jPanelSUVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelr25, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelm25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(jPanelSUVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelm26)
                    .addComponent(jLabelr26, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
        );
        jPanelSUVLayout.setVerticalGroup(
            jPanelSUVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSUVLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanelSUVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSUVLayout.createSequentialGroup()
                        .addGroup(jPanelSUVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelr25, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(jLabelr24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelSUVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelm25)
                            .addComponent(jLabelm24))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelSUVLayout.createSequentialGroup()
                        .addComponent(jLabelr26, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelm26)
                        .addGap(131, 295, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("SUV", jPanelSUV);

        jLabelr27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelr27MouseClicked(evt);
            }
        });

        jLabelm27.setText("jLabel5");

        jButton12.setText("<");

        javax.swing.GroupLayout jPanelAMGLayout = new javax.swing.GroupLayout(jPanelAMG);
        jPanelAMG.setLayout(jPanelAMGLayout);
        jPanelAMGLayout.setHorizontalGroup(
            jPanelAMGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAMGLayout.createSequentialGroup()
                .addGroup(jPanelAMGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAMGLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton12))
                    .addGroup(jPanelAMGLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(jPanelAMGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelm27)
                            .addComponent(jLabelr27, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(626, Short.MAX_VALUE))
        );
        jPanelAMGLayout.setVerticalGroup(
            jPanelAMGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAMGLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabelr27, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelm27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12)
                .addContainerGap(209, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("AMG", jPanelAMG);

        jPanel1.add(jTabbedPane1);
        jTabbedPane1.setBounds(159, 104, 1052, 517);

        jLabelUser.setBackground(new java.awt.Color(255, 255, 255));
        jLabelUser.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelUserMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelUser);
        jLabelUser.setBounds(58, 101, 0, 56);

        jToggleButtonSol.setIcon(new javax.swing.ImageIcon("C:\\Users\\java\\Documents\\NetBeansProjects\\Fabrika_Otomasyonu\\image\\solltıkk.png")); // NOI18N
        jToggleButtonSol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonSolActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButtonSol);
        jToggleButtonSol.setBounds(90, 340, 48, 48);

        jToggleButtonSag.setIcon(new javax.swing.ImageIcon("C:\\Users\\java\\Documents\\NetBeansProjects\\Fabrika_Otomasyonu\\image\\saggtıkk.png")); // NOI18N
        jToggleButtonSag.setMaximumSize(new java.awt.Dimension(48, 48));
        jToggleButtonSag.setMinimumSize(new java.awt.Dimension(48, 48));
        jToggleButtonSag.setPreferredSize(new java.awt.Dimension(48, 48));
        jToggleButtonSag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonSagActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButtonSag);
        jToggleButtonSag.setBounds(1229, 346, 48, 48);

        jLabelGiris.setIcon(new javax.swing.ImageIcon("C:\\Users\\java\\Documents\\NetBeansProjects\\Fabrika_Otomasyonu\\src\\image\\giris.png")); // NOI18N
        jLabelGiris.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelGirisMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelGiris);
        jLabelGiris.setBounds(1162, 2, 64, 64);

        jLabelKayit.setIcon(new javax.swing.ImageIcon("C:\\Users\\java\\Documents\\NetBeansProjects\\Fabrika_Otomasyonu\\src\\image\\kayit.png")); // NOI18N
        jLabelKayit.setRequestFocusEnabled(false);
        jLabelKayit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelKayitMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelKayit);
        jLabelKayit.setBounds(1070, 2, 64, 64);

        jLabelgiris.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelgiris.setForeground(new java.awt.Color(255, 255, 255));
        jLabelgiris.setText("GİRİŞ YAP");
        jPanel1.add(jLabelgiris);
        jLabelgiris.setBounds(1168, 72, 58, 14);

        jLabelkayit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelkayit.setForeground(new java.awt.Color(255, 255, 255));
        jLabelkayit.setText("KAYIT OL");
        jPanel1.add(jLabelkayit);
        jLabelkayit.setBounds(1080, 72, 51, 14);

        jLabelHos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelHos.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabelHos);
        jLabelHos.setBounds(853, 13, 199, 36);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1İtemStateChanged(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(1244, 13, 98, 20);

        arka.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.add(arka);
        arka.setBounds(0, 0, 1366, 770);

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
    }// </editor-fold>//GEN-END:initComponents

    public void combodoldur() {
        ls.add("Seçiniz");
        ls.add("Araç Takip");
        ls.add("Çıkış");
        DefaultComboBoxModel dcm = new DefaultComboBoxModel();
        for (String l : ls) {
            dcm.addElement(l);
        }
        jComboBox1.setModel(dcm);

    }
    private void jToggleButtonSagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonSagActionPerformed
        jTabbedPane1.setSelectedIndex(++i);
        if (i == jTabbedPane1.getTabCount() - 1) {
            i = -1;

        }
    }//GEN-LAST:event_jToggleButtonSagActionPerformed

    private void jToggleButtonSolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonSolActionPerformed
        --i;
        if (i == -1) {
            i = jTabbedPane1.getTabCount() - 1;
            jTabbedPane1.setSelectedIndex(i);
        } else {
            jTabbedPane1.setSelectedIndex(i);

        }
    }//GEN-LAST:event_jToggleButtonSolActionPerformed

    private void jLabelUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUserMouseClicked

    }//GEN-LAST:event_jLabelUserMouseClicked

    private void jLabelr27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelr27MouseClicked

    }//GEN-LAST:event_jLabelr27MouseClicked

    private void jLabelr26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelr26MouseClicked
        FiyatResmiCek.gelenurl = "http://fiyat.mercedes-benz.com.tr/gls";
        new SiparisSayfasi().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelr26MouseClicked

    private void jLabelr25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelr25MouseClicked
        FiyatResmiCek.gelenurl = "http://fiyat.mercedes-benz.com.tr/gle-suv";
        new SiparisSayfasi().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelr25MouseClicked

    private void jLabelr24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelr24MouseClicked
        FiyatResmiCek.gelenurl = "http://fiyat.mercedes-benz.com.tr/glc-suv";
        new SiparisSayfasi().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelr24MouseClicked

    private void jLabelr23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelr23MouseClicked
        FiyatResmiCek.gelenurl = "http://fiyat.mercedes-benz.com.tr/slc";
        new SiparisSayfasi().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelr23MouseClicked

    private void jLabelr22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelr22MouseClicked
        FiyatResmiCek.gelenurl = "http://fiyat.mercedes-benz.com.tr/yeni-sl";
        new SiparisSayfasi().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelr22MouseClicked

    private void jLabelr21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelr21MouseClicked
        FiyatResmiCek.gelenurl = "http://fiyat.mercedes-benz.com.tr/s-serisi-cabriolet";
        new SiparisSayfasi().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelr21MouseClicked

    private void jLabelr20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelr20MouseClicked
        FiyatResmiCek.gelenurl = "http://fiyat.mercedes-benz.com.tr/e-serisi-cabriolet";
        new SiparisSayfasi().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelr20MouseClicked

    private void jLabelr19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelr19MouseClicked
        FiyatResmiCek.gelenurl = "http://fiyat.mercedes-benz.com.tr/c-serisi-cabriolet";
        new SiparisSayfasi().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelr19MouseClicked

    private void jLabelr16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelr16MouseClicked
        FiyatResmiCek.gelenurl = "http://fiyat.mercedes-benz.com.tr/glc-coup%C3%A9";
        new SiparisSayfasi().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelr16MouseClicked

    private void jLabelr17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelr17MouseClicked
        FiyatResmiCek.gelenurl = "http://fiyat.mercedes-benz.com.tr/gle-coup%C3%A9";
        new SiparisSayfasi().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelr17MouseClicked

    private void jLabelr18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelr18MouseClicked
        FiyatResmiCek.gelenurl = "http://fiyat.mercedes-benz.com.tr/s-serisi-coup%C3%A9";
        new SiparisSayfasi().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelr18MouseClicked

    private void jLabelr15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelr15MouseClicked
        FiyatResmiCek.gelenurl = "http://fiyat.mercedes-benz.com.tr/yeni-e-serisi-coup%C3%A9";
        new SiparisSayfasi().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelr15MouseClicked

    private void jLabelr14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelr14MouseClicked
        FiyatResmiCek.gelenurl = "http://fiyat.mercedes-benz.com.tr/cls";
        new SiparisSayfasi().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelr14MouseClicked

    private void jLabelr13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelr13MouseClicked
        FiyatResmiCek.gelenurl = "http://fiyat.mercedes-benz.com.tr/c-serisi-coup%C3%A9";
        new SiparisSayfasi().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelr13MouseClicked

    private void jLabelr12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelr12MouseClicked
        FiyatResmiCek.gelenurl = "http://fiyat.mercedes-benz.com.tr/e-serisi-all-terrain";
        new SiparisSayfasi().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelr12MouseClicked

    private void jLabelr11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelr11MouseClicked
        FiyatResmiCek.gelenurl = "http://fiyat.mercedes-benz.com.tr/c-serisi-estate";
        new SiparisSayfasi().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelr11MouseClicked

    private void jLabelr7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelr7MouseClicked
        FiyatResmiCek.gelenurl = "http://fiyat.mercedes-benz.com.tr/s-serisi-";
        new SiparisSayfasi().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelr7MouseClicked

    private void jLabelr10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelr10MouseClicked
        FiyatResmiCek.gelenurl = "http://fiyat.mercedes-benz.com.tr/yeni-mercedes-maybach-s-serisi--";
        new SiparisSayfasi().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelr10MouseClicked

    private void jLabelr9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelr9MouseClicked
        FiyatResmiCek.gelenurl = "http://fiyat.mercedes-benz.com.tr/mercedes-maybach-s-serisi";
        new SiparisSayfasi().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelr9MouseClicked

    private void jLabelr5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelr5MouseClicked
        FiyatResmiCek.gelenurl = "http://fiyat.mercedes-benz.com.tr/c-serisi-";
        new SiparisSayfasi().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelr5MouseClicked

    private void jLabelr6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelr6MouseClicked
        FiyatResmiCek.gelenurl = "http://fiyat.mercedes-benz.com.tr/yeni-e-serisi-";
        new SiparisSayfasi().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelr6MouseClicked

    private void jLabelr8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelr8MouseClicked
        FiyatResmiCek.gelenurl = "http://fiyat.mercedes-benz.com.tr/-yeni-s-serisi-";
        new SiparisSayfasi().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelr8MouseClicked

    private void jLabelr4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelr4MouseClicked
        FiyatResmiCek.gelenurl = "http://fiyat.mercedes-benz.com.tr/yeni-gla";
        new SiparisSayfasi().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelr4MouseClicked

    private void jLabelr3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelr3MouseClicked
        FiyatResmiCek.gelenurl = "http://fiyat.mercedes-benz.com.tr/cla";
        new SiparisSayfasi().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelr3MouseClicked

    private void jLabelr2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelr2MouseClicked
        FiyatResmiCek.gelenurl = "http://fiyat.mercedes-benz.com.tr/b-serisi";
        new SiparisSayfasi().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelr2MouseClicked

    private void jLabelr1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelr1MouseClicked

        FiyatResmiCek.gelenurl = "http://fiyat.mercedes-benz.com.tr/a-serisi";
        new SiparisSayfasi().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelr1MouseClicked

    private void jLabelKayitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelKayitMouseClicked
        modeldurum=2;
        new MusteriKayit().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelKayitMouseClicked

    private void jLabelGirisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelGirisMouseClicked
        modeldurum = 1;
        new MusteriKayit().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelGirisMouseClicked

    private void jComboBox1İtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1İtemStateChanged
        if (jComboBox1.getSelectedIndex() == 1) {
            new AracTakip(0, null, null,null).setVisible(true);
            dispose();
        }
        else if (jComboBox1.getSelectedIndex() == 2) {
            new AracTakip(0, null, null,null).setVisible(false);
            System.exit(0);
        }
    }//GEN-LAST:event_jComboBox1İtemStateChanged

    int i = 0;

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
            java.util.logging.Logger.getLogger(ModellerSayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModellerSayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModellerSayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModellerSayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModellerSayfasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arka;
    private javax.swing.JButton jButton12;
    public static javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    public static javax.swing.JLabel jLabelGiris;
    public static javax.swing.JLabel jLabelHos;
    public static javax.swing.JLabel jLabelKayit;
    private javax.swing.JLabel jLabelUser;
    public static javax.swing.JLabel jLabelgiris;
    public static javax.swing.JLabel jLabelkayit;
    private javax.swing.JLabel jLabelm1;
    private javax.swing.JLabel jLabelm10;
    private javax.swing.JLabel jLabelm11;
    private javax.swing.JLabel jLabelm12;
    private javax.swing.JLabel jLabelm13;
    private javax.swing.JLabel jLabelm14;
    private javax.swing.JLabel jLabelm15;
    private javax.swing.JLabel jLabelm16;
    private javax.swing.JLabel jLabelm17;
    private javax.swing.JLabel jLabelm18;
    private javax.swing.JLabel jLabelm19;
    private javax.swing.JLabel jLabelm2;
    private javax.swing.JLabel jLabelm20;
    private javax.swing.JLabel jLabelm21;
    private javax.swing.JLabel jLabelm22;
    private javax.swing.JLabel jLabelm23;
    private javax.swing.JLabel jLabelm24;
    private javax.swing.JLabel jLabelm25;
    private javax.swing.JLabel jLabelm26;
    private javax.swing.JLabel jLabelm27;
    private javax.swing.JLabel jLabelm3;
    private javax.swing.JLabel jLabelm4;
    private javax.swing.JLabel jLabelm5;
    private javax.swing.JLabel jLabelm6;
    private javax.swing.JLabel jLabelm7;
    private javax.swing.JLabel jLabelm8;
    private javax.swing.JLabel jLabelm9;
    private javax.swing.JLabel jLabelr1;
    private javax.swing.JLabel jLabelr10;
    private javax.swing.JLabel jLabelr11;
    private javax.swing.JLabel jLabelr12;
    private javax.swing.JLabel jLabelr13;
    private javax.swing.JLabel jLabelr14;
    private javax.swing.JLabel jLabelr15;
    private javax.swing.JLabel jLabelr16;
    private javax.swing.JLabel jLabelr17;
    private javax.swing.JLabel jLabelr18;
    private javax.swing.JLabel jLabelr19;
    private javax.swing.JLabel jLabelr2;
    private javax.swing.JLabel jLabelr20;
    private javax.swing.JLabel jLabelr21;
    private javax.swing.JLabel jLabelr22;
    private javax.swing.JLabel jLabelr23;
    private javax.swing.JLabel jLabelr24;
    private javax.swing.JLabel jLabelr25;
    private javax.swing.JLabel jLabelr26;
    private javax.swing.JLabel jLabelr27;
    private javax.swing.JLabel jLabelr3;
    private javax.swing.JLabel jLabelr4;
    private javax.swing.JLabel jLabelr5;
    private javax.swing.JLabel jLabelr6;
    private javax.swing.JLabel jLabelr7;
    private javax.swing.JLabel jLabelr8;
    private javax.swing.JLabel jLabelr9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelAMG;
    private javax.swing.JPanel jPanelCabriolet;
    private javax.swing.JPanel jPanelCoupe;
    private javax.swing.JPanel jPanelEstate;
    private javax.swing.JPanel jPanelKompakt;
    private javax.swing.JPanel jPanelSUV;
    private javax.swing.JPanel jPanelSedan;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToggleButton jToggleButtonSag;
    private javax.swing.JToggleButton jToggleButtonSol;
    // End of variables declaration//GEN-END:variables

    private Image fitimage(Image img, int w, int h) {
        BufferedImage resizedimage = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = resizedimage.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(img, 0, 0, w, h, null);
        g2.dispose();
        return resizedimage;
    }

    public void labeldoldur() {
        pd.ModelDoldur(jLabelm1, jLabelm2, jLabelm3, jLabelm4, jLabelm5, jLabelm6, jLabelm7, jLabelm8, jLabelm9, jLabelm10, jLabelm11, jLabelm12, jLabelm13, jLabelm14, jLabelm15, jLabelm16, jLabelm17, jLabelm18, jLabelm19, jLabelm20, jLabelm21, jLabelm22, jLabelm23, jLabelm24, jLabelm25, jLabelm26, jLabelm27);

        pd.resimDoldur(jLabelr1);
        pd.resimDoldur(jLabelr2);
        pd.resimDoldur(jLabelr3);
        pd.resimDoldur(jLabelr4);
        pd.resimDoldur(jLabelr5);
        pd.resimDoldur(jLabelr6);
        pd.resimDoldur(jLabelr7);
        pd.resimDoldur(jLabelr8);
        pd.resimDoldur(jLabelr9);
        pd.resimDoldur(jLabelr10);
        pd.resimDoldur(jLabelr11);
        pd.resimDoldur(jLabelr12);
        pd.resimDoldur(jLabelr13);
        pd.resimDoldur(jLabelr14);
        pd.resimDoldur(jLabelr15);
        pd.resimDoldur(jLabelr16);
        pd.resimDoldur(jLabelr17);
        pd.resimDoldur(jLabelr18);
        pd.resimDoldur(jLabelr19);
        pd.resimDoldur(jLabelr20);
        pd.resimDoldur(jLabelr21);
        pd.resimDoldur(jLabelr22);
        pd.resimDoldur(jLabelr23);
        pd.resimDoldur(jLabelr24);
        pd.resimDoldur(jLabelr25);
        pd.resimDoldur(jLabelr26);
        pd.resimDoldur(jLabelr27);

    }

}
