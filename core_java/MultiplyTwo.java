import java.util.Scanner;

public class MultiplyTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        System.out.println("multiplication of  two numbers : "+(num1*num2));
        sc.close();
    }
}
