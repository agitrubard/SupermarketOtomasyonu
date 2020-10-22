package com.supermarketotomasyonu.yonetici;

import com.supermarketotomasyonu.SupermarketOtomasyonu;
import com.supermarketotomasyonu.veritabani.VeritabaniIslemleri;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author berrinkorkutata
 * @author agitrubardemir
 */
public class YoneticiIslemleri {

    private final Connection connection = VeritabaniIslemleri.connection;
    private Statement statement;
    private PreparedStatement preparedStatement = null;
    public static Yonetici girisYapanYonetici;

    public YoneticiIslemleri() {
        try {
            statement = connection.createStatement();

            String sorgu = "SELECT * FROM Yoneticiler WHERE KullaniciAdi = '" + SupermarketOtomasyonu.kullaniciAdi + "'";

            ResultSet result = statement.executeQuery(sorgu);

            while (result.next()) {
                int no = result.getInt("YoneticiNo");
                String kullaniciAdi = SupermarketOtomasyonu.kullaniciAdi;
                String mailAdresi = result.getString("MailAdresi");
                String ad = result.getString("Ad");
                String soyad = result.getString("Soyad");

                girisYapanYonetici = new Yonetici(no, kullaniciAdi, mailAdresi, ad, soyad);
            }
        } catch (SQLException ex) {
            Logger.getLogger(YoneticiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Yonetici> tumYoneticileriGetir() {
        ArrayList<Yonetici> list = new ArrayList<>();

        try {
            statement = connection.createStatement();

            String sorgu = "SELECT * FROM Yoneticiler ORDER BY Yoneticiler.Ad ASC";

            ResultSet result = statement.executeQuery(sorgu);

            while (result.next()) {
                int no = result.getInt("YoneticiNo");
                String kullaniciAdi = result.getString("KullaniciAdi");
                String mailAdresi = result.getString("MailAdresi");
                String ad = result.getString("Ad");
                String soyad = result.getString("Soyad");
                list.add(new Yonetici(no, kullaniciAdi, mailAdresi, ad, soyad));
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(YoneticiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public void ekle(int no, String kullaniciAdi, String mailAdresi, String ad, String soyad) {
        String sorgu = "INSERT INTO Yoneticiler (YoneticiNo, KullaniciAdi, MailAdresi, Ad, Soyad) VALUES (?,?,?,?,?)";
        try {
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setInt(1, no);
            preparedStatement.setString(2, kullaniciAdi);
            preparedStatement.setString(3, mailAdresi);
            preparedStatement.setString(4, ad);
            preparedStatement.setString(5, soyad);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(YoneticiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void guncelle(int no, String kullaniciAdi, String mailAdresi, String ad, String soyad) {
        String sorgu;
        boolean kontrol = isYoneticiNo(no);

        if (kontrol) {
            sorgu = "UPDATE Yoneticiler SET KullaniciAdi = ? , MailAdresi = ? , Ad = ? , Soyad = ? WHERE YoneticiNo = ?";
        } else {
            sorgu = "UPDATE Yoneticiler SET YoneticiNo = ? , MailAdresi = ? , Ad = ? , Soyad = ? WHERE KullaniciAdi = ?";
        }

        try {
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setString(2, mailAdresi);
            preparedStatement.setString(3, ad);
            preparedStatement.setString(4, soyad);

            if (kontrol) {
                preparedStatement.setString(1, kullaniciAdi);
                preparedStatement.setInt(5, no);
            } else {
                preparedStatement.setString(5, kullaniciAdi);
                preparedStatement.setInt(1, no);
            }

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(YoneticiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void kisiselBilgilerGuncelle(int no, String kullaniciAdi, String mailAdresi, String ad, String soyad) {
        String sorgu = "UPDATE Yoneticiler SET KullaniciAdi = ? , MailAdresi = ? , Ad = ? , Soyad = ? WHERE YoneticiNo = ?";

        try {
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setString(1, kullaniciAdi);
            preparedStatement.setString(2, mailAdresi);
            preparedStatement.setString(3, ad);
            preparedStatement.setString(4, soyad);
            preparedStatement.setInt(5, no);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(YoneticiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sil(int no) {
        String sorgu = "DELETE FROM Yoneticiler WHERE YoneticiNo = ?";

        try {
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setInt(1, no);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(YoneticiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean isYoneticiNo(int no) {
        try {
            String sorgu = "SELECT * FROM Yoneticiler WHERE YoneticiNo = ?";
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setInt(1, no);

            ResultSet result = preparedStatement.executeQuery();

            return result.next();
        } catch (SQLException ex) {
            Logger.getLogger(YoneticiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public int noOlustur() {
        Random random = new Random();
        while (true) {
            int no = 1 + random.nextInt(99999998);

            if (isYoneticiNo(no) == false) {
                return no;
            }
        }
    }

    public boolean isSifreDegistir(String kullaniciAdi, String mailAdresi) {
        try {
            String sorgu = "SELECT * FROM Yoneticiler WHERE KullaniciAdi = ? AND MailAdresi = ?";

            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setString(1, kullaniciAdi);
            preparedStatement.setString(2, mailAdresi);

            ResultSet result = preparedStatement.executeQuery();

            return result.next();
        } catch (SQLException ex) {
            Logger.getLogger(YoneticiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public void sifreDegistir(String kullaniciAdi, String sifre) {
        try {
            String sorgu = "UPDATE Yoneticiler SET Sifre = ? WHERE KullaniciAdi = ?";

            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setString(1, sifre);
            preparedStatement.setString(2, kullaniciAdi);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(YoneticiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
