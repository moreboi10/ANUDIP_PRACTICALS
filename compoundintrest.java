import java.util.Scanner;
import java.lang.Math;

public class compoundintrest {
    void CI(double P,double R,double T,double N){
        double CI =  P*Math.pow((1+(R/(100*N))),N*T)-P;
        System.out.println("The compound intrest is : " + CI);
    }
    public static void main(String [] args){
        compoundintrest sol = new compoundintrest();
        Scanner sc = new Scanner(System.in);
        
    System.out.println("enter principle :");
    double P = sc.nextDouble();
    System.out.println("enter rate :");
    double R = sc.nextDouble();
    System.out.println("enter time :");
    double T = sc.nextDouble();
    System.out.println("enter number of time compunded :");
    double N = sc.nextDouble();
    sol.CI(P,R,T,N); 
    sc.close();  
    }
}
