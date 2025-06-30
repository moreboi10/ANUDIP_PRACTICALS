import java.util.Scanner;

public class Lab4_question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start of range: ");
        int start = sc.nextInt();
        System.out.print("Enter end of range: ");
        int end = sc.nextInt();
        printArmstrongNumber(start, end);
        sc.close();
    }

    static void printArmstrongNumber(int start, int end) {
        System.out.println("Armstrong numbers in the range:");
        for (int num = start; num <= end; num++) {
            int original = num;
            int sum = 0;
            int temp = num;
            int digits = 0;

          
            while (temp > 0) {
                digits++;
                temp /= 10;
            }

            temp = num;
          
            while (temp > 0) {
                int digit = temp % 10;
                int cube = 1;
                for (int i = 0; i < digits; i++) {
                    cube *= digit;
                }
                sum += cube;
                temp /= 10;
            }

            if (sum == original) {
                System.out.println(original);
            }
        }
    }
}
