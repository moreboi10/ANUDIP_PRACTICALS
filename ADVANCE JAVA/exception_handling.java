public class exception_handling{
    public static void main(String[] args) {
    int[] arr = new int[5];
    arr[4] = 10;

    try{
        System.out.println(arr[6]); // This will throw ArrayIndexOutOfBoundsException
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("message  :" +e.getMessage());
    }
    catch(Exception e){
        System.out.println("message :" +e.getMessage());
    }
    finally{
        System.out.println("executed ");
    }

    }
}