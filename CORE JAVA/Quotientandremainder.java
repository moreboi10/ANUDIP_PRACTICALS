import java.util.Scanner;

public class Quotientandremainder {
    void QandR(double divisor,double dividend){
        double quotient = dividend / divisor;
        double remainder = dividend % divisor;
        System.out.println("The quotient and the remainder is : "+quotient+" and "+remainder);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter dividend and divisor :");
        int dividend = sc.nextInt() ;
        int divisor = sc.nextInt();
        Quotientandremainder sol = new Quotientandremainder();
        sol.QandR(divisor, dividend);     
        sc.close();
    }
}
