package com.supermarketotomasyonu.urun;

import com.supermarketotomasyonu.veritabani.VeritabaniIslemleri;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author berrinkorkutata
 * @author agitrubardemir
 */
public class UrunIslemleri {

    private final Connection connection = VeritabaniIslemleri.connection;
    private Statement statement;
    private PreparedStatement preparedStatement = null;

    public ArrayList<Urun> tumUrunleriGetir() {
        ArrayList<Urun> list = new ArrayList<>();

        try {
            statement = connection.createStatement();

            String sorgu = "SELECT * FROM Urunler ORDER BY Urunler.KategoriAdi ASC";

            ResultSet result = statement.executeQuery(sorgu);

            while (result.next()) {
                int no = result.getInt("UrunNo");
                String kategoriAdi = result.getString("KategoriAdi");
                int kategoriNo = result.getInt("KategoriNo");
                String ad = result.getString("Ad");
                String marka = result.getString("Marka");
                float fiyat = result.getFloat("Fiyat");
                int stokSayisi = result.getInt("StokSayisi");

                list.add(new Urun(no, kategoriAdi, kategoriNo, ad, marka, fiyat, stokSayisi));
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(UrunIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public void ekle(int no, String ad, String kategoriAdi, int kategoriNo, String marka, float fiyat, int stokSayisi) {
        String sorgu = "INSERT INTO Urunler (UrunNo, Ad, KategoriAdi, KategoriNo, Marka, Fiyat, StokSayisi) VALUES (?,?,?,?,?,?,?)";
        try {
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setInt(1, no);
            preparedStatement.setString(2, ad);
            preparedStatement.setString(3, kategoriAdi);
            preparedStatement.setInt(4, kategoriNo);
            preparedStatement.setString(5, marka);
            preparedStatement.setFloat(6, fiyat);
            preparedStatement.setInt(7, stokSayisi);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UrunIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void guncelle(int no, String ad, String kategoriAdi, int kategoriNo, String marka, float fiyat, int stokSayisi) {
        String sorgu = "UPDATE Urunler SET Ad = ? , KategoriAdi = ? , KategoriNo = ? , Marka = ? , Fiyat = ? , StokSayisi = ? WHERE UrunNo = ?";

        try {
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, kategoriAdi);
            preparedStatement.setInt(3, kategoriNo);
            preparedStatement.setString(4, marka);
            preparedStatement.setFloat(5, fiyat);
            preparedStatement.setInt(6, stokSayisi);
            preparedStatement.setInt(7, no);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UrunIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int stokSayisiBul(int no) {
        try {
            statement = connection.createStatement();

            String sorgu = "SELECT StokSayisi FROM Urunler WHERE UrunNo = " + no;

            ResultSet result = statement.executeQuery(sorgu);

            while (result.next()) {
                int stokSayisi = result.getInt("StokSayisi");
                return stokSayisi;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UrunIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        return 0;

    }

    public void stokSayisiniGuncelle(int no, int adet) {
        String sorgu = "UPDATE Urunler SET StokSayisi = ? WHERE UrunNo = ?";

        try {
            preparedStatement = connection.prepareStatement(sorgu);

            int stokSayisi = stokSayisiBul(no);
            stokSayisi -= adet;

            preparedStatement.setInt(1, stokSayisi);
            preparedStatement.setInt(2, no);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UrunIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sil(int no) {
        String sorgu = "DELETE FROM Urunler WHERE UrunNo = ?";

        try {
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setInt(1, no);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UrunIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean isUrunNo(int no) {
        try {
            String sorgu = "SELECT * FROM Urunler WHERE UrunNo = ?";
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setInt(1, no);

            ResultSet result = preparedStatement.executeQuery();

            return result.next();
        } catch (SQLException ex) {
            Logger.getLogger(UrunIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public int noOlustur() {
        Random random = new Random();
        while (true) {
            int no = 1 + random.nextInt(999999998);

            if (isUrunNo(no) == false) {
                return no;
            }
        }
    }

    public String urunAdiBul(int urunNo) {
        try {
            statement = connection.createStatement();

            String sorgu = "SELECT Ad FROM Urunler WHERE UrunNo = " + urunNo;

            ResultSet result = statement.executeQuery(sorgu);

            while (result.next()) {
                String urunAdi = result.getString("Ad");
                return urunAdi;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UrunIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return null;
    }

    public int kategoriNoBul(String kategoriAdi) {
        try {
            statement = connection.createStatement();

            String sorgu = "SELECT * FROM Kategoriler WHERE KategoriAdi = '" + kategoriAdi + "'";

            ResultSet result = statement.executeQuery(sorgu);

            while (result.next()) {
                int kategoriNo = result.getInt("KategoriNo");
                return kategoriNo;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UrunIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        return 0;
    }

    public String kategoriAdiBul(int kategoriNo) {
        try {
            statement = connection.createStatement();

            String sorgu = "SELECT * FROM Kategoriler WHERE KategoriNo = " + kategoriNo;

            ResultSet result = statement.executeQuery(sorgu);

            while (result.next()) {
                String kategoriAdi = result.getString("KategoriAdi");
                return kategoriAdi;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UrunIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return null;
    }

    public int kategoriSec(int kategoriNo) {
        switch (kategoriNo) {
            case 45125:
                return 1;
            case 45582:
                return 2;
            case 78963:
                return 3;
            case 36458:
                return 4;
            case 68429:
                return 5;
            case 94671:
                return 6;
            case 48652:
                return 7;
            case 85345:
                return 8;
            case 12547:
                return 9;
            case 24796:
                return 10;
        }
        return 0;
    }

    public int kategoriNoSec(int kategoriSecimi) {
        switch (kategoriSecimi) {
            case 1:
                return 45125;
            case 2:
                return 45582;
            case 3:
                return 78963;
            case 4:
                return 36458;
            case 5:
                return 68429;
            case 6:
                return 94671;
            case 7:
                return 48652;
            case 8:
                return 85345;
            case 9:
                return 12547;
            case 10:
                return 24796;
        }
        return 0;
    }

    public float urunTutariHesapla(int adet, float fiyat) {
        DecimalFormat df = new DecimalFormat("####.##");
        String tutar = df.format((adet * fiyat));
        return Float.parseFloat(tutar);
    }

    public float fiyatDonusumuSQL(String urunFiyati) {
        urunFiyati = urunFiyati.replace("₺", "");
        urunFiyati = urunFiyati.replace(",", ".");
        float tutar = Float.parseFloat(urunFiyati);
        return tutar;
    }

    public String fiyatDonusumu(float urunFiyati) {
        String tutar = "₺" + String.valueOf(urunFiyati);
        tutar = tutar.replace(".", ",");
        return tutar;
    }
}
