package com.supermarketotomasyonu.yonetici;

import com.supermarketotomasyonu.urun.Urun;
import com.supermarketotomasyonu.urun.UrunIslemleri;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 * @author berrinkorkutata
 * @author agitrubardemir
 */
public class UrunBilgileriEkran extends javax.swing.JFrame {

    DefaultTableModel model;
    UrunIslemleri urunIslemleri = new UrunIslemleri();

    int mouseX, mouseY;

    public UrunBilgileriEkran() {
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
        urunBilgileriYazisi = new javax.swing.JLabel();
        dikeySeparator = new javax.swing.JSeparator();
        yataySeparator = new javax.swing.JSeparator();
        kapamaPanel = new javax.swing.JPanel();
        kapamaButton = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        urunTablosu = new javax.swing.JTable();
        urunAraYazisi = new javax.swing.JLabel();
        urunAraAlani = new javax.swing.JTextField();
        araSeparator = new javax.swing.JSeparator();
        urunSayisiYazisi = new javax.swing.JLabel();

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

        urunBilgileriYazisi.setFont(new java.awt.Font("SF Pro Rounded", 1, 60)); // NOI18N
        urunBilgileriYazisi.setForeground(new java.awt.Color(79, 114, 0));
        urunBilgileriYazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        urunBilgileriYazisi.setText("ÜRÜN BİLGİLERİ");

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
        urunAraYazisi.setText("Ürün Ara : ");
        urunAraYazisi.setToolTipText("");

        urunAraAlani.setBackground(new java.awt.Color(255, 255, 255));
        urunAraAlani.setFont(new java.awt.Font("SF Pro Rounded", 0, 18)); // NOI18N
        urunAraAlani.setForeground(new java.awt.Color(113, 156, 14));
        urunAraAlani.setToolTipText("Aramak istediğiniz ürünün bilgisini giriniz.");
        urunAraAlani.setBorder(null);
        urunAraAlani.setCaretColor(new java.awt.Color(79, 114, 0));
        urunAraAlani.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        urunAraAlani.setSelectionColor(new java.awt.Color(79, 114, 0));
        urunAraAlani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                urunAraAlaniKeyReleased(evt);
            }
        });

        araSeparator.setBackground(new java.awt.Color(113, 156, 14));
        araSeparator.setForeground(new java.awt.Color(113, 156, 14));
        araSeparator.setToolTipText("18,30,49");

        urunSayisiYazisi.setFont(new java.awt.Font("SF Pro Rounded", 1, 16)); // NOI18N
        urunSayisiYazisi.setForeground(new java.awt.Color(79, 114, 0));
        urunSayisiYazisi.setText("Toplam Ürün Sayısı : ");

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
                        .addComponent(urunBilgileriYazisi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kapamaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formLayout.createSequentialGroup()
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane)
                            .addComponent(yataySeparator, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 921, Short.MAX_VALUE)
                            .addGroup(formLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(urunAraYazisi)
                                    .addComponent(urunAraAlani)
                                    .addComponent(araSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(urunSayisiYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addComponent(urunBilgileriYazisi)
                        .addGap(19, 19, 19)))
                .addComponent(yataySeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(urunAraYazisi)
                .addGap(1, 1, 1)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(formLayout.createSequentialGroup()
                        .addComponent(urunAraAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(araSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(urunSayisiYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void dinamikAra(String ara) {
        TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<DefaultTableModel>(model);

        urunTablosu.setRowSorter(rowSorter);

        rowSorter.setRowFilter(RowFilter.regexFilter(ara));
    }

    private void urunAraAlaniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_urunAraAlaniKeyReleased
        String ara = urunAraAlani.getText();

        dinamikAra(ara);
    }//GEN-LAST:event_urunAraAlaniKeyReleased

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UrunBilgileriEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new UrunBilgileriEkran().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator araSeparator;
    private javax.swing.JSeparator dikeySeparator;
    private javax.swing.JPanel form;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel kapamaButton;
    private javax.swing.JPanel kapamaPanel;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField urunAraAlani;
    private javax.swing.JLabel urunAraYazisi;
    private javax.swing.JLabel urunBilgileriYazisi;
    private javax.swing.JLabel urunSayisiYazisi;
    private javax.swing.JTable urunTablosu;
    private javax.swing.JSeparator yataySeparator;
    // End of variables declaration//GEN-END:variables
}
