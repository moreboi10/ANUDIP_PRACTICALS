import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class JavaExtensionFileCreation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a file name with .java extension: ");
        String pathname = sc.nextLine();
        
        try {
            File fileobj  = new File(pathname);

        } catch (Exception e) {
          
        }
    }
}
