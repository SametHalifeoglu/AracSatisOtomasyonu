package Fabrika_Method;

import Fabrika_DB.DB;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class LabelDoldurma {

    DB db = new DB();

    public static void main(String[] args) {
        LabelDoldurma pd = new LabelDoldurma();
        pd.ModelBilgiGetir();

    }

    public void ModelBilgiGetir() {
        ArrayList<HashMap<String, String>> ls = new ArrayList<>();

        String url = "http://fiyat.mercedes-benz.com.tr/";
        try {
            Document doc = Jsoup.connect(url).get();
            Elements el1 = doc.getElementsByAttributeValue("class",
                    "slides");
            Elements el2 = el1.tagName("li");
            Elements el3 = el2.tagName("li").select("a");
            for (Element itemm : el3) {
                String key = itemm.getElementsByTag("em").text();
                String value = itemm.getElementsByTag("img").attr("src");

                try {
                    String query = "insert into model_resim values(null,'" + key + "','" + value + "')";
                    int deger = db.baglan().executeUpdate(query);
                    if (deger > 0) {
                        System.out.println("Model bilgileri başarıyla eklendi");
                    }
                } catch (SQLException e) {
                    System.err.println("Model bilgilerini ekleme hatası" + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.err.println("PaneDoldurma Hatası :" + e.getMessage());
        }

    }

    int i = 0;

    public ArrayList resimgetir() {
        ArrayList<String> labelresimdoldur = new ArrayList<>();
        try {
            String query = "select model_resimler from model_resim";
            ResultSet rs = db.baglan().executeQuery(query);
            while (rs.next()) {
                labelresimdoldur.add(rs.getString("model_resimler"));
            }
            System.out.println(labelresimdoldur.size());
        } catch (SQLException e) {
            System.err.println("model adlarini getirme hatası" + e.getMessage());
        }
        return labelresimdoldur;
    }

    public void resimDoldur(JLabel jresim) {
        BufferedImage image = null;

        try {
            image = ImageIO.read(new URL("" + resimgetir().get(i)));
        } catch (IOException e) {
            System.err.println("Resim çekme hatası.." + e.getMessage());
        }
        ImageIcon imageIcon = new ImageIcon(fitimage(image, jresim.getWidth(), jresim.getHeight()));
        jresim.setIcon(imageIcon);
        i++;

    }

    private Image fitimage(Image img, int w, int h) {
        BufferedImage resizedimage = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = resizedimage.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(img, 0, 0, w, h, null);
        g2.dispose();
        return resizedimage;
    }

}
