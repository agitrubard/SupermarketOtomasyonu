package com.supermarketotomasyonu.calisan;

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
public class CalisanIslemleri {

    private final Connection connection = VeritabaniIslemleri.connection;
    private Statement statement;
    private PreparedStatement preparedStatement = null;
    public static Calisan girisYapanCalisan;

    public CalisanIslemleri() {
        try {
            statement = connection.createStatement();

            String sorgu = "SELECT * FROM Calisanlar WHERE KullaniciAdi = '" + SupermarketOtomasyonu.kullaniciAdi + "'";

            ResultSet result = statement.executeQuery(sorgu);

            while (result.next()) {
                int no = result.getInt("CalisanNo");
                String kullaniciAdi = SupermarketOtomasyonu.kullaniciAdi;
                String mailAdresi = result.getString("MailAdresi");
                String ad = result.getString("Ad");
                String soyad = result.getString("Soyad");
                String departman = result.getString("Departman");
                int maas = result.getInt("Maas");

                girisYapanCalisan = new Calisan(no, kullaniciAdi, mailAdresi, ad, soyad, departman, maas);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Calisan> tumCalisanlariGetir() {
        ArrayList<Calisan> list = new ArrayList<>();

        try {
            statement = connection.createStatement();

            String sorgu = "SELECT * FROM Calisanlar ORDER BY Calisanlar.Ad ASC";

            ResultSet result = statement.executeQuery(sorgu);

            while (result.next()) {
                int no = result.getInt("CalisanNo");
                String kullaniciAdi = result.getString("KullaniciAdi");
                String mailAdresi = result.getString("MailAdresi");
                String ad = result.getString("Ad");
                String soyad = result.getString("Soyad");
                String departman = result.getString("Departman");
                int maas = result.getInt("Maas");
                list.add(new Calisan(no, kullaniciAdi, mailAdresi, ad, soyad, departman, maas));
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public void ekle(int no, String kullaniciAdi, String mailAdresi, String ad, String soyad, String departman, int maas) {
        String sorgu = "INSERT INTO Calisanlar (CalisanNo, KullaniciAdi, MailAdresi, Ad, Soyad, Departman, Maas) VALUES (?,?,?,?,?,?,?)";
        try {
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setInt(1, no);
            preparedStatement.setString(2, kullaniciAdi);
            preparedStatement.setString(3, mailAdresi);
            preparedStatement.setString(4, ad);
            preparedStatement.setString(5, soyad);
            preparedStatement.setString(6, departman);
            preparedStatement.setInt(7, maas);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void guncelle(int no, String kullaniciAdi, String mailAdresi, String ad, String soyad, String departman, int maas) {
        String sorgu;
        boolean kontrol = isCalisanNo(no);

        if (kontrol) {
            sorgu = "UPDATE Calisanlar SET KullaniciAdi = ? , MailAdresi = ? , Ad = ? , Soyad = ? , Departman = ? , Maas = ? WHERE CalisanNo = ?";
        } else {
            sorgu = "UPDATE Calisanlar SET CalisanNo = ? , MailAdresi = ? , Ad = ? , Soyad = ? , Departman = ? , Maas = ? WHERE KullaniciAdi = ?";
        }

        try {
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setString(2, mailAdresi);
            preparedStatement.setString(3, ad);
            preparedStatement.setString(4, soyad);
            preparedStatement.setString(5, departman);
            preparedStatement.setInt(6, maas);

            if (kontrol) {
                preparedStatement.setString(1, kullaniciAdi);
                preparedStatement.setInt(7, no);
            } else {
                preparedStatement.setString(7, kullaniciAdi);
                preparedStatement.setInt(1, no);
            }

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void kisiselBilgilerGuncelle(int no, String kullaniciAdi, String mailAdresi) {
        String sorgu = "UPDATE Calisanlar SET KullaniciAdi = ? , MailAdresi = ? WHERE CalisanNo = ?";

        try {
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setString(1, kullaniciAdi);
            preparedStatement.setString(2, mailAdresi);
            preparedStatement.setInt(3, no);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sil(int no) {
        String sorgu = "DELETE FROM Calisanlar WHERE CalisanNo = ?";

        try {
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setInt(1, no);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean isCalisanNo(int no) {
        try {
            String sorgu = "SELECT * FROM Calisanlar WHERE CalisanNo = ?";
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setInt(1, no);

            ResultSet result = preparedStatement.executeQuery();

            return result.next();
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public int noOlustur() {
        Random random = new Random();
        while (true) {
            int no = 1 + random.nextInt(999998);

            if (isCalisanNo(no) == false) {
                return no;
            }
        }
    }

    public boolean isSifreDegistir(String kullaniciAdi, String mailAdresi) {
        try {
            String sorgu = "SELECT * FROM Calisanlar WHERE KullaniciAdi = ? AND MailAdresi = ?";

            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setString(1, kullaniciAdi);
            preparedStatement.setString(2, mailAdresi);

            ResultSet result = preparedStatement.executeQuery();

            return result.next();
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public void sifreDegistir(String kullaniciAdi, String sifre) {
        try {
            String sorgu = "UPDATE Calisanlar SET Sifre = ? WHERE KullaniciAdi = ?";

            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setString(1, sifre);
            preparedStatement.setString(2, kullaniciAdi);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int maasDonusumuSQL(String calisanMaas) {
        calisanMaas = calisanMaas.replace("₺", "");
        calisanMaas = calisanMaas.replace(".", "");
        int maas = Integer.parseInt(calisanMaas);
        return maas;
    }

    public String maasDonusumu(int calisanMaas) {
        String maas = "₺" + String.valueOf(calisanMaas);
        maas = maas.substring(0, 2) + "." + maas.substring(2, 5);
        return maas;
    }
}
