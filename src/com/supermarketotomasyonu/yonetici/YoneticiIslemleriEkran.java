package com.supermarketotomasyonu.yonetici;

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
public class YoneticiIslemleriEkran extends javax.swing.JFrame {

    DefaultTableModel model;
    YoneticiIslemleri yoneticiIslemleri = new YoneticiIslemleri();

    int mouseX, mouseY;

    public YoneticiIslemleriEkran() {
        initComponents();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        this.setLocation(x, y);

        model = (DefaultTableModel) yoneticiTablosu.getModel();
        yoneticiGoruntule();
    }

    public void yoneticiGoruntule() {
        model.setRowCount(0);

        ArrayList<Yonetici> yoneticiler = new ArrayList<>();

        int yoneticiSayisi = 0;

        yoneticiler = yoneticiIslemleri.tumYoneticileriGetir();

        if (yoneticiler != null) {
            for (Yonetici yonetici : yoneticiler) {

                int no = yonetici.getNo();
                String kullaniciAdi = yonetici.getKullaniciAdi();
                String adSoyad = yonetici.getAd() + " " + yonetici.getSoyad();
                String mailAdresi = yonetici.getMailAdresi();

                Object[] eklenecek = {no, kullaniciAdi, adSoyad, mailAdresi};

                model.addRow(eklenecek);
                yoneticiSayisi++;
            }
            yoneticiSayisiYazisi.setText("Toplam Yönetici Sayısı : " + yoneticiSayisi);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        form = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        calisanIslemleriYazisi = new javax.swing.JLabel();
        dikeySeparator = new javax.swing.JSeparator();
        yataySeparator = new javax.swing.JSeparator();
        kapamaPanel = new javax.swing.JPanel();
        kapamaButton = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        yoneticiTablosu = new javax.swing.JTable();
        yoneticiAraYazisi = new javax.swing.JLabel();
        yoneticiAraAlani = new javax.swing.JTextField();
        araSeparator = new javax.swing.JSeparator();
        yoneticiNoYazisi = new javax.swing.JLabel();
        kullaniciAdiYazisi = new javax.swing.JLabel();
        mailAdresiYazisi = new javax.swing.JLabel();
        adYazisi = new javax.swing.JLabel();
        soyadYazisi = new javax.swing.JLabel();
        yoneticiNoAlani = new javax.swing.JTextField();
        adAlani = new javax.swing.JTextField();
        soyadAlani = new javax.swing.JTextField();
        kullaniciAdiAlani = new javax.swing.JTextField();
        mailAdresiAlani = new javax.swing.JTextField();
        silButton = new javax.swing.JButton();
        guncelleButton = new javax.swing.JButton();
        ekleButton = new javax.swing.JButton();
        olusturButton = new javax.swing.JButton();
        mesajYazisi = new javax.swing.JLabel();
        yoneticiSayisiYazisi = new javax.swing.JLabel();

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

        calisanIslemleriYazisi.setFont(new java.awt.Font("SF Pro Rounded", 1, 60)); // NOI18N
        calisanIslemleriYazisi.setForeground(new java.awt.Color(79, 114, 0));
        calisanIslemleriYazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        calisanIslemleriYazisi.setText("YÖNETİCİ İŞLEMLERİ");

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

        yoneticiTablosu.setBackground(new java.awt.Color(255, 255, 255));
        yoneticiTablosu.setFont(new java.awt.Font("SF Pro Rounded", 0, 14)); // NOI18N
        yoneticiTablosu.setForeground(new java.awt.Color(113, 156, 14));
        yoneticiTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Yönetici No", "Kullanıcı Adı", "Ad Soyad", "Mail Adresi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        yoneticiTablosu.setSelectionBackground(new java.awt.Color(79, 114, 0));
        yoneticiTablosu.setSelectionForeground(new java.awt.Color(255, 255, 255));
        yoneticiTablosu.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        yoneticiTablosu.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        yoneticiTablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yoneticiTablosuMouseClicked(evt);
            }
        });
        jScrollPane.setViewportView(yoneticiTablosu);
        if (yoneticiTablosu.getColumnModel().getColumnCount() > 0) {
            yoneticiTablosu.getColumnModel().getColumn(0).setResizable(false);
            yoneticiTablosu.getColumnModel().getColumn(0).setPreferredWidth(-100);
            yoneticiTablosu.getColumnModel().getColumn(1).setResizable(false);
            yoneticiTablosu.getColumnModel().getColumn(2).setResizable(false);
            yoneticiTablosu.getColumnModel().getColumn(2).setPreferredWidth(200);
            yoneticiTablosu.getColumnModel().getColumn(3).setResizable(false);
            yoneticiTablosu.getColumnModel().getColumn(3).setPreferredWidth(300);
        }

        yoneticiAraYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 14)); // NOI18N
        yoneticiAraYazisi.setForeground(new java.awt.Color(113, 156, 14));
        yoneticiAraYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        yoneticiAraYazisi.setText("Yönetici Ara :");
        yoneticiAraYazisi.setToolTipText("");

        yoneticiAraAlani.setBackground(new java.awt.Color(255, 255, 255));
        yoneticiAraAlani.setFont(new java.awt.Font("SF Pro Rounded", 0, 18)); // NOI18N
        yoneticiAraAlani.setForeground(new java.awt.Color(113, 156, 14));
        yoneticiAraAlani.setToolTipText("Aramak istediğiniz yöneticinin bilgisini giriniz.");
        yoneticiAraAlani.setBorder(null);
        yoneticiAraAlani.setCaretColor(new java.awt.Color(79, 114, 0));
        yoneticiAraAlani.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        yoneticiAraAlani.setSelectionColor(new java.awt.Color(79, 114, 0));
        yoneticiAraAlani.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yoneticiAraAlaniMouseClicked(evt);
            }
        });
        yoneticiAraAlani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                yoneticiAraAlaniKeyReleased(evt);
            }
        });

        araSeparator.setBackground(new java.awt.Color(113, 156, 14));
        araSeparator.setForeground(new java.awt.Color(113, 156, 14));
        araSeparator.setToolTipText("18,30,49");

        yoneticiNoYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 20)); // NOI18N
        yoneticiNoYazisi.setForeground(new java.awt.Color(79, 114, 0));
        yoneticiNoYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        yoneticiNoYazisi.setText("Yönetici No : ");
        yoneticiNoYazisi.setToolTipText("Yönetici numarasını yandaki oluştur butonuna tıklayarak oluşturunuz.");

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

        yoneticiNoAlani.setEditable(false);
        yoneticiNoAlani.setBackground(new java.awt.Color(113, 156, 14));
        yoneticiNoAlani.setFont(new java.awt.Font("SF Pro Rounded", 0, 18)); // NOI18N
        yoneticiNoAlani.setForeground(new java.awt.Color(255, 255, 255));
        yoneticiNoAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        yoneticiNoAlani.setToolTipText("Yönetici numarasını yandaki oluştur butonuna tıklayarak oluşturunuz.");
        yoneticiNoAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14)));
        yoneticiNoAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        yoneticiNoAlani.setSelectedTextColor(new java.awt.Color(113, 156, 14));
        yoneticiNoAlani.setSelectionColor(new java.awt.Color(255, 255, 255));

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

        ekleButton.setBackground(new java.awt.Color(113, 156, 14));
        ekleButton.setFont(new java.awt.Font("SF Pro Rounded", 1, 20)); // NOI18N
        ekleButton.setForeground(new java.awt.Color(255, 255, 255));
        ekleButton.setText("EKLE");
        ekleButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ekleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ekleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekleButtonActionPerformed(evt);
            }
        });

        olusturButton.setBackground(new java.awt.Color(113, 156, 14));
        olusturButton.setFont(new java.awt.Font("SF Pro Rounded", 1, 18)); // NOI18N
        olusturButton.setForeground(new java.awt.Color(255, 255, 255));
        olusturButton.setText("OLUŞTUR");
        olusturButton.setToolTipText("Yönetici numarası oluşturmak için tıklayınız.");
        olusturButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        olusturButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        olusturButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                olusturButtonActionPerformed(evt);
            }
        });

        mesajYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 16)); // NOI18N
        mesajYazisi.setForeground(new java.awt.Color(0, 0, 0));

        yoneticiSayisiYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 16)); // NOI18N
        yoneticiSayisiYazisi.setForeground(new java.awt.Color(79, 114, 0));
        yoneticiSayisiYazisi.setText("Toplam Yönetici Sayısı : ");

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
                        .addComponent(calisanIslemleriYazisi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kapamaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formLayout.createSequentialGroup()
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yataySeparator, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(formLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(yoneticiAraYazisi)
                                    .addComponent(yoneticiAraAlani)
                                    .addComponent(araSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ekleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(guncelleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(silButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(formLayout.createSequentialGroup()
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(mesajYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yoneticiSayisiYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(formLayout.createSequentialGroup()
                                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
                                        .addComponent(adYazisi)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(adAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
                                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(soyadYazisi)
                                            .addComponent(mailAdresiYazisi))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(mailAdresiAlani, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(soyadAlani, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(formLayout.createSequentialGroup()
                                        .addComponent(kullaniciAdiYazisi)
                                        .addGap(13, 13, 13))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
                                        .addComponent(yoneticiNoYazisi)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(kullaniciAdiAlani)
                                    .addComponent(yoneticiNoAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(olusturButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 15, Short.MAX_VALUE))))
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
                        .addComponent(calisanIslemleriYazisi)
                        .addGap(19, 19, 19)))
                .addComponent(yataySeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yoneticiNoYazisi)
                    .addComponent(yoneticiNoAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adYazisi)
                    .addComponent(adAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(olusturButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soyadYazisi)
                    .addComponent(soyadAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kullaniciAdiYazisi)
                    .addComponent(kullaniciAdiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mailAdresiYazisi)
                    .addComponent(mailAdresiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ekleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guncelleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(silButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11))
                    .addGroup(formLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(yoneticiAraYazisi)
                        .addGap(1, 1, 1)
                        .addComponent(yoneticiAraAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(araSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mesajYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yoneticiSayisiYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void yoneticiAraAlaniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yoneticiAraAlaniMouseClicked
        adAlani.setText("");
        soyadAlani.setText("");
        mailAdresiAlani.setText("");
        yoneticiNoAlani.setText("");
        kullaniciAdiAlani.setText("");
    }//GEN-LAST:event_yoneticiAraAlaniMouseClicked

    private void dinamikAra(String ara) {
        TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<DefaultTableModel>(model);

        yoneticiTablosu.setRowSorter(rowSorter);

        rowSorter.setRowFilter(RowFilter.regexFilter(ara));
    }

    private void yoneticiAraAlaniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yoneticiAraAlaniKeyReleased
        String ara = yoneticiAraAlani.getText();

        dinamikAra(ara);
    }//GEN-LAST:event_yoneticiAraAlaniKeyReleased

    private void yoneticiTablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yoneticiTablosuMouseClicked
        mesajYazisi.setText("");

        int selectedRow = yoneticiTablosu.getSelectedRow();

        String no = model.getValueAt(selectedRow, 0).toString();
        yoneticiNoAlani.setText(no);

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
    }//GEN-LAST:event_yoneticiTablosuMouseClicked

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

    private void mailAdresiAlaniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mailAdresiAlaniKeyTyped
        char c = evt.getKeyChar();
        if (mailAdresiAlani.getText().length() >= 50 || (c == KeyEvent.VK_SPACE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_mailAdresiAlaniKeyTyped

    private void kullaniciAdiAlaniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kullaniciAdiAlaniKeyTyped
        char c = evt.getKeyChar();
        if (kullaniciAdiAlani.getText().length() >= 20 || (c == KeyEvent.VK_SPACE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_kullaniciAdiAlaniKeyTyped

    private void olusturButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_olusturButtonActionPerformed
        mesajYazisi.setText("");

        int no;

        if (yoneticiNoAlani.getText().equals("")) {
            no = 0;
        } else {
            no = Integer.parseInt(yoneticiNoAlani.getText());
        }

        if (yoneticiIslemleri.isYoneticiNo(no)) {
            mesajYazisi.setText("Bu Yönetici Sistemde Zaten Kayıtlı Olduğundan Yeni Bir Yönetici No Oluşturamazsınız!");
            mesajYazisi.setForeground(Color.RED);
        } else {
            int yoneticiNo = yoneticiIslemleri.noOlustur();
            yoneticiNoAlani.setText(String.valueOf(yoneticiNo));
        }
    }//GEN-LAST:event_olusturButtonActionPerformed

    private void ekleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekleButtonActionPerformed
        mesajYazisi.setText("");

        if (adAlani.getText().equals("")) {
            mesajYazisi.setText("Lütfen Yöneticinin Adını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (soyadAlani.getText().equals("")) {
            mesajYazisi.setText("Lütfen Yöneticinin Soyadını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (mailAdresiAlani.getText().trim().equals("")) {
            mesajYazisi.setText("Lütfen Yöneticinin Mail Adresini Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (yoneticiNoAlani.getText().equals("")) {
            mesajYazisi.setText("Lütfen Oluştur Butonuna Tıklayarak Bir Yönetici No Oluşturunuz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (kullaniciAdiAlani.getText().equals("")) {
            mesajYazisi.setText("Lütfen Yöneticinin Kullanıcı Adını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else {
            String ad = adAlani.getText();
            String soyad = soyadAlani.getText();
            String mailAdresi = mailAdresiAlani.getText().trim();
            int no = Integer.parseInt(yoneticiNoAlani.getText());
            String kullaniciAdi = kullaniciAdiAlani.getText().trim();

            if (yoneticiIslemleri.isYoneticiNo(no) == false) {
                yoneticiIslemleri.ekle(no, kullaniciAdi, mailAdresi, ad, soyad);

                yoneticiGoruntule();

                mesajYazisi.setText(ad + " " + soyad + " Adlı Yönetici Başarıyla Eklendi.");
                mesajYazisi.setForeground(new Color(0, 226, 0));

                adAlani.setText("");
                soyadAlani.setText("");
                mailAdresiAlani.setText("");
                yoneticiNoAlani.setText("");
                kullaniciAdiAlani.setText("");
            } else {
                mesajYazisi.setText(ad + " " + soyad + " Adlı Yönetici Sistemde Zaten Kayıtlı!");
                mesajYazisi.setForeground(Color.RED);
            }
        }
    }//GEN-LAST:event_ekleButtonActionPerformed

    private void guncelleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleButtonActionPerformed
        mesajYazisi.setText("");

        if (adAlani.getText().equals("")) {
            mesajYazisi.setText("Lütfen Yöneticinin Adını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (soyadAlani.getText().equals("")) {
            mesajYazisi.setText("Lütfen Yöneticinin Soyadını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (mailAdresiAlani.getText().trim().equals("")) {
            mesajYazisi.setText("Lütfen Yöneticinin Mail Adresini Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (kullaniciAdiAlani.getText().equals("")) {
            mesajYazisi.setText("Lütfen Yöneticinin Kullanıcı Adını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else {
            String ad = adAlani.getText();
            String soyad = soyadAlani.getText();
            String mailAdresi = mailAdresiAlani.getText().trim();
            int no = Integer.parseInt(yoneticiNoAlani.getText());
            String kullaniciAdi = kullaniciAdiAlani.getText().trim();

            yoneticiIslemleri.guncelle(no, kullaniciAdi, mailAdresi, ad, soyad);

            yoneticiGoruntule();

            mesajYazisi.setText(ad + " " + soyad + " Adlı Yöneticinin Bilgileri Başarıyla Güncellendi.");
            mesajYazisi.setForeground(new Color(0, 226, 0));

            adAlani.setText("");
            soyadAlani.setText("");
            mailAdresiAlani.setText("");
            yoneticiNoAlani.setText("");
            kullaniciAdiAlani.setText("");
        }
    }//GEN-LAST:event_guncelleButtonActionPerformed

    private void silButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silButtonActionPerformed
        mesajYazisi.setText("");

        int selectedRow = yoneticiTablosu.getSelectedRow();

        if (selectedRow == -1) {
            if (model.getRowCount() == 0) {
                mesajYazisi.setText("Yönetici Tablonuz Şu Anda Boş!");
                mesajYazisi.setForeground(Color.RED);
            } else {
                mesajYazisi.setText("Lütfen Silinecek Bir Yönetici Seçiniz!");
                mesajYazisi.setForeground(Color.RED);
            }
        } else {
            String adSoyad = adAlani.getText() + " " + soyadAlani.getText();
            int no = Integer.parseInt(yoneticiNoAlani.getText());

            yoneticiIslemleri.sil(no);

            yoneticiGoruntule();

            mesajYazisi.setText(adSoyad + " Adlı Yönetici Başarıyla Silindi.");
            mesajYazisi.setForeground(new Color(0, 226, 0));

            adAlani.setText("");
            soyadAlani.setText("");
            mailAdresiAlani.setText("");
            yoneticiNoAlani.setText("");
            kullaniciAdiAlani.setText("");
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
            java.util.logging.Logger.getLogger(YoneticiIslemleriEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new YoneticiIslemleriEkran().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adAlani;
    private javax.swing.JLabel adYazisi;
    private javax.swing.JSeparator araSeparator;
    private javax.swing.JLabel calisanIslemleriYazisi;
    private javax.swing.JSeparator dikeySeparator;
    private javax.swing.JButton ekleButton;
    private javax.swing.JPanel form;
    private javax.swing.JButton guncelleButton;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel kapamaButton;
    private javax.swing.JPanel kapamaPanel;
    private javax.swing.JTextField kullaniciAdiAlani;
    private javax.swing.JLabel kullaniciAdiYazisi;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField mailAdresiAlani;
    private javax.swing.JLabel mailAdresiYazisi;
    private javax.swing.JLabel mesajYazisi;
    private javax.swing.JButton olusturButton;
    private javax.swing.JButton silButton;
    private javax.swing.JTextField soyadAlani;
    private javax.swing.JLabel soyadYazisi;
    private javax.swing.JSeparator yataySeparator;
    private javax.swing.JTextField yoneticiAraAlani;
    private javax.swing.JLabel yoneticiAraYazisi;
    private javax.swing.JTextField yoneticiNoAlani;
    private javax.swing.JLabel yoneticiNoYazisi;
    private javax.swing.JLabel yoneticiSayisiYazisi;
    private javax.swing.JTable yoneticiTablosu;
    // End of variables declaration//GEN-END:variables
}
