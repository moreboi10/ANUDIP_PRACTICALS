import java.sql.*;
import java.util.Scanner;

public class PROJECT1 {
    private static final String URL = "jdbc:mysql://localhost:3306/employee";
    private static final String USER = "root";
    private static final String PASSWORD = "moreboi10";

    public static void main(String[] args) {
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        // create connection object 
        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD); 
        System.out.println("database connected !! ");
       
        createTable(connection);
        Scanner sc  = new Scanner(System.in);
        int ch;
        do {
            System.out.println("--------------------------------------------MENU-----------------------------------");
            System.out.println("1 . ADD EMPLOYEE ");
            System.out.println("2 . VIEW TABLE ");
            System.out.println("3 . UPDATE TABLE ");
            System.out.println("4 . DELETE EMPLOYEE ");
            System.out.println("5 . SELECT VIA ID");
            System.out.println("0 . EXIT");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println();
            System.out.print("Enter your choice : ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                int n ;
                
                System.out.println("Enter the number of employees to add : ");
                n = sc.nextInt();
                for(int i=0 ; i<n ; i++)
                {
                    System.out.println("enter emp_id :");
                    int emp_id = sc.nextInt();
                    System.out.println("enter name :");
                    String name = sc.next();
                    System.out.println("enter email :");
                    String email = sc.next();
                    System.out.println("enter salary : ");
                    int salary = sc.nextInt();
                    insertData(connection,emp_id,name,email,salary);
                }
                break;
                
                case 2:
                retrieveData(connection);
                break ;
                
                case 3:
                int t ;
                System.out.println("Enter the number of employees to update : ");
                t = sc.nextInt();
                
                for(int i=0 ; i<t ; i++)
                {
                    System.out.print("enter emp_id to make changes to : ");
                    int id = sc.nextInt();
                    System.out.print("enter new_salary  : ");
                    int  new_salary = sc.nextInt();
                    updateData(connection,id, new_salary);
                }
                break;

                case 4:
                System.out.print("Enter EMP_ID to delete EMPLOYEE : ");
                int id = sc.nextInt();
                deleteData(connection, id);
                break;
                
                case 5:
                System.out.println("Enter the emp_id to show :");
                int emp_id = sc.nextInt();
                selectviaid(connection,emp_id);

            }

        } while (ch != 0);
        connection.close();
        System.out.println("database closed !");
 
    }
    catch(Exception e)
    { e.printStackTrace();}
    } // main block 

    // all methods definations 
    private static void createTable(Connection connection) throws SQLException{
        String createtablesql = "CREATE TABLE IF NOT EXISTS users (" 
            + "emp_id INT PRIMARY KEY,"
            + "name varchar(50),"
            + "email varchar(100)  UNIQUE,"
            + "salary INT "
            + ")";
        
        try(Statement stmt = connection.createStatement()){
            stmt.execute(createtablesql);
            System.out.println("Table User created succesfully !!");
        }
    } //create table closed 

    private static void insertData(Connection connection ,int emp_id,String name , String email , int salary) throws SQLException{
        String insertdatasql = "INSERT INTO users (emp_id,name,email,salary) VALUES (?,?,?,?)";
        try(PreparedStatement pstmt  = connection.prepareStatement(insertdatasql))
            {
                pstmt.setInt(1, emp_id);
                pstmt.setString(2, name);
                pstmt.setString(3, email);
                pstmt.setInt(4, salary);
                pstmt.executeUpdate();
                System.out.println("Inserted: " + name);
            }
        }

    // retrivedata start 
    private static void retrieveData(Connection connection) throws SQLException{
        String retrivedata = "SELECT * FROM users ";
        try(Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(retrivedata)){
                System.out.println( "Employee Data");
                while (rs.next()){
                    System.out.println("EMP_ID :" + rs.getInt("emp_id")+", Name : "+rs.getString("name")+", Email : "+ rs.getString("email")+", Salary :"+rs.getInt("salary"));
                }
            }
    }

    private static void updateData (Connection connection ,int id , int  new_salary) throws SQLException {
        String updatesql = "UPDATE users SET salary = ? WHERE emp_id = ?";
        try(PreparedStatement pstmt = connection.prepareStatement(updatesql)){
            pstmt.setInt(1, new_salary);
            pstmt.setInt(2,id);
            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("updated salary for ID :" + id);
            }
            else{
                System.out.println("nothing updated !!");
            }
        }
    }

    private static void deleteData(Connection connection,int id) throws SQLException {
        String deletesql = "DELETE FROM users WHERE emp_id = ?";

        try(PreparedStatement pstmt = connection.prepareStatement(deletesql)){
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            System.out.println("Deleted user with EMP_ID : " + id );
        }
    } 

    private static void selectviaid(Connection connection, int id) throws SQLException {
    String selectQuery = "SELECT * FROM users WHERE emp_id = ?";
    
    try (PreparedStatement pstmt = connection.prepareStatement(selectQuery)) {
        pstmt.setInt(1, id);  

        try (ResultSet rs = pstmt.executeQuery()) {
            System.out.println("Employee Data:");
            if (rs.next()) {
                System.out.println("EMP_ID: " + rs.getInt("emp_id") + 
                                   ", Name: " + rs.getString("name") + 
                                   ", Email: " + rs.getString("email") + 
                                   ", Salary: " + rs.getInt("salary"));
            } else {
                System.out.println("No employee found with ID: " + id);
            }
        }
    }
    }

    }
