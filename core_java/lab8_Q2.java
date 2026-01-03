import java.util.Scanner;

class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Dog {
    void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class lab8_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter animal type (animal/dog/cat): ");
        String input = sc.nextLine().toLowerCase();

        Animal obj;

        if (input.equals("dog")) {
            obj = new Dog();
        } else if (input.equals("cat")) {
            obj = new Cat();
        } else {
            obj = new Animal();
        }

        obj.makeSound();
        sc.close();
    }
}
