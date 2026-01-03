public class fibbonacci {
    public static void main (String [] args){
        int newcounter = 1;
        int oldcounter = 0;
        int n = 10;
        for(int i= 1 ; i<n;i++){
            int temp = newcounter + oldcounter;
            oldcounter = newcounter;
            newcounter = temp;
            System.out.println(temp);
            
            
        
        }

    }
    
}
