import java.util.Scanner;

class BankAccount {
    private int balance = 0;

    void moneywithdrawl() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to be Withdrawn :");
        int amount = sc.nextInt();
        try {
            if (this.balance - amount < 0) {
                throw new InsufficientBalance("Your Account has Insuffient balance !!");
            } else {
                this.balance = this.balance - amount;
                System.out.println("Your Transaction was Successfull !! \nYour new balance is : " + this.balance);
            }
        } catch (InsufficientBalance e) {
            System.out.println(e.getMessage());
       
    }
}

    void moneydeposit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to be Deposited :");
        int amount = sc.nextInt();
        this.balance = this.balance + amount;
        System.out.println("Your current balance is :" + this.balance);

        
    }

}

public class BankingApplication {
    public static void main(String[] args) {
        
        String Exit = "no";
        BankAccount user = new BankAccount();
        while (!Exit.equalsIgnoreCase("yes")) {
            System.out.println("****************************************Welcome to the Banking Application!****************************************");
            Scanner sc = new Scanner(System.in);
            System.out.println("Select an Option \n1.Money Withdrawl\n2.Money Deposit\nChoose your option :");
            int choice = sc.nextInt();
           try {
             switch (choice) {
                case 1:
                    user.moneywithdrawl();
                    break;
                case 2:
                    user.moneydeposit();
                    break;
                default:
                    throw new InvalidInputException("Your Choice was Invalid !!");
            }
           } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
           }
           System.out.print("\nDo you want to Exit (yes/no) :");
           Exit = sc.next();
        }


       
    }
}
