package com.supermarketotomasyonu.kullanici;

import static com.supermarketotomasyonu.kullanici.AlisverisYapEkran.sepetList;
import com.supermarketotomasyonu.uyariekranlari.SiparisVerildiBildirimi;
import com.supermarketotomasyonu.siparis.SiparisIslemleri;
import com.supermarketotomasyonu.urun.Urun;
import com.supermarketotomasyonu.urun.UrunIslemleri;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 * @author berrinkorkutata
 * @author agitrubardemir
 */
public class SepetEkran extends javax.swing.JFrame {

    UrunIslemleri urunIslemleri = new UrunIslemleri();
    SiparisIslemleri siparisIslemleri = new SiparisIslemleri();
    KullaniciIslemleri kullaniciIslemleri = new KullaniciIslemleri();
    public static int siparisNo;

    DefaultTableModel model;
    public static ArrayList<Urun> sepet = new ArrayList<>();

    int mouseX, mouseY;

    public SepetEkran() {
        initComponents();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        this.setLocation(x, y);

        model = (DefaultTableModel) sepetTablosu.getModel();
        urunGoruntule();
    }

    public void urunGoruntule() {
        model.setRowCount(0);

        int urunSayisi = 0;
        float toplamTutar = 0;

        if (sepet != null) {
            for (Urun urun : sepet) {
                String no = String.valueOf(urun.getNo());
                String ad = urun.getAd();
                int adet = urun.getAdet();
                float fiyat = urun.getFiyat();
                float urunTutari = urunIslemleri.urunTutariHesapla(adet, fiyat);
                String tutar = urunIslemleri.fiyatDonusumu(urunTutari);
                Object[] eklenecek = {no, ad, adet, tutar};

                model.addRow(eklenecek);
                urunSayisi += adet;

                toplamTutar = siparisIslemleri.toplamTutariHesapla(toplamTutar, urunTutari);
            }
            toplamTutarYazisi.setText("Toplam Tutar : " + siparisIslemleri.tutarDonusumu(toplamTutar));
            urunSayisiYazisi.setText("Toplam Ürün Sayısı : " + urunSayisi);
        }
    }

    private String gununTarihiSQL() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime ldt = LocalDateTime.now();
        return dtf.format(ldt);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        form = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        alisverisSepetiYazisi = new javax.swing.JLabel();
        dikeySeparator = new javax.swing.JSeparator();
        yataySeparator = new javax.swing.JSeparator();
        kapamaPanel = new javax.swing.JPanel();
        kapamaButton = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        sepetTablosu = new javax.swing.JTable();
        siparisVerButton = new javax.swing.JButton();
        silButton = new javax.swing.JButton();
        toplamTutarYazisi = new javax.swing.JLabel();
        urunSayisiYazisi = new javax.swing.JLabel();
        mesajYazisi = new javax.swing.JLabel();
        adetArttirButton = new javax.swing.JButton();
        adetAzaltButton = new javax.swing.JButton();
        geriGitPanel = new javax.swing.JPanel();
        geriGitButton = new javax.swing.JLabel();

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

        alisverisSepetiYazisi.setFont(new java.awt.Font("SF Pro Rounded", 1, 60)); // NOI18N
        alisverisSepetiYazisi.setForeground(new java.awt.Color(79, 114, 0));
        alisverisSepetiYazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alisverisSepetiYazisi.setText("ALIŞVERİŞ SEPETİ");

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
            .addComponent(kapamaButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kapamaPanelLayout.setVerticalGroup(
            kapamaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kapamaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sepetTablosu.setBackground(new java.awt.Color(255, 255, 255));
        sepetTablosu.setFont(new java.awt.Font("SF Pro Rounded", 0, 14)); // NOI18N
        sepetTablosu.setForeground(new java.awt.Color(113, 156, 14));
        sepetTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ürün No", "Ürün Adı", "Adet", "Tutar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sepetTablosu.setSelectionBackground(new java.awt.Color(79, 114, 0));
        sepetTablosu.setSelectionForeground(new java.awt.Color(255, 255, 255));
        sepetTablosu.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        sepetTablosu.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane.setViewportView(sepetTablosu);
        if (sepetTablosu.getColumnModel().getColumnCount() > 0) {
            sepetTablosu.getColumnModel().getColumn(0).setResizable(false);
            sepetTablosu.getColumnModel().getColumn(0).setPreferredWidth(100);
            sepetTablosu.getColumnModel().getColumn(1).setResizable(false);
            sepetTablosu.getColumnModel().getColumn(1).setPreferredWidth(500);
            sepetTablosu.getColumnModel().getColumn(2).setResizable(false);
            sepetTablosu.getColumnModel().getColumn(3).setResizable(false);
        }

        siparisVerButton.setBackground(new java.awt.Color(113, 156, 14));
        siparisVerButton.setFont(new java.awt.Font("SF Pro Rounded", 1, 20)); // NOI18N
        siparisVerButton.setForeground(new java.awt.Color(255, 255, 255));
        siparisVerButton.setText("SİPARİŞ VER");
        siparisVerButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        siparisVerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        siparisVerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siparisVerButtonActionPerformed(evt);
            }
        });

        silButton.setBackground(new java.awt.Color(113, 156, 14));
        silButton.setFont(new java.awt.Font("SF Pro Rounded", 1, 20)); // NOI18N
        silButton.setForeground(new java.awt.Color(255, 255, 255));
        silButton.setText("SEPETTEN SİL");
        silButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        silButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        silButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silButtonActionPerformed(evt);
            }
        });

        toplamTutarYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 20)); // NOI18N
        toplamTutarYazisi.setForeground(new java.awt.Color(79, 114, 0));
        toplamTutarYazisi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        toplamTutarYazisi.setText("TOPLAM TUTAR :  ₺0");
        toplamTutarYazisi.setToolTipText("");

        urunSayisiYazisi.setFont(new java.awt.Font("SF Pro Rounded", 1, 16)); // NOI18N
        urunSayisiYazisi.setForeground(new java.awt.Color(79, 114, 0));
        urunSayisiYazisi.setText("Toplam Ürün Sayısı : ");

        mesajYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 16)); // NOI18N
        mesajYazisi.setForeground(new java.awt.Color(0, 0, 0));

        adetArttirButton.setBackground(new java.awt.Color(113, 156, 14));
        adetArttirButton.setFont(new java.awt.Font("SF Pro Rounded", 1, 20)); // NOI18N
        adetArttirButton.setForeground(new java.awt.Color(255, 255, 255));
        adetArttirButton.setText("+");
        adetArttirButton.setToolTipText("Ürünün adetini arttırmak için tıklayın.");
        adetArttirButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        adetArttirButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adetArttirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adetArttirButtonActionPerformed(evt);
            }
        });

        adetAzaltButton.setBackground(new java.awt.Color(113, 156, 14));
        adetAzaltButton.setFont(new java.awt.Font("SF Pro Rounded", 1, 20)); // NOI18N
        adetAzaltButton.setForeground(new java.awt.Color(255, 255, 255));
        adetAzaltButton.setText("-");
        adetAzaltButton.setToolTipText("Ürünün adetini azaltmak için tıklayın.");
        adetAzaltButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        adetAzaltButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adetAzaltButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adetAzaltButtonActionPerformed(evt);
            }
        });

        geriGitPanel.setBackground(new java.awt.Color(255, 255, 255));
        geriGitPanel.setForeground(new java.awt.Color(255, 255, 255));

        geriGitButton.setFont(new java.awt.Font("SF Pro Rounded", 1, 32)); // NOI18N
        geriGitButton.setForeground(new java.awt.Color(255, 255, 255));
        geriGitButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        geriGitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/supermarketotomasyonu/images/geri.png"))); // NOI18N
        geriGitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geriGitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriGitButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout geriGitPanelLayout = new javax.swing.GroupLayout(geriGitPanel);
        geriGitPanel.setLayout(geriGitPanelLayout);
        geriGitPanelLayout.setHorizontalGroup(
            geriGitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(geriGitButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        geriGitPanelLayout.setVerticalGroup(
            geriGitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(geriGitButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout formLayout = new javax.swing.GroupLayout(form);
        form.setLayout(formLayout);
        formLayout.setHorizontalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addComponent(geriGitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(logo)
                .addGap(8, 8, 8)
                .addComponent(dikeySeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alisverisSepetiYazisi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kapamaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(formLayout.createSequentialGroup()
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(yataySeparator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(formLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane)
                            .addGroup(formLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(mesajYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(urunSayisiYazisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(5, 5, 5))
                            .addGroup(formLayout.createSequentialGroup()
                                .addComponent(adetArttirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(silButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(adetAzaltButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                .addComponent(siparisVerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(toplamTutarYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        formLayout.setVerticalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formLayout.createSequentialGroup()
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(geriGitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kapamaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logo)
                            .addComponent(dikeySeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
                                .addComponent(alisverisSepetiYazisi)
                                .addGap(20, 20, 20)))
                        .addGap(7, 7, 7)))
                .addComponent(yataySeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adetArttirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(silButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(siparisVerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(toplamTutarYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(adetAzaltButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
            .addComponent(form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kapamaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kapamaButtonMouseClicked
        KullaniciEkran kullaniciEkran = new KullaniciEkran();
        kullaniciEkran.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_kapamaButtonMouseClicked

    private void geriGitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriGitButtonMouseClicked
        AlisverisYapEkran alisverisYapEkran = new AlisverisYapEkran();
        alisverisYapEkran.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_geriGitButtonMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int kordinatX = evt.getXOnScreen();
        int kordinatY = evt.getYOnScreen();

        this.setLocation(kordinatX - mouseX, kordinatY - mouseY);
    }//GEN-LAST:event_formMouseDragged

    private void adetArttirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adetArttirButtonActionPerformed
        mesajYazisi.setText("");

        int selectedRow = sepetTablosu.getSelectedRow();

        String no = model.getValueAt(selectedRow, 0).toString();
        if (selectedRow == -1) {
            if (model.getRowCount() == 0) {
                mesajYazisi.setText("Sepetiniz Şu Anda Boş!");
                mesajYazisi.setForeground(Color.RED);
            } else {
                mesajYazisi.setText("Lütfen Sepetinizden Adeti Arttırılacak Ürünü Seçiniz!");
                mesajYazisi.setForeground(Color.RED);
            }
        } else {
            for (Urun urun : sepetList) {
                if (urun.getNo() == Integer.parseInt(no)) {
                    urun.setAdet(urun.getAdet() + 1);
                }
            }

            urunGoruntule();

            mesajYazisi.setText("Ürün Adeti Arttırıldı.");
            mesajYazisi.setForeground(new Color(0, 226, 0));
        }
    }//GEN-LAST:event_adetArttirButtonActionPerformed

    private void silButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silButtonActionPerformed
        mesajYazisi.setText("");

        int selectedRow = sepetTablosu.getSelectedRow();

        if (selectedRow == -1) {
            if (model.getRowCount() == 0) {
                mesajYazisi.setText("Sepetiniz Şu Anda Boş!");
                mesajYazisi.setForeground(Color.RED);
            } else {
                mesajYazisi.setText("Lütfen Sepetinizden Silinecek Ürünü Seçiniz!");
                mesajYazisi.setForeground(Color.RED);
            }
        } else {
            sepet.remove(selectedRow);

            urunGoruntule();

            mesajYazisi.setText("Ürün Sepetinizden Silindi.");
            mesajYazisi.setForeground(new Color(0, 226, 0));
        }
    }//GEN-LAST:event_silButtonActionPerformed

    private void adetAzaltButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adetAzaltButtonActionPerformed
        mesajYazisi.setText("");

        int selectedRow = sepetTablosu.getSelectedRow();

        String no = model.getValueAt(selectedRow, 0).toString();

        if (selectedRow == -1) {
            if (model.getRowCount() == 0) {
                mesajYazisi.setText("Sepetiniz Şu Anda Boş!");
                mesajYazisi.setForeground(Color.RED);
            } else {
                mesajYazisi.setText("Lütfen Sepetinizden Adeti Azaltılacak Ürünü Seçiniz!");
                mesajYazisi.setForeground(Color.RED);
            }
        } else {
            for (Urun urun : sepetList) {
                if (urun.getNo() == Integer.parseInt(no)) {
                    if (urun.getAdet() == 1) {
                        sepet.remove(selectedRow);

                        urunGoruntule();

                        mesajYazisi.setText("Ürün Sepetinizden Silindi.");
                        mesajYazisi.setForeground(new Color(0, 226, 0));
                    } else {
                        urun.setAdet(urun.getAdet() - 1);

                        urunGoruntule();

                        mesajYazisi.setText("Ürün Adeti Azaltıldı.");
                        mesajYazisi.setForeground(new Color(0, 226, 0));
                    }
                }
            }
        }
    }//GEN-LAST:event_adetAzaltButtonActionPerformed

    private void siparisVerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siparisVerButtonActionPerformed
        model.setRowCount(0);

        if (sepet != null) {
            String satinAlinanUrunler = "";
            float siparisTutari = 0;
            for (Urun urun : sepet) {
                int urunNo = urun.getNo();
                int adet = urun.getAdet();
                satinAlinanUrunler += urunNo + "-" + adet + ",";
                urunIslemleri.stokSayisiniGuncelle(urunNo, adet);
                float urunTutari = (adet * urun.getFiyat());
                siparisTutari += urunTutari;
            }

            if (siparisTutari != 0) {
                int no = siparisIslemleri.noOlustur();
                String kullaniciAdSoyad = KullaniciIslemleri.girisYapanKullanici.getAd() + " " + KullaniciIslemleri.girisYapanKullanici.getSoyad();
                int kullaniciNo = KullaniciIslemleri.girisYapanKullanici.getNo();
                String adres = KullaniciIslemleri.girisYapanKullanici.getAdres();
                String tarih = gununTarihiSQL();

                siparisIslemleri.siparisVer(no, kullaniciAdSoyad, kullaniciNo, satinAlinanUrunler, siparisTutari, adres, tarih);

                siparisNo = no;
                SiparisVerildiBildirimi siparisVerildiBildirimEkran = new SiparisVerildiBildirimi();
                siparisVerildiBildirimEkran.setVisible(true);

                toplamTutarYazisi.setText("Toplam Tutar : ₺0");
                urunSayisiYazisi.setText("Toplam Ürün Sayısı : 0");

                sepet.removeAll(sepet);

                setVisible(false);
            } else {
                mesajYazisi.setText("Alışveriş Sepetiniz Boş Olduğundan Sipariş Veremezsiniz!");
                mesajYazisi.setForeground(Color.RED);
            }

        } else {
            mesajYazisi.setText("Alışveriş Sepetiniz Boş Olduğundan Sipariş Veremezsiniz!");
            mesajYazisi.setForeground(Color.RED);
        }
    }//GEN-LAST:event_siparisVerButtonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SepetEkran.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new SepetEkran().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adetArttirButton;
    private javax.swing.JButton adetAzaltButton;
    private javax.swing.JLabel alisverisSepetiYazisi;
    private javax.swing.JSeparator dikeySeparator;
    private javax.swing.JPanel form;
    private javax.swing.JLabel geriGitButton;
    private javax.swing.JPanel geriGitPanel;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel kapamaButton;
    private javax.swing.JPanel kapamaPanel;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel mesajYazisi;
    private javax.swing.JTable sepetTablosu;
    private javax.swing.JButton silButton;
    private javax.swing.JButton siparisVerButton;
    private javax.swing.JLabel toplamTutarYazisi;
    private javax.swing.JLabel urunSayisiYazisi;
    private javax.swing.JSeparator yataySeparator;
    // End of variables declaration//GEN-END:variables
}
