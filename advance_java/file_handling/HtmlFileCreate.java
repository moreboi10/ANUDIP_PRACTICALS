import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class HtmlFileCreate {
    public static void main(String[] args) {
        String path = "sample.html";
        File htmlfile = new File(path);

        try {
            htmlfile.createNewFile();
            System.out.println("created a new file !!");
        } catch (IOException e) {
           
        }
       
}
}