package com.supermarketotomasyonu.calisan;

import com.supermarketotomasyonu.siparis.Siparis;
import com.supermarketotomasyonu.siparis.SiparisIslemleri;
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
public class VerilenSiparislerEkran extends javax.swing.JFrame {

    DefaultTableModel model;
    SiparisIslemleri siparisIslemleri = new SiparisIslemleri();

    int mouseX, mouseY;

    public VerilenSiparislerEkran() {
        initComponents();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        this.setLocation(x, y);

        model = (DefaultTableModel) siparisTablosu.getModel();

        siparisGoruntule();
    }

    public void siparisGoruntule() {
        model.setRowCount(0);

        ArrayList<Siparis> siparisler = new ArrayList<>();

        int siparisSayisi = 0;

        siparisler = siparisIslemleri.tumSiparisleriGetir();

        if (siparisler != null) {
            for (Siparis siparis : siparisler) {
                int no = siparis.getNo();
                String kullaniciAdSoyad = siparis.getKullaniciAdSoyad();
                String satinAlinanUrunler = siparisIslemleri.satinAlinanUrunleriBul(siparis.getSatinAlinanUrunler());
                String tutar = siparisIslemleri.tutarDonusumu(siparis.getTutari());
                String adres = siparis.getAdresi();
                String tarih = siparisIslemleri.tarihDonusumu(siparis.getTarihi());

                Object[] eklenecek = {no, kullaniciAdSoyad, satinAlinanUrunler, adres, tutar, tarih};

                model.addRow(eklenecek);
                siparisSayisi++;
            }
            siparisSayisiYazisi.setText("Toplam Sipariş Sayısı : " + siparisSayisi);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        form = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        verdigimSiparislerYazisi = new javax.swing.JLabel();
        dikeySeparator = new javax.swing.JSeparator();
        yataySeparator = new javax.swing.JSeparator();
        kapamaPanel = new javax.swing.JPanel();
        kapamaButton = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        siparisTablosu = new javax.swing.JTable();
        urunAraYazisi = new javax.swing.JLabel();
        siparisAraAlani = new javax.swing.JTextField();
        araSeparator = new javax.swing.JSeparator();
        siparisSayisiYazisi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        form.setBackground(new java.awt.Color(255, 255, 255));
        form.setToolTipText("");
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

        verdigimSiparislerYazisi.setFont(new java.awt.Font("SF Pro Rounded", 1, 60)); // NOI18N
        verdigimSiparislerYazisi.setForeground(new java.awt.Color(79, 114, 0));
        verdigimSiparislerYazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        verdigimSiparislerYazisi.setText("VERİLEN SİPARİŞLER");

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

        siparisTablosu.setBackground(new java.awt.Color(255, 255, 255));
        siparisTablosu.setFont(new java.awt.Font("SF Pro Rounded", 0, 14)); // NOI18N
        siparisTablosu.setForeground(new java.awt.Color(113, 156, 14));
        siparisTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sipariş No", "Kullanıcı Ad Soyad", "Satın Alınan Ürünler", "Sipariş Adresi", "Sipariş Tutarı", "Sipariş Tarihi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        siparisTablosu.setSelectionBackground(new java.awt.Color(79, 114, 0));
        siparisTablosu.setSelectionForeground(new java.awt.Color(255, 255, 255));
        siparisTablosu.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        siparisTablosu.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        siparisTablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                siparisTablosuMouseClicked(evt);
            }
        });
        jScrollPane.setViewportView(siparisTablosu);
        if (siparisTablosu.getColumnModel().getColumnCount() > 0) {
            siparisTablosu.getColumnModel().getColumn(0).setResizable(false);
            siparisTablosu.getColumnModel().getColumn(0).setPreferredWidth(100);
            siparisTablosu.getColumnModel().getColumn(1).setResizable(false);
            siparisTablosu.getColumnModel().getColumn(1).setPreferredWidth(200);
            siparisTablosu.getColumnModel().getColumn(2).setResizable(false);
            siparisTablosu.getColumnModel().getColumn(2).setPreferredWidth(600);
            siparisTablosu.getColumnModel().getColumn(3).setResizable(false);
            siparisTablosu.getColumnModel().getColumn(3).setPreferredWidth(300);
            siparisTablosu.getColumnModel().getColumn(4).setResizable(false);
            siparisTablosu.getColumnModel().getColumn(4).setPreferredWidth(120);
            siparisTablosu.getColumnModel().getColumn(5).setResizable(false);
            siparisTablosu.getColumnModel().getColumn(5).setPreferredWidth(120);
        }

        urunAraYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 14)); // NOI18N
        urunAraYazisi.setForeground(new java.awt.Color(113, 156, 14));
        urunAraYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        urunAraYazisi.setText("Sipariş Ara : ");
        urunAraYazisi.setToolTipText("");

        siparisAraAlani.setBackground(new java.awt.Color(255, 255, 255));
        siparisAraAlani.setFont(new java.awt.Font("SF Pro Rounded", 0, 18)); // NOI18N
        siparisAraAlani.setForeground(new java.awt.Color(113, 156, 14));
        siparisAraAlani.setToolTipText("Aramak istediğiniz siparişin bilgisini giriniz.");
        siparisAraAlani.setBorder(null);
        siparisAraAlani.setCaretColor(new java.awt.Color(79, 114, 0));
        siparisAraAlani.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        siparisAraAlani.setSelectionColor(new java.awt.Color(79, 114, 0));
        siparisAraAlani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                siparisAraAlaniKeyReleased(evt);
            }
        });

        araSeparator.setBackground(new java.awt.Color(113, 156, 14));
        araSeparator.setForeground(new java.awt.Color(113, 156, 14));
        araSeparator.setToolTipText("18,30,49");

        siparisSayisiYazisi.setFont(new java.awt.Font("SF Pro Rounded", 1, 16)); // NOI18N
        siparisSayisiYazisi.setForeground(new java.awt.Color(79, 114, 0));
        siparisSayisiYazisi.setText("Toplam Sipariş Sayısı : ");

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
                        .addComponent(verdigimSiparislerYazisi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 429, Short.MAX_VALUE)
                        .addComponent(kapamaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formLayout.createSequentialGroup()
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yataySeparator, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(formLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(urunAraYazisi)
                                    .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(siparisAraAlani)
                                        .addComponent(araSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(siparisSayisiYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane))
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
                        .addComponent(verdigimSiparislerYazisi)
                        .addGap(19, 19, 19)))
                .addComponent(yataySeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(urunAraYazisi)
                .addGap(1, 1, 1)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(formLayout.createSequentialGroup()
                        .addComponent(siparisAraAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(araSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(siparisSayisiYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void dinamikAra(String ara) {
        TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<DefaultTableModel>(model);

        siparisTablosu.setRowSorter(rowSorter);

        rowSorter.setRowFilter(RowFilter.regexFilter(ara));
    }

    private void siparisAraAlaniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_siparisAraAlaniKeyReleased
        String ara = siparisAraAlani.getText();

        dinamikAra(ara);
    }//GEN-LAST:event_siparisAraAlaniKeyReleased

    private void siparisTablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siparisTablosuMouseClicked
        int selectedRow = siparisTablosu.getSelectedRow();
        int selectedColumn = siparisTablosu.getSelectedColumn();

        String text = model.getValueAt(selectedRow, selectedColumn).toString();

        this.siparisTablosu.setToolTipText(text);
    }//GEN-LAST:event_siparisTablosuMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerilenSiparislerEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new VerilenSiparislerEkran().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator araSeparator;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JSeparator dikeySeparator;
    private javax.swing.JPanel form;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel kapamaButton;
    private javax.swing.JPanel kapamaPanel;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField siparisAraAlani;
    private javax.swing.JLabel siparisSayisiYazisi;
    private javax.swing.JTable siparisTablosu;
    private javax.swing.JLabel urunAraYazisi;
    private javax.swing.JLabel verdigimSiparislerYazisi;
    private javax.swing.JSeparator yataySeparator;
    // End of variables declaration//GEN-END:variables
}
