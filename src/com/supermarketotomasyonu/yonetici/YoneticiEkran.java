package com.supermarketotomasyonu.yonetici;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * @author berrinkorkutata
 * @author agitrubardemir
 */
public class YoneticiEkran extends javax.swing.JFrame {

    int mouseX, mouseY;

    public YoneticiEkran() {
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
        yoneticiYazisi = new javax.swing.JLabel();
        dikeySeparator = new javax.swing.JSeparator();
        yataySeparator = new javax.swing.JSeparator();
        yoneticiIslemleriButton = new javax.swing.JLabel();
        yoneticiIslemleriYazisi1 = new javax.swing.JLabel();
        yoneticiIslemleriYazisi2 = new javax.swing.JLabel();
        calisanIslemleriButton = new javax.swing.JLabel();
        calisanIslemleriYazisi1 = new javax.swing.JLabel();
        calisanIslemleriYazisi2 = new javax.swing.JLabel();
        urunBilgileriButton = new javax.swing.JLabel();
        urunBilgileriYazisi1 = new javax.swing.JLabel();
        urunBilgileriYazisi2 = new javax.swing.JLabel();
        kullaniciBilgileriButton = new javax.swing.JLabel();
        kullaniciBilgileriYazisi1 = new javax.swing.JLabel();
        kullaniciBilgileriYazisi2 = new javax.swing.JLabel();
        kisiselBilgilerimButton = new javax.swing.JLabel();
        kisiselBilgilerimYazisi1 = new javax.swing.JLabel();
        kisiselBilgilerimYazisi2 = new javax.swing.JLabel();

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

        yoneticiYazisi.setFont(new java.awt.Font("SF Pro Rounded", 1, 60)); // NOI18N
        yoneticiYazisi.setForeground(new java.awt.Color(79, 114, 0));
        yoneticiYazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yoneticiYazisi.setText("YÖNETİCİ");

        dikeySeparator.setBackground(new java.awt.Color(79, 114, 0));
        dikeySeparator.setForeground(new java.awt.Color(79, 114, 0));
        dikeySeparator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        dikeySeparator.setToolTipText("");
        dikeySeparator.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        dikeySeparator.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        dikeySeparator.setMinimumSize(new java.awt.Dimension(50, 50));
        dikeySeparator.setSize(new java.awt.Dimension(50, 20));

        yataySeparator.setBackground(new java.awt.Color(79, 114, 0));
        yataySeparator.setForeground(new java.awt.Color(79, 114, 0));
        yataySeparator.setToolTipText("");
        yataySeparator.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        yataySeparator.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        yataySeparator.setMinimumSize(new java.awt.Dimension(50, 50));
        yataySeparator.setSize(new java.awt.Dimension(50, 20));

        yoneticiIslemleriButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/supermarketotomasyonu/images/yoneticiIslemleri.png"))); // NOI18N
        yoneticiIslemleriButton.setToolTipText("Yönetici İşlemlerini gerçekleştirmek ve Yöneticileri görüntülemek için tıklayınız.");
        yoneticiIslemleriButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        yoneticiIslemleriButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yoneticiIslemleriButtonMouseClicked(evt);
            }
        });

        yoneticiIslemleriYazisi1.setFont(new java.awt.Font("SF Pro Rounded", 0, 24)); // NOI18N
        yoneticiIslemleriYazisi1.setForeground(new java.awt.Color(79, 114, 0));
        yoneticiIslemleriYazisi1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yoneticiIslemleriYazisi1.setText("YÖNETİCİ");
        yoneticiIslemleriYazisi1.setToolTipText("Yönetici İşlemlerini gerçekleştirmek ve Yöneticileri görüntülemek için yukarıdaki butona tıklayınız.");

        yoneticiIslemleriYazisi2.setFont(new java.awt.Font("SF Pro Rounded", 0, 24)); // NOI18N
        yoneticiIslemleriYazisi2.setForeground(new java.awt.Color(79, 114, 0));
        yoneticiIslemleriYazisi2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yoneticiIslemleriYazisi2.setText("İŞLEMLERİ");
        yoneticiIslemleriYazisi2.setToolTipText("Yönetici İşlemlerini gerçekleştirmek ve Yöneticileri görüntülemek için yukarıdaki butona tıklayınız.");

        calisanIslemleriButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/supermarketotomasyonu/images/calisanIslemleri.png"))); // NOI18N
        calisanIslemleriButton.setToolTipText("Çalışan İşlemlerini gerçekleştirmek ve Çalışanları görüntülemek için tıklayınız.");
        calisanIslemleriButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calisanIslemleriButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calisanIslemleriButtonMouseClicked(evt);
            }
        });

        calisanIslemleriYazisi1.setFont(new java.awt.Font("SF Pro Rounded", 0, 24)); // NOI18N
        calisanIslemleriYazisi1.setForeground(new java.awt.Color(79, 114, 0));
        calisanIslemleriYazisi1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        calisanIslemleriYazisi1.setText("ÇALIŞAN");
        calisanIslemleriYazisi1.setToolTipText("Çalışan İşlemlerini gerçekleştirmek ve Çalışanları görüntülemek için yukarıdaki butona tıklayınız.");

        calisanIslemleriYazisi2.setFont(new java.awt.Font("SF Pro Rounded", 0, 24)); // NOI18N
        calisanIslemleriYazisi2.setForeground(new java.awt.Color(79, 114, 0));
        calisanIslemleriYazisi2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        calisanIslemleriYazisi2.setText("İŞLEMLERİ");
        calisanIslemleriYazisi2.setToolTipText("Çalışan İşlemlerini gerçekleştirmek ve Çalışanları görüntülemek için yukarıdaki butona tıklayınız.");

        urunBilgileriButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/supermarketotomasyonu/images/urunBilgileri.png"))); // NOI18N
        urunBilgileriButton.setToolTipText("Ürün Bilgilerini görüntülemek için tıklayınız.");
        urunBilgileriButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        urunBilgileriButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                urunBilgileriButtonMouseClicked(evt);
            }
        });

        urunBilgileriYazisi1.setFont(new java.awt.Font("SF Pro Rounded", 0, 24)); // NOI18N
        urunBilgileriYazisi1.setForeground(new java.awt.Color(79, 114, 0));
        urunBilgileriYazisi1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        urunBilgileriYazisi1.setText("ÜRÜN");
        urunBilgileriYazisi1.setToolTipText("Ürün Bilgilerini görüntülemek için yukarıdaki butona tıklayınız.");

        urunBilgileriYazisi2.setFont(new java.awt.Font("SF Pro Rounded", 0, 24)); // NOI18N
        urunBilgileriYazisi2.setForeground(new java.awt.Color(79, 114, 0));
        urunBilgileriYazisi2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        urunBilgileriYazisi2.setText("BİLGİLERİ");
        urunBilgileriYazisi2.setToolTipText("Ürün Bilgilerini görüntülemek için yukarıdaki butona tıklayınız.");

        kullaniciBilgileriButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/supermarketotomasyonu/images/kullaniciIslemleri.png"))); // NOI18N
        kullaniciBilgileriButton.setToolTipText("Kullanıcı Bilgilerini görüntülemek için tıklayınız.");
        kullaniciBilgileriButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kullaniciBilgileriButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kullaniciBilgileriButtonMouseClicked(evt);
            }
        });

        kullaniciBilgileriYazisi1.setFont(new java.awt.Font("SF Pro Rounded", 0, 24)); // NOI18N
        kullaniciBilgileriYazisi1.setForeground(new java.awt.Color(79, 114, 0));
        kullaniciBilgileriYazisi1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kullaniciBilgileriYazisi1.setText("KULLANICI");
        kullaniciBilgileriYazisi1.setToolTipText("Kullanıcı Bilgilerini görüntülemek için yukarıdaki butona tıklayınız.");

        kullaniciBilgileriYazisi2.setFont(new java.awt.Font("SF Pro Rounded", 0, 24)); // NOI18N
        kullaniciBilgileriYazisi2.setForeground(new java.awt.Color(79, 114, 0));
        kullaniciBilgileriYazisi2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kullaniciBilgileriYazisi2.setText("BİLGİLERİ");
        kullaniciBilgileriYazisi2.setToolTipText("Kullanıcı Bilgilerini görüntülemek için yukarıdaki butona tıklayınız.");

        kisiselBilgilerimButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/supermarketotomasyonu/images/kisiselBilgiler.png"))); // NOI18N
        kisiselBilgilerimButton.setToolTipText("Kişisel Bilgilerinizi görüntülemek için tıklayınız.");
        kisiselBilgilerimButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kisiselBilgilerimButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kisiselBilgilerimButtonMouseClicked(evt);
            }
        });

        kisiselBilgilerimYazisi1.setFont(new java.awt.Font("SF Pro Rounded", 0, 24)); // NOI18N
        kisiselBilgilerimYazisi1.setForeground(new java.awt.Color(79, 114, 0));
        kisiselBilgilerimYazisi1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kisiselBilgilerimYazisi1.setText("KİŞİSEL");
        kisiselBilgilerimYazisi1.setToolTipText("Kişisel Bilgilerinizi görüntülemek için yukarıdaki butona tıklayınız.");

        kisiselBilgilerimYazisi2.setFont(new java.awt.Font("SF Pro Rounded", 0, 24)); // NOI18N
        kisiselBilgilerimYazisi2.setForeground(new java.awt.Color(79, 114, 0));
        kisiselBilgilerimYazisi2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kisiselBilgilerimYazisi2.setText("BİLGİLERİM");
        kisiselBilgilerimYazisi2.setToolTipText("Kişisel Bilgilerinizi görüntülemek için yukarıdaki butona tıklayınız.");

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
                        .addGap(5, 5, 5)
                        .addComponent(yoneticiYazisi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
                        .addComponent(kapamaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formLayout.createSequentialGroup()
                        .addComponent(yataySeparator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(formLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(urunBilgileriYazisi2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(urunBilgileriYazisi1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(urunBilgileriButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(yoneticiIslemleriYazisi1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(yoneticiIslemleriYazisi2, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addComponent(yoneticiIslemleriButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formLayout.createSequentialGroup()
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kullaniciBilgileriYazisi1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kullaniciBilgileriYazisi2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(formLayout.createSequentialGroup()
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(calisanIslemleriYazisi1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(calisanIslemleriYazisi2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(calisanIslemleriButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kullaniciBilgileriButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(kisiselBilgilerimYazisi1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(kisiselBilgilerimYazisi2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(kisiselBilgilerimButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60))))
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
                            .addComponent(dikeySeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
                        .addComponent(yoneticiYazisi)
                        .addGap(23, 23, 23)))
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formLayout.createSequentialGroup()
                        .addComponent(yataySeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formLayout.createSequentialGroup()
                                .addComponent(yoneticiIslemleriButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(yoneticiIslemleriYazisi1)
                                .addGap(2, 2, 2)
                                .addComponent(yoneticiIslemleriYazisi2))
                            .addGroup(formLayout.createSequentialGroup()
                                .addComponent(calisanIslemleriButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(calisanIslemleriYazisi1)
                                .addGap(2, 2, 2)
                                .addComponent(calisanIslemleriYazisi2)))
                        .addGap(18, 18, 18)
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
                                .addComponent(urunBilgileriButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(urunBilgileriYazisi1)
                                .addGap(2, 2, 2)
                                .addComponent(urunBilgileriYazisi2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
                                .addComponent(kullaniciBilgileriButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(kullaniciBilgileriYazisi1)
                                .addGap(2, 2, 2)
                                .addComponent(kullaniciBilgileriYazisi2)))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
                        .addComponent(kisiselBilgilerimButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(kisiselBilgilerimYazisi2))
                            .addComponent(kisiselBilgilerimYazisi1))
                        .addGap(154, 154, 154))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void yoneticiIslemleriButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yoneticiIslemleriButtonMouseClicked
        YoneticiIslemleriEkran yoneticiIslemleriEkran = new YoneticiIslemleriEkran();
        yoneticiIslemleriEkran.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_yoneticiIslemleriButtonMouseClicked

    private void calisanIslemleriButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calisanIslemleriButtonMouseClicked
        CalisanIslemleriEkran calisanIslemleriEkran = new CalisanIslemleriEkran();
        calisanIslemleriEkran.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_calisanIslemleriButtonMouseClicked

    private void urunBilgileriButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_urunBilgileriButtonMouseClicked
        UrunBilgileriEkran urunBilgileriEkran = new UrunBilgileriEkran();
        urunBilgileriEkran.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_urunBilgileriButtonMouseClicked

    private void kullaniciBilgileriButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kullaniciBilgileriButtonMouseClicked
        KullaniciBilgileriEkran kullaniciBilgileriEkran = new KullaniciBilgileriEkran();
        kullaniciBilgileriEkran.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_kullaniciBilgileriButtonMouseClicked

    private void kisiselBilgilerimButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kisiselBilgilerimButtonMouseClicked
        YoneticiKisiselBilgilerEkran kisiselBilgilerEkran = new YoneticiKisiselBilgilerEkran();
        kisiselBilgilerEkran.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_kisiselBilgilerimButtonMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YoneticiEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new YoneticiEkran().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel calisanIslemleriButton;
    private javax.swing.JLabel calisanIslemleriYazisi1;
    private javax.swing.JLabel calisanIslemleriYazisi2;
    private javax.swing.JSeparator dikeySeparator;
    private javax.swing.JPanel form;
    private javax.swing.JLabel kapamaButton;
    private javax.swing.JPanel kapamaPanel;
    private javax.swing.JLabel kisiselBilgilerimButton;
    private javax.swing.JLabel kisiselBilgilerimYazisi1;
    private javax.swing.JLabel kisiselBilgilerimYazisi2;
    private javax.swing.JLabel kullaniciBilgileriButton;
    private javax.swing.JLabel kullaniciBilgileriYazisi1;
    private javax.swing.JLabel kullaniciBilgileriYazisi2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel urunBilgileriButton;
    private javax.swing.JLabel urunBilgileriYazisi1;
    private javax.swing.JLabel urunBilgileriYazisi2;
    private javax.swing.JSeparator yataySeparator;
    private javax.swing.JLabel yoneticiIslemleriButton;
    private javax.swing.JLabel yoneticiIslemleriYazisi1;
    private javax.swing.JLabel yoneticiIslemleriYazisi2;
    private javax.swing.JLabel yoneticiYazisi;
    // End of variables declaration//GEN-END:variables
}
