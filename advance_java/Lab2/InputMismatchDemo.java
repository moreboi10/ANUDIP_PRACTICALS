
import java.util.Scanner;
import java.util.InputMismatchException;

public class InputMismatchDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int num = sc.nextInt();   // Risky line

            System.out.println("You entered: " + num);
        }
        catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer value.");
        }
        finally {
            sc.close();
        }
    }
}