package Fabrika_Method;

public class HataAyiklamaMetodu {

    public boolean strKontrol(String ad) {

        for (char harf : ad.toCharArray()) {
            if (Character.isDigit(harf)||!Character.isAlphabetic(harf)) {
                return false;
            }
        }
        return true;
    }
    
    public boolean NumKontrol(String num) {

        for (char harf : num.toCharArray()) {
            if (!Character.isDigit(harf)) {
                return false;
            }
            else if (num.length()!=10) {
                return false;
            }
            if(!num.substring(0, 1).equals("5")){
                return false;
            }
        }
        return true;
    }
    
    public  boolean mailDogrulama(String email) {
           String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
           java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
           java.util.regex.Matcher m = p.matcher(email);
           return m.matches();
    }
    
    public boolean bosgecilmez(String deger){
        if(deger.equals(" ")){
            return false;
        }
        return true;
        
    }
    
    public boolean SifreKontrol(String deger){
        for (char harf : deger.toCharArray()) {
            if(!Character.isAlphabetic(harf)&& !Character.isDigit(harf)) {
                return false;
            }
        }
        return true;
    }
    
}
