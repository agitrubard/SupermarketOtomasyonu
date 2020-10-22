package com.supermarketotomasyonu.siparis;

/**
 * @author berrinkorkutata
 * @author agitrubardemir
 */
public class Siparis {

    private int no;
    private String kullaniciAdSoyad;
    private int kullaniciNo;
    private String satinAlinanUrunler;
    private float tutari;
    private String adresi;
    private String tarihi;

    public Siparis(int no, String kullaniciAdSoyad, int kullaniciNo, String satinAlinanUrunler, float tutari, String adresi, String tarihi) {
        this.no = no;
        this.kullaniciAdSoyad = kullaniciAdSoyad;
        this.kullaniciNo = kullaniciNo;
        this.satinAlinanUrunler = satinAlinanUrunler;
        this.tutari = tutari;
        this.adresi = adresi;
        this.tarihi = tarihi;
    }

    public Siparis(int no, String satinAlinanUrunler, float tutari, String adresi, String tarihi) {
        this.no = no;
        this.satinAlinanUrunler = satinAlinanUrunler;
        this.tutari = tutari;
        this.adresi = adresi;
        this.tarihi = tarihi;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getKullaniciAdSoyad() {
        return kullaniciAdSoyad;
    }

    public void setKullaniciAdSoyad(String kullaniciAdSoyad) {
        this.kullaniciAdSoyad = kullaniciAdSoyad;
    }

    public int getKullaniciNo() {
        return kullaniciNo;
    }

    public void setKullaniciNo(int kullaniciNo) {
        this.kullaniciNo = kullaniciNo;
    }

    public String getSatinAlinanUrunler() {
        return satinAlinanUrunler;
    }

    public void setSatinAlinanUrunler(String satinAlinanUrunler) {
        this.satinAlinanUrunler = satinAlinanUrunler;
    }

    public float getTutari() {
        return tutari;
    }

    public void setTutari(float tutari) {
        this.tutari = tutari;
    }

    public String getAdresi() {
        return adresi;
    }

    public void setAdresi(String adresi) {
        this.adresi = adresi;
    }

    public String getTarihi() {
        return tarihi;
    }

    public void setTarihi(String tarihi) {
        this.tarihi = tarihi;
    }
}