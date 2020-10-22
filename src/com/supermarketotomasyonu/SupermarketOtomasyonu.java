package com.supermarketotomasyonu;

import com.supermarketotomasyonu.uyariekranlari.GirisUyarisi;
import com.supermarketotomasyonu.uyariekranlari.GirisTuruUyarisiSifre;
import com.supermarketotomasyonu.uyariekranlari.GirisTuruUyarisiGiris;
import com.supermarketotomasyonu.calisan.CalisanEkran;
import com.supermarketotomasyonu.kullanici.KullaniciEkran;
import com.supermarketotomasyonu.veritabani.VeritabaniIslemleri;
import com.supermarketotomasyonu.yonetici.YoneticiEkran;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.Icon;

/**
 * @author berrinkorkutata
 * @author agitrubardemir
 */
public class SupermarketOtomasyonu extends javax.swing.JFrame {

    VeritabaniIslemleri veritabaniIslemleri = new VeritabaniIslemleri();

    Icon sifreAcikIcon = new javax.swing.ImageIcon(getClass().getResource("/com/supermarketotomasyonu/images/beyazSifreAcik33x33.png"));
    Icon sifreKapaliIcon = new javax.swing.ImageIcon(getClass().getResource("/com/supermarketotomasyonu/images/beyazSifreKapali33x33.png"));

    public static String kullaniciAdi;
    public static int kontrolSayisi = 0;
    private static int sifreGosterKontrol;

    int mouseX, mouseY;

    public SupermarketOtomasyonu() {
        initComponents();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        this.setLocation(x, y);

        kontrolSayisi = 0;
        sifreGosterKontrol = 0;
    }

    public static String hashPassword(String sifre) {
        try {
            MessageDigest hash = MessageDigest.getInstance("SHA-256");
            hash.update(sifre.getBytes());
            byte[] sonuc = hash.digest();

            return new BigInteger(sonuc).toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        girisGroup = new javax.swing.ButtonGroup();
        form = new javax.swing.JPanel();
        girisPanel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        yoneticiRadio = new javax.swing.JRadioButton();
        calisanRadio = new javax.swing.JRadioButton();
        kullaniciRadio = new javax.swing.JRadioButton();
        kayitOlButton = new javax.swing.JButton();
        kapamaPanel = new javax.swing.JPanel();
        kapamaButton = new javax.swing.JLabel();
        supermarketYazisi = new javax.swing.JLabel();
        otomasyonuYazisi = new javax.swing.JLabel();
        kullaniciAdiYazisi = new javax.swing.JLabel();
        kullaniciAdiAlani = new javax.swing.JTextField();
        sifreYazisi = new javax.swing.JLabel();
        sifreAlani = new javax.swing.JPasswordField();
        girisYapButton = new javax.swing.JButton();
        sifremiUnuttumButton = new javax.swing.JLabel();
        sifreGosterButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        form.setBackground(new java.awt.Color(79, 114, 0));
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

        girisPanel.setBackground(new java.awt.Color(255, 255, 255));
        girisPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setBackground(new java.awt.Color(255, 255, 255));
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/supermarketotomasyonu/images/newlogo200x200.jpg"))); // NOI18N
        girisPanel.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 200));

        yoneticiRadio.setBackground(new java.awt.Color(255, 255, 255));
        girisGroup.add(yoneticiRadio);
        yoneticiRadio.setFont(new java.awt.Font("SF Pro Rounded", 1, 24)); // NOI18N
        yoneticiRadio.setForeground(new java.awt.Color(113, 156, 14));
        yoneticiRadio.setText("Yönetici Girişi");
        yoneticiRadio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        yoneticiRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yoneticiRadioActionPerformed(evt);
            }
        });
        girisPanel.add(yoneticiRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 200, 60));

        calisanRadio.setBackground(new java.awt.Color(255, 255, 255));
        girisGroup.add(calisanRadio);
        calisanRadio.setFont(new java.awt.Font("SF Pro Rounded", 1, 24)); // NOI18N
        calisanRadio.setForeground(new java.awt.Color(113, 156, 14));
        calisanRadio.setText("Çalışan Girişi");
        calisanRadio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calisanRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calisanRadioActionPerformed(evt);
            }
        });
        girisPanel.add(calisanRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 200, 60));

        kullaniciRadio.setBackground(new java.awt.Color(255, 255, 255));
        girisGroup.add(kullaniciRadio);
        kullaniciRadio.setFont(new java.awt.Font("SF Pro Rounded", 1, 24)); // NOI18N
        kullaniciRadio.setForeground(new java.awt.Color(113, 156, 14));
        kullaniciRadio.setText("Kullanıcı Girişi");
        kullaniciRadio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kullaniciRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullaniciRadioActionPerformed(evt);
            }
        });
        girisPanel.add(kullaniciRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 200, 60));

        kayitOlButton.setBackground(new java.awt.Color(113, 156, 14));
        kayitOlButton.setFont(new java.awt.Font("SF Pro Rounded", 1, 20)); // NOI18N
        kayitOlButton.setForeground(new java.awt.Color(255, 255, 255));
        kayitOlButton.setText("KAYIT OL");
        kayitOlButton.setToolTipText("Otomasyona kullanıcı olarak kayıt olmak için butona tıklayabilirsiniz.");
        kayitOlButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        kayitOlButton.setBorderPainted(false);
        kayitOlButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kayitOlButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayitOlButtonActionPerformed(evt);
            }
        });
        girisPanel.add(kayitOlButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 120, 45));

        kapamaPanel.setBackground(new java.awt.Color(79, 114, 0));
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

        supermarketYazisi.setFont(new java.awt.Font("SF Pro Rounded", 1, 52)); // NOI18N
        supermarketYazisi.setForeground(new java.awt.Color(255, 255, 255));
        supermarketYazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        supermarketYazisi.setText("SÜPERMARKET");

        otomasyonuYazisi.setFont(new java.awt.Font("SF Pro Rounded", 1, 52)); // NOI18N
        otomasyonuYazisi.setForeground(new java.awt.Color(255, 255, 255));
        otomasyonuYazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        otomasyonuYazisi.setText("OTOMASYONU");

        kullaniciAdiYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 18)); // NOI18N
        kullaniciAdiYazisi.setForeground(new java.awt.Color(255, 255, 255));
        kullaniciAdiYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        kullaniciAdiYazisi.setText("Kullanıcı Adı : ");

        kullaniciAdiAlani.setBackground(new java.awt.Color(255, 255, 255));
        kullaniciAdiAlani.setFont(new java.awt.Font("SF Pro Rounded", 0, 18)); // NOI18N
        kullaniciAdiAlani.setForeground(new java.awt.Color(113, 156, 14));
        kullaniciAdiAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kullaniciAdiAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        kullaniciAdiAlani.setCaretColor(new java.awt.Color(79, 114, 0));
        kullaniciAdiAlani.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        kullaniciAdiAlani.setSelectionColor(new java.awt.Color(113, 156, 14));
        kullaniciAdiAlani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                kullaniciAdiAlaniKeyTyped(evt);
            }
        });

        sifreYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 18)); // NOI18N
        sifreYazisi.setForeground(new java.awt.Color(255, 255, 255));
        sifreYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sifreYazisi.setText("Şifre : ");

        sifreAlani.setBackground(new java.awt.Color(255, 255, 255));
        sifreAlani.setFont(new java.awt.Font("SF Pro Rounded", 0, 12)); // NOI18N
        sifreAlani.setForeground(new java.awt.Color(113, 156, 14));
        sifreAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sifreAlani.setToolTipText("");
        sifreAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        sifreAlani.setCaretColor(new java.awt.Color(79, 114, 0));
        sifreAlani.setEchoChar('●');
        sifreAlani.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        sifreAlani.setSelectionColor(new java.awt.Color(113, 156, 14));
        sifreAlani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sifreAlaniKeyTyped(evt);
            }
        });

        girisYapButton.setBackground(new java.awt.Color(255, 255, 255));
        girisYapButton.setFont(new java.awt.Font("SF Pro Rounded", 1, 20)); // NOI18N
        girisYapButton.setForeground(new java.awt.Color(113, 156, 14));
        girisYapButton.setText("GİRİŞ YAP");
        girisYapButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        girisYapButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        girisYapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girisYapButtonActionPerformed(evt);
            }
        });

        sifremiUnuttumButton.setFont(new java.awt.Font("SF Pro Rounded", 0, 18)); // NOI18N
        sifremiUnuttumButton.setForeground(new java.awt.Color(255, 255, 204));
        sifremiUnuttumButton.setText("Şifrenizi mi unuttunuz?");
        sifremiUnuttumButton.setToolTipText("Şifrenizi değiştirmek için buraya tıklayabilirsiniz.");
        sifremiUnuttumButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sifremiUnuttumButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sifremiUnuttumButtonMouseClicked(evt);
            }
        });

        sifreGosterButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sifreGosterButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/supermarketotomasyonu/images/beyazSifreAcik33x33.png"))); // NOI18N
        sifreGosterButton.setToolTipText("");
        sifreGosterButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sifreGosterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sifreGosterButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout formLayout = new javax.swing.GroupLayout(form);
        form.setLayout(formLayout);
        formLayout.setHorizontalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addComponent(girisPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formLayout.createSequentialGroup()
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(supermarketYazisi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(otomasyonuYazisi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(formLayout.createSequentialGroup()
                                .addComponent(sifremiUnuttumButton)
                                .addGap(0, 239, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kapamaPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
                                .addComponent(girisYapButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94))))
                    .addGroup(formLayout.createSequentialGroup()
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formLayout.createSequentialGroup()
                                .addComponent(kullaniciAdiYazisi)
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
                                .addComponent(sifreYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)))
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formLayout.createSequentialGroup()
                                .addComponent(sifreAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(sifreGosterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(kullaniciAdiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        formLayout.setVerticalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addComponent(girisPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(formLayout.createSequentialGroup()
                .addComponent(kapamaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(supermarketYazisi)
                    .addGroup(formLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(otomasyonuYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kullaniciAdiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
                        .addComponent(kullaniciAdiYazisi)
                        .addGap(6, 6, 6)))
                .addGap(18, 18, 18)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sifreAlani, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addGroup(formLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(sifreYazisi))
                    .addComponent(sifreGosterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(girisYapButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(sifremiUnuttumButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void yoneticiRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yoneticiRadioActionPerformed
        kontrolSayisi = 1;
    }//GEN-LAST:event_yoneticiRadioActionPerformed

    private void calisanRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calisanRadioActionPerformed
        kontrolSayisi = 2;
    }//GEN-LAST:event_calisanRadioActionPerformed

    private void kullaniciRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullaniciRadioActionPerformed
        kontrolSayisi = 3;
    }//GEN-LAST:event_kullaniciRadioActionPerformed

    private void kayitOlButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayitOlButtonActionPerformed
        KayitOlEkran kayitOlEkran = new KayitOlEkran();
        kayitOlEkran.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_kayitOlButtonActionPerformed

    private void kullaniciAdiAlaniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kullaniciAdiAlaniKeyTyped
        char c = evt.getKeyChar();
        if (kullaniciAdiAlani.getText().length() >= 20 || (c == KeyEvent.VK_SPACE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_kullaniciAdiAlaniKeyTyped

    private void sifreAlaniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sifreAlaniKeyTyped
        char c = evt.getKeyChar();
        if ((c == KeyEvent.VK_SPACE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_sifreAlaniKeyTyped

    private void sifreGosterButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sifreGosterButtonMouseClicked
        if (sifreGosterKontrol == 0) {
            sifreAlani.setEchoChar((char) 0);
            sifreAlani.setFont(new Font("SF Pro Rounded", Font.PLAIN, 18));
            sifreGosterButton.setIcon(sifreKapaliIcon);
            sifreGosterKontrol = 1;
        } else {
            sifreAlani.setEchoChar('●');
            sifreAlani.setFont(new Font("SF Pro Rounded", Font.PLAIN, 12));
            sifreGosterButton.setIcon(sifreAcikIcon);
            sifreGosterKontrol = 0;
        }
    }//GEN-LAST:event_sifreGosterButtonMouseClicked

    private void girisYapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girisYapButtonActionPerformed
        if (kontrolSayisi != 0) {
            boolean giris = veritabaniIslemleri.girisYap(kullaniciAdiAlani.getText(), hashPassword(new String(sifreAlani.getPassword())));

            if (giris) {
                switch (kontrolSayisi) {
                    case 1:
                        YoneticiEkran yoneticiEkran = new YoneticiEkran();
                        yoneticiEkran.setVisible(true);
                        break;
                    case 2:
                        CalisanEkran calisanEkran = new CalisanEkran();
                        calisanEkran.setVisible(true);
                        break;
                    case 3:
                        KullaniciEkran kullaniciEkran = new KullaniciEkran();
                        kullaniciEkran.setVisible(true);
                        break;
                }
                kullaniciAdi = kullaniciAdiAlani.getText();
                setVisible(false);
            } else {
                GirisUyarisi girisBildirimiUyariEkran1 = new GirisUyarisi();
                girisBildirimiUyariEkran1.setVisible(true);
                kullaniciAdiAlani.setText("");
                sifreAlani.setText("");
            }
        } else {
            GirisTuruUyarisiGiris girisBildirimiUyariEkran2 = new GirisTuruUyarisiGiris();
            girisBildirimiUyariEkran2.setVisible(true);
        }
    }//GEN-LAST:event_girisYapButtonActionPerformed

    private void sifremiUnuttumButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sifremiUnuttumButtonMouseClicked
        if (kontrolSayisi == 0) {
            GirisTuruUyarisiSifre girisBildirimiUyariEkran3 = new GirisTuruUyarisiSifre();
            girisBildirimiUyariEkran3.setVisible(true);
        } else {
            SifreDegistirEkran sifreDegistirEkran = new SifreDegistirEkran();
            sifreDegistirEkran.setVisible(true);
            setVisible(false);
        }
    }//GEN-LAST:event_sifremiUnuttumButtonMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SupermarketOtomasyonu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new SupermarketOtomasyonu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton calisanRadio;
    private javax.swing.JPanel form;
    private javax.swing.ButtonGroup girisGroup;
    private javax.swing.JPanel girisPanel;
    private javax.swing.JButton girisYapButton;
    private javax.swing.JLabel kapamaButton;
    private javax.swing.JPanel kapamaPanel;
    private javax.swing.JButton kayitOlButton;
    private javax.swing.JTextField kullaniciAdiAlani;
    private javax.swing.JLabel kullaniciAdiYazisi;
    private javax.swing.JRadioButton kullaniciRadio;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel otomasyonuYazisi;
    private javax.swing.JPasswordField sifreAlani;
    private javax.swing.JLabel sifreGosterButton;
    private javax.swing.JLabel sifreYazisi;
    private javax.swing.JLabel sifremiUnuttumButton;
    private javax.swing.JLabel supermarketYazisi;
    private javax.swing.JRadioButton yoneticiRadio;
    // End of variables declaration//GEN-END:variables
}
