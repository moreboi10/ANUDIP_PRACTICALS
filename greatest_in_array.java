public class greatest_in_array {
    public static void main(String[] args) {
        int greatest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int [] arr = {12,23,34,23,12,1,2}; 
        for(int i = 0; i<arr.length; i++)
        {
            if (greatest < arr[i]) {
                greatest = arr[i];
            }
            if (smallest > arr[i]){
                smallest = arr[i];
            }
        }
        int great2 = Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length ; i++)
        {
            if (great2 < arr[i] && arr[i] <greatest) {
                great2 = arr[i];
            }
        }
        System.out.println("second largest " + great2);
        System.out.println("this is the largest element : "+greatest);
        System.out.println("this is the smallest element : "+smallest);
    }
}
