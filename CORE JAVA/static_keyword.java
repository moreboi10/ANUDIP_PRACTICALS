class math_util{
    math_util(){

    }
    static int square(int x){
        return x*x;
    }
}
class college  {
    
        static String college = " Dr. D.Y. Patil Technical campus";
        String name ;
        int age ;

    college(int age , String name){
        this.name = name ;
        this.age = age;
        
    }
}
class outer {
    static{
        System.out.println("run this !!");
    }
    static int data = 100;
    static class inner{
        inner(){
            System.out.println(data);
        }
    }
}

public class static_keyword {
    public static void main(String[] args) {
        System.out.println("main mathod called ");
        college coep = new college(10, "ganesh");
        college dyp = new college(21, "sanket");
        System.out.println(coep.college + "  "+ dyp.college);
        System.out.println(college.college);
        // outer o1 = new outer();
        

    }   
}
