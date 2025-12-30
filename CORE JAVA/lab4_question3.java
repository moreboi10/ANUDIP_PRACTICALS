import java.util.Scanner;

public class lab4_question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenCount = 0, oddCount = 0;

        while (true) {
            System.out.print("Enter a number (-1 to stop): ");
            int num = sc.nextInt();
            if (num == -1) {
                break;
            }
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        sc.close();
        System.out.println("Total even numbers: " + evenCount);
        System.out.println("Total odd numbers: " + oddCount);
    }
}
