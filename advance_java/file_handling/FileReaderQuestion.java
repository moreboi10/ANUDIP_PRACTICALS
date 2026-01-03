import java.io.File;
import java.io.IOException;
import java.io.FileReader;

public class FileReaderQuestion {
    public static void main(String[] args) {
        File file = new File("output.txt");
        FileReader fr = null;
        try {
            fr = new FileReader(file);
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
    }
}
}