import java.util.Arrays;
import java.util.Scanner;

public class string_methods {
    string_methods(){
        String str = "Sanket Dashrath more";
        System.out.println("This is string.length() : "+str.length());
        System.out.println("This is str.replace(oldchar,newchar) (not mutable but can be stored in another string) :"+str.replace('a','b'));
        System.out.println("This is str.substring(start_index, end_index) (new string made can be stored in another var):"+str.substring(0, 4));
        System.out.println("This is str. ");
        System.out.println("This is str. ");
    }
    void array_methods(){
        Scanner sc = new Scanner(System.in);
        int [] array = new int[5];
        for(int i=0 ; i<5 ; i++)
        {
            array[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("this is array.length : "+array.length);
        System.out.println("this is array before sort : "+array[0]);
        Arrays.sort(array); //use java.util.Arrays
        System.out.println("this is Arrays.sort(array) (sort is present in Arrays class and sort is its method) : "+array[0]);
        //2D arrays
        int [][] arr = {{12,23,34},{12,43,22}};
        System.out.println(arr[0][1]+" and "+arr[1][1]);
    }

    void java_implicits(){
        // casting 
        double price = 100.00;
        double finalprice = price + 18; //implicit casting => double + int
        System.out.println(finalprice);
        int p = 100;
        int fp = p + (int)18.0; // explicit casting => (typecast)value
        System.out.println(fp);

        //Constants
        final float pi = 3.14F; // final keyword ensures no change to the value
        System.out.println("this is a constant : "+ pi);


        //operators
        // -arthematic Ops + - / *
        // -assignment Ops = == < > 
        // -urinary Ops i++ --i
        
        }


    public static void main(String[] args) {
        string_methods obj = new string_methods();
        obj.array_methods();
    }
    
}