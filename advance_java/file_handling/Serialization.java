import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
        int roll;
        String name;
        int age;
        double percentage;

            public Student(int roll,String name,int age ,double percentage){
                this.roll = roll;
                this.name = name;
                this.age = age;
                this.percentage = percentage;
            }                                      


}

public class Serialization {
    public static void main(String[] args) {
         Student s = new Student(13, "sanket", 23, 50);
        try {
            FileOutputStream fos = new FileOutputStream("serial.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
