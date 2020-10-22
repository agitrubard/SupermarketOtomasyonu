package com.supermarketotomasyonu.calisan;

/**
 * @author berrinkorkutata
 * @author agitrubardemir
 */
public class Calisan {

    private int no;
    private String kullaniciAdi;
    private String mailAdresi;
    private String ad;
    private String soyad;
    private String departman;
    private int maas;

    public Calisan(int no, String kullaniciAdi, String mailAdresi, String ad, String soyad, String departman, int maas) {
        this.no = no;
        this.kullaniciAdi = kullaniciAdi;
        this.mailAdresi = mailAdresi;
        this.ad = ad;
        this.soyad = soyad;
        this.departman = departman;
        this.maas = maas;
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

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

}
