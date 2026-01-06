ADVANCE JAVA 
- This is a advance java course of the Anudip course previously done in the 4th semester  about core java . This extends the knowledge futher by introducing advance concepts .

trainer name : Yashashree ma'am

EXCEPTIONAL HANDLING :
Exception heirarchy : 
                                                      object class 
                                                          |
                                                          |
                                                          V
                                                      Throwable class 
                                                          |
                                                          |
                                                          V
                                                      Exceptions 
                                                      |       |
                                                      |       |
                                                      V       V
                                                  checked    unchecked 
* Exception handling is used to handle runtime errors so that the normal flow of a program can continue.

syntax:
try{
    //code with expected error
}
catch(Exception e){
    //handles the error 
}
finally{
    // the block which will execute nonetheless ie. highest priority block that even executes if error occur.
}






*we can use multiple catch blocks but only one exception will be handled as the execution PREEMPTS when an error occurs and catch block handles the exception .



system.out.printl vs system.error.out 
* out uses buffer memory for displaying messages 
* error uses new version of output everytime to see if any new error has occured 


throw and throws 
* throws can work when given with method declaration but.... 
    --> throws is just a declaration that tell the user that this method may generate a exception u need to handle it 
* throw will need a throws method or a try{} block to be executed.
    --> throw sends user defined exception with a anonomous object same as catch block object


checked and unchecked exceptions 
checked : compiler suggests that the exception must be handled
unchecked : compiler does not suggest that the exception must be handled


FILE HANDLING :
* file handling heirarchy 

                                                object class 
                                                    |
                                                    |
                                                    V
                                                inputstream / outputstream (abstract classes)
                                                    |
                                                    |
                                                    V
                                        byte stream / character stream 
                                            |                       |
                                            |                       |
                                            V                       V
                                    fileinputstream         fileoutputstream
                                    filereader              filewriter

* file handling is used to read and write data to files in the system

Bytesream :
* used to read and write data in bytes
8 bytes data
Character stream :
* used to read and write data in characters
 used for text files majorly not necessary can be used for other files too but not efficient

TO Create a new file :
    *using import java.io.file;
    *File f = new File("path of the file with name and extension");
    *f.createNewFile(); // this will create a new file in the given path

    To Check if file is created or not :
    * to check if file is created or not use :
        if(f.exists()){
            system.out.println("file created");
        }
        else{
            system.out.println("file not created");
        }

TO write data to a file :
    * using import java.io.filewriter;
    * FileWriter fw = new FileWriter("path of the file with name and extension");
    * fw.write("data to be written in the file");
    * fw.close(); // to close the file writer stream




architexcture of exception handling in java 
                                                Throwable
                                                    |
                            ------------------------------------------------
                            |                                              |
                        Exception                                     Error
                            |
            --------------------------------
            |                              |
        Checked                       Unchecked
    (Compile time)                 (Runtime)



arraylist and linkedlist in java
* both are used to store data dynamically
* arraylist uses dynamic array to store the data    
insertion and deletion is better in linkedlist as it uses doubly linked nodes to store data
* arraylist is better in searching as it uses index to access data directly


memory consumption : 
* arraylist uses less memory as it uses dynamic array to store data
* linkedlist uses more memory as it uses pointers to point to next and previous nodes along with

arraylist is faster in execution as it uses index to access data directly