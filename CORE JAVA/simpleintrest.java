import java.util.Scanner;
public class simpleintrest {
    void SI(int principle,int rate ,int time){
        int SI = principle*rate*time;
        System.out.println("The Simple intrest of your data is "+SI);
    }
    public static void main(String [] args){
        simpleintrest sol = new simpleintrest();
        Scanner sc = new Scanner(System.in);
        
    System.out.println("enter principle rate and time (years)");
    int P = sc.nextInt();
    int R = sc.nextInt();
    int T = sc.nextInt();
    sol.SI(P,R,T); 
    sc.close();       
    }
}
