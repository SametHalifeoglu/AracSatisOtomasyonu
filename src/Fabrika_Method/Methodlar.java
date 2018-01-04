package Fabrika_Method;

import Fabrika_DB.DB;
import Fabrika_Property.MusteriProperty;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Methodlar {

    MusteriProperty mp = new MusteriProperty();
    DB db = new DB();

    public void MusteriEkle(MusteriProperty mus) {
        try {
            String query = "CALL MusteriKayit(?,?,?,?,?,?,?)";
            PreparedStatement pss = db.baglan(query);
            pss.setString(1, mus.getMusAdi());
            pss.setString(2, mus.getMusSoyadi());
            pss.setString(3, mus.getMusTel());
            pss.setString(4, mus.getMusUnvan());
            pss.setString(5, mus.getMusSirket());
            pss.setString(6, mus.getMusMail());
            pss.setString(7, mus.getMusSifre());
            pss.executeUpdate();
            System.out.println("yazdım");
        } catch (SQLException e) {
            System.err.println("Müşteri Ekleme Hatası : " + e.getMessage());
        }
    }

}
