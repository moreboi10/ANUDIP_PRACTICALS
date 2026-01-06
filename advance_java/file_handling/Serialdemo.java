

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

import javax.tools.FileObject;


public class Serialdemo {
    public static void main(String[] args) {
        // Student s = new Student(13, "sanket", 23, 50);
        // try {
        //     FileOutputStream fos = new FileOutputStream("serial.txt");
        //     ObjectOutputStream oos = new ObjectOutputStream(fos);
        //     oos.writeObject(s);

        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // }
        // catch(IOException e){
        //     e.printStackTrace();
        // }
    
        try {
            FileInputStream fis = new FileInputStream("serial.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student s1 = (Student) ois.readObject();
            System.out.println("name : " +s1.name);
            System.out.println("age : " +s1.age);
            System.out.println("roll : " +s1.roll);
            System.out.println("percentage : " +s1.percentage);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }

        
    }
}
