package Fabrika_Method;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class FiyatResmiCek {

    public static String gelenurl;

    public ArrayList<String> ResimCek() {
        ArrayList<String> ls = new ArrayList<>();
        try {
            //System.out.println("çalıştım");
            String url = gelenurl;
            Document doc = Jsoup.connect(url).timeout(30000).get();

            Elements el1 = doc.getElementsByAttributeValue("id", "slider");
            Elements el2 = el1.tagName("li");
            Elements el3 = el2.tagName("li").attr("class", "flex-active-slide");
            Elements el4 = el3.select("img");
            for (Element item : el4) {
                ls.add(item.attr("data-src"));
            }
            //System.out.println("ls " + ls);
        } catch (IOException e) {
            System.err.println("Fiyat resmi çekme hatası:" + e.getMessage());
        }
        return ls;
    }

    public ArrayList<String> SutunCek() {

        ArrayList<String> ls = new ArrayList<>();
        try {
            String url = gelenurl;
            Document doc = Jsoup.connect(url).timeout(30000).get();
            Elements el2 = doc.getElementsByAttributeValue("class", "table");
            Elements el3 = el2.select("div");
            for (Element item : el3) {
                ls.add(item.getElementsByTag("div").attr("class", "th").text());
                if (item.text().equals("Tavsiye Edilen Anahtar Teslim Fiyatı")) {
                    break;
                }
            }
            ls.remove(0);
            ls.remove(5);
            ls.remove(ls.size() - 1);
            //System.out.println("ls değeri:" + ls);
        } catch (IOException e) {
            System.err.println("Fiyat resmi çekme hatası:" + e.getMessage());
        }

        return ls;
    }

    public DefaultTableModel ListeDoldur() {
        ArrayList<String> ls = new ArrayList<>();
        try {
            String url = gelenurl;
            Document doc = Jsoup.connect(url).timeout(30000).get();
            Elements el1 = doc.getElementsByAttributeValue("class", "trfull");
            Elements el2 = el1.select("div");
            for (Element item : el2) {
                ls.add(item.getElementsByTag("div").attr("class", "trfull").text());
                ls.add("");
            }
            //System.out.println("listedoldur:" + ls);
        } catch (Exception e) {
            System.err.println("ListeDoldur Hatası :" + e.getMessage());
        }
        DefaultTableModel dtm = new DefaultTableModel();
        for (String item : SutunCek()) {
            dtm.addColumn(item);
        }
        for (String l : ls) {
            dtm.addRow(new String[]{l});
        }
        return dtm;
    }
    int sayac = 0;

    public DefaultTableModel SatirDoldur() {
        ArrayList<String> ls = new ArrayList<>();
        try {
            String url = gelenurl;
            Document doc = Jsoup.connect(url).timeout(30000).get();
            Elements el1 = doc.getElementsByAttributeValue("class", "pricelist");
            Elements el2 = el1.tagName("h1");
            Elements el3 = el2.tagName("h1").attr("class", "table");
            Elements el4 = el3.select("div");
            for (Element item : el4) {
                ls.add(item.attr("class", "td").text());

            }

            for (int i = 0; i < 18; i++) {
                ls.remove(0);
            }

            String a = ls.get(10);
            //System.out.println("a değeri " + a);
            for (int j = 0; j < ls.size(); j++) {
                if (ls.get(j).equals(a)) {
                    //ls.remove(j);
                    sayac++;
                }
            }

            ls.remove(ls.size() - 1);
            //ls.remove(ls.size() - 1);
            for (int i = 0; i < ls.size(); i++) {

                for (String item : Modeller()) {
                    if (ls.get(i).equals(item)) {

                        ls.remove(i + 6);
                        ls.remove(i + 8);
                        //a=ls.get(8);
                    } else if (ls.get(i).equals(" ")) {

                        for (String ite1 : Modeller()) {
                            if (!ls.get(i + 1).equals(Modeller().get(0))) {
                                ls.remove(i + 6);
                                ls.remove(i + 8);
                            } else {
                                System.out.println(ls.get(i + 1));
                                ls.remove(i + 7);
                                ls.remove(i + 9);
                            }
                        }
                    }

                }

            }

        } catch (Exception e) {
            System.err.println("Satir Doldur Hatasi" + e.getMessage());
        }
        DefaultTableModel dtm = new DefaultTableModel();

        for (String item : SutunCek()) {
            dtm.addColumn(item);
        }
        int k = 0;

        int a = Modeller().size();
        int b = a - a;

        for (int i = 0; i < sayac; i++) {

            if (ls.get(k).equals(Modeller().get((b))) && b != (Modeller().size())) {

                dtm.addRow(new String[]{ls.get(k)});
                dtm.addRow(new String[]{ls.get(k + 1), ls.get(k + 2), ls.get(k + 3), ls.get(k + 4), ls.get(k + 5), ls.get(k + 6), ls.get(k + 7)});
                k = k + 9;
                b++;
                if (b == Modeller().size()) {
                    b = Modeller().size() - 1;
                }

            } else {

                //System.out.println("çalıştım");
                dtm.addRow(new String[]{ls.get(k), ls.get(k + 1), ls.get(k + 2), ls.get(k + 3), ls.get(k + 4), ls.get(k + 6), ls.get(k + 7)});
                k = k + 10;

            }

        }
        return dtm;
    }

    public ArrayList<String> Modeller() {
        ArrayList<String> ls = new ArrayList<>();
        try {
            String url = gelenurl;
            Document doc = Jsoup.connect(url).timeout(30000).get();
            Elements el1 = doc.getElementsByAttributeValue("class", "trfull");
            Elements el2 = el1.select("div");
            for (Element item : el2) {
                ls.add(item.getElementsByTag("div").attr("class", "trfull").text());
            }

        } catch (Exception e) {
            System.err.println("ListeDoldur Hatası :" + e.getMessage());
        }
        return ls;
    }

    int i = 0;

    public void ModelResmiYerlestir(JLabel labelModel) {
        ++i;
        if (i == ResimCek().size()) {
            i = ResimCek().size() - 1;
        }
        BufferedImage image = null;
        try {
            image = ImageIO.read(new URL(ResimCek().get(i)));
        } catch (IOException e) {
            System.err.println("Resim çekme hatası.." + e.getMessage());
        }
        ImageIcon imageIcon = new ImageIcon(fitimage(image, labelModel.getWidth(), labelModel.getHeight()));
        labelModel.setIcon(imageIcon);

    }

    public void ModelResmiYerlestir1(JLabel labelModel) {
        --i;
        if (i == -1) {
            i = 0;
        }
        BufferedImage image = null;
        try {
            image = ImageIO.read(new URL(ResimCek().get(i)));
        } catch (IOException e) {
            System.err.println("Resim çekme hatası.." + e.getMessage());
        }
        ImageIcon imageIcon = new ImageIcon(fitimage(image, labelModel.getWidth(), labelModel.getHeight()));
        labelModel.setIcon(imageIcon);

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
