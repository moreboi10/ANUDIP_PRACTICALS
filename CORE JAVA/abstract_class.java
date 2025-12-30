abstract class animal{
    //Abstract method 
    abstract void sound();
    // non - abstract method 
    void eat(){
        System.out.println("Animal Eats");
    }
}   

class dog extends animal {
    @Override
    void sound() {
        System.out.println("bhok mat bhai !");
    }
    // @Override
    // void eat(){
    //     System.out.println("mai pedigeree nhi khata");
    // }
}
public class abstract_class {
    public static void main(String[] args) {
        animal d1 = new dog();
        d1.sound();
        d1.eat();
        
        
    }
}
