class animal {
    void sound(){
        System.out.println("animal is making noise !");
    }
    
}

class dog extends animal {
    @Override
     void sound(){
        System.out.println("dog is making noise !");
    }
    
}
public class rutime_polymorphism {
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.sound();
    }
}
