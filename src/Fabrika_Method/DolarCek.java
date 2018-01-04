package Fabrika_Method;

import Fabrika_DB.DB;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

public class DolarCek {

    public static String seciliModel;
    public static String seciliSeri;
    public static float para;
    DB db = new DB();
    String dolar = null;
    float a;
    float b;
    float toplam = 0;
    String gonder;

    public static void main(String[] args) {
        DolarCek dc = new DolarCek();
        //dc.DegerCek();

        //System.out.println("gelen değer:" + dc.FiyatHesapla());
        dc.HttpGetir();
        //dc.ekle();
    }

    public float DegerCek() {

        try {
            String url = "http://www.tcmb.gov.tr/kurlar/today.xml";
            String data = Jsoup.connect(url).timeout(30000).execute().body();
            Document doc = Jsoup.parse(data, "", Parser.xmlParser());
            Elements elem = doc.select("Currency");
            for (Element item : elem) {
                if (item.getElementsByTag("Isim").text().equals("ABD DOLARI")) {
                    dolar = item.getElementsByTag("ForexSelling").text();
                    a = Float.valueOf(dolar);
                }
            }
        } catch (IOException e) {
            System.err.println("Dolar değeri çekme hatası :" + e.getMessage());
        }
        return a;

    }

    public String FiyatHesapla() {
        toplam=0;
        ArrayList<Float> ls = new ArrayList<>();
        try {
            String url = HttpGetir();
            Document doc = Jsoup.connect(url).timeout(30000).ignoreContentType(true).get();
            Elements elem = doc.getElementsByAttributeValue("class", "price");
            Elements elem1 = elem.tagName("small");

            for (Element element : elem1) {
                String a = element.text().replace(" TL (KDV DAHİL)", "");
                String c = a.replace(",", ".");
                b = Float.valueOf(c);
                ls.add(b);
            }
            for (Float item : ls) {
                toplam += (item * DegerCek() * DegerCek());
            }
            int al = (int) toplam;
            String al1 = String.valueOf(al);
            gonder = al1.substring(0, 3).concat(".") + al1.substring(3);
            para=Float.valueOf(gonder);
            System.out.println("para değeri :" + para);
        } catch (IOException | NumberFormatException e) {
            System.err.println("Parça Çekme Hatası:" + e.getMessage());
        }
        return gonder;

    }

    public String HttpGetir() {
        String url = null;
        try {

            String query = "select ModelUrl from modeller where ModelAdi='" + seciliModel + "' and  ModelSeri='" + seciliSeri + "'";
            //String query = "select UrunKod from urunler where UrunAdi='"+seciliModel+"' and UrunSoyadi='"+seciliSeri+"'";
            ResultSet rs = db.baglan().executeQuery(query);
            while (rs.next()) {

                url = rs.getString("ModelUrl");
            }
            System.out.println("url degeri : " + url);
        } catch (SQLException ex) {
            System.err.println("Http getirme hatası: " + ex.getMessage());
        }
        return url;
    }

}
