
import java.util.Scanner;

public class ConvertString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number string:");
        String input = sc.nextLine();
        try {
            if (input.isEmpty()) {
                throw new NullPointerException();
            }
            else {
            int num = Integer.parseInt(input);
            System.out.println("Converted number: " + num);
            }
        } 
        catch (NullPointerException e) {
            System.out.println("the following message is :"+e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("contains text, not numbers.");
        }
        
        sc.close();

    }
}