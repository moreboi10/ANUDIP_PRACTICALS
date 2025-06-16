import java.util.Scanner;

class student {
    String name ;
    int age;

    public void printinfo(String name){
        System.out.println("name : "+name);
    }
    
    public void printinfo(int age){
        System.out.println("age : "+age);
    }
    
    public void printinfo(int age,String name){
        System.out.println("age : "+age+"\nname : "+name);
    }
    
    public void printinfo(String name,int age){
        System.out.println("name : "+name+"\nage : "+age);
    }
    
    
}
public class polymorphism {
    public static void main(String[] args) {
        student s1 = new student();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int age = sc.nextInt();
        s1.printinfo(str,age);
        s1.printinfo(age,str);
        sc.close();
    }
}
