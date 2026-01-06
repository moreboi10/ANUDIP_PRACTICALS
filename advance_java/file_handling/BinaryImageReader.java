import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BinaryImageReader {
    public static void main(String[] args) throws IOException{
        System.out.println("This is a placeholder for BinaryImageReader functionality.");
        String filename = "image1.jpg";
        File fileobj = new File(filename);

        try {
            FileInputStream fist = new FileInputStream(fileobj);

            int bytes;
            int bytescount = 0;
            while ((bytes = fist.read()) != -1) {   
                // System.out.println(bytes);
                bytescount++;
            }
            System.out.println("file size :" + bytescount);
        } catch (IOException e) {
            System.out.println("the following error appeared "+e.getMessage());
        } 

    }
}
