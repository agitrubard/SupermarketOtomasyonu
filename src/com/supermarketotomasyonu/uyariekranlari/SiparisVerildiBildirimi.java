package com.supermarketotomasyonu.uyariekranlari;

import com.supermarketotomasyonu.kullanici.KullaniciEkran;
import com.supermarketotomasyonu.kullanici.SepetEkran;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * @author berrinkorkutata
 * @author agitrubardemir
 */
public class SiparisVerildiBildirimi extends javax.swing.JFrame {

    int mouseX, mouseY;

    public SiparisVerildiBildirimi() {
        initComponents();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        this.setLocation(x, y);

        siparisNumaranizYazisi.setText("SİPARİŞ NUMARANIZ : " + SepetEkran.siparisNo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        form = new javax.swing.JPanel();
        kapamaPanel = new javax.swing.JPanel();
        kapamaButton = new javax.swing.JLabel();
        tikLogo = new javax.swing.JLabel();
        mesajYazisi = new javax.swing.JLabel();
        siparisNumaranizYazisi = new javax.swing.JLabel();
        bilgiYazisi = new javax.swing.JLabel();
        tesekkurYazisi = new javax.swing.JLabel();

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
        form.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kapamaPanel.setBackground(java.awt.Color.red);
        kapamaPanel.setForeground(new java.awt.Color(255, 255, 255));

        kapamaButton.setFont(new java.awt.Font("SF Pro Rounded", 1, 32)); // NOI18N
        kapamaButton.setForeground(new java.awt.Color(255, 255, 255));
        kapamaButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kapamaButton.setText("X");
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

        form.add(kapamaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, -1, -1));

        tikLogo.setFont(new java.awt.Font("SF Pro Rounded", 0, 20)); // NOI18N
        tikLogo.setForeground(new java.awt.Color(79, 114, 0));
        tikLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tikLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/supermarketotomasyonu/images/tik.jpg"))); // NOI18N
        form.add(tikLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        mesajYazisi.setFont(new java.awt.Font("SF Pro Rounded", 1, 40)); // NOI18N
        mesajYazisi.setForeground(new java.awt.Color(79, 114, 0));
        mesajYazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mesajYazisi.setText("SİPARİŞİNİZ VERİLMİŞTİR!");
        form.add(mesajYazisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        siparisNumaranizYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 20)); // NOI18N
        siparisNumaranizYazisi.setForeground(new java.awt.Color(79, 114, 0));
        siparisNumaranizYazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        siparisNumaranizYazisi.setText("SİPARİŞ NUMARANIZ : ");
        form.add(siparisNumaranizYazisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 380, -1));

        bilgiYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 14)); // NOI18N
        bilgiYazisi.setForeground(new java.awt.Color(79, 114, 0));
        bilgiYazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bilgiYazisi.setText("Siparişlerinizi AnaEkrandaki \"Verdiğim Siparişler\" butonuna tıklayarak görüntüleyebilirsiniz.");
        form.add(bilgiYazisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        tesekkurYazisi.setFont(new java.awt.Font("SF Pro Rounded", 2, 18)); // NOI18N
        tesekkurYazisi.setForeground(new java.awt.Color(113, 156, 14));
        tesekkurYazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tesekkurYazisi.setText("Bizi tercih ettiğiniz için teşekkür ederiz.");
        form.add(tesekkurYazisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(form, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(form, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kapamaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kapamaButtonMouseClicked
        KullaniciEkran kullaniciEkran = new KullaniciEkran();
        kullaniciEkran.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_kapamaButtonMouseClicked

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int kordinatX = evt.getXOnScreen();
        int kordinatY = evt.getYOnScreen();

        this.setLocation(kordinatX - mouseX, kordinatY - mouseY);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_formMousePressed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SiparisVerildiBildirimi.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SiparisVerildiBildirimi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bilgiYazisi;
    private javax.swing.JPanel form;
    private javax.swing.JLabel kapamaButton;
    private javax.swing.JPanel kapamaPanel;
    private javax.swing.JLabel mesajYazisi;
    private javax.swing.JLabel siparisNumaranizYazisi;
    private javax.swing.JLabel tesekkurYazisi;
    private javax.swing.JLabel tikLogo;
    // End of variables declaration//GEN-END:variables
}
