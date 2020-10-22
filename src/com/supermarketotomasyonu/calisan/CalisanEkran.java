package com.supermarketotomasyonu.calisan;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * @author berrinkorkutata
 * @author agitrubardemir
 */
public class CalisanEkran extends javax.swing.JFrame {

    int mouseX, mouseY;

    public CalisanEkran() {
        initComponents();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        this.setLocation(x, y);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        form = new javax.swing.JPanel();
        kapamaPanel = new javax.swing.JPanel();
        kapamaButton = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        calisanYazisi = new javax.swing.JLabel();
        yataySeparator = new javax.swing.JSeparator();
        dikeySeparator = new javax.swing.JSeparator();
        urunIslemleriButton = new javax.swing.JLabel();
        kisiselBilgilerButton = new javax.swing.JLabel();
        kullaniciIslemleriButton = new javax.swing.JLabel();
        kullaniciYazisi = new javax.swing.JLabel();
        islemleriYazisi = new javax.swing.JLabel();
        urunYazisi = new javax.swing.JLabel();
        islemleri2Yazisi = new javax.swing.JLabel();
        kisiselYazisi = new javax.swing.JLabel();
        bilgilerYazisi = new javax.swing.JLabel();
        verilenSiparislerButton = new javax.swing.JLabel();
        verilenYazisi = new javax.swing.JLabel();
        siparislerYazisi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        form.setBackground(new java.awt.Color(255, 255, 255));
        form.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        form.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        kapamaPanel.setBackground(new java.awt.Color(255, 255, 255));
        kapamaPanel.setForeground(new java.awt.Color(255, 255, 255));

        kapamaButton.setFont(new java.awt.Font("SF Pro Rounded", 1, 32)); // NOI18N
        kapamaButton.setForeground(new java.awt.Color(255, 255, 255));
        kapamaButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kapamaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/supermarketotomasyonu/images/kapat.png"))); // NOI18N
        kapamaButton.setToolTipText("");
        kapamaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kapamaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kapamaButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kapamaPanelLayout = new javax.swing.GroupLayout(kapamaPanel);
        kapamaPanel.setLayout(kapamaPanelLayout);
        kapamaPanelLayout.setHorizontalGroup(
            kapamaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kapamaPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kapamaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        kapamaPanelLayout.setVerticalGroup(
            kapamaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kapamaPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kapamaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/supermarketotomasyonu/images/newlogo110x110.jpg"))); // NOI18N

        calisanYazisi.setFont(new java.awt.Font("SF Pro Rounded", 1, 60)); // NOI18N
        calisanYazisi.setForeground(new java.awt.Color(79, 114, 0));
        calisanYazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        calisanYazisi.setText("ÇALIŞAN");

        yataySeparator.setBackground(new java.awt.Color(79, 114, 0));
        yataySeparator.setForeground(new java.awt.Color(79, 114, 0));
        yataySeparator.setToolTipText("");
        yataySeparator.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        yataySeparator.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        yataySeparator.setMinimumSize(new java.awt.Dimension(50, 50));
        yataySeparator.setSize(new java.awt.Dimension(50, 20));

        dikeySeparator.setBackground(new java.awt.Color(79, 114, 0));
        dikeySeparator.setForeground(new java.awt.Color(79, 114, 0));
        dikeySeparator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        dikeySeparator.setToolTipText("");
        dikeySeparator.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        dikeySeparator.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        dikeySeparator.setMinimumSize(new java.awt.Dimension(50, 50));
        dikeySeparator.setSize(new java.awt.Dimension(50, 20));

        urunIslemleriButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/supermarketotomasyonu/images/urunBilgileri.png"))); // NOI18N
        urunIslemleriButton.setToolTipText("Ürün İşlemlerini gerçekleştirmek ve Ürünleri görüntülemek için tıklayınız.");
        urunIslemleriButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        urunIslemleriButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                urunIslemleriButtonMouseClicked(evt);
            }
        });

        kisiselBilgilerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/supermarketotomasyonu/images/kisiselBilgiler.png"))); // NOI18N
        kisiselBilgilerButton.setToolTipText("Kişisel Bilgilerinizi görüntülemek için tıklayınız.");
        kisiselBilgilerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kisiselBilgilerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kisiselBilgilerButtonMouseClicked(evt);
            }
        });

        kullaniciIslemleriButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/supermarketotomasyonu/images/kullaniciIslemleri.png"))); // NOI18N
        kullaniciIslemleriButton.setToolTipText("Kullanıcı İşlemlerini gerçekleştirmek ve Kullanıcıları görüntülemek için tıklayınız.");
        kullaniciIslemleriButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kullaniciIslemleriButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kullaniciIslemleriButtonMouseClicked(evt);
            }
        });

        kullaniciYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 24)); // NOI18N
        kullaniciYazisi.setForeground(new java.awt.Color(79, 114, 0));
        kullaniciYazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kullaniciYazisi.setText("KULLANICI");
        kullaniciYazisi.setToolTipText("Kullanıcı İşlemlerini gerçekleştirmek ve Kullanıcıları görüntülemek için yukarıdaki butona tıklayınız.");

        islemleriYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 24)); // NOI18N
        islemleriYazisi.setForeground(new java.awt.Color(79, 114, 0));
        islemleriYazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        islemleriYazisi.setText("İŞLEMLERİ");
        islemleriYazisi.setToolTipText("Kullanıcı İşlemlerini gerçekleştirmek ve Kullanıcıları görüntülemek için yukarıdaki butona tıklayınız.");

        urunYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 24)); // NOI18N
        urunYazisi.setForeground(new java.awt.Color(79, 114, 0));
        urunYazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        urunYazisi.setText("ÜRÜN");
        urunYazisi.setToolTipText("Ürün İşlemlerini gerçekleştirmek ve Ürünleri görüntülemek için yukarıdaki butona tıklayınız.");

        islemleri2Yazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 24)); // NOI18N
        islemleri2Yazisi.setForeground(new java.awt.Color(79, 114, 0));
        islemleri2Yazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        islemleri2Yazisi.setText("İŞLEMLERİ");
        islemleri2Yazisi.setToolTipText("Ürün İşlemlerini gerçekleştirmek ve Ürünleri görüntülemek için yukarıdaki butona tıklayınız.");

        kisiselYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 24)); // NOI18N
        kisiselYazisi.setForeground(new java.awt.Color(79, 114, 0));
        kisiselYazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kisiselYazisi.setText("KİŞİSEL");
        kisiselYazisi.setToolTipText("Kişisel Bilgilerinizi görüntülemek için yukarıdaki butona tıklayınız.");

        bilgilerYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 24)); // NOI18N
        bilgilerYazisi.setForeground(new java.awt.Color(79, 114, 0));
        bilgilerYazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bilgilerYazisi.setText("BİLGİLERİM");
        bilgilerYazisi.setToolTipText("Kişisel Bilgilerinizi görüntülemek için yukarıdaki butona tıklayınız.");

        verilenSiparislerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/supermarketotomasyonu/images/siparisBilgileri.png"))); // NOI18N
        verilenSiparislerButton.setToolTipText("Verilen Siparişleri görüntülemek için tıklayınız.");
        verilenSiparislerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verilenSiparislerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verilenSiparislerButtonMouseClicked(evt);
            }
        });

        verilenYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 24)); // NOI18N
        verilenYazisi.setForeground(new java.awt.Color(79, 114, 0));
        verilenYazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        verilenYazisi.setText("VERİLEN");
        verilenYazisi.setToolTipText("Verilen Siparişleri görüntülemek için yukarıdaki butona tıklayınız.");

        siparislerYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 24)); // NOI18N
        siparislerYazisi.setForeground(new java.awt.Color(79, 114, 0));
        siparislerYazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        siparislerYazisi.setText("SİPARİŞLER");
        siparislerYazisi.setToolTipText("Verilen Siparişleri görüntülemek için yukarıdaki butona tıklayınız.");

        javax.swing.GroupLayout formLayout = new javax.swing.GroupLayout(form);
        form.setLayout(formLayout);
        formLayout.setHorizontalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
                        .addComponent(logo)
                        .addGap(8, 8, 8)
                        .addComponent(dikeySeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calisanYazisi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kapamaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formLayout.createSequentialGroup()
                        .addComponent(yataySeparator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(formLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formLayout.createSequentialGroup()
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kullaniciYazisi, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(islemleriYazisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(60, 60, 60)
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(islemleri2Yazisi, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(urunYazisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(formLayout.createSequentialGroup()
                        .addComponent(kullaniciIslemleriButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(urunIslemleriButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(siparislerYazisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(verilenYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(verilenSiparislerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(kisiselYazisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bilgilerYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kisiselBilgilerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );
        formLayout.setVerticalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formLayout.createSequentialGroup()
                        .addComponent(kapamaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dikeySeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(formLayout.createSequentialGroup()
                                .addComponent(calisanYazisi)
                                .addGap(22, 22, 22)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(yataySeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formLayout.createSequentialGroup()
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kullaniciIslemleriButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(urunIslemleriButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formLayout.createSequentialGroup()
                                .addComponent(kullaniciYazisi)
                                .addGap(2, 2, 2)
                                .addComponent(islemleriYazisi))
                            .addGroup(formLayout.createSequentialGroup()
                                .addComponent(urunYazisi)
                                .addGap(2, 2, 2)
                                .addComponent(islemleri2Yazisi))))
                    .addGroup(formLayout.createSequentialGroup()
                        .addComponent(verilenSiparislerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(verilenYazisi)
                        .addGap(2, 2, 2)
                        .addComponent(siparislerYazisi))
                    .addGroup(formLayout.createSequentialGroup()
                        .addComponent(kisiselBilgilerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(bilgilerYazisi))
                            .addComponent(kisiselYazisi))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kapamaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kapamaButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_kapamaButtonMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int kordinatX = evt.getXOnScreen();
        int kordinatY = evt.getYOnScreen();

        this.setLocation(kordinatX - mouseX, kordinatY - mouseY);
    }//GEN-LAST:event_formMouseDragged

    private void kullaniciIslemleriButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kullaniciIslemleriButtonMouseClicked
        KullaniciIslemleriEkran kullaniciIslemleriEkran = new KullaniciIslemleriEkran();
        kullaniciIslemleriEkran.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_kullaniciIslemleriButtonMouseClicked

    private void urunIslemleriButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_urunIslemleriButtonMouseClicked
        UrunIslemleriEkran urunIslemleriEkran = new UrunIslemleriEkran();
        urunIslemleriEkran.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_urunIslemleriButtonMouseClicked

    private void verilenSiparislerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verilenSiparislerButtonMouseClicked
        VerilenSiparislerEkran verilenSiparislerEkran = new VerilenSiparislerEkran();
        verilenSiparislerEkran.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_verilenSiparislerButtonMouseClicked

    private void kisiselBilgilerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kisiselBilgilerButtonMouseClicked
        CalisanKisiselBilgilerEkran kisiselBilgilerEkran = new CalisanKisiselBilgilerEkran();
        kisiselBilgilerEkran.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_kisiselBilgilerButtonMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalisanEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new CalisanEkran().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bilgilerYazisi;
    private javax.swing.JLabel calisanYazisi;
    private javax.swing.JSeparator dikeySeparator;
    private javax.swing.JPanel form;
    private javax.swing.JLabel islemleri2Yazisi;
    private javax.swing.JLabel islemleriYazisi;
    private javax.swing.JLabel kapamaButton;
    private javax.swing.JPanel kapamaPanel;
    private javax.swing.JLabel kisiselBilgilerButton;
    private javax.swing.JLabel kisiselYazisi;
    private javax.swing.JLabel kullaniciIslemleriButton;
    private javax.swing.JLabel kullaniciYazisi;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel siparislerYazisi;
    private javax.swing.JLabel urunIslemleriButton;
    private javax.swing.JLabel urunYazisi;
    private javax.swing.JLabel verilenSiparislerButton;
    private javax.swing.JLabel verilenYazisi;
    private javax.swing.JSeparator yataySeparator;
    // End of variables declaration//GEN-END:variables
}
