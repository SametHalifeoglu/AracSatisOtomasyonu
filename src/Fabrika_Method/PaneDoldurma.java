package Fabrika_Method;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class PaneDoldurma {

    public ArrayList PaneDoldur() {
        ArrayList<HashMap<String, String>> ls = new ArrayList<>();
        ArrayList href = new ArrayList<>();
        ArrayList img = new ArrayList<>();
        HashMap<String, String> hm = new HashMap<>();
        String url = "http://fiyat.mercedes-benz.com.tr/";
        try {
            Document doc = Jsoup.connect(url).get();
            Elements el1 = doc.getElementsByAttributeValue("class",
                    "slides");
            Elements el2 = el1.tagName("li");
            Elements el3 = el2.tagName("li").select("a");
            for (Element itemm : el3) {
                //System.out.println(itemm);
                //hm.put(itemm.getElementsByTag("em").text(), itemm.getElementsByTag("img").attr("src"));
                //System.out.println("hm :" + hm);
                href.add((itemm.getElementsByTag("em").text()));
                href.add(itemm.getElementsByTag("img").attr("src"));
                //hm.put(itemm.getElementsByTag("em").text(), itemm.getElementsByTag("img").attr("src"));
            }

            href.set(9, "http://cdn.mercedes-benz.com.tr/files/2017/1/24/c-serisi-sedan/_0003s_0001_Yeni%20C-Serisi%20Sedan.jpg");
            href.set(13, "http://cdn.mercedes-benz.com.tr/files/2017/1/24/s-serisi-sedan-uzun-versiyon/_0003s_0003_S-Serisi%20Sedan.jpg");
            href.set(15, "http://cdn.mercedes-benz.com.tr/files/2017/7/3/-yeni-s-serisi-sedan-/yeni%20s%20serisi%20sedan.jpg");
            href.set(21, "http://cdn.mercedes-benz.com.tr/files/2017/1/24/c-serisi-estate/_0004s_0000_C-Serisi%20Estate.jpg");
            href.set(23, "http://cdn.mercedes-benz.com.tr/files/2017/5/3/e-serisi-all-terrain/E-Class%20All-Terrain_thumbnail.jpg");
            href.set(43, "http://cdn.mercedes-benz.com.tr/files/2017/1/24/s-serisi-cabriolet/S-Serisi%20Cabriolet.jpg");
            href.set(39, "http://cdn.mercedes-benz.com.tr/files/2017/1/24/c-serisi-cabriolet/C-Serisi%20Cabriolet.jpg");
            href.set(27, "http://cdn.mercedes-benz.com.tr/files/2017/1/24/cls/_0002s_0001_CLS%20Coupe.jpg");
            href.set(25, "http://cdn.mercedes-benz.com.tr/files/2017/1/24/c-serisi-coup%C3%A9/_0002s_0002_C-Serisi%20Coupe.jpg");
            href.set(35, "http://cdn.mercedes-benz.com.tr/files/2017/1/24/s-serisi-coup%C3%A9/_0002s_0005_S-Serisi%20Coupe.jpg");
            href.set(33, "http://cdn.mercedes-benz.com.tr/files/2017/1/24/gle-coup%C3%A9/fb-_0002s_0003_GLE%20Coupe.jpg");
            href.set(29, "http://cdn.mercedes-benz.com.tr/files/2017/3/1/e-serisi-coup%C3%A9-/model_overview_mercedes-benz-e-class_c238__271x124_10-2016.jpg");
            href.set(31, "http://cdn.mercedes-benz.com.tr/files/2017/1/24/glc-coup%C3%A9/fb-mercedes-benz-glc_c253_modeloverview_271x124_04-2016.jpg");
            //href.set(37, "http://cdn.mercedes-benz.com.tr/files/2017/1/24/mercedes-amg-gt/_0002s_0004_Mercedes-AMG%20GT.jpg");
            href.remove(36);
            href.remove(36);
            //System.out.println(href);
        } catch (IOException e) {
            System.err.println("PaneDoldurma Hatası :" + e.getMessage());
        }
        return href;
    }

    
    int i = 1;

    public void resimDoldur(JLabel jresim) {

        BufferedImage image = null;

        try {
            image = ImageIO.read(new URL("" + PaneDoldur().get(i)));
        } catch (IOException e) {
            System.err.println("Resim çekme hatası.." + e.getMessage() + i);
        }
        ImageIcon imageIcon = new ImageIcon(fitimage(image, jresim.getWidth(), jresim.getHeight()));
        jresim.setIcon(imageIcon);
        i = i + 2;

    }

    private Image fitimage(Image img, int w, int h) {
        BufferedImage resizedimage = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = resizedimage.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(img, 0, 0, w, h, null);
        g2.dispose();
        return resizedimage;
    }

    public void ModelDoldur(JLabel jmodel, JLabel jmodel1, JLabel jmodel2, JLabel jmodel3, JLabel jmodel4, JLabel jmodel5, JLabel jmodel6, JLabel jmodel7, JLabel jmodel8, JLabel jmodel9, JLabel jmodel10, JLabel jmodel11, JLabel jmodel12, JLabel jmodel13, JLabel jmodel14, JLabel jmodel15, JLabel jmodel16, JLabel jmodel17, JLabel jmodel18, JLabel jmodel19, JLabel jmodel20, JLabel jmodel21, JLabel jmodel22, JLabel jmodel23, JLabel jmodel24, JLabel jmodel25, JLabel jmodel26) {

        jmodel.setText("" + PaneDoldur().get(0));
        jmodel1.setText("" + PaneDoldur().get(2));
        jmodel2.setText("" + PaneDoldur().get(4));
        jmodel3.setText("" + PaneDoldur().get(6));
        jmodel4.setText("" + PaneDoldur().get(8));
        jmodel5.setText("" + PaneDoldur().get(10));
        jmodel6.setText("" + PaneDoldur().get(12));
        jmodel7.setText("" + PaneDoldur().get(14));
        jmodel8.setText("" + PaneDoldur().get(16));
        jmodel9.setText("" + PaneDoldur().get(18));
        jmodel10.setText("" + PaneDoldur().get(20));
        jmodel11.setText("" + PaneDoldur().get(22));
        jmodel12.setText("" + PaneDoldur().get(24));
        jmodel13.setText("" + PaneDoldur().get(26));
        jmodel14.setText("" + PaneDoldur().get(28));
        jmodel15.setText("" + PaneDoldur().get(30));
        jmodel16.setText("" + PaneDoldur().get(32));
        jmodel17.setText("" + PaneDoldur().get(34));
        jmodel18.setText("" + PaneDoldur().get(36));
        jmodel19.setText("" + PaneDoldur().get(38));
        jmodel20.setText("" + PaneDoldur().get(40));
        jmodel21.setText("" + PaneDoldur().get(42));
        jmodel22.setText("" + PaneDoldur().get(44));
        jmodel23.setText("" + PaneDoldur().get(46));
        jmodel24.setText("" + PaneDoldur().get(48));
        jmodel25.setText("" + PaneDoldur().get(50));
        jmodel26.setText("" + PaneDoldur().get(52));
        

    }

}
