package com.supermarketotomasyonu;

import com.supermarketotomasyonu.kullanici.KullaniciIslemleri;
import com.supermarketotomasyonu.uyariekranlari.KayitGerceklestiBildirimi;
import com.supermarketotomasyonu.uyariekranlari.KayitOlUyarisi;
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
public class KayitOlEkran extends javax.swing.JFrame {

    KullaniciIslemleri kullaniciIslemleri = new KullaniciIslemleri();
    
    Icon sifreAcikIcon = new javax.swing.ImageIcon(getClass().getResource("/com/supermarketotomasyonu/images/yesilSifreAcik33x33.png"));
    Icon sifreKapaliIcon = new javax.swing.ImageIcon(getClass().getResource("/com/supermarketotomasyonu/images/yesilSifreKapali33x33.png"));

    public static int kullaniciNo;
    private static int sifreGosterKontrol;

    int mouseX, mouseY;

    public KayitOlEkran() {
        initComponents();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        this.setLocation(x, y);

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

        form = new javax.swing.JPanel();
        kapamaPanel = new javax.swing.JPanel();
        kapamaButton = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        kullaniciYazisi = new javax.swing.JLabel();
        kayitEkraniYazisi = new javax.swing.JLabel();
        yataySeparator = new javax.swing.JSeparator();
        kullaniciAdiYazisi = new javax.swing.JLabel();
        kullaniciAdiAlani = new javax.swing.JTextField();
        sifreYazisi = new javax.swing.JLabel();
        sifreAlani = new javax.swing.JPasswordField();
        mailAdresiYazisi = new javax.swing.JLabel();
        mailAdresiAlani = new javax.swing.JTextField();
        adYazisi = new javax.swing.JLabel();
        adAlani = new javax.swing.JTextField();
        soyadYazisi = new javax.swing.JLabel();
        soyadAlani = new javax.swing.JTextField();
        adresYazisi = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        adresAlani = new javax.swing.JTextArea();
        kayitOlButton = new javax.swing.JButton();
        sifreGosterButton = new javax.swing.JLabel();

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

        kullaniciYazisi.setFont(new java.awt.Font("SF Pro Rounded", 1, 45)); // NOI18N
        kullaniciYazisi.setForeground(new java.awt.Color(79, 114, 0));
        kullaniciYazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kullaniciYazisi.setText("KULLANICI");

        kayitEkraniYazisi.setFont(new java.awt.Font("SF Pro Rounded", 1, 45)); // NOI18N
        kayitEkraniYazisi.setForeground(new java.awt.Color(79, 114, 0));
        kayitEkraniYazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kayitEkraniYazisi.setText("KAYIT EKRANI");

        yataySeparator.setBackground(new java.awt.Color(79, 114, 0));
        yataySeparator.setForeground(new java.awt.Color(79, 114, 0));
        yataySeparator.setToolTipText("");
        yataySeparator.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        yataySeparator.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        yataySeparator.setMinimumSize(new java.awt.Dimension(50, 50));
        yataySeparator.setSize(new java.awt.Dimension(50, 20));

        kullaniciAdiYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 20)); // NOI18N
        kullaniciAdiYazisi.setForeground(new java.awt.Color(79, 114, 0));
        kullaniciAdiYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        kullaniciAdiYazisi.setText("Kullanıcı Adı : ");
        kullaniciAdiYazisi.setToolTipText("Kullanıcı adınız en fazla 20 karakter uzunluğunda olabilir.");

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

        sifreYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 20)); // NOI18N
        sifreYazisi.setForeground(new java.awt.Color(79, 114, 0));
        sifreYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sifreYazisi.setText("Şifre : ");
        sifreYazisi.setToolTipText("");

        sifreAlani.setBackground(new java.awt.Color(113, 156, 14));
        sifreAlani.setFont(new java.awt.Font("SF Pro Rounded", 0, 12)); // NOI18N
        sifreAlani.setForeground(new java.awt.Color(255, 255, 255));
        sifreAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sifreAlani.setToolTipText("");
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

        mailAdresiYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 20)); // NOI18N
        mailAdresiYazisi.setForeground(new java.awt.Color(79, 114, 0));
        mailAdresiYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mailAdresiYazisi.setText("Mail Adresi : ");
        mailAdresiYazisi.setToolTipText("Lütfen hâlihazırda kullandığınız bir mail adresi giriniz.");

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

        adYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 20)); // NOI18N
        adYazisi.setForeground(new java.awt.Color(79, 114, 0));
        adYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        adYazisi.setText("Ad : ");

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

        soyadYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 20)); // NOI18N
        soyadYazisi.setForeground(new java.awt.Color(79, 114, 0));
        soyadYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        soyadYazisi.setText("Soyad : ");

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

        adresYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 20)); // NOI18N
        adresYazisi.setForeground(new java.awt.Color(79, 114, 0));
        adresYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        adresYazisi.setText("Adres : ");
        adresYazisi.setToolTipText("Adresinizi doğru girdiğinizden emin olunuz.");

        adresAlani.setBackground(new java.awt.Color(113, 156, 14));
        adresAlani.setColumns(20);
        adresAlani.setFont(new java.awt.Font("SF Pro Rounded", 0, 16)); // NOI18N
        adresAlani.setForeground(new java.awt.Color(255, 255, 255));
        adresAlani.setLineWrap(true);
        adresAlani.setRows(2);
        adresAlani.setToolTipText("Adresinizi doğru girdiğinizden emin olunuz.");
        adresAlani.setWrapStyleWord(true);
        adresAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14)));
        adresAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        adresAlani.setSelectedTextColor(new java.awt.Color(113, 156, 14));
        adresAlani.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane.setViewportView(adresAlani);

        kayitOlButton.setBackground(new java.awt.Color(113, 156, 14));
        kayitOlButton.setFont(new java.awt.Font("SF Pro Rounded", 1, 20)); // NOI18N
        kayitOlButton.setForeground(new java.awt.Color(255, 255, 255));
        kayitOlButton.setText("KAYIT OL");
        kayitOlButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        kayitOlButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kayitOlButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayitOlButtonActionPerformed(evt);
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

        javax.swing.GroupLayout formLayout = new javax.swing.GroupLayout(form);
        form.setLayout(formLayout);
        formLayout.setHorizontalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formLayout.createSequentialGroup()
                        .addComponent(yataySeparator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(formLayout.createSequentialGroup()
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formLayout.createSequentialGroup()
                                .addComponent(kullaniciYazisi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(kapamaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(formLayout.createSequentialGroup()
                                .addComponent(kayitEkraniYazisi)
                                .addGap(0, 38, Short.MAX_VALUE))))))
            .addGroup(formLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(soyadYazisi)
                            .addComponent(adYazisi)
                            .addComponent(adresYazisi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(soyadAlani, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(adAlani, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(jScrollPane)))
                    .addGroup(formLayout.createSequentialGroup()
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(formLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(sifreYazisi))
                            .addComponent(kullaniciAdiYazisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mailAdresiYazisi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mailAdresiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kullaniciAdiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(formLayout.createSequentialGroup()
                                .addComponent(sifreAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(sifreGosterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kayitOlButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );
        formLayout.setVerticalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formLayout.createSequentialGroup()
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(kullaniciYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(kapamaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kayitEkraniYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(yataySeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kullaniciAdiYazisi)
                    .addComponent(kullaniciAdiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sifreYazisi)
                        .addComponent(sifreAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sifreGosterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mailAdresiYazisi)
                    .addComponent(mailAdresiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adYazisi)
                    .addComponent(adAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soyadYazisi)
                    .addComponent(soyadAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adresYazisi)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kayitOlButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        SupermarketOtomasyonu supermarketOtomasyonu = new SupermarketOtomasyonu();
        supermarketOtomasyonu.setVisible(true);
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

    private void sifreAlaniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sifreAlaniKeyTyped
        char c = evt.getKeyChar();
        if ((c == KeyEvent.VK_SPACE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_sifreAlaniKeyTyped

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

    private void kayitOlButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayitOlButtonActionPerformed
        String kullaniciAdi = kullaniciAdiAlani.getText().trim();
        String sifre = hashPassword(new String(sifreAlani.getPassword()));
        String mailAdresi = mailAdresiAlani.getText().trim();
        String ad = adAlani.getText();
        String soyad = soyadAlani.getText();
        String adres = adresAlani.getText();

        if (kullaniciAdi.equals("") || sifre.equals("") || mailAdresi.equals("") || ad.equals("") || soyad.equals("") || adres.equals("")) {
            KayitOlUyarisi kayitOlUyarisi = new KayitOlUyarisi();
            kayitOlUyarisi.setVisible(true);
        } else {
            int no = kullaniciIslemleri.noOlustur();

            kullaniciIslemleri.kayitOl(no, kullaniciAdi, sifre, mailAdresi, ad, soyad, adres);

            kullaniciNo = no;

            KayitGerceklestiBildirimi kayitGerceklestiBildirimi = new KayitGerceklestiBildirimi();
            kayitGerceklestiBildirimi.setVisible(true);
            setVisible(false);
        }
    }//GEN-LAST:event_kayitOlButtonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KayitOlEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new KayitOlEkran().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adAlani;
    private javax.swing.JLabel adYazisi;
    private javax.swing.JTextArea adresAlani;
    private javax.swing.JLabel adresYazisi;
    private javax.swing.JPanel form;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel kapamaButton;
    private javax.swing.JPanel kapamaPanel;
    private javax.swing.JLabel kayitEkraniYazisi;
    private javax.swing.JButton kayitOlButton;
    private javax.swing.JTextField kullaniciAdiAlani;
    private javax.swing.JLabel kullaniciAdiYazisi;
    private javax.swing.JLabel kullaniciYazisi;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField mailAdresiAlani;
    private javax.swing.JLabel mailAdresiYazisi;
    private javax.swing.JPasswordField sifreAlani;
    private javax.swing.JLabel sifreGosterButton;
    private javax.swing.JLabel sifreYazisi;
    private javax.swing.JTextField soyadAlani;
    private javax.swing.JLabel soyadYazisi;
    private javax.swing.JSeparator yataySeparator;
    // End of variables declaration//GEN-END:variables
}
