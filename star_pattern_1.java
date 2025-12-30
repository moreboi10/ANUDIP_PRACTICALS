import java.util.Scanner;
public class star_pattern_1 {

    static class Stars{
        static int rows = 5;
        Stars(int rows){
            this.rows = rows;
        }
        void star1(){
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        Stars p1 = new Stars(row);
        p1.star1();
        
    }
}

