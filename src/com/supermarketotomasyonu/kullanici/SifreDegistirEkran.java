package com.supermarketotomasyonu.kullanici;

import com.supermarketotomasyonu.uyariekranlari.SifreAlaniBosUyarisi;
import com.supermarketotomasyonu.uyariekranlari.SifreDegistirildiBildirimi;
import com.supermarketotomasyonu.uyariekranlari.SifrelerUyusmuyorUyarisi;
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
public class SifreDegistirEkran extends javax.swing.JFrame {

    KullaniciIslemleri kullaniciIslemleri = new KullaniciIslemleri();

    Icon sifreAcikIcon = new javax.swing.ImageIcon(getClass().getResource("/com/supermarketotomasyonu/images/yesilSifreAcik33x33.png"));
    Icon sifreKapaliIcon = new javax.swing.ImageIcon(getClass().getResource("/com/supermarketotomasyonu/images/yesilSifreKapali33x33.png"));

    private static int sifreGosterKontrol;
    private static int sifreDogrulamaGosterKontrol;

    int mouseX, mouseY;

    public SifreDegistirEkran() {
        initComponents();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        this.setLocation(x, y);

        sifreGosterKontrol = 0;
        sifreDogrulamaGosterKontrol = 0;
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

        form = new javax.swing.JPanel();
        kapamaPanel = new javax.swing.JPanel();
        kapamaButton = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        sifreYazisi = new javax.swing.JLabel();
        degistirmeEkraniYazisi = new javax.swing.JLabel();
        yataySeparator = new javax.swing.JSeparator();
        yeniSifreYazisi = new javax.swing.JLabel();
        yeniSifreDogrulamaYazisi = new javax.swing.JLabel();
        sifreDegistirButton = new javax.swing.JButton();
        sifreAlani = new javax.swing.JPasswordField();
        sifreDogrulamaAlani = new javax.swing.JPasswordField();
        sifreGosterButton = new javax.swing.JLabel();
        sifreDogrulamaGosterButton = new javax.swing.JLabel();

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

        sifreYazisi.setFont(new java.awt.Font("SF Pro Rounded", 1, 36)); // NOI18N
        sifreYazisi.setForeground(new java.awt.Color(79, 114, 0));
        sifreYazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sifreYazisi.setText("ŞİFRE");

        degistirmeEkraniYazisi.setFont(new java.awt.Font("SF Pro Rounded", 1, 36)); // NOI18N
        degistirmeEkraniYazisi.setForeground(new java.awt.Color(79, 114, 0));
        degistirmeEkraniYazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        degistirmeEkraniYazisi.setText("DEĞİŞTİRME EKRANI");

        yataySeparator.setBackground(new java.awt.Color(79, 114, 0));
        yataySeparator.setForeground(new java.awt.Color(79, 114, 0));
        yataySeparator.setToolTipText("");
        yataySeparator.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        yataySeparator.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        yataySeparator.setMinimumSize(new java.awt.Dimension(50, 50));
        yataySeparator.setSize(new java.awt.Dimension(50, 20));

        yeniSifreYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 20)); // NOI18N
        yeniSifreYazisi.setForeground(new java.awt.Color(79, 114, 0));
        yeniSifreYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        yeniSifreYazisi.setText("Yeni Şifre : ");
        yeniSifreYazisi.setToolTipText("Yeni şifrenizi giriniz.");

        yeniSifreDogrulamaYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 20)); // NOI18N
        yeniSifreDogrulamaYazisi.setForeground(new java.awt.Color(79, 114, 0));
        yeniSifreDogrulamaYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        yeniSifreDogrulamaYazisi.setText("Yeni Şifre Doğrulama : ");
        yeniSifreDogrulamaYazisi.setToolTipText("Yeni şifrenizi tekrar giriniz.");

        sifreDegistirButton.setBackground(new java.awt.Color(113, 156, 14));
        sifreDegistirButton.setFont(new java.awt.Font("SF Pro Rounded", 1, 20)); // NOI18N
        sifreDegistirButton.setForeground(new java.awt.Color(255, 255, 255));
        sifreDegistirButton.setText("DEĞİŞTİR");
        sifreDegistirButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        sifreDegistirButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sifreDegistirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifreDegistirButtonActionPerformed(evt);
            }
        });

        sifreAlani.setBackground(new java.awt.Color(113, 156, 14));
        sifreAlani.setFont(new java.awt.Font("SF Pro Rounded", 0, 12)); // NOI18N
        sifreAlani.setForeground(new java.awt.Color(255, 255, 255));
        sifreAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sifreAlani.setToolTipText("Yeni şifrenizi giriniz.");
        sifreAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14)));
        sifreAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        sifreAlani.setEchoChar('●');
        sifreAlani.setSelectedTextColor(new java.awt.Color(113, 156, 14));
        sifreAlani.setSelectionColor(new java.awt.Color(255, 255, 255));
        sifreAlani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sifreAlaniKeyTyped(evt);
            }
        });

        sifreDogrulamaAlani.setBackground(new java.awt.Color(113, 156, 14));
        sifreDogrulamaAlani.setFont(new java.awt.Font("SF Pro Rounded", 0, 12)); // NOI18N
        sifreDogrulamaAlani.setForeground(new java.awt.Color(255, 255, 255));
        sifreDogrulamaAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sifreDogrulamaAlani.setToolTipText("Yeni şifrenizi tekrar giriniz.");
        sifreDogrulamaAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14)));
        sifreDogrulamaAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        sifreDogrulamaAlani.setEchoChar('●');
        sifreDogrulamaAlani.setSelectedTextColor(new java.awt.Color(113, 156, 14));
        sifreDogrulamaAlani.setSelectionColor(new java.awt.Color(255, 255, 255));
        sifreDogrulamaAlani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sifreDogrulamaAlaniKeyTyped(evt);
            }
        });

        sifreGosterButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sifreGosterButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/supermarketotomasyonu/images/yesilSifreAcik33x33.png"))); // NOI18N
        sifreGosterButton.setToolTipText("");
        sifreGosterButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sifreGosterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sifreGosterButtonMouseClicked(evt);
            }
        });

        sifreDogrulamaGosterButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sifreDogrulamaGosterButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/supermarketotomasyonu/images/yesilSifreAcik33x33.png"))); // NOI18N
        sifreDogrulamaGosterButton.setToolTipText("");
        sifreDogrulamaGosterButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sifreDogrulamaGosterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sifreDogrulamaGosterButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout formLayout = new javax.swing.GroupLayout(form);
        form.setLayout(formLayout);
        formLayout.setHorizontalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(degistirmeEkraniYazisi)
                    .addComponent(sifreYazisi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kapamaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(formLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formLayout.createSequentialGroup()
                        .addComponent(yataySeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sifreDegistirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(formLayout.createSequentialGroup()
                                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(formLayout.createSequentialGroup()
                                        .addComponent(yeniSifreDogrulamaYazisi)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sifreDogrulamaAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(formLayout.createSequentialGroup()
                                        .addComponent(yeniSifreYazisi)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sifreAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(5, 5, 5)
                                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sifreGosterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sifreDogrulamaGosterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(20, 20, 20))))
        );
        formLayout.setVerticalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(formLayout.createSequentialGroup()
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kapamaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(formLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(formLayout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(sifreYazisi))
                                    .addGroup(formLayout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addComponent(degistirmeEkraniYazisi))
                                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(yataySeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yeniSifreYazisi)
                            .addComponent(sifreAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(sifreGosterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(yeniSifreDogrulamaYazisi)
                        .addComponent(sifreDogrulamaAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sifreDogrulamaGosterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sifreDegistirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        KullaniciKisiselBilgilerEkran kisiselBilgilerEkran = new KullaniciKisiselBilgilerEkran();
        kisiselBilgilerEkran.setVisible(true);
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

    private void sifreAlaniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sifreAlaniKeyTyped
        char c = evt.getKeyChar();
        if ((c == KeyEvent.VK_SPACE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_sifreAlaniKeyTyped

    private void sifreDogrulamaAlaniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sifreDogrulamaAlaniKeyTyped
        char c = evt.getKeyChar();
        if ((c == KeyEvent.VK_SPACE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_sifreDogrulamaAlaniKeyTyped

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

    private void sifreDogrulamaGosterButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sifreDogrulamaGosterButtonMouseClicked
        if (sifreDogrulamaGosterKontrol == 0) {
            sifreDogrulamaAlani.setEchoChar((char) 0);
            sifreDogrulamaAlani.setFont(new Font("SF Pro Rounded", Font.PLAIN, 18));
            sifreDogrulamaGosterButton.setIcon(sifreKapaliIcon);
            sifreDogrulamaGosterKontrol = 1;
        } else {
            sifreDogrulamaAlani.setEchoChar('●');
            sifreDogrulamaAlani.setFont(new Font("SF Pro Rounded", Font.PLAIN, 12));
            sifreDogrulamaGosterButton.setIcon(sifreAcikIcon);
            sifreDogrulamaGosterKontrol = 0;
        }
    }//GEN-LAST:event_sifreDogrulamaGosterButtonMouseClicked

    private void sifreDegistirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifreDegistirButtonActionPerformed
        String kullaniciAdi = KullaniciIslemleri.girisYapanKullanici.getKullaniciAdi();
        String sifre = hashPassword(new String(sifreAlani.getPassword()));
        String sifreDogrulama = hashPassword(new String(sifreDogrulamaAlani.getPassword()));

        boolean kontrol = sifre.equals(sifreDogrulama);
        boolean sifreKontrol = new String(sifreAlani.getPassword()).equals("");
        boolean sifreDogrulamaKontrol = new String(sifreDogrulamaAlani.getPassword()).equals("");

        if (!(sifreKontrol || sifreDogrulamaKontrol)) {
            if (kontrol) {
                kullaniciIslemleri.sifreDegistir(kullaniciAdi, sifre);

                SifreDegistirildiBildirimi sifreDegistirildiBildirimEkran = new SifreDegistirildiBildirimi();
                sifreDegistirildiBildirimEkran.setVisible(true);
                setVisible(false);
            } else {
                SifrelerUyusmuyorUyarisi sifrelerUyusmuyorUyarisi = new SifrelerUyusmuyorUyarisi();
                sifrelerUyusmuyorUyarisi.setVisible(true);
            }
        } else {
            SifreAlaniBosUyarisi sifreAlaniBosUyarisi = new SifreAlaniBosUyarisi();
            sifreAlaniBosUyarisi.setVisible(true);
        }
    }//GEN-LAST:event_sifreDegistirButtonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SifreDegistirEkran.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new SifreDegistirEkran().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel degistirmeEkraniYazisi;
    private javax.swing.JPanel form;
    private javax.swing.JLabel kapamaButton;
    private javax.swing.JPanel kapamaPanel;
    private javax.swing.JLabel logo;
    private javax.swing.JPasswordField sifreAlani;
    private javax.swing.JButton sifreDegistirButton;
    private javax.swing.JPasswordField sifreDogrulamaAlani;
    private javax.swing.JLabel sifreDogrulamaGosterButton;
    private javax.swing.JLabel sifreGosterButton;
    private javax.swing.JLabel sifreYazisi;
    private javax.swing.JSeparator yataySeparator;
    private javax.swing.JLabel yeniSifreDogrulamaYazisi;
    private javax.swing.JLabel yeniSifreYazisi;
    // End of variables declaration//GEN-END:variables
}
