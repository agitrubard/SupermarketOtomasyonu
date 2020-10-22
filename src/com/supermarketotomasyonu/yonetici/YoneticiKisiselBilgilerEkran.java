package com.supermarketotomasyonu.yonetici;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

/**
 * @author berrinkorkutata
 * @author agitrubardemir
 */
public class YoneticiKisiselBilgilerEkran extends javax.swing.JFrame {

    YoneticiIslemleri yoneticiIslemleri = new YoneticiIslemleri();

    int mouseX, mouseY;

    public YoneticiKisiselBilgilerEkran() {
        initComponents();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        this.setLocation(x, y);

        bilgileriGoruntule();
    }

    public void bilgileriGoruntule() {
        String no = String.valueOf(YoneticiIslemleri.girisYapanYonetici.getNo());
        yoneticiNoAlani.setText(no);

        String kullaniciAdi = YoneticiIslemleri.girisYapanYonetici.getKullaniciAdi();
        kullaniciAdiAlani.setText(kullaniciAdi);

        String mailAdresi = YoneticiIslemleri.girisYapanYonetici.getMailAdresi();
        mailAdresiAlani.setText(mailAdresi);

        String ad = YoneticiIslemleri.girisYapanYonetici.getAd();
        adAlani.setText(ad);

        String soyad = YoneticiIslemleri.girisYapanYonetici.getSoyad();
        soyadAlani.setText(soyad);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        form = new javax.swing.JPanel();
        kapamaPanel = new javax.swing.JPanel();
        kapamaButton = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        bilgilerYazisi = new javax.swing.JLabel();
        yataySeparator = new javax.swing.JSeparator();
        dikeySeparator = new javax.swing.JSeparator();
        kullaniciAdiYazisi = new javax.swing.JLabel();
        mailAdresiYazisi = new javax.swing.JLabel();
        adYazisi = new javax.swing.JLabel();
        soyadYazisi = new javax.swing.JLabel();
        yoneticiNoYazisi = new javax.swing.JLabel();
        guncelleButton = new javax.swing.JButton();
        kisiselYazisi = new javax.swing.JLabel();
        mesajYazisi = new javax.swing.JLabel();
        yoneticiNoAlani = new javax.swing.JTextField();
        kullaniciAdiAlani = new javax.swing.JTextField();
        mailAdresiAlani = new javax.swing.JTextField();
        adAlani = new javax.swing.JTextField();
        soyadAlani = new javax.swing.JTextField();
        sifreDegistirButton = new javax.swing.JButton();

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

        bilgilerYazisi.setFont(new java.awt.Font("SF Pro Rounded", 1, 45)); // NOI18N
        bilgilerYazisi.setForeground(new java.awt.Color(79, 114, 0));
        bilgilerYazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bilgilerYazisi.setText("BİLGİLER");

        yataySeparator.setBackground(new java.awt.Color(79, 114, 0));
        yataySeparator.setForeground(new java.awt.Color(79, 114, 0));
        yataySeparator.setToolTipText("");
        yataySeparator.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        yataySeparator.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        yataySeparator.setMinimumSize(new java.awt.Dimension(50, 50));

        dikeySeparator.setBackground(new java.awt.Color(79, 114, 0));
        dikeySeparator.setForeground(new java.awt.Color(79, 114, 0));
        dikeySeparator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        dikeySeparator.setToolTipText("");
        dikeySeparator.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        dikeySeparator.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        dikeySeparator.setMinimumSize(new java.awt.Dimension(50, 50));

        kullaniciAdiYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 20)); // NOI18N
        kullaniciAdiYazisi.setForeground(new java.awt.Color(79, 114, 0));
        kullaniciAdiYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        kullaniciAdiYazisi.setText("Kullanıcı Adı : ");
        kullaniciAdiYazisi.setToolTipText("Kullanıcı adınız en fazla 20 karakter uzunluğunda olabilir.");

        mailAdresiYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 20)); // NOI18N
        mailAdresiYazisi.setForeground(new java.awt.Color(79, 114, 0));
        mailAdresiYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mailAdresiYazisi.setText("Mail Adresi : ");
        mailAdresiYazisi.setToolTipText("Lütfen hâlihazırda kullandığınız bir mail adresi giriniz.");

        adYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 20)); // NOI18N
        adYazisi.setForeground(new java.awt.Color(79, 114, 0));
        adYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        adYazisi.setText("Ad : ");

        soyadYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 20)); // NOI18N
        soyadYazisi.setForeground(new java.awt.Color(79, 114, 0));
        soyadYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        soyadYazisi.setText("Soyad : ");

        yoneticiNoYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 20)); // NOI18N
        yoneticiNoYazisi.setForeground(new java.awt.Color(79, 114, 0));
        yoneticiNoYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        yoneticiNoYazisi.setText("Yönetici No : ");
        yoneticiNoYazisi.setToolTipText("Yönetici numaranızı değiştiremezsiniz, kaydınız yapılırken otomatik olarak oluşturulur.");

        guncelleButton.setBackground(new java.awt.Color(113, 156, 14));
        guncelleButton.setFont(new java.awt.Font("SF Pro Rounded", 1, 20)); // NOI18N
        guncelleButton.setForeground(new java.awt.Color(255, 255, 255));
        guncelleButton.setText("GÜNCELLE");
        guncelleButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        guncelleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guncelleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelleButtonActionPerformed(evt);
            }
        });

        kisiselYazisi.setFont(new java.awt.Font("SF Pro Rounded", 1, 45)); // NOI18N
        kisiselYazisi.setForeground(new java.awt.Color(79, 114, 0));
        kisiselYazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kisiselYazisi.setText("KİŞİSEL");

        mesajYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 16)); // NOI18N
        mesajYazisi.setForeground(java.awt.Color.red);

        yoneticiNoAlani.setBackground(new java.awt.Color(113, 156, 14));
        yoneticiNoAlani.setFont(new java.awt.Font("SF Pro Rounded", 0, 18)); // NOI18N
        yoneticiNoAlani.setForeground(new java.awt.Color(255, 255, 255));
        yoneticiNoAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        yoneticiNoAlani.setToolTipText("Yönetici numaranızı değiştiremezsiniz, kaydınız yapılırken otomatik olarak oluşturulur.");
        yoneticiNoAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14)));
        yoneticiNoAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        yoneticiNoAlani.setSelectedTextColor(new java.awt.Color(113, 156, 14));
        yoneticiNoAlani.setSelectionColor(new java.awt.Color(255, 255, 255));

        kullaniciAdiAlani.setBackground(new java.awt.Color(113, 156, 14));
        kullaniciAdiAlani.setFont(new java.awt.Font("SF Pro Rounded", 0, 18)); // NOI18N
        kullaniciAdiAlani.setForeground(new java.awt.Color(255, 255, 255));
        kullaniciAdiAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kullaniciAdiAlani.setToolTipText("Kullanıcı adınız en fazla 20 karakter uzunluğunda olabilir.");
        kullaniciAdiAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14)));
        kullaniciAdiAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        kullaniciAdiAlani.setSelectedTextColor(new java.awt.Color(113, 156, 14));
        kullaniciAdiAlani.setSelectionColor(new java.awt.Color(255, 255, 255));
        kullaniciAdiAlani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                kullaniciAdiAlaniKeyTyped(evt);
            }
        });

        mailAdresiAlani.setBackground(new java.awt.Color(113, 156, 14));
        mailAdresiAlani.setFont(new java.awt.Font("SF Pro Rounded", 0, 18)); // NOI18N
        mailAdresiAlani.setForeground(new java.awt.Color(255, 255, 255));
        mailAdresiAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mailAdresiAlani.setToolTipText("Lütfen hâlihazırda kullandığınız bir mail adresi giriniz.");
        mailAdresiAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14)));
        mailAdresiAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        mailAdresiAlani.setSelectedTextColor(new java.awt.Color(113, 156, 14));
        mailAdresiAlani.setSelectionColor(new java.awt.Color(255, 255, 255));
        mailAdresiAlani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mailAdresiAlaniKeyTyped(evt);
            }
        });

        adAlani.setBackground(new java.awt.Color(113, 156, 14));
        adAlani.setFont(new java.awt.Font("SF Pro Rounded", 0, 18)); // NOI18N
        adAlani.setForeground(new java.awt.Color(255, 255, 255));
        adAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        adAlani.setToolTipText("");
        adAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14)));
        adAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        adAlani.setSelectedTextColor(new java.awt.Color(113, 156, 14));
        adAlani.setSelectionColor(new java.awt.Color(255, 255, 255));
        adAlani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                adAlaniKeyTyped(evt);
            }
        });

        soyadAlani.setBackground(new java.awt.Color(113, 156, 14));
        soyadAlani.setFont(new java.awt.Font("SF Pro Rounded", 0, 18)); // NOI18N
        soyadAlani.setForeground(new java.awt.Color(255, 255, 255));
        soyadAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        soyadAlani.setToolTipText("");
        soyadAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14)));
        soyadAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        soyadAlani.setSelectedTextColor(new java.awt.Color(113, 156, 14));
        soyadAlani.setSelectionColor(new java.awt.Color(255, 255, 255));
        soyadAlani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                soyadAlaniKeyTyped(evt);
            }
        });

        sifreDegistirButton.setBackground(new java.awt.Color(113, 156, 14));
        sifreDegistirButton.setFont(new java.awt.Font("SF Pro Rounded", 1, 20)); // NOI18N
        sifreDegistirButton.setForeground(new java.awt.Color(255, 255, 255));
        sifreDegistirButton.setText("ŞİFRE DEĞİŞTİR");
        sifreDegistirButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        sifreDegistirButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sifreDegistirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifreDegistirButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formLayout = new javax.swing.GroupLayout(form);
        form.setLayout(formLayout);
        formLayout.setHorizontalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(logo)
                        .addGap(8, 8, 8)
                        .addComponent(dikeySeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kisiselYazisi)
                            .addComponent(bilgilerYazisi))
                        .addGap(47, 47, 47)
                        .addComponent(kapamaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(yataySeparator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(formLayout.createSequentialGroup()
                                    .addGap(5, 5, 5)
                                    .addComponent(yoneticiNoYazisi)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(yoneticiNoAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(formLayout.createSequentialGroup()
                                    .addComponent(kullaniciAdiYazisi)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(kullaniciAdiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(formLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(mailAdresiYazisi)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(mailAdresiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(formLayout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(adYazisi)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(adAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
                                    .addComponent(soyadYazisi)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(soyadAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
                                    .addComponent(sifreDegistirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(guncelleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(mesajYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        formLayout.setVerticalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kapamaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(formLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logo)
                            .addComponent(dikeySeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(formLayout.createSequentialGroup()
                                .addComponent(kisiselYazisi)
                                .addGap(6, 6, 6)
                                .addComponent(bilgilerYazisi)))))
                .addGap(2, 2, 2)
                .addComponent(yataySeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yoneticiNoYazisi)
                    .addComponent(yoneticiNoAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kullaniciAdiYazisi)
                    .addComponent(kullaniciAdiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mailAdresiYazisi)
                    .addComponent(mailAdresiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adYazisi)
                    .addComponent(adAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soyadYazisi)
                    .addComponent(soyadAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guncelleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sifreDegistirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mesajYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(form, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kapamaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kapamaButtonMouseClicked
        YoneticiEkran yoneticiEkran = new YoneticiEkran();
        yoneticiEkran.setVisible(true);
        setVisible(false);
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

    private void kullaniciAdiAlaniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kullaniciAdiAlaniKeyTyped
        char c = evt.getKeyChar();
        if (kullaniciAdiAlani.getText().length() >= 20 || (c == KeyEvent.VK_SPACE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_kullaniciAdiAlaniKeyTyped

    private void mailAdresiAlaniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mailAdresiAlaniKeyTyped
        char c = evt.getKeyChar();
        if (mailAdresiAlani.getText().length() >= 50 || (c == KeyEvent.VK_SPACE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_mailAdresiAlaniKeyTyped

    private void adAlaniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adAlaniKeyTyped
        char c = evt.getKeyChar();
        if (adAlani.getText().length() >= 25 || (Character.isDigit(c))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_adAlaniKeyTyped

    private void soyadAlaniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_soyadAlaniKeyTyped
        char c = evt.getKeyChar();
        if (soyadAlani.getText().length() >= 25 || (Character.isDigit(c))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_soyadAlaniKeyTyped

    private void sifreDegistirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifreDegistirButtonActionPerformed
        SifreDegistirEkran sifreDegistirEkran = new SifreDegistirEkran();
        sifreDegistirEkran.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_sifreDegistirButtonActionPerformed

    private void guncelleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleButtonActionPerformed
        mesajYazisi.setText("");

        int no = Integer.parseInt(yoneticiNoAlani.getText());
        String kullaniciAdi = kullaniciAdiAlani.getText().trim();
        String mailAdresi = mailAdresiAlani.getText().trim();
        String ad = adAlani.getText();
        String soyad = soyadAlani.getText();

        if (kullaniciAdi.equals("") || mailAdresi.equals("") || ad.equals("") || soyad.equals("")) {
            mesajYazisi.setText("Lütfen Bilgileri Eksiksiz Girdiğinizden Emin Olunuz!");
            mesajYazisi.setForeground(Color.RED);
        } else {
            yoneticiIslemleri.kisiselBilgilerGuncelle(no, kullaniciAdi, mailAdresi, ad, soyad);

            mesajYazisi.setText("Bilgileriniz Güncellendi!");
            mesajYazisi.setForeground(new Color(0, 226, 0));
        }
    }//GEN-LAST:event_guncelleButtonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YoneticiKisiselBilgilerEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new YoneticiKisiselBilgilerEkran().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adAlani;
    private javax.swing.JLabel adYazisi;
    private javax.swing.JLabel bilgilerYazisi;
    private javax.swing.JSeparator dikeySeparator;
    private javax.swing.JPanel form;
    private javax.swing.JButton guncelleButton;
    private javax.swing.JLabel kapamaButton;
    private javax.swing.JPanel kapamaPanel;
    private javax.swing.JLabel kisiselYazisi;
    private javax.swing.JTextField kullaniciAdiAlani;
    private javax.swing.JLabel kullaniciAdiYazisi;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField mailAdresiAlani;
    private javax.swing.JLabel mailAdresiYazisi;
    private javax.swing.JLabel mesajYazisi;
    private javax.swing.JButton sifreDegistirButton;
    private javax.swing.JTextField soyadAlani;
    private javax.swing.JLabel soyadYazisi;
    private javax.swing.JSeparator yataySeparator;
    private javax.swing.JTextField yoneticiNoAlani;
    private javax.swing.JLabel yoneticiNoYazisi;
    // End of variables declaration//GEN-END:variables
}