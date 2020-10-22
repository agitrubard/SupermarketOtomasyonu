package com.supermarketotomasyonu.kullanici;

/**
 * @author berrinkorkutata
 * @author agitrubardemir
 */
public class Kullanici {

    private int no;
    private String kullaniciAdi;
    private String mailAdresi;
    private String ad;
    private String soyad;
    private String adres;

    public Kullanici(int no, String kullaniciAdi, String mailAdresi, String ad, String soyad, String adres) {
        this.no = no;
        this.kullaniciAdi = kullaniciAdi;
        this.mailAdresi = mailAdresi;
        this.ad = ad;
        this.soyad = soyad;
        this.adres = adres;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getMailAdresi() {
        return mailAdresi;
    }

    public void setMailAdresi(String mailAdresi) {
        this.mailAdresi = mailAdresi;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
}
