package com.supermarketotomasyonu.calisan;

import com.supermarketotomasyonu.urun.Urun;
import com.supermarketotomasyonu.urun.UrunIslemleri;
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
public class UrunIslemleriEkran extends javax.swing.JFrame {

    DefaultTableModel model;
    UrunIslemleri urunIslemleri = new UrunIslemleri();

    int mouseX, mouseY;

    public UrunIslemleriEkran() {
        initComponents();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        this.setLocation(x, y);

        model = (DefaultTableModel) urunTablosu.getModel();
        urunGoruntule();
    }

    public void urunGoruntule() {
        model.setRowCount(0);

        ArrayList<Urun> urunler = new ArrayList<>();

        int urunSayisi = 0;

        urunler = urunIslemleri.tumUrunleriGetir();

        if (urunler != null) {
            for (Urun urun : urunler) {
                int no = urun.getNo();
                String ad = urun.getAd();
                String kategoriAdi = urun.getKategoriAdi();
                String marka = urun.getMarka();
                String fiyat = urunIslemleri.fiyatDonusumu(urun.getFiyat());
                int stokSayisi = urun.getStokSayisi();

                Object[] eklenecek = {no, ad, kategoriAdi, marka, fiyat, stokSayisi};

                model.addRow(eklenecek);
                urunSayisi++;
            }
            urunSayisiYazisi.setText("Toplam Ürün Sayısı : " + urunSayisi);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        form = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        urunIslemleriYazisi = new javax.swing.JLabel();
        dikeySeparator = new javax.swing.JSeparator();
        yataySeparator = new javax.swing.JSeparator();
        kapamaPanel = new javax.swing.JPanel();
        kapamaButton = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        urunTablosu = new javax.swing.JTable();
        urunAraYazisi = new javax.swing.JLabel();
        urunAraAlani = new javax.swing.JTextField();
        araSeparator = new javax.swing.JSeparator();
        stokSayisiYazisi = new javax.swing.JLabel();
        urunNoYazisi = new javax.swing.JLabel();
        urunAdiYazisi = new javax.swing.JLabel();
        markasiYazisi = new javax.swing.JLabel();
        fiyatYazisi = new javax.swing.JLabel();
        urunNoAlani = new javax.swing.JTextField();
        urunAdiAlani = new javax.swing.JTextField();
        markaAlani = new javax.swing.JTextField();
        stokSayisiAlani = new javax.swing.JTextField();
        silButton = new javax.swing.JButton();
        guncelleButton = new javax.swing.JButton();
        ekleButton = new javax.swing.JButton();
        olusturButton = new javax.swing.JButton();
        urunSayisiYazisi = new javax.swing.JLabel();
        mesajYazisi = new javax.swing.JLabel();
        kategoriSecimi = new javax.swing.JComboBox<>();
        kategorisiYazisi = new javax.swing.JLabel();
        fiyatAlani = new javax.swing.JTextField();

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

        urunIslemleriYazisi.setFont(new java.awt.Font("SF Pro Rounded", 1, 60)); // NOI18N
        urunIslemleriYazisi.setForeground(new java.awt.Color(79, 114, 0));
        urunIslemleriYazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        urunIslemleriYazisi.setText("ÜRÜN İŞLEMLERİ");

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

        urunTablosu.setBackground(new java.awt.Color(255, 255, 255));
        urunTablosu.setFont(new java.awt.Font("SF Pro Rounded", 0, 14)); // NOI18N
        urunTablosu.setForeground(new java.awt.Color(113, 156, 14));
        urunTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ürün No", "Ürün Adı", "Kategori", "Marka", "Fiyat", "Stok Sayısı"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        urunTablosu.setSelectionBackground(new java.awt.Color(79, 114, 0));
        urunTablosu.setSelectionForeground(new java.awt.Color(255, 255, 255));
        urunTablosu.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        urunTablosu.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        urunTablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                urunTablosuMouseClicked(evt);
            }
        });
        jScrollPane.setViewportView(urunTablosu);
        if (urunTablosu.getColumnModel().getColumnCount() > 0) {
            urunTablosu.getColumnModel().getColumn(0).setResizable(false);
            urunTablosu.getColumnModel().getColumn(0).setPreferredWidth(100);
            urunTablosu.getColumnModel().getColumn(1).setResizable(false);
            urunTablosu.getColumnModel().getColumn(1).setPreferredWidth(370);
            urunTablosu.getColumnModel().getColumn(2).setResizable(false);
            urunTablosu.getColumnModel().getColumn(2).setPreferredWidth(120);
            urunTablosu.getColumnModel().getColumn(3).setResizable(false);
            urunTablosu.getColumnModel().getColumn(3).setPreferredWidth(180);
            urunTablosu.getColumnModel().getColumn(4).setResizable(false);
            urunTablosu.getColumnModel().getColumn(4).setPreferredWidth(60);
            urunTablosu.getColumnModel().getColumn(5).setResizable(false);
            urunTablosu.getColumnModel().getColumn(5).setPreferredWidth(80);
        }

        urunAraYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 14)); // NOI18N
        urunAraYazisi.setForeground(new java.awt.Color(113, 156, 14));
        urunAraYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        urunAraYazisi.setText("Ürün Ara :");
        urunAraYazisi.setToolTipText("");

        urunAraAlani.setBackground(new java.awt.Color(255, 255, 255));
        urunAraAlani.setFont(new java.awt.Font("SF Pro Rounded", 0, 18)); // NOI18N
        urunAraAlani.setForeground(new java.awt.Color(113, 156, 14));
        urunAraAlani.setToolTipText("Aramak istediğiniz ürünün bilgisini giriniz.");
        urunAraAlani.setBorder(null);
        urunAraAlani.setCaretColor(new java.awt.Color(79, 114, 0));
        urunAraAlani.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        urunAraAlani.setSelectionColor(new java.awt.Color(79, 114, 0));
        urunAraAlani.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                urunAraAlaniMouseClicked(evt);
            }
        });
        urunAraAlani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                urunAraAlaniKeyReleased(evt);
            }
        });

        araSeparator.setBackground(new java.awt.Color(113, 156, 14));
        araSeparator.setForeground(new java.awt.Color(113, 156, 14));
        araSeparator.setToolTipText("18,30,49");

        stokSayisiYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 20)); // NOI18N
        stokSayisiYazisi.setForeground(new java.awt.Color(79, 114, 0));
        stokSayisiYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        stokSayisiYazisi.setText("Stok Sayısı : ");
        stokSayisiYazisi.setToolTipText("");

        urunNoYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 20)); // NOI18N
        urunNoYazisi.setForeground(new java.awt.Color(79, 114, 0));
        urunNoYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        urunNoYazisi.setText("Ürün No : ");
        urunNoYazisi.setToolTipText("Ürün numarasını yandaki oluştur butonuna tıklayarak oluşturunuz.");

        urunAdiYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 20)); // NOI18N
        urunAdiYazisi.setForeground(new java.awt.Color(79, 114, 0));
        urunAdiYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        urunAdiYazisi.setText("Ürün Adı : ");

        markasiYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 20)); // NOI18N
        markasiYazisi.setForeground(new java.awt.Color(79, 114, 0));
        markasiYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        markasiYazisi.setText("Markası : ");
        markasiYazisi.setToolTipText("");

        fiyatYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 20)); // NOI18N
        fiyatYazisi.setForeground(new java.awt.Color(79, 114, 0));
        fiyatYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fiyatYazisi.setText("Fiyat (₺) : ");
        fiyatYazisi.setToolTipText("Ürünün fiyatını \"₺43,44\" veya \"43,44\" şeklinde giriniz");

        urunNoAlani.setEditable(false);
        urunNoAlani.setBackground(new java.awt.Color(113, 156, 14));
        urunNoAlani.setFont(new java.awt.Font("SF Pro Rounded", 0, 18)); // NOI18N
        urunNoAlani.setForeground(new java.awt.Color(255, 255, 255));
        urunNoAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        urunNoAlani.setToolTipText("Ürün numarasını yandaki oluştur butonuna tıklayarak oluşturunuz.");
        urunNoAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14)));
        urunNoAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        urunNoAlani.setSelectedTextColor(new java.awt.Color(113, 156, 14));
        urunNoAlani.setSelectionColor(new java.awt.Color(255, 255, 255));

        urunAdiAlani.setBackground(new java.awt.Color(113, 156, 14));
        urunAdiAlani.setFont(new java.awt.Font("SF Pro Rounded", 0, 18)); // NOI18N
        urunAdiAlani.setForeground(new java.awt.Color(255, 255, 255));
        urunAdiAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        urunAdiAlani.setToolTipText("");
        urunAdiAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14)));
        urunAdiAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        urunAdiAlani.setSelectedTextColor(new java.awt.Color(113, 156, 14));
        urunAdiAlani.setSelectionColor(new java.awt.Color(255, 255, 255));
        urunAdiAlani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                urunAdiAlaniKeyTyped(evt);
            }
        });

        markaAlani.setBackground(new java.awt.Color(113, 156, 14));
        markaAlani.setFont(new java.awt.Font("SF Pro Rounded", 0, 18)); // NOI18N
        markaAlani.setForeground(new java.awt.Color(255, 255, 255));
        markaAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        markaAlani.setToolTipText("");
        markaAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14)));
        markaAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        markaAlani.setSelectedTextColor(new java.awt.Color(113, 156, 14));
        markaAlani.setSelectionColor(new java.awt.Color(255, 255, 255));
        markaAlani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                markaAlaniKeyTyped(evt);
            }
        });

        stokSayisiAlani.setBackground(new java.awt.Color(113, 156, 14));
        stokSayisiAlani.setFont(new java.awt.Font("SF Pro Rounded", 0, 18)); // NOI18N
        stokSayisiAlani.setForeground(new java.awt.Color(255, 255, 255));
        stokSayisiAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        stokSayisiAlani.setToolTipText("");
        stokSayisiAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14)));
        stokSayisiAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        stokSayisiAlani.setSelectedTextColor(new java.awt.Color(113, 156, 14));
        stokSayisiAlani.setSelectionColor(new java.awt.Color(255, 255, 255));
        stokSayisiAlani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stokSayisiAlaniKeyTyped(evt);
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
        olusturButton.setToolTipText("Ürün numarası oluşturmak için tıklayınız.");
        olusturButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        olusturButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        olusturButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                olusturButtonActionPerformed(evt);
            }
        });

        urunSayisiYazisi.setFont(new java.awt.Font("SF Pro Rounded", 1, 16)); // NOI18N
        urunSayisiYazisi.setForeground(new java.awt.Color(79, 114, 0));
        urunSayisiYazisi.setText("Toplam Ürün Sayısı : ");

        mesajYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 16)); // NOI18N
        mesajYazisi.setForeground(new java.awt.Color(0, 0, 0));

        kategoriSecimi.setBackground(new java.awt.Color(113, 156, 14));
        kategoriSecimi.setFont(new java.awt.Font("SF Pro Rounded", 0, 14)); // NOI18N
        kategoriSecimi.setForeground(new java.awt.Color(255, 255, 255));
        kategoriSecimi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Ürünün Kategorisini Seçiniz --", "Atıştırmalık", "Balık Çeşitleri", "Et Ürünleri", "Ev İhtiyaçları", "İçecek", "Kozmetik", "Meyve", "Sebze", "Süt Ürünleri", "Temizlik Ürünleri" }));
        kategoriSecimi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        kategoriSecimi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        kategorisiYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 20)); // NOI18N
        kategorisiYazisi.setForeground(new java.awt.Color(79, 114, 0));
        kategorisiYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        kategorisiYazisi.setText("Kategorisi : ");
        kategorisiYazisi.setToolTipText("");

        fiyatAlani.setBackground(new java.awt.Color(113, 156, 14));
        fiyatAlani.setFont(new java.awt.Font("SF Pro Rounded", 0, 18)); // NOI18N
        fiyatAlani.setForeground(new java.awt.Color(255, 255, 255));
        fiyatAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fiyatAlani.setToolTipText("Ürünün fiyatını \"₺43,44\" veya \"43,44\" şeklinde giriniz");
        fiyatAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14), new java.awt.Color(113, 156, 14)));
        fiyatAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        fiyatAlani.setSelectedTextColor(new java.awt.Color(113, 156, 14));
        fiyatAlani.setSelectionColor(new java.awt.Color(255, 255, 255));
        fiyatAlani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fiyatAlaniKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout formLayout = new javax.swing.GroupLayout(form);
        form.setLayout(formLayout);
        formLayout.setHorizontalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(logo)
                .addGap(8, 8, 8)
                .addComponent(dikeySeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(urunIslemleriYazisi)
                .addGap(282, 282, 282)
                .addComponent(kapamaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(formLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(yataySeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(formLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(kategorisiYazisi)
                .addGap(12, 12, 12)
                .addComponent(kategoriSecimi, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132)
                .addComponent(stokSayisiYazisi)
                .addGap(12, 12, 12)
                .addComponent(stokSayisiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(formLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(urunAraYazisi))
            .addGroup(formLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(urunAraAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(araSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(130, 130, 130)
                .addComponent(ekleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(guncelleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(silButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(formLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(formLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(mesajYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(urunSayisiYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(formLayout.createSequentialGroup()
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(urunNoYazisi)
                        .addGap(12, 12, 12)
                        .addComponent(urunNoAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(olusturButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(urunAdiYazisi)
                        .addGap(12, 12, 12)
                        .addComponent(urunAdiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(markasiYazisi)
                        .addGap(12, 12, 12)
                        .addComponent(markaAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(fiyatYazisi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fiyatAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        formLayout.setVerticalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(logo))
                    .addGroup(formLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(dikeySeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(urunIslemleriYazisi))
                    .addComponent(kapamaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(yataySeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(urunNoAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(olusturButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markaAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(formLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(urunNoYazisi)
                            .addComponent(markasiYazisi))))
                .addGap(12, 12, 12)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(urunAdiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(formLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(urunAdiYazisi))
                    .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fiyatYazisi)
                        .addComponent(fiyatAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(kategorisiYazisi))
                    .addComponent(kategoriSecimi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(stokSayisiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(stokSayisiYazisi)))
                .addGap(19, 19, 19)
                .addComponent(urunAraYazisi)
                .addGap(1, 1, 1)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(urunAraAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(araSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ekleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guncelleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(silButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mesajYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(urunSayisiYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void urunAraAlaniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_urunAraAlaniMouseClicked
        urunNoAlani.setText("");
        urunAdiAlani.setText("");
        kategoriSecimi.setSelectedIndex(0);
        markaAlani.setText("");
        fiyatAlani.setText("");
        stokSayisiAlani.setText("");
    }//GEN-LAST:event_urunAraAlaniMouseClicked

    private void dinamikAra(String ara) {
        TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<DefaultTableModel>(model);

        urunTablosu.setRowSorter(rowSorter);

        rowSorter.setRowFilter(RowFilter.regexFilter(ara));
    }

    private void urunAraAlaniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_urunAraAlaniKeyReleased
        String ara = urunAraAlani.getText();

        dinamikAra(ara);
    }//GEN-LAST:event_urunAraAlaniKeyReleased

    private void urunTablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_urunTablosuMouseClicked
        mesajYazisi.setText("");

        int selectedRow = urunTablosu.getSelectedRow();

        String no = model.getValueAt(selectedRow, 0).toString();
        urunNoAlani.setText(no);

        String ad = model.getValueAt(selectedRow, 1).toString();
        urunAdiAlani.setText(ad);

        String kategoriAdi = model.getValueAt(selectedRow, 2).toString();
        int kategoriNo = urunIslemleri.kategoriNoBul(kategoriAdi);
        kategoriSecimi.setSelectedIndex(urunIslemleri.kategoriSec(kategoriNo));

        String marka = model.getValueAt(selectedRow, 3).toString();
        markaAlani.setText(marka);

        String fiyat = model.getValueAt(selectedRow, 4).toString();
        fiyatAlani.setText(fiyat);

        String stokSayisi = model.getValueAt(selectedRow, 5).toString();
        stokSayisiAlani.setText(stokSayisi);
    }//GEN-LAST:event_urunTablosuMouseClicked

    private void urunAdiAlaniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_urunAdiAlaniKeyTyped
        if (urunAdiAlani.getText().length() >= 60) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_urunAdiAlaniKeyTyped

    private void markaAlaniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_markaAlaniKeyTyped
        if (markaAlani.getText().length() >= 25) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_markaAlaniKeyTyped

    private void fiyatAlaniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fiyatAlaniKeyTyped
        char c = evt.getKeyChar();
        if (stokSayisiAlani.getText().length() >= 5 || c == KeyEvent.VK_SPACE) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_fiyatAlaniKeyTyped

    private void stokSayisiAlaniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stokSayisiAlaniKeyTyped
        char c = evt.getKeyChar();
        if ((!Character.isDigit(c) || (c == KeyEvent.VK_SPACE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_stokSayisiAlaniKeyTyped

    private void olusturButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_olusturButtonActionPerformed
        mesajYazisi.setText("");

        int no;

        if (urunNoAlani.getText().equals("")) {
            no = 0;
        } else {
            no = Integer.parseInt(urunNoAlani.getText());
        }

        if (urunIslemleri.isUrunNo(no)) {
            mesajYazisi.setText("Bu Ürün Sistemde Zaten Kayıtlı Olduğundan Yeni Bir Ürün No Oluşturamazsınız!");
            mesajYazisi.setForeground(Color.RED);
        } else {
            int urunNo = urunIslemleri.noOlustur();
            urunNoAlani.setText(String.valueOf(urunNo));
        }
    }//GEN-LAST:event_olusturButtonActionPerformed

    private void ekleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekleButtonActionPerformed
        mesajYazisi.setText("");

        if (urunNoAlani.getText().equals("")) {
            mesajYazisi.setText("Lütfen Oluştur Butonuna Tıklayarak Bir Ürün No Oluşturunuz");
            mesajYazisi.setForeground(Color.RED);
        } else if (urunAdiAlani.getText().equals("")) {
            mesajYazisi.setText("Lütfen Ürün Adını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (kategoriSecimi.getSelectedIndex() == 0) {
            mesajYazisi.setText("Lütfen Ürünün Kategorisini Seçiniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (markaAlani.getText().equals("")) {
            mesajYazisi.setText("Lütfen Ürünün Markasını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (fiyatAlani.getText().trim().equals("")) {
            mesajYazisi.setText("Lütfen Ürünün Fiyatını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (stokSayisiAlani.getText().trim().equals("")) {
            mesajYazisi.setText("Lütfen Ürünün Stok Sayısını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else {
            int no = Integer.parseInt(urunNoAlani.getText());
            String ad = urunAdiAlani.getText();
            int kategoriNo = urunIslemleri.kategoriNoSec(kategoriSecimi.getSelectedIndex());
            String kategoriAdi = urunIslemleri.kategoriAdiBul(kategoriNo);
            String marka = markaAlani.getText();
            float fiyat = urunIslemleri.fiyatDonusumuSQL(fiyatAlani.getText());
            int stokSayisi = Integer.parseInt(stokSayisiAlani.getText());

            if (urunIslemleri.isUrunNo(no) == false) {
                urunIslemleri.ekle(no, ad, kategoriAdi, kategoriNo, marka, fiyat, stokSayisi);

                urunGoruntule();

                mesajYazisi.setText(ad + " Adlı Ürün Başarıyla Eklendi.");
                mesajYazisi.setForeground(new Color(0, 226, 0));

                urunNoAlani.setText("");
                urunAdiAlani.setText("");
                kategoriSecimi.setSelectedIndex(0);
                markaAlani.setText("");
                fiyatAlani.setText("");
                stokSayisiAlani.setText("");
            } else {
                mesajYazisi.setText(ad + " Adlı Ürün Sistemde Zaten Kayıtlı!");
                mesajYazisi.setForeground(Color.RED);
            }
        }
    }//GEN-LAST:event_ekleButtonActionPerformed

    private void guncelleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleButtonActionPerformed
        mesajYazisi.setText("");

        int selectedRow = urunTablosu.getSelectedRow();

        if (selectedRow == -1) {
            if (model.getRowCount() == 0) {
                mesajYazisi.setText("Ürün Tablonuz Şu Anda Boş!");
                mesajYazisi.setForeground(Color.RED);
            } else {
                mesajYazisi.setText("Lütfen Bilgileri Güncellenecek Bir Ürün Seçiniz!");
                mesajYazisi.setForeground(Color.RED);
            }
        }

        if (urunAdiAlani.getText().equals("")) {
            mesajYazisi.setText("Lütfen Ürün Adını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (kategoriSecimi.getSelectedIndex() == 0) {
            mesajYazisi.setText("Lütfen Ürünün Kategorisini Seçiniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (markaAlani.getText().equals("")) {
            mesajYazisi.setText("Lütfen Ürünün Markasını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (fiyatAlani.getText().trim().equals("")) {
            mesajYazisi.setText("Lütfen Ürünün Fiyatını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (stokSayisiAlani.getText().trim().equals("")) {
            mesajYazisi.setText("Lütfen Ürünün Stok Sayısını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else {
            int no = Integer.parseInt(urunNoAlani.getText());
            String ad = urunAdiAlani.getText();
            int kategoriNo = urunIslemleri.kategoriNoSec(kategoriSecimi.getSelectedIndex());
            String kategoriAdi = urunIslemleri.kategoriAdiBul(kategoriNo);
            String marka = markaAlani.getText();
            float fiyat = urunIslemleri.fiyatDonusumuSQL(fiyatAlani.getText());
            int stokSayisi = Integer.parseInt(stokSayisiAlani.getText());

            urunIslemleri.guncelle(no, ad, kategoriAdi, kategoriNo, marka, fiyat, stokSayisi);

            urunGoruntule();

            mesajYazisi.setText(ad + " Adlı Ürünün Bilgileri Başarıyla Güncellendi.");
            mesajYazisi.setForeground(new Color(0, 226, 0));

            urunNoAlani.setText("");
            urunAdiAlani.setText("");
            kategoriSecimi.setSelectedIndex(0);
            markaAlani.setText("");
            fiyatAlani.setText("");
            stokSayisiAlani.setText("");
        }
    }//GEN-LAST:event_guncelleButtonActionPerformed

    private void silButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silButtonActionPerformed
        mesajYazisi.setText("");

        int selectedRow = urunTablosu.getSelectedRow();

        if (selectedRow == -1) {
            if (model.getRowCount() == 0) {
                mesajYazisi.setText("Ürün Tablonuz Şu Anda Boş!");
                mesajYazisi.setForeground(Color.RED);
            } else {
                mesajYazisi.setText("Lütfen Silinecek Bir Ürün Seçiniz!");
                mesajYazisi.setForeground(Color.RED);
            }
        } else {
            String ad = urunAdiAlani.getText();
            int no = Integer.parseInt(urunNoAlani.getText());

            urunIslemleri.sil(no);

            urunGoruntule();

            mesajYazisi.setText(ad + " Adlı Ürün Başarıyla Silindi.");
            mesajYazisi.setForeground(new Color(0, 226, 0));

            urunNoAlani.setText("");
            urunAdiAlani.setText("");
            kategoriSecimi.setSelectedIndex(0);
            markaAlani.setText("");
            fiyatAlani.setText("");
            stokSayisiAlani.setText("");
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
            java.util.logging.Logger.getLogger(UrunIslemleriEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new UrunIslemleriEkran().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator araSeparator;
    private javax.swing.JSeparator dikeySeparator;
    private javax.swing.JButton ekleButton;
    private javax.swing.JTextField fiyatAlani;
    private javax.swing.JLabel fiyatYazisi;
    private javax.swing.JPanel form;
    private javax.swing.JButton guncelleButton;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel kapamaButton;
    private javax.swing.JPanel kapamaPanel;
    private javax.swing.JComboBox<String> kategoriSecimi;
    private javax.swing.JLabel kategorisiYazisi;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField markaAlani;
    private javax.swing.JLabel markasiYazisi;
    private javax.swing.JLabel mesajYazisi;
    private javax.swing.JButton olusturButton;
    private javax.swing.JButton silButton;
    private javax.swing.JTextField stokSayisiAlani;
    private javax.swing.JLabel stokSayisiYazisi;
    private javax.swing.JTextField urunAdiAlani;
    private javax.swing.JLabel urunAdiYazisi;
    private javax.swing.JTextField urunAraAlani;
    private javax.swing.JLabel urunAraYazisi;
    private javax.swing.JLabel urunIslemleriYazisi;
    private javax.swing.JTextField urunNoAlani;
    private javax.swing.JLabel urunNoYazisi;
    private javax.swing.JLabel urunSayisiYazisi;
    private javax.swing.JTable urunTablosu;
    private javax.swing.JSeparator yataySeparator;
    // End of variables declaration//GEN-END:variables
}
