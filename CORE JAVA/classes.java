import java.util.Scanner;
import java.lang.Math;

class shape {
    void area(double area){
        System.out.println("the area of the shape is "+area);
    }
    
}
class circle extends shape {
    double calcarea(double radius){
        double area = 3.14*(Math.pow(radius, 2));
        return area;
        
    }
}
class triangle extends circle {
    double calcarea(double base,double height){
        double area = (0.5)*base*height;
        return area;
    }
    
}

public class classes {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            triangle t1 = new triangle();
            double area = t1.calcarea(10,23);
            t1.area(area);
            sc.close();
    }
}

