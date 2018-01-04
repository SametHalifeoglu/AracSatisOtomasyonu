package Fabrika_Method;

import Fabrika_DB.DB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PayClass {

    ArrayList<String> ls = new ArrayList<>();
    DB db = new DB();
    public static String KartAdi;
    public static String KartSoyadi;
    public static String KartNo;
    public static String KartTarih;
    public static String deger;
    boolean durum;

    public boolean Odeme() {

        ls.clear();
        try {
            String query = "select BankAdi,BankSoyadi,BankNum,BankTarih from bankserver";
            ResultSet rs = db.baglan().executeQuery(query);
            while (rs.next()) {
                //System.out.println("ısımsoyısım:" + rs.getString("BankAdi") + " " + rs.getString("BankSoyadi"));
                ls.add(rs.getString("BankAdi") + rs.getString("BankSoyadi") + rs.getString("BankNum") + rs.getString("BankTarih"));
            }
            System.out.println("ls değeri :" + ls);
            String toplam = KartAdi + KartSoyadi + KartNo + KartTarih;
            for (int i = 0; i < ls.size(); i++) {
                if (toplam.equalsIgnoreCase(ls.get(i))) {
                    JOptionPane.showMessageDialog(null, "Kart bilgileri başarıyla doğrulanmıştır. Lütfen bankanızdan gelen onay kodunu giriniz");
                    durum = true;
                    String queryy = "select BankKod from bankserver where BankAdi='" + KartAdi + "' and BankSoyadi='" + KartSoyadi + "' and BankNum='" + KartNo + "' and BankTarih='" + KartTarih + "'";
                    ResultSet rss = db.baglan().executeQuery(queryy);
                    while (rss.next()) {
                        deger=rss.getString("BankKod");
                        JOptionPane.showMessageDialog(null, "Onay Kodunuz\n "+"    "+deger);
                    }
                    break;
                } else if (i == ls.size() - 1) {
                    JOptionPane.showMessageDialog(null, "Kart bilgileri geçersizdir.");
                    durum = false;
                    break;
                }
            }
        } catch (SQLException ex) {
            System.err.println("Odeme Bilgileri Hatası :" + ex.getMessage());
        }
        return durum;
    }
}
