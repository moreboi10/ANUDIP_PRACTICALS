abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    double r;
    Circle(double r) {
        this.r = r;
    }
    double calculateArea() {
        return 3.14159 * r * r;
    }
}

class Rectangle extends Shape {
    double l, w;
    Rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }
    double calculateArea() {
        return l * w;
    }
}

public class lab8_Q1 {
    public static void main(String[] args) {
        Shape c = new Circle(7);
        Shape r = new Rectangle(5, 10);
        System.out.println("Circle Area: " + c.calculateArea());
        System.out.println("Rectangle Area: " + r.calculateArea());
    }
}
