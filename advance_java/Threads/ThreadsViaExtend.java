class NewThread extends Thread{
   
    @Override
    public void run(){
        for(int i=1 ; i<=10 ; i++)
        {
            System.out.println(i);
        }
    }
    
}
public class ThreadsViaExtend {
    public static void main(String[] args) {
        NewThread s1 = new NewThread();
        s1.start();
    }
}
