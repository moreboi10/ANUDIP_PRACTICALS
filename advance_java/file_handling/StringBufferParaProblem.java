import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StringBufferParaProblem {
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
        
        
        
        //this is the code using string buffer


        // StringBuilder builder = new StringBuilder();

        // System.out.println("Enter paragraph (type END on a new line to finish):");

        // while (true) {
        //     String line = sc.nextLine();

        //     if (line.equalsIgnoreCase("END")) {
        //         break;
        //     }

        //     builder.append(line).append("\n");
        // }

        // try (FileWriter writer = new FileWriter(filename)) {
        //     writer.write(builder.toString());
        //     System.out.println("Paragraph written successfully.");
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }


         try (BufferedReader br =
                 new BufferedReader(new FileReader("output.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
