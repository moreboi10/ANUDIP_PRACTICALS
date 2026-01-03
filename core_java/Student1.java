public class Student1 {
    private String name;
    private int age;
    private String department;

    public Student1(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    public static void main(String[] args) {
        Student1 student = new Student1("sanket ", 21, "computer engineering");
        System.out.println("name : "+student.getName());
        System.out.println("age : "+student.getAge());
        System.out.println("dept : "+student.getDepartment());
        
    }

}
