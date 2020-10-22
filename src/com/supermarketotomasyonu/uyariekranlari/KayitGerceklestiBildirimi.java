package com.supermarketotomasyonu.uyariekranlari;

import com.supermarketotomasyonu.KayitOlEkran;
import com.supermarketotomasyonu.SupermarketOtomasyonu;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * @author berrinkorkutata
 * @author agitrubardemir
 */
public class KayitGerceklestiBildirimi extends javax.swing.JFrame {

    int mouseX, mouseY;

    public KayitGerceklestiBildirimi() {
        initComponents();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        this.setLocation(x, y);

        siparisNumaranizYazisi.setText("KULLANICI NUMARANIZ : " + KayitOlEkran.kullaniciNo);
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
        mesajYazisi1 = new javax.swing.JLabel();

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

        tikLogo.setFont(new java.awt.Font("SF Pro Rounded", 0, 20)); // NOI18N
        tikLogo.setForeground(new java.awt.Color(79, 114, 0));
        tikLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tikLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/supermarketotomasyonu/images/tik.jpg"))); // NOI18N

        mesajYazisi.setFont(new java.awt.Font("SF Pro Rounded", 1, 40)); // NOI18N
        mesajYazisi.setForeground(new java.awt.Color(79, 114, 0));
        mesajYazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mesajYazisi.setText("BAŞARIYLA GERÇEKLEŞTİ!");

        siparisNumaranizYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 20)); // NOI18N
        siparisNumaranizYazisi.setForeground(new java.awt.Color(79, 114, 0));
        siparisNumaranizYazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        siparisNumaranizYazisi.setText("KULLANICI NUMARANIZ : ");

        bilgiYazisi.setFont(new java.awt.Font("SF Pro Rounded", 0, 14)); // NOI18N
        bilgiYazisi.setForeground(new java.awt.Color(79, 114, 0));
        bilgiYazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bilgiYazisi.setText("AnaEkrandaki giriş bölümünden \"Kullanıcı\" giriş türünü seçtikten sonra sisteme giriş yapabilirsiniz");

        mesajYazisi1.setFont(new java.awt.Font("SF Pro Rounded", 1, 40)); // NOI18N
        mesajYazisi1.setForeground(new java.awt.Color(79, 114, 0));
        mesajYazisi1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mesajYazisi1.setText("KAYIT İŞLEMİNİZ");

        javax.swing.GroupLayout formLayout = new javax.swing.GroupLayout(form);
        form.setLayout(formLayout);
        formLayout.setHorizontalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(tikLogo)
                        .addGap(10, 10, 10)
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formLayout.createSequentialGroup()
                                .addComponent(mesajYazisi1)
                                .addGap(154, 154, 154)
                                .addComponent(kapamaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(mesajYazisi)))
                    .addGroup(formLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(siparisNumaranizYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(formLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bilgiYazisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        formLayout.setVerticalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(tikLogo))
                    .addGroup(formLayout.createSequentialGroup()
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(mesajYazisi1))
                            .addComponent(kapamaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(mesajYazisi)))
                .addGap(20, 20, 20)
                .addComponent(siparisNumaranizYazisi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(bilgiYazisi)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            java.util.logging.Logger.getLogger(KayitGerceklestiBildirimi.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new KayitGerceklestiBildirimi().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bilgiYazisi;
    private javax.swing.JPanel form;
    private javax.swing.JLabel kapamaButton;
    private javax.swing.JPanel kapamaPanel;
    private javax.swing.JLabel mesajYazisi;
    private javax.swing.JLabel mesajYazisi1;
    private javax.swing.JLabel siparisNumaranizYazisi;
    private javax.swing.JLabel tikLogo;
    // End of variables declaration//GEN-END:variables
}
