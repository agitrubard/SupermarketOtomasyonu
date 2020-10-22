package com.supermarketotomasyonu.yonetici;

import com.supermarketotomasyonu.calisan.Calisan;
import com.supermarketotomasyonu.calisan.CalisanIslemleri;
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
public class CalisanIslemleriEkran extends javax.swing.JFrame {

    DefaultTableModel model;
    CalisanIslemleri calisanIslemleri = new CalisanIslemleri();

    int mouseX, mouseY;

    public CalisanIslemleriEkran() {
        initComponents();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        this.setLocation(x, y);

        model = (DefaultTableModel) calisanTablosu.getModel();
        calisanGoruntule();
    }

    public void calisanGoruntule() {
        model.setRowCount(0);

        ArrayList<Calisan> calisanlar = new ArrayList<>();

        int calisanSayisi = 0;

        calisanlar = calisanIslemleri.tumCalisanlariGetir();

        if (calisanlar != null) {
            for (Calisan calisan : calisanlar) {

                int no = calisan.getNo();
                String kullaniciAdi = calisan.getKullaniciAdi();
                String adSoyad = calisan.getAd() + " " + calisan.getSoyad();
                String mailAdresi = calisan.getMailAdresi();
                String departman = calisan.getDepartman();
                String maas = calisanIslemleri.maasDonusumu(calisan.getMaas());

                Object[] eklenecek = {no, kullaniciAdi, adSoyad, mailAdresi, departman, maas};

                model.addRow(eklenecek);
                calisanSayisi++;
            }
            calisanSayisiYazisi.setText("Toplam Çalışan Sayısı : " + calisanSayisi);
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
        calisanTablosu = new javax.swing.JTable();
        calisanAraYazisi = new javax.swing.JLabel();
        calisanAraAlani = new javax.swing.JTextField();
        araSeparator = new javax.swing.JSeparator();
        calisanNoYazisi = new javax.swing.JLabel();
        kullaniciAdiYazisi = new javax.swing.JLabel();
        mailAdresiYazisi = new javax.swing.JLabel();
        adYazisi = new javax.swing.JLabel();
        soyadYazisi = new javax.swing.JLabel();
        departmanYazisi = new javax.swing.JLabel();
        maasYazisi = new javax.swing.JLabel();
        calisanNoAlani = new javax.swing.JTextField();
        adAlani = new javax.swing.JTextField();
        soyadAlani = new javax.swing.JTextField();
        departmanAlani = new javax.swing.JTextField();
        kullaniciAdiAlani = new javax.swing.JTextField();
        mailAdresiAlani = new javax.swing.JTextField();
        silButton = new javax.swing.JButton();
        guncelleButton = new javax.swing.JButton();
        ekleButton = new javax.swing.JButton();
        olusturButton = new javax.swing.JButton();
        mesajYazisi = new javax.swing.JLabel();
        calisanSayisiYazisi = new javax.swing.JLabel();
        maasAlani = new javax.swing.JFormattedTextField();

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
        calisanIslemleriYazisi.setText("ÇALIŞAN İŞLEMLERİ");

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

        calisanTablosu.setBackground(new java.awt.Color(255, 255, 255));
        calisanTablosu.setFont(new java.awt.Font("SF Pro Rounded", 0, 14)); // NOI18N
        calisanTablosu.setForeground(new java.awt.Color(113, 156, 14));
        calisanTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Çalışan No", "Kullanıcı Adı", "Ad Soyad", "Mail Adresi", "Departman", "Maaş"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        calisanTablosu.setSelectionBackground(new java.awt.Color(79, 114, 0));
        calisanTablosu.setSelectionForeground(new java.awt.Color(255, 255, 255));
        calisanTablosu.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        calisanTablosu.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        calisanTablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calisanTablosuMouseClicked(evt);
            }
        });
        jScrollPane.setViewportView(calisanTablosu);
        if (calisanTablosu.getColumnModel().getColumnCount() > 0) {
            calisanTablosu.getColumnModel().getColumn(0).setResizable(false);
            calisanTablosu.getColumnModel().getColumn(1).setResizable(false);
            calisanTablosu.getColumnModel().getColumn(1).setPreferredWidth(150);
            calisanTablosu.getColumnModel().getColumn(2).setResizable(false);
            calisanTablosu.getColumnModel().getColumn(2).setPreferredWidth(150);
            calisanTablosu.getColumnModel().getColumn(3).setResizable(false);
            calisanTablosu.getColumnModel().getColumn(3).setPreferredWidth(220);
            calisanTablosu.getColumnModel().getColumn(4).setResizable(false);
            calisanTablosu.getColumnModel().getColumn(4).setPreferredWidth(270);
            calisanTablosu.getColumnModel().getColumn(5).setResizable(false);
        }

        calisanAraYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 14)); // NOI18N
        calisanAraYazisi.setForeground(new java.awt.Color(113, 156, 14));
        calisanAraYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        calisanAraYazisi.setText("Çalışan Ara :");
        calisanAraYazisi.setToolTipText("");

        calisanAraAlani.setBackground(new java.awt.Color(255, 255, 255));
        calisanAraAlani.setFont(new java.awt.Font("SF Pro Rounded", 0, 18)); // NOI18N
        calisanAraAlani.setForeground(new java.awt.Color(113, 156, 14));
        calisanAraAlani.setToolTipText("Aramak istediğiniz çalışanın bilgisini giriniz.");
        calisanAraAlani.setBorder(null);
        calisanAraAlani.setCaretColor(new java.awt.Color(79, 114, 0));
        calisanAraAlani.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        calisanAraAlani.setSelectionColor(new java.awt.Color(79, 114, 0));
        calisanAraAlani.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calisanAraAlaniMouseClicked(evt);
            }
        });
        calisanAraAlani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                calisanAraAlaniKeyReleased(evt);
            }
        });

        araSeparator.setBackground(new java.awt.Color(113, 156, 14));
        araSeparator.setForeground(new java.awt.Color(113, 156, 14));
        araSeparator.setToolTipText("18,30,49");

        calisanNoYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 20)); // NOI18N
        calisanNoYazisi.setForeground(new java.awt.Color(79, 114, 0));
        calisanNoYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        calisanNoYazisi.setText("Çalışan No : ");
        calisanNoYazisi.setToolTipText("Çalışan numarasını yandaki oluştur butonuna tıklayarak oluşturunuz.");

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

        departmanYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 20)); // NOI18N
        departmanYazisi.setForeground(new java.awt.Color(79, 114, 0));
        departmanYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        departmanYazisi.setText("Departman : ");
        departmanYazisi.setToolTipText("Çalışanın çalıştığı departmanı giriniz.");

        maasYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 20)); // NOI18N
        maasYazisi.setForeground(new java.awt.Color(79, 114, 0));
        maasYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        maasYazisi.setText("Maaş : ");
        maasYazisi.setToolTipText("Çalışanın maaşını giriniz.");

        calisanNoAlani.setEditable(false);
        calisanNoAlani.setBackground(new java.awt.Color(113, 156, 14));
        calisanNoAlani.setFont(new java.awt.Font("SF Pro Rounded", 0, 18)); // NOI18N
        calisanNoAlani.setForeground(new java.awt.Color(255, 255, 255));
        calisanNoAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        calisanNoAlani.setToolTipText("Çalışan numarasını yandaki oluştur butonuna tıklayarak oluşturunuz.");
        calisanNoAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14)));
        calisanNoAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        calisanNoAlani.setSelectedTextColor(new java.awt.Color(113, 156, 14));
        calisanNoAlani.setSelectionColor(new java.awt.Color(255, 255, 255));

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

        departmanAlani.setBackground(new java.awt.Color(113, 156, 14));
        departmanAlani.setFont(new java.awt.Font("SF Pro Rounded", 0, 18)); // NOI18N
        departmanAlani.setForeground(new java.awt.Color(255, 255, 255));
        departmanAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        departmanAlani.setToolTipText("Çalışanın çalıştığı departmanı giriniz.");
        departmanAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14)));
        departmanAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        departmanAlani.setSelectedTextColor(new java.awt.Color(113, 156, 14));
        departmanAlani.setSelectionColor(new java.awt.Color(255, 255, 255));
        departmanAlani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                departmanAlaniKeyTyped(evt);
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
        olusturButton.setToolTipText("Çalışan numarası oluşturmak için tıklayınız.");
        olusturButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        olusturButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        olusturButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                olusturButtonActionPerformed(evt);
            }
        });

        mesajYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 16)); // NOI18N
        mesajYazisi.setForeground(new java.awt.Color(0, 0, 0));

        calisanSayisiYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 16)); // NOI18N
        calisanSayisiYazisi.setForeground(new java.awt.Color(79, 114, 0));
        calisanSayisiYazisi.setText("Toplam Çalışan Sayısı : ");

        maasAlani.setBackground(new java.awt.Color(113, 156, 14));
        maasAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14)));
        maasAlani.setForeground(new java.awt.Color(255, 255, 255));
        try {
            maasAlani.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("₺#.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        maasAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        maasAlani.setToolTipText("Çalışanın maaşını giriniz.");
        maasAlani.setActionCommand("<Not Set>");
        maasAlani.setFont(new java.awt.Font("SF Pro Rounded", 0, 18)); // NOI18N

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
                        .addGap(5, 5, 5)
                        .addComponent(mesajYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calisanSayisiYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addGroup(formLayout.createSequentialGroup()
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(calisanAraYazisi)
                                    .addComponent(calisanAraAlani)
                                    .addComponent(araSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ekleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(guncelleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(silButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(yataySeparator, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
                            .addGroup(formLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(formLayout.createSequentialGroup()
                                        .addComponent(soyadYazisi)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(soyadAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(formLayout.createSequentialGroup()
                                        .addComponent(maasYazisi)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(maasAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(formLayout.createSequentialGroup()
                                        .addComponent(adYazisi)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(adAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(formLayout.createSequentialGroup()
                                        .addComponent(departmanYazisi)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(departmanAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(formLayout.createSequentialGroup()
                                        .addComponent(kullaniciAdiYazisi)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(kullaniciAdiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
                                        .addComponent(calisanNoYazisi)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(calisanNoAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
                                        .addComponent(mailAdresiYazisi)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mailAdresiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(olusturButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(6, 6, 6))
                            .addComponent(jScrollPane, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
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
                    .addComponent(calisanNoYazisi)
                    .addComponent(calisanNoAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(departmanYazisi)
                    .addComponent(departmanAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mailAdresiYazisi)
                    .addComponent(mailAdresiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maasYazisi)
                    .addComponent(maasAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ekleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guncelleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(silButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calisanAraYazisi)
                        .addGap(1, 1, 1)
                        .addComponent(calisanAraAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(araSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mesajYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calisanSayisiYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void calisanAraAlaniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calisanAraAlaniMouseClicked
        adAlani.setText("");
        soyadAlani.setText("");
        departmanAlani.setText("");
        maasAlani.setText("");
        calisanNoAlani.setText("");
        kullaniciAdiAlani.setText("");
        mailAdresiAlani.setText("");
    }//GEN-LAST:event_calisanAraAlaniMouseClicked

    private void dinamikAra(String ara) {
        TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<DefaultTableModel>(model);

        calisanTablosu.setRowSorter(rowSorter);

        rowSorter.setRowFilter(RowFilter.regexFilter(ara));
    }

    private void calisanAraAlaniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calisanAraAlaniKeyReleased
        String ara = calisanAraAlani.getText();

        dinamikAra(ara);
    }//GEN-LAST:event_calisanAraAlaniKeyReleased

    private void calisanTablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calisanTablosuMouseClicked
        mesajYazisi.setText("");

        int selectedRow = calisanTablosu.getSelectedRow();

        String no = model.getValueAt(selectedRow, 0).toString();
        calisanNoAlani.setText(no);

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

        String departman = model.getValueAt(selectedRow, 4).toString();
        departmanAlani.setText(departman);

        String maas = model.getValueAt(selectedRow, 5).toString();
        maasAlani.setText(maas);
    }//GEN-LAST:event_calisanTablosuMouseClicked

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

    private void departmanAlaniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_departmanAlaniKeyTyped
        char c = evt.getKeyChar();
        if (departmanAlani.getText().length() >= 50) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_departmanAlaniKeyTyped

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

    private void olusturButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_olusturButtonActionPerformed
        mesajYazisi.setText("");

        int no;

        if (calisanNoAlani.getText().equals("")) {
            no = 0;
        } else {
            no = Integer.parseInt(calisanNoAlani.getText());
        }

        if (calisanIslemleri.isCalisanNo(no)) {
            mesajYazisi.setText("Bu Çalışan Sistemde Zaten Kayıtlı Olduğundan Yeni Bir Çalışan No Oluşturamazsınız!");
            mesajYazisi.setForeground(Color.RED);
        } else {
            int yoneticiNo = calisanIslemleri.noOlustur();
            calisanNoAlani.setText(String.valueOf(yoneticiNo));
        }
    }//GEN-LAST:event_olusturButtonActionPerformed

    private void ekleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekleButtonActionPerformed
        mesajYazisi.setText("");

        if (adAlani.getText().equals("")) {
            mesajYazisi.setText("Lütfen Çalışanın Adını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (soyadAlani.getText().equals("")) {
            mesajYazisi.setText("Lütfen Çalışanın Soyadını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (departmanAlani.getText().equals("")) {
            mesajYazisi.setText("Lütfen Çalışanın Depertmanını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (maasAlani.getText().trim().equals("")) {
            mesajYazisi.setText("Lütfen Çalışanın Maaşını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (calisanNoAlani.getText().equals("")) {
            mesajYazisi.setText("Lütfen Oluştur Butonuna Tıklayarak Bir Çalışan No Oluşturunuz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (kullaniciAdiAlani.getText().equals("")) {
            mesajYazisi.setText("Lütfen Çalışanın Kullanıcı Adını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (mailAdresiAlani.getText().trim().equals("")) {
            mesajYazisi.setText("Lütfen Çalışanın Mail Adresini Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else {
            String ad = adAlani.getText();
            String soyad = soyadAlani.getText();
            String departman = departmanAlani.getText();
            int maas = calisanIslemleri.maasDonusumuSQL(maasAlani.getText());
            int no = Integer.parseInt(calisanNoAlani.getText());
            String kullaniciAdi = kullaniciAdiAlani.getText().trim();
            String mailAdresi = mailAdresiAlani.getText().trim();

            if (calisanIslemleri.isCalisanNo(no) == false) {
                calisanIslemleri.ekle(no, kullaniciAdi, mailAdresi, ad, soyad, departman, maas);

                calisanGoruntule();

                mesajYazisi.setText(ad + " " + soyad + " Adlı Çalışan Başarıyla Eklendi.");
                mesajYazisi.setForeground(new Color(0, 226, 0));

                adAlani.setText("");
                soyadAlani.setText("");
                departmanAlani.setText("");
                maasAlani.setText("");
                calisanNoAlani.setText("");
                kullaniciAdiAlani.setText("");
                mailAdresiAlani.setText("");
            } else {
                mesajYazisi.setText(ad + " " + soyad + " Adlı Çalışan Sistemde Zaten Kayıtlı!");
                mesajYazisi.setForeground(Color.RED);
            }
        }
    }//GEN-LAST:event_ekleButtonActionPerformed

    private void guncelleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleButtonActionPerformed
        mesajYazisi.setText("");

        if (adAlani.getText().equals("")) {
            mesajYazisi.setText("Lütfen Çalışanın Adını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (soyadAlani.getText().equals("")) {
            mesajYazisi.setText("Lütfen Çalışanın Soyadını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (departmanAlani.getText().equals("")) {
            mesajYazisi.setText("Lütfen Çalışanın Depertmanını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (maasAlani.getText().trim().equals("")) {
            mesajYazisi.setText("Lütfen Çalışanın Maaşını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (calisanNoAlani.getText().equals("")) {
            mesajYazisi.setText("Lütfen Oluştur Butonuna Tıklayarak Bir Çalışan No Oluşturunuz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (kullaniciAdiAlani.getText().equals("")) {
            mesajYazisi.setText("Lütfen Çalışanın Kullanıcı Adını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (mailAdresiAlani.getText().trim().equals("")) {
            mesajYazisi.setText("Lütfen Çalışanın Mail Adresini Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else {
            String ad = adAlani.getText();
            String soyad = soyadAlani.getText();
            String departman = departmanAlani.getText();
            int maas = calisanIslemleri.maasDonusumuSQL(maasAlani.getText());
            int no = Integer.parseInt(calisanNoAlani.getText());
            String kullaniciAdi = kullaniciAdiAlani.getText().trim();
            String mailAdresi = mailAdresiAlani.getText().trim();

            calisanIslemleri.guncelle(no, kullaniciAdi, mailAdresi, ad, soyad, departman, maas);

            calisanGoruntule();

            mesajYazisi.setText(ad + " " + soyad + " Adlı Çalışanın Bilgileri Başarıyla Güncellendi.");
            mesajYazisi.setForeground(new Color(0, 226, 0));

            adAlani.setText("");
            soyadAlani.setText("");
            departmanAlani.setText("");
            maasAlani.setText("");
            calisanNoAlani.setText("");
            kullaniciAdiAlani.setText("");
            mailAdresiAlani.setText("");
        }
    }//GEN-LAST:event_guncelleButtonActionPerformed

    private void silButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silButtonActionPerformed
        mesajYazisi.setText("");

        int selectedRow = calisanTablosu.getSelectedRow();

        if (selectedRow == -1) {
            if (model.getRowCount() == 0) {
                mesajYazisi.setText("Çalışan Tablonuz Şu Anda Boş!");
                mesajYazisi.setForeground(Color.RED);
            } else {
                mesajYazisi.setText("Lütfen Silinecek Bir Çalışan Seçiniz!");
                mesajYazisi.setForeground(Color.RED);
            }
        } else {
            String adSoyad = adAlani.getText() + " " + soyadAlani.getText();
            int no = Integer.parseInt(calisanNoAlani.getText());

            calisanIslemleri.sil(no);

            calisanGoruntule();

            mesajYazisi.setText(adSoyad + " Adlı Çalışan Başarıyla Silindi.");
            mesajYazisi.setForeground(new Color(0, 226, 0));

            adAlani.setText("");
            soyadAlani.setText("");
            departmanAlani.setText("");
            maasAlani.setText("");
            calisanNoAlani.setText("");
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
            java.util.logging.Logger.getLogger(CalisanIslemleriEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new CalisanIslemleriEkran().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adAlani;
    private javax.swing.JLabel adYazisi;
    private javax.swing.JSeparator araSeparator;
    private javax.swing.JTextField calisanAraAlani;
    private javax.swing.JLabel calisanAraYazisi;
    private javax.swing.JLabel calisanIslemleriYazisi;
    private javax.swing.JTextField calisanNoAlani;
    private javax.swing.JLabel calisanNoYazisi;
    private javax.swing.JLabel calisanSayisiYazisi;
    private javax.swing.JTable calisanTablosu;
    private javax.swing.JTextField departmanAlani;
    private javax.swing.JLabel departmanYazisi;
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
    private javax.swing.JFormattedTextField maasAlani;
    private javax.swing.JLabel maasYazisi;
    private javax.swing.JTextField mailAdresiAlani;
    private javax.swing.JLabel mailAdresiYazisi;
    private javax.swing.JLabel mesajYazisi;
    private javax.swing.JButton olusturButton;
    private javax.swing.JButton silButton;
    private javax.swing.JTextField soyadAlani;
    private javax.swing.JLabel soyadYazisi;
    private javax.swing.JSeparator yataySeparator;
    // End of variables declaration//GEN-END:variables
}
