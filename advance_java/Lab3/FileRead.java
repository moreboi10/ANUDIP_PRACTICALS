import java.io.*;
import java.util.Scanner;

// Write a Java program that reads an input file from the file system and outputs the content of the file character by character. Use FileReader.read() method to read characters from the file. At the end, print the total number of characters present in the file.


public class FileRead {
    
    static void newfile(String pathname){
        Scanner sc = new Scanner(System.in);
        try {
            File labfile3 = new File(pathname);
            labfile3.createNewFile();
            System.out.println("Created a new file !!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void writefile(String pathname){
        Scanner sc = new Scanner(System.in);
        try (FileWriter w = new FileWriter(pathname)) {
            System.out.println("Enter your paragraph and end it with (exit) :");
            String towrite = sc.nextLine();
            while (towrite.equalsIgnoreCase("exit")) {
                w.write(towrite);
            }
            System.out.println("written in file !! ");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void readfile(String pathname){
        try {
            Scanner sc = new Scanner(System.in);
            FileReader read = new FileReader(pathname);
            int charcount = 0;
            int s;
            while ((s = read.read()) != -1) {
                System.out.print((char) s);
                charcount += 1;
            }

            System.out.println("\nthe char count is :" + charcount);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file name : ");
        String pathname = sc.next();
        System.out.print("enter a choice :\n1.createnewfile\n2.writefile\n3.readfile\n:");        
        int choice = sc.nextInt();
       
        try {
             switch (choice) {
            case 1:
                FileRead.newfile(pathname);
                break;
            case 2:
                FileRead.writefile(pathname);
                break;
            case 3:
                FileRead.readfile(pathname);
                break;
            default:
                throw new InvalidInputException("invalid choice !!");
        }
       
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }
    }
}
