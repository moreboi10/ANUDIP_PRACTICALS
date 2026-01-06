import java.text.DateFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Localisation {
    public static void main(String[] args) {
        String lang = "en";
        String country = "US";

        Locale l = new Locale(lang,country);
        Locale l2 = new Locale("fr","FR");
        ResourceBundle rd = ResourceBundle.getBundle("Bundle",l);
        System.out.println(rd.getString("wish"));
        System.out.println(rd.getString("melons"));

        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, l2);
        System.out.println(df.format(new java.util.Date()));
    }   
}
