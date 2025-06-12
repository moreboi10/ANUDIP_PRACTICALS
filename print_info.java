import java.util.Scanner;

public class print_info {
    public  void print_inf(){
        System.out.println("this is a printinfo");
    }
    public  static void print_inf2(){
        System.out.println("this is a printinfo");
    }
    public static int sum(int a ,int b ){
        return a+b;
    }
    public static void main(String[] args) {
        print_info obj = new print_info();
        obj.print_inf();
        print_inf2();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        System.out.println(sum(x,y));
    }
}
