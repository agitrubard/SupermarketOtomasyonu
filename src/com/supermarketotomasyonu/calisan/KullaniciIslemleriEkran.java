package com.supermarketotomasyonu.calisan;

import com.supermarketotomasyonu.kullanici.Kullanici;
import com.supermarketotomasyonu.kullanici.KullaniciIslemleri;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 * @author berrinkorkutata
 * @author agitrubardemir
 */
public class KullaniciIslemleriEkran extends javax.swing.JFrame {

    DefaultTableModel model;
    KullaniciIslemleri kullaniciIslemleri = new KullaniciIslemleri();

    int mouseX, mouseY;

    public KullaniciIslemleriEkran() {
        initComponents();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        this.setLocation(x, y);

        model = (DefaultTableModel) kullaniciTablosu.getModel();
        kullaniciGoruntule();
    }

    public void kullaniciGoruntule() {
        model.setRowCount(0);

        ArrayList<Kullanici> kullanicilar = new ArrayList<>();

        int kullaniciSayisi = 0;

        kullanicilar = kullaniciIslemleri.tumKullanicilariGetir();

        if (kullanicilar != null) {
            for (Kullanici kullanici : kullanicilar) {

                int no = kullanici.getNo();
                String kullaniciAdi = kullanici.getKullaniciAdi();
                String adSoyad = kullanici.getAd() + " " + kullanici.getSoyad();
                String mailAdresi = kullanici.getMailAdresi();
                String adres = kullanici.getAdres();

                Object[] eklenecek = {no, kullaniciAdi, adSoyad, mailAdresi, adres};

                model.addRow(eklenecek);
                kullaniciSayisi++;
            }
            kullaniciSayisiYazisi.setText("Toplam Kullanıcı Sayısı : " + kullaniciSayisi);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        form = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        kullaniciIslemleriYazisi = new javax.swing.JLabel();
        dikeySeparator = new javax.swing.JSeparator();
        yataySeparator = new javax.swing.JSeparator();
        kapamaPanel = new javax.swing.JPanel();
        kapamaButton = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        kullaniciTablosu = new javax.swing.JTable();
        kullaniciAraYazisi = new javax.swing.JLabel();
        kullaniciAraAlani = new javax.swing.JTextField();
        araSeparator = new javax.swing.JSeparator();
        kullaniciNoYazisi = new javax.swing.JLabel();
        kullaniciAdiYazisi = new javax.swing.JLabel();
        mailAdresiYazisi = new javax.swing.JLabel();
        adYazisi = new javax.swing.JLabel();
        soyadYazisi = new javax.swing.JLabel();
        adresYazisi = new javax.swing.JLabel();
        kullaniciNoAlani = new javax.swing.JTextField();
        adAlani = new javax.swing.JTextField();
        soyadAlani = new javax.swing.JTextField();
        kullaniciAdiAlani = new javax.swing.JTextField();
        mailAdresiAlani = new javax.swing.JTextField();
        silButton = new javax.swing.JButton();
        guncelleButton = new javax.swing.JButton();
        adresAlani = new javax.swing.JTextArea();
        mesajYazisi = new javax.swing.JLabel();
        kullaniciSayisiYazisi = new javax.swing.JLabel();

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

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/supermarketotomasyonu/images/newlogo110x110.jpg"))); // NOI18N

        kullaniciIslemleriYazisi.setFont(new java.awt.Font("SF Pro Rounded", 1, 60)); // NOI18N
        kullaniciIslemleriYazisi.setForeground(new java.awt.Color(79, 114, 0));
        kullaniciIslemleriYazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kullaniciIslemleriYazisi.setText("KULLANICI İŞLEMLERİ");

        dikeySeparator.setBackground(new java.awt.Color(79, 114, 0));
        dikeySeparator.setForeground(new java.awt.Color(79, 114, 0));
        dikeySeparator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        dikeySeparator.setToolTipText("");
        dikeySeparator.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        dikeySeparator.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        dikeySeparator.setMinimumSize(new java.awt.Dimension(50, 50));

        yataySeparator.setBackground(new java.awt.Color(79, 114, 0));
        yataySeparator.setForeground(new java.awt.Color(79, 114, 0));
        yataySeparator.setToolTipText("");
        yataySeparator.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        yataySeparator.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        yataySeparator.setMinimumSize(new java.awt.Dimension(50, 50));
        yataySeparator.setPreferredSize(new java.awt.Dimension(0, 10));

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

        kullaniciTablosu.setBackground(new java.awt.Color(255, 255, 255));
        kullaniciTablosu.setFont(new java.awt.Font("SF Pro Rounded", 0, 14)); // NOI18N
        kullaniciTablosu.setForeground(new java.awt.Color(113, 156, 14));
        kullaniciTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kullanıcı No", "Kullanıcı Adı", "Ad Soyad", "Mail Adresi", "Adres"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        kullaniciTablosu.setSelectionBackground(new java.awt.Color(79, 114, 0));
        kullaniciTablosu.setSelectionForeground(new java.awt.Color(255, 255, 255));
        kullaniciTablosu.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        kullaniciTablosu.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        kullaniciTablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kullaniciTablosuMouseClicked(evt);
            }
        });
        jScrollPane.setViewportView(kullaniciTablosu);
        if (kullaniciTablosu.getColumnModel().getColumnCount() > 0) {
            kullaniciTablosu.getColumnModel().getColumn(0).setResizable(false);
            kullaniciTablosu.getColumnModel().getColumn(1).setResizable(false);
            kullaniciTablosu.getColumnModel().getColumn(1).setPreferredWidth(130);
            kullaniciTablosu.getColumnModel().getColumn(2).setResizable(false);
            kullaniciTablosu.getColumnModel().getColumn(2).setPreferredWidth(150);
            kullaniciTablosu.getColumnModel().getColumn(3).setResizable(false);
            kullaniciTablosu.getColumnModel().getColumn(3).setPreferredWidth(200);
            kullaniciTablosu.getColumnModel().getColumn(4).setResizable(false);
            kullaniciTablosu.getColumnModel().getColumn(4).setPreferredWidth(300);
        }

        kullaniciAraYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 14)); // NOI18N
        kullaniciAraYazisi.setForeground(new java.awt.Color(113, 156, 14));
        kullaniciAraYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        kullaniciAraYazisi.setText("Kullanıcı Ara :");
        kullaniciAraYazisi.setToolTipText("");

        kullaniciAraAlani.setBackground(new java.awt.Color(255, 255, 255));
        kullaniciAraAlani.setFont(new java.awt.Font("SF Pro Rounded", 0, 18)); // NOI18N
        kullaniciAraAlani.setForeground(new java.awt.Color(113, 156, 14));
        kullaniciAraAlani.setToolTipText("Aramak istediğiniz kullanıcının bilgisini giriniz.");
        kullaniciAraAlani.setBorder(null);
        kullaniciAraAlani.setCaretColor(new java.awt.Color(79, 114, 0));
        kullaniciAraAlani.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        kullaniciAraAlani.setSelectionColor(new java.awt.Color(79, 114, 0));
        kullaniciAraAlani.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kullaniciAraAlaniMouseClicked(evt);
            }
        });
        kullaniciAraAlani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                kullaniciAraAlaniKeyReleased(evt);
            }
        });

        araSeparator.setBackground(new java.awt.Color(113, 156, 14));
        araSeparator.setForeground(new java.awt.Color(113, 156, 14));
        araSeparator.setToolTipText("18,30,49");

        kullaniciNoYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 20)); // NOI18N
        kullaniciNoYazisi.setForeground(new java.awt.Color(79, 114, 0));
        kullaniciNoYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        kullaniciNoYazisi.setText("Kullanıcı No : ");
        kullaniciNoYazisi.setToolTipText("Kullanıcı numarası, kullanıcı sisteme kayıt olduktan sonra otomatik olarak oluşturulur ve değiştirilemez.");

        kullaniciAdiYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 20)); // NOI18N
        kullaniciAdiYazisi.setForeground(new java.awt.Color(79, 114, 0));
        kullaniciAdiYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        kullaniciAdiYazisi.setText("Kullanıcı Adı : ");
        kullaniciAdiYazisi.setToolTipText("Kullanıcı adı en fazla 20 karakter uzunluğunda olabilir.");

        mailAdresiYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 20)); // NOI18N
        mailAdresiYazisi.setForeground(new java.awt.Color(79, 114, 0));
        mailAdresiYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mailAdresiYazisi.setText("Mail Adresi : ");
        mailAdresiYazisi.setToolTipText("Lütfen hâlihazırda kullanılan bir mail adresi giriniz.");

        adYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 20)); // NOI18N
        adYazisi.setForeground(new java.awt.Color(79, 114, 0));
        adYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        adYazisi.setText("Ad : ");

        soyadYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 20)); // NOI18N
        soyadYazisi.setForeground(new java.awt.Color(79, 114, 0));
        soyadYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        soyadYazisi.setText("Soyad : ");

        adresYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 20)); // NOI18N
        adresYazisi.setForeground(new java.awt.Color(79, 114, 0));
        adresYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        adresYazisi.setText("Adres : ");
        adresYazisi.setToolTipText("Kullanıcının adresini doğru girdiğinizden emin olunuz.");

        kullaniciNoAlani.setEditable(false);
        kullaniciNoAlani.setBackground(new java.awt.Color(113, 156, 14));
        kullaniciNoAlani.setFont(new java.awt.Font("SF Pro Rounded", 0, 18)); // NOI18N
        kullaniciNoAlani.setForeground(new java.awt.Color(255, 255, 255));
        kullaniciNoAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kullaniciNoAlani.setToolTipText("Kullanıcı numarası, kullanıcı sisteme kayıt olduktan sonra otomatik olarak oluşturulur ve değiştirilemez.");
        kullaniciNoAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14)));
        kullaniciNoAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        kullaniciNoAlani.setSelectedTextColor(new java.awt.Color(113, 156, 14));
        kullaniciNoAlani.setSelectionColor(new java.awt.Color(255, 255, 255));

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

        kullaniciAdiAlani.setBackground(new java.awt.Color(113, 156, 14));
        kullaniciAdiAlani.setFont(new java.awt.Font("SF Pro Rounded", 0, 18)); // NOI18N
        kullaniciAdiAlani.setForeground(new java.awt.Color(255, 255, 255));
        kullaniciAdiAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kullaniciAdiAlani.setToolTipText("Kullanıcı adı en fazla 20 karakter uzunluğunda olabilir.");
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
        mailAdresiAlani.setToolTipText("Lütfen hâlihazırda kullanılan bir mail adresi giriniz.");
        mailAdresiAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14)));
        mailAdresiAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        mailAdresiAlani.setSelectedTextColor(new java.awt.Color(113, 156, 14));
        mailAdresiAlani.setSelectionColor(new java.awt.Color(255, 255, 255));
        mailAdresiAlani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mailAdresiAlaniKeyTyped(evt);
            }
        });

        silButton.setBackground(new java.awt.Color(113, 156, 14));
        silButton.setFont(new java.awt.Font("SF Pro Rounded", 1, 20)); // NOI18N
        silButton.setForeground(new java.awt.Color(255, 255, 255));
        silButton.setText("SİL");
        silButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        silButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        silButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silButtonActionPerformed(evt);
            }
        });

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

        adresAlani.setBackground(new java.awt.Color(113, 156, 14));
        adresAlani.setColumns(20);
        adresAlani.setFont(new java.awt.Font("SF Pro Rounded", 0, 16)); // NOI18N
        adresAlani.setForeground(new java.awt.Color(255, 255, 255));
        adresAlani.setLineWrap(true);
        adresAlani.setRows(2);
        adresAlani.setToolTipText("Kullanıcının adresini doğru girdiğinizden emin olunuz.");
        adresAlani.setWrapStyleWord(true);
        adresAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14)));
        adresAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        adresAlani.setSelectedTextColor(new java.awt.Color(113, 156, 14));
        adresAlani.setSelectionColor(new java.awt.Color(255, 255, 255));

        mesajYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 16)); // NOI18N
        mesajYazisi.setForeground(new java.awt.Color(0, 0, 0));

        kullaniciSayisiYazisi.setFont(new java.awt.Font("SF Pro Rounded", 1, 16)); // NOI18N
        kullaniciSayisiYazisi.setForeground(new java.awt.Color(79, 114, 0));
        kullaniciSayisiYazisi.setText("Toplam Kullanıcı Sayısı : ");

        javax.swing.GroupLayout formLayout = new javax.swing.GroupLayout(form);
        form.setLayout(formLayout);
        formLayout.setHorizontalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formLayout.createSequentialGroup()
                        .addComponent(logo)
                        .addGap(8, 8, 8)
                        .addComponent(dikeySeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(kullaniciIslemleriYazisi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kapamaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(mesajYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kullaniciSayisiYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(formLayout.createSequentialGroup()
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(kullaniciAraYazisi)
                                    .addComponent(kullaniciAraAlani)
                                    .addComponent(araSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(guncelleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(silButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(yataySeparator, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
                            .addComponent(jScrollPane, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(adresAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(formLayout.createSequentialGroup()
                            .addComponent(adYazisi)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(adAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(formLayout.createSequentialGroup()
                            .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(adresYazisi)
                                .addComponent(soyadYazisi))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(soyadAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formLayout.createSequentialGroup()
                        .addComponent(kullaniciAdiYazisi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kullaniciAdiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
                        .addComponent(kullaniciNoYazisi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kullaniciNoAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
                        .addComponent(mailAdresiYazisi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mailAdresiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(85, 85, 85))
        );
        formLayout.setVerticalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formLayout.createSequentialGroup()
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(logo)
                                    .addComponent(dikeySeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(kapamaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
                        .addComponent(kullaniciIslemleriYazisi)
                        .addGap(19, 19, 19)))
                .addComponent(yataySeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kullaniciNoYazisi)
                    .addComponent(kullaniciNoAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adYazisi)
                    .addComponent(adAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soyadYazisi)
                    .addComponent(soyadAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kullaniciAdiYazisi)
                    .addComponent(kullaniciAdiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mailAdresiYazisi)
                        .addComponent(mailAdresiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(adresAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(adresYazisi)))
                .addGap(18, 18, 18)
                .addComponent(kullaniciAraYazisi)
                .addGap(3, 3, 3)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kullaniciAraAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guncelleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(silButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(araSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mesajYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kullaniciSayisiYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        CalisanEkran calisanEkran = new CalisanEkran();
        calisanEkran.setVisible(true);
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

    private void kullaniciAraAlaniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kullaniciAraAlaniMouseClicked
        adAlani.setText("");
        soyadAlani.setText("");
        adresAlani.setText("");
        kullaniciNoAlani.setText("");
        kullaniciAdiAlani.setText("");
        mailAdresiAlani.setText("");
    }//GEN-LAST:event_kullaniciAraAlaniMouseClicked

    private void dinamikAra(String ara) {
        TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<DefaultTableModel>(model);

        kullaniciTablosu.setRowSorter(rowSorter);

        rowSorter.setRowFilter(RowFilter.regexFilter(ara));
    }

    private void kullaniciAraAlaniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kullaniciAraAlaniKeyReleased
        String ara = kullaniciAraAlani.getText();

        dinamikAra(ara);
    }//GEN-LAST:event_kullaniciAraAlaniKeyReleased

    private void kullaniciTablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kullaniciTablosuMouseClicked
        mesajYazisi.setText("");

        int selectedRow = kullaniciTablosu.getSelectedRow();

        String no = model.getValueAt(selectedRow, 0).toString();
        kullaniciNoAlani.setText(no);

        String kullaniciAdi = model.getValueAt(selectedRow, 1).toString();
        kullaniciAdiAlani.setText(kullaniciAdi);

        String adSoyad = model.getValueAt(selectedRow, 2).toString();
        String[] dizi = adSoyad.split(" ");
        String ad;
        String soyad;
        switch (dizi.length) {
            case 4:
                ad = dizi[0] + " " + dizi[1];
                soyad = dizi[2] + " " + dizi[3];
                break;
            case 3:
                ad = dizi[0] + " " + dizi[1];
                soyad = dizi[2];
                break;
            default:
                ad = dizi[0];
                soyad = dizi[1];
                break;
        }
        adAlani.setText(ad);
        soyadAlani.setText(soyad);

        String mailAdresi = model.getValueAt(selectedRow, 3).toString();
        mailAdresiAlani.setText(mailAdresi);

        String adres = model.getValueAt(selectedRow, 4).toString();
        adresAlani.setText(adres);
    }//GEN-LAST:event_kullaniciTablosuMouseClicked

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

    private void guncelleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleButtonActionPerformed
        mesajYazisi.setText("");

        if (adAlani.getText().equals("")) {
            mesajYazisi.setText("Lütfen Kullanıcının Adını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (soyadAlani.getText().equals("")) {
            mesajYazisi.setText("Lütfen Kullanıcının Soyadını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (adresAlani.getText().equals("")) {
            mesajYazisi.setText("Lütfen Kullanıcının Adresini Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (kullaniciAdiAlani.getText().equals("")) {
            mesajYazisi.setText("Lütfen Kullanıcının Kullanıcı Adını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (mailAdresiAlani.getText().trim().equals("")) {
            mesajYazisi.setText("Lütfen Kullanıcının Mail Adresini Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else {
            String ad = adAlani.getText();
            String soyad = soyadAlani.getText();
            String adres = adresAlani.getText();
            int no = Integer.parseInt(kullaniciNoAlani.getText());
            String kullaniciAdi = kullaniciAdiAlani.getText().trim();
            String mailAdresi = mailAdresiAlani.getText().trim();

            kullaniciIslemleri.guncelle(no, kullaniciAdi, mailAdresi, ad, soyad, adres);

            kullaniciGoruntule();

            mesajYazisi.setText(ad + " " + soyad + " Adlı Kullanıcının Bilgileri Başarıyla Güncellendi.");
            mesajYazisi.setForeground(new Color(0, 226, 0));

            adAlani.setText("");
            soyadAlani.setText("");
            adresAlani.setText("");
            kullaniciNoAlani.setText("");
            kullaniciAdiAlani.setText("");
            mailAdresiAlani.setText("");
        }
    }//GEN-LAST:event_guncelleButtonActionPerformed

    private void silButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silButtonActionPerformed
        mesajYazisi.setText("");

        int selectedRow = kullaniciTablosu.getSelectedRow();

        if (selectedRow == -1) {
            if (model.getRowCount() == 0) {
                mesajYazisi.setText("Kullanıcı Tablonuz Şu Anda Boş!");
                mesajYazisi.setForeground(Color.RED);
            } else {
                mesajYazisi.setText("Lütfen Silinecek Bir Kullanıcı Seçiniz!");
                mesajYazisi.setForeground(Color.RED);
            }
        } else {
            String adSoyad = adAlani.getText() + " " + soyadAlani.getText();
            int no = Integer.parseInt(kullaniciNoAlani.getText());

            kullaniciIslemleri.sil(no);

            kullaniciGoruntule();

            mesajYazisi.setText(adSoyad + " Adlı Kullanıcı Başarıyla Silindi.");
            mesajYazisi.setForeground(new Color(0, 226, 0));

            adAlani.setText("");
            soyadAlani.setText("");
            adresAlani.setText("");
            kullaniciNoAlani.setText("");
            kullaniciAdiAlani.setText("");
            mailAdresiAlani.setText("");
        }
    }//GEN-LAST:event_silButtonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KullaniciIslemleriEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new KullaniciIslemleriEkran().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adAlani;
    private javax.swing.JLabel adYazisi;
    private javax.swing.JTextArea adresAlani;
    private javax.swing.JLabel adresYazisi;
    private javax.swing.JSeparator araSeparator;
    private javax.swing.JSeparator dikeySeparator;
    private javax.swing.JPanel form;
    private javax.swing.JButton guncelleButton;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel kapamaButton;
    private javax.swing.JPanel kapamaPanel;
    private javax.swing.JTextField kullaniciAdiAlani;
    private javax.swing.JLabel kullaniciAdiYazisi;
    private javax.swing.JTextField kullaniciAraAlani;
    private javax.swing.JLabel kullaniciAraYazisi;
    private javax.swing.JLabel kullaniciIslemleriYazisi;
    private javax.swing.JTextField kullaniciNoAlani;
    private javax.swing.JLabel kullaniciNoYazisi;
    private javax.swing.JLabel kullaniciSayisiYazisi;
    private javax.swing.JTable kullaniciTablosu;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField mailAdresiAlani;
    private javax.swing.JLabel mailAdresiYazisi;
    private javax.swing.JLabel mesajYazisi;
    private javax.swing.JButton silButton;
    private javax.swing.JTextField soyadAlani;
    private javax.swing.JLabel soyadYazisi;
    private javax.swing.JSeparator yataySeparator;
    // End of variables declaration//GEN-END:variables
}
