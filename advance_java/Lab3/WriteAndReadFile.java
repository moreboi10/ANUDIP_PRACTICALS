import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteAndReadFile {
    public static void main(String[] args) {
        String filePath = "sample.txt";
        int count = 0;

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("hello there my name is sanket more I am learning java file handling.\n");
        } catch (IOException e) {
            System.out.println("Error while writing to the file.");
            return;
        }

        try (FileReader reader = new FileReader(filePath)) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
                count++;
            }
            System.out.println("\n\nTotal number of characters: " + count);
        } catch (IOException e) {
            System.out.println("Error while reading the file.");
        }
    }
}
