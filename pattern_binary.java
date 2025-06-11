import java.util.Scanner;

public class pattern_binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows =sc.nextInt();
        int binary_0 = 0;
        int binary_1 = 1;
        for(int i=0 ; i<rows ; i++)
        {
            for(int j=0 ; j<i ; j++)
            {
                if (i%2 == 0) {
                    if (j % 2 == 0) {
                        System.out.print(binary_0);
                    }
                    else{
                        System.out.print(binary_1);

                    }
                    
                }
                else{
                    if (j % 2 == 0) {
                        System.out.print(binary_1);
                    }
                    else{
                        System.out.print(binary_0);

                    }
                }

            }
            System.out.println();
        }
        sc.close();
    }
}
