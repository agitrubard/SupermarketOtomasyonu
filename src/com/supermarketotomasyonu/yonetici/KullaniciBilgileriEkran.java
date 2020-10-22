package com.supermarketotomasyonu.yonetici;

import com.supermarketotomasyonu.kullanici.Kullanici;
import com.supermarketotomasyonu.kullanici.KullaniciIslemleri;
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
public class KullaniciBilgileriEkran extends javax.swing.JFrame {

    DefaultTableModel model;
    KullaniciIslemleri kullaniciIslemleri = new KullaniciIslemleri();

    int mouseX, mouseY;

    public KullaniciBilgileriEkran() {
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
        kullaniciIslemleriYazisi.setText("KULLANICI BİLGİLERİ");

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
        kullaniciTablosu.setShowGrid(false);
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
        kullaniciAraAlani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                kullaniciAraAlaniKeyReleased(evt);
            }
        });

        araSeparator.setBackground(new java.awt.Color(113, 156, 14));
        araSeparator.setForeground(new java.awt.Color(113, 156, 14));
        araSeparator.setToolTipText("18,30,49");

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
                        .addComponent(yataySeparator, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(formLayout.createSequentialGroup()
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kullaniciAraYazisi)
                            .addComponent(kullaniciAraAlani)
                            .addComponent(araSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kullaniciSayisiYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane)))
                .addContainerGap())
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
                .addGap(3, 3, 3)
                .addComponent(kullaniciAraYazisi)
                .addGap(6, 6, 6)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(formLayout.createSequentialGroup()
                        .addComponent(kullaniciAraAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(araSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kullaniciSayisiYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        int selectedRow = kullaniciTablosu.getSelectedRow();

        String adres = model.getValueAt(selectedRow, 4).toString();

        this.kullaniciTablosu.setToolTipText(adres);
    }//GEN-LAST:event_kullaniciTablosuMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KullaniciBilgileriEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new KullaniciBilgileriEkran().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator araSeparator;
    private javax.swing.JSeparator dikeySeparator;
    private javax.swing.JPanel form;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel kapamaButton;
    private javax.swing.JPanel kapamaPanel;
    private javax.swing.JTextField kullaniciAraAlani;
    private javax.swing.JLabel kullaniciAraYazisi;
    private javax.swing.JLabel kullaniciIslemleriYazisi;
    private javax.swing.JLabel kullaniciSayisiYazisi;
    private javax.swing.JTable kullaniciTablosu;
    private javax.swing.JLabel logo;
    private javax.swing.JSeparator yataySeparator;
    // End of variables declaration//GEN-END:variables
}
