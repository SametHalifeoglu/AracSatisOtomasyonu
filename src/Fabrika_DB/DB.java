package Fabrika_DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {

    final private String url = "jdbc:mysql://localhost/";
    final private String driver = "com.mysql.jdbc.Driver";
    String dbName = "fabrika";
    String dbUser = "root";
    String dbSifre = "";
    final private String encode = "?useUnicode=true&characterEncoding=utf-8";

    PreparedStatement ps = null;
    Connection conn = null;
    Statement st = null;

    public PreparedStatement baglan(String query) {

        //System.out.println("query çalıştım : " + query);
        try {
            if (conn != null) {
                kapat();
            }
            Class.forName(driver);
            conn = DriverManager.getConnection(url + dbName + encode, dbUser, dbSifre);
            ps = conn.prepareStatement(query);
            System.out.println("Bağlantı Başarılı");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("PreparedStatement Hatası :" + e.getMessage());
        }
        return ps;
    }

    public Statement baglan() {
        if (conn != null) {
            kapat();
        }
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url + dbName + encode, dbUser, dbSifre);
            st = conn.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Satatemenet bağlantı hatası: " + e.getMessage());
        }

        return st;
    }

    public void kapat() {
        try {
            if (ps != null) {
                ps.close();
                System.out.println("PreparedStatement Kapatıldı.");
                ps = null;

            }
            if (conn != null) {
                conn.close();
                System.out.println("Connection Kapatıldı.");
                conn = null;
            }
        } catch (SQLException e) {
            System.err.println("Kapatma Hatası " + e.getMessage());
        }
    }

}
