// 1st way to create the thread
public class threads{
public static void main(String[] args) {
   mythread t1 =new mythread();
   t1.start();
   myrunnable r1 =new myrunnable();
   thread t2 =new thread();
   t2.start();
}
}

class mythread extends threads {
    public void run(){
        System.out.println("thread is running using thread class");
    }
}

// 2nd way to create thread
class myrunnable implements runnable{
    public void run()
    {
        System.out.println("thread is running using runnable");
    }
}