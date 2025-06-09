import java.util.Scanner;

public class findmax {
    void max(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("Largest number is " + a);
        } else if (b > a && b > c) {
            System.out.println("Largest number is " + b);
        } else {
            System.out.println("Largest number is " + c);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        findmax obj = new findmax();
        obj.max(x, y, z);
    }
}
