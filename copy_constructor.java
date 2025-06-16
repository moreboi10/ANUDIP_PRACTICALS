class copy {
    String name;
    copy(){
        System.out.println("construtor has been called !");
    }
    copy(String name){
        this.name = name ;
        System.out.println("this is the name of construtor : "+name);
    }
    
    copy(copy c){
        this.name = c.name ;
        System.out.println("this is the name of construtor : "+name);
    }

    
}
public class copy_constructor {
    public static void main(String[] args) {
        copy c = new copy();
        copy s = new copy("rahul");
        copy e = new copy(s);
    }
    
}