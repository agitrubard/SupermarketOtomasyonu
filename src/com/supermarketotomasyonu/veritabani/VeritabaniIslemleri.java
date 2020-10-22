package com.supermarketotomasyonu.veritabani;

import com.supermarketotomasyonu.SupermarketOtomasyonu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author berrinkorkutata
 * @author agitrubardemir
 */
public class VeritabaniIslemleri {

    public static Connection connection = null;
    private static PreparedStatement preparedStatement = null;

    public VeritabaniIslemleri() {
        String url = "jdbc:mysql://" + Veritabani.host + ":" + Veritabani.port + "/" + Veritabani.name;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VeritabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Driver bulunamadı!");
        }

        try {
            connection = DriverManager.getConnection(url, Veritabani.username, Veritabani.password);
            System.out.println("Bağlantı Başarılı.");
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız!");
        }
    }

    public boolean girisYap(String kullaniciAdi, String sifre) {
        int kontrol = SupermarketOtomasyonu.kontrolSayisi;
        String sorgu = "";

        switch (kontrol) {
            case 1:
                sorgu = "SELECT * FROM Yoneticiler WHERE KullaniciAdi = ? AND Sifre = ?";
                break;
            case 2:
                sorgu = "SELECT * FROM Calisanlar WHERE KullaniciAdi = ? AND Sifre = ?";
                break;
            case 3:
                sorgu = "SELECT * FROM Kullanicilar WHERE KullaniciAdi = ? AND Sifre = ?";
                break;
        }

        try {
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setString(1, kullaniciAdi);
            preparedStatement.setString(2, sifre);

            ResultSet result = preparedStatement.executeQuery();

            return result.next();
        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
