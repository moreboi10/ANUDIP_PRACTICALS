class Student {
    String name;
    int age;
    String department;

    // default constructor
    Student() {
        name = "Unknown";
        age = 20;
        department = "Unassigned";
    }

    // constructor with name and age
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        department = "IT";
    }

    // constructor with all three
    Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println();
    }
}

public class lab5_que2 {
    public static void main(String[] args) {

        Student s1 = new Student(); // default
        Student s2 = new Student("Sanket", 21); // 2 args
        Student s3 = new Student("Riya", 22, "Computer"); // all 3 args

        System.out.println("Student 1:");
        s1.printDetails();

        System.out.println("Student 2:");
        s2.printDetails();

        System.out.println("Student 3:");
        s3.printDetails();
    }
}
