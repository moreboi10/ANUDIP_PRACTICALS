import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        String Exit = "no";
        while (!Exit.equalsIgnoreCase("yes")) {

            Scanner sc = new Scanner(System.in);
            System.out.println("enter a num1 : ");
            int num1 = sc.nextInt();
            System.out.println("enter a num2 : ");
            int num2 = sc.nextInt();

            try {
                System.out.println("Enter a operator (+,-,*,/): ");
                String operator = sc.next();
                switch (operator) {
                    case "+":
                        int sum = num1 + num2;
                        System.out.println("The sum of the given numbers is " + sum);
                        break;
                    case "-":
                        int subt = num1 - num2;
                        System.out.println("The subtraction of the given numbers is " + subt);
                        break;
                    case "*":
                        int prod = num1 * num2;
                        System.out.println("The product of the given numbers is " + prod);
                        break;
                    case "/":
                        try {
                            int div = num1 / num2;
                            System.out.println("The division of the given numbers is " + div);
                        } catch (ArithmeticException e) {
                            System.err.println("The error message is " + e.getMessage());
                        }
                        break;
                    default:
                        throw new InvalidInputException("The Operator is invalid !!");
                }

            } catch (InvalidInputException e) {
                System.err.println("The following error appears : " + e.getMessage());
            }

            System.out.println("Do you want to exit (yes/no) : ");
            Exit = sc.next();
        }
        
    }
}