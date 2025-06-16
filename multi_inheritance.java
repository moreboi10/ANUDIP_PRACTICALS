class shape {
    void area(){
        System.out.println("display area !!");
    }
    
}
class triangle extends shape {

    
}
class equitriangle extends triangle {

    
}
 class circle extends shape {
    // this is show heirarchical class inheritance
    
}
public class multi_inheritance {
    public static void main(String[] args) {
        shape s = new shape();        
        triangle r = new triangle();        
        equitriangle t = new equitriangle();        
        s.area();
        r.area();
        t.area();
    }
}
