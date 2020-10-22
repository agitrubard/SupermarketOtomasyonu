package com.supermarketotomasyonu.urun;

/**
 * @author berrinkorkutata
 * @author agitrubardemir
 */
public class Urun {

    private int no;
    private String kategoriAdi;
    private int kategoriNo;
    private String ad;
    private String marka;
    private float fiyat;
    private int stokSayisi;
    private int adet;

    public Urun(int no, String kategoriAdi, int kategoriNo, String ad, String marka, float fiyat, int stokSayisi) {
        this.no = no;
        this.kategoriAdi = kategoriAdi;
        this.kategoriNo = kategoriNo;
        this.ad = ad;
        this.marka = marka;
        this.fiyat = fiyat;
        this.stokSayisi = stokSayisi;
    }
    
    public Urun(int no, String ad, int adet, float fiyat) {
        this.no = no;
        this.ad = ad;
        this.adet = adet;
        this.fiyat = fiyat;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getKategoriAdi() {
        return kategoriAdi;
    }

    public void setKategoriAdi(String kategoriAdi) {
        this.kategoriAdi = kategoriAdi;
    }

    public int getKategoriNo() {
        return kategoriNo;
    }

    public void setKategoriNo(int kategoriNo) {
        this.kategoriNo = kategoriNo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public float getFiyat() {
        return fiyat;
    }

    public void setFiyat(float fiyat) {
        this.fiyat = fiyat;
    }

    public int getStokSayisi() {
        return stokSayisi;
    }

    public void setStokSayisi(int stokSayisi) {
        this.stokSayisi = stokSayisi;
    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }
}
