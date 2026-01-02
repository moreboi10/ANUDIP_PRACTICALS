import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWholePara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a file name : ");
        String filename = sc.nextLine();
        File fileobj = new File(filename);

         try {
            if (fileobj.createNewFile()) {
                System.out.println("File created: " + fileobj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
        

        
        System.out.println("Enter a paragraph to write into the file:");
        String paragraph = sc.nextLine();

        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(paragraph);
            System.out.println("Content successfully written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
