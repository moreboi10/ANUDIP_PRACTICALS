import java.util.Scanner;

class InsufficientFundsException extends Exception {
    private double balance;
    private double deficit;

    InsufficientFundsException(double balance, double deficit) {
        super("Insufficient funds. Current Balance: " + balance + " Deficit Amount: " + deficit);
        this.balance = balance;
        this.deficit = deficit;
    }
}

class InvalidAgeException extends RuntimeException {
    InvalidAgeException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance = 0;

    void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(balance, amount - balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New Balance: " + balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Current Balance: " + balance);
    }
}

class VoterRegistration {
    void validateAge(int age) {
        if (age < 18) {
            throw new InvalidAgeException("Age not eligible for voter registration");
        }
        System.out.println("Voter registration successful");
    }
}

public class BankingFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();
        VoterRegistration voter = new VoterRegistration();
        String exit = "no";

        while (!exit.equalsIgnoreCase("yes")) {
            System.out.println("1.Withdraw\n2.Deposit\n3.Voter Registration");
            int choice = sc.nextInt();

            try {
                if (choice == 1) {
                    System.out.print("Enter amount: ");
                    double amt = sc.nextDouble();
                    account.withdraw(amt);
                } else if (choice == 2) {
                    System.out.print("Enter amount: ");
                    double amt = sc.nextDouble();
                    account.deposit(amt);
                } else if (choice == 3) {
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    voter.validateAge(age);
                } else {
                    System.out.println("Invalid choice");
                }
            } catch (InsufficientFundsException e) {
                System.out.println(e.getMessage());
            } catch (InvalidAgeException e) {
                System.out.println(e.getMessage());
            }

            System.out.print("Exit (yes/no): ");
            exit = sc.next();
        }
    }
}
