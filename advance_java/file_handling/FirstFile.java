
import java.io.File;
import java.io.IOException;
import java.util.Scanner;



public class FirstFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file path/Name with extension : ");
        String path = sc.nextLine();
        
        try{
            File fileobj = new File(path); 
            if (fileobj.createNewFile()) {
                System.out.println("File created: " + fileobj.getName());
            } else {
                System.out.println("File already exists.");
            }
            
        } catch (IOException e) {
            System.err.println("An error occured !!" + e.getMessage());
        }
        

        

    }
}
