public class ThrowsExample{

    public void evenodd(int num) throws Exception{
       
            if(num % 2 == 0){
                System.out.println(num + " is even");
            }else{
                throw new Exception(num + " does not meet the criteria of even number");
            }
        
    }
    public static void main(String[] args){
        ThrowsExample t = new ThrowsExample();
        try{
            t.evenodd(55);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
