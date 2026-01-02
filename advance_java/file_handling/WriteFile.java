import java.io.File;    
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file path/Name with extension : ");
        String path = sc.nextLine();
        
        System.out.println("Enter data to write in file : ");
        String data = sc.nextLine();
        
        try(FileWriter writer = new FileWriter(path)) {
            
            writer.write(data);
            
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred !!" + e.getMessage());
        }
    }
}