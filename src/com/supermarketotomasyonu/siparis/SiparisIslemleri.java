package com.supermarketotomasyonu.siparis;

import com.supermarketotomasyonu.urun.UrunIslemleri;
import com.supermarketotomasyonu.veritabani.VeritabaniIslemleri;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author berrinkorkutata
 * @author agitrubardemir
 */
public class SiparisIslemleri {

    private final Connection connection = VeritabaniIslemleri.connection;
    private Statement statement;
    private PreparedStatement preparedStatement = null;

    public ArrayList<Siparis> tumSiparisleriGetir() {

        ArrayList<Siparis> list = new ArrayList<>();

        try {
            statement = connection.createStatement();

            String sorgu = "SELECT * FROM Siparisler ORDER BY Siparisler.SiparisTarihi DESC";

            ResultSet result = statement.executeQuery(sorgu);

            while (result.next()) {
                int no = result.getInt("SiparisNo");
                String kullaniciAdSoyad = result.getString("KullaniciAdSoyad");
                int kullaniciNo = result.getInt("KullaniciNo");
                String satinAlinanUrunler = result.getString("SatinAlinanUrunler");
                float tutari = result.getFloat("SiparisTutari");
                String adresi = result.getString("SiparisAdresi");
                String tarihi = result.getString("SiparisTarihi");

                list.add(new Siparis(no, kullaniciAdSoyad, kullaniciNo, satinAlinanUrunler, tutari, adresi, tarihi));
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(SiparisIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public ArrayList<Siparis> siparisleriGetir(int kullaniciNo) {

        ArrayList<Siparis> list = new ArrayList<>();

        try {
            statement = connection.createStatement();

            String sorgu = "SELECT * FROM Siparisler WHERE KullaniciNo = " + kullaniciNo + " ORDER BY Siparisler.SiparisTarihi ASC";

            ResultSet result = statement.executeQuery(sorgu);

            while (result.next()) {
                int no = result.getInt("SiparisNo");
                String satinAlinanUrunler = result.getString("SatinAlinanUrunler");
                float tutari = result.getFloat("SiparisTutari");
                String adresi = result.getString("SiparisAdresi");
                String tarihi = result.getString("SiparisTarihi");

                list.add(new Siparis(no, satinAlinanUrunler, tutari, adresi, tarihi));
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(SiparisIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public void siparisVer(int no, String kullaniciAdSoyad, int kullaniciNo, String satinAlinanUrunler, float tutar, String adres, String tarih) {
        String sorgu = "INSERT INTO Siparisler (SiparisNo, KullaniciAdSoyad, KullaniciNo, SatinAlinanUrunler, SiparisTutari, SiparisAdresi, SiparisTarihi) VALUES (?,?,?,?,?,?,?)";
        try {
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setInt(1, no);
            preparedStatement.setString(2, kullaniciAdSoyad);
            preparedStatement.setInt(3, kullaniciNo);
            preparedStatement.setString(4, satinAlinanUrunler);
            preparedStatement.setFloat(5, tutar);
            preparedStatement.setString(6, adres);
            preparedStatement.setString(7, tarih);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SiparisIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sil(int no) {
        String sorgu = "DELETE FROM Siparisler WHERE SiparisNo = ?";

        try {
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setInt(1, no);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SiparisIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean isSiparisNo(int no) {
        try {
            String sorgu = "SELECT * FROM Siparisler WHERE SiparisNo = ?";
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setInt(1, no);

            ResultSet result = preparedStatement.executeQuery();

            return result.next();
        } catch (SQLException ex) {
            Logger.getLogger(SiparisIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public int noOlustur() {
        Random random = new Random();
        while (true) {
            int no = 1 + random.nextInt(999999998);

            if (isSiparisNo(no) == false) {
                return no;
            }
        }
    }

    public String satinAlinanUrunleriBul(String satinAlinanUrunler) {
        UrunIslemleri urunIslemleri = new UrunIslemleri();

        String[] urunlerDizi = satinAlinanUrunler.split(",");
        String satinAlinanUrunAdlari = "";

        for (String urunler : urunlerDizi) {
            String urun = urunler;
            String[] urunDizi = urun.split("-");

            String no = urunDizi[0];
            String adet = urunDizi[1];

            satinAlinanUrunAdlari += "- " + urunIslemleri.urunAdiBul(Integer.parseInt(no)) + " [" + adet + "]" + "\n";
        }

        return satinAlinanUrunAdlari;
    }

    public float toplamTutariHesapla(float toplamTutar, float urunFiyat) {
        DecimalFormat df = new DecimalFormat("####.##");
        String tutar = df.format((toplamTutar + urunFiyat));
        return Float.parseFloat(tutar);
    }

    public float tutarDonusumuSQL(String siparisTutari) {
        siparisTutari = siparisTutari.replace("₺", "");
        float tutar = Float.parseFloat(siparisTutari);
        return tutar;
    }

    public String tutarDonusumu(float siparisTutari) {
        String tutar = "₺" + String.valueOf(siparisTutari);
        tutar = tutar.replace(".", ",");
        return tutar;
    }

    public String tarihDonusumuSQL(String tarih) {
        String[] split = tarih.split("/");
        String gun = split[0];
        String ay = split[1];
        String yil = split[2];

        return yil + "-" + ay + "-" + gun;
    }

    public String tarihDonusumu(String tarih) {
        String[] split = tarih.split("-");
        String yil = split[0];
        String ay = split[1];
        String gun = split[2];

        return gun + "/" + ay + "/" + yil;
    }
}
