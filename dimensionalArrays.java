import java.util.Scanner;

public class dimensionalArrays {
     public static void oneDimensional(int arr1[],int n){
         Scanner sc = new Scanner(System.in);
         for(int i=0 ; i<n ; i++)
         {
             int x = sc.nextInt();
             arr1[i] = x;
            }
            for(int i=0 ; i<n ; i++)
            {
                System.out.print(arr1[i]+" ");
                
            }
        }

        public static void twoDimensional(int arr2[][],int n){
        Scanner sc = new Scanner(System.in);
         for(int i=0 ; i<n ; i++)
         {
             for(int j=0 ; j<n ;j++)
             {
                arr2[i][j] = sc.nextInt();
             }
            }
         for(int i=0 ; i<n ; i++)
         {
             for(int j=0 ; j<n;j++)
             {
                System.out.print(arr2[i][j]+" ");
             }
             System.out.println();
            }
            
        }
        
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int arr1 [] = new int[n];
            int arr2 [][] = new int[n][n];
        // oneDimensional(arr1,n);
    //    System.out.println();
        twoDimensional(arr2, n);
        
    }
}
