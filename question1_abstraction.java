abstract class payment {
    abstract void processPayment(double amount);
    
}
class creditcard extends payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing credit card payment :" + amount);
        
    }
}

class UPI extends payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing UPI payment : "+ amount);
        
    }
}

public class question1_abstraction {
    public static void main(String[] args) {
            payment cc = new creditcard();
            payment upi = new UPI();
            cc.processPayment(100.5);
            upi.processPayment(1232.32);
    }
}
