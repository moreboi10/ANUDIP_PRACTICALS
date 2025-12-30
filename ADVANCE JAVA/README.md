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