import java.util.Scanner;

public class Car {
    // Member variables
    String make;
    String model;
    short year;
    int price;

    // Constructor
    public Car(String make, String model, short year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Method to display car info
    public void displayInfo() {
        System.out.println("Car Details:");
        System.out.println("Make  : " + make);
        System.out.println("Model : " + model);
        System.out.println("Year  : " + year);
        System.out.println("Price : ₹" + price);
        System.out.println("------------------------");
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many cars do you want to enter? ");
        int count = sc.nextInt();
        sc.nextLine(); // clear newline

        Car[] cars = new Car[count];

        for (int i = 0; i < count; i++) {
            System.out.println("\nEnter details for Car #" + (i + 1));

            System.out.print("Enter Make: ");
            String make = sc.nextLine();

            System.out.print("Enter Model: ");
            String model = sc.nextLine();

            System.out.print("Enter Year: ");
            short year = sc.nextShort();

            System.out.print("Enter Price: ₹");
            int price = sc.nextInt();
            sc.nextLine(); // clear newline

            cars[i] = new Car(make, model, year, price);
        }

        System.out.println("\n----- Displaying Car Information -----");
        for (Car c : cars) {
            c.displayInfo();
        }

        sc.close();
    }
}
