package com.supermarketotomasyonu.kullanici;

import com.supermarketotomasyonu.SupermarketOtomasyonu;
import com.supermarketotomasyonu.veritabani.VeritabaniIslemleri;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author berrinkorkutata
 * @author agitrubardemir
 */
public class KullaniciIslemleri {

    private final Connection connection = VeritabaniIslemleri.connection;
    private Statement statement;
    private PreparedStatement preparedStatement = null;
    public static Kullanici girisYapanKullanici;

    public KullaniciIslemleri() {
        try {
            statement = connection.createStatement();

            String sorgu = "SELECT * FROM Kullanicilar WHERE KullaniciAdi = '" + SupermarketOtomasyonu.kullaniciAdi + "'";

            ResultSet result = statement.executeQuery(sorgu);

            while (result.next()) {
                int no = result.getInt("KullaniciNo");
                String kullaniciAdi = SupermarketOtomasyonu.kullaniciAdi;
                String mailAdresi = result.getString("MailAdresi");
                String ad = result.getString("Ad");
                String soyad = result.getString("Soyad");
                String adres = result.getString("Adres");

                girisYapanKullanici = new Kullanici(no, kullaniciAdi, mailAdresi, ad, soyad, adres);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Kullanici> tumKullanicilariGetir() {
        ArrayList<Kullanici> list = new ArrayList<>();

        try {
            statement = connection.createStatement();

            String sorgu = "SELECT * FROM Kullanicilar ORDER BY Kullanicilar.Ad ASC";

            ResultSet result = statement.executeQuery(sorgu);

            while (result.next()) {
                int no = result.getInt("KullaniciNo");
                String kullaniciAdi = result.getString("KullaniciAdi");
                String mailAdresi = result.getString("MailAdresi");
                String ad = result.getString("Ad");
                String soyad = result.getString("Soyad");
                String adres = result.getString("Adres");
                list.add(new Kullanici(no, kullaniciAdi, mailAdresi, ad, soyad, adres));
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public void kayitOl(int no, String kullaniciAdi, String sifre, String mailAdresi, String ad, String soyad, String adres) {
        String sorgu = "INSERT INTO Kullanicilar (KullaniciNo, KullaniciAdi, Sifre, MailAdresi, Ad, Soyad, Adres) VALUES (?,?,?,?,?,?,?)";
        try {
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setInt(1, no);
            preparedStatement.setString(2, kullaniciAdi);
            preparedStatement.setString(3, sifre);
            preparedStatement.setString(4, mailAdresi);
            preparedStatement.setString(5, ad);
            preparedStatement.setString(6, soyad);
            preparedStatement.setString(7, adres);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void guncelle(int no, String kullaniciAdi, String mailAdresi, String ad, String soyad, String adres) {
        String sorgu;
        boolean kontrol = isKullaniciNo(no);

        if (kontrol) {
            sorgu = "UPDATE Kullanicilar SET KullaniciAdi = ? , MailAdresi = ? , Ad = ? , Soyad = ? , Adres = ? WHERE KullaniciNo = ?";
        } else {
            sorgu = "UPDATE Kullanicilar SET KullaniciNo = ? , MailAdresi = ? , Ad = ? , Soyad = ? , Adres = ? WHERE KullaniciAdi = ?";
        }

        try {
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setString(2, mailAdresi);
            preparedStatement.setString(3, ad);
            preparedStatement.setString(4, soyad);
            preparedStatement.setString(5, adres);

            if (kontrol) {
                preparedStatement.setString(1, kullaniciAdi);
                preparedStatement.setInt(6, no);
            } else {
                preparedStatement.setString(6, kullaniciAdi);
                preparedStatement.setInt(1, no);
            }

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void kisiselBilgilerGuncelle(int no, String kullaniciAdi, String mailAdresi, String ad, String soyad, String adres) {
        String sorgu = "UPDATE Kullanicilar SET KullaniciAdi = ? , MailAdresi = ? , Ad = ? , Soyad = ? , Adres = ? WHERE KullaniciNo = ?";

        try {
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setString(1, kullaniciAdi);
            preparedStatement.setString(2, mailAdresi);
            preparedStatement.setString(3, ad);
            preparedStatement.setString(4, soyad);
            preparedStatement.setString(5, adres);
            preparedStatement.setInt(6, no);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sil(int no) {
        String sorgu = "DELETE FROM Kullanicilar WHERE KullaniciNo = ?";

        try {
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setInt(1, no);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean isKullaniciNo(int no) {
        try {
            String sorgu = "SELECT * FROM Kullanicilar WHERE KullaniciNo = ?";
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setInt(1, no);

            ResultSet result = preparedStatement.executeQuery();

            return result.next();
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public int noOlustur() {
        Random random = new Random();
        while (true) {
            int no = 1 + random.nextInt(99999998);

            if (isKullaniciNo(no) == false) {
                return no;
            }
        }
    }

    public boolean isSifreDegistir(String kullaniciAdi, String mailAdresi) {
        try {
            String sorgu = "SELECT * FROM Kullanicilar WHERE KullaniciAdi = ? AND MailAdresi = ?";

            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setString(1, kullaniciAdi);
            preparedStatement.setString(2, mailAdresi);

            ResultSet result = preparedStatement.executeQuery();

            return result.next();
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public void sifreDegistir(String kullaniciAdi, String sifre) {
        try {
            String sorgu = "UPDATE Kullanicilar SET Sifre = ? WHERE KullaniciAdi = ?";

            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setString(1, sifre);
            preparedStatement.setString(2, kullaniciAdi);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
