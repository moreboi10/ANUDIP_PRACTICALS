import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter the Number : ");
        int n=sc.nextInt();
        sc.close();
        switch (n) {
            case 1 :
                System.err.println("Good Morning");
                break;
            case 2 :
                System.err.println("Namste");
                break;
            case 3 :
                System.err.println("Good night");
                break;
            
            default:
                throw new AssertionError("Invalid: "+n);
        }
    }
}