import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckEmptyFile {

    public static void main(String[] args) {
        String filePath = "input.txt";

        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new IOException("File does not exist.");
            }

            if (file.length() == 0) {
                throw new Exception("File is empty.");
            }

            try (FileReader reader = new FileReader(file)) {
                int c;
                while ((c = reader.read()) != -1) {
                    System.out.print((char) c);
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
