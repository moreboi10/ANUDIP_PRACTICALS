import java.util.Scanner;

public class dimensionalArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1 [] = new int[n];
        int arr2 [][] = new int[5][6];

        for(int i=0 ; i<n ; i++)
        {
            int x = sc.nextInt();
            arr1[i] = x;
        }
        for(int i=0 ; i<n ; i++)
        {
            System.out.print(arr1[i]+" ");
            
        }
        sc.close();
    }
}
