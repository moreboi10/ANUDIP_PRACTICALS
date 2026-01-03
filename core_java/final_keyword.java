
// final class vehicle{
class vehicle{
    // final void run(int speed){  not allowed as final keyword cannot be overridden in subclass
    void run(int speed){
        System.out.println("bhaag dhanno bhaag!!");
        System.out.println("gaddi di speed :"+speed);
    }
}

class skoda extends vehicle {
    @Override
    void run(int speed){
        System.out.println("mat bhaag bhai !");
    }
    
}
public class final_keyword {

    public static void main(String[] args) {
        final int speed = 120;
        System.out.println("cannnot change final variable once assigned !!");
        vehicle skoda = new skoda();
        skoda.run(speed);

    }
}
