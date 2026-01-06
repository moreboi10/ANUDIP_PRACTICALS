java.io vs java.nio
* java.io is the older version of file handling in java
* java.nio is the newer version of file handling in java with more features and better performance
* java.nio supports non-blocking I/O operations
* java.nio provides better scalability for handling multiple file operations simultaneously


architecture of java.io package 
                                                Object
                                                    |
                                                    |
                                                    V
                                                InputStream
                                                    |
                ------------------------------------------------
                |                                              |
            FileInputStream                             FilterInputStream
                                                            |
                                        --------------------------------------
                                        |                                    |
                                BufferedInputStream                 DataInputStream

architecture of java.nio package 
                                                Object
                                                    |
                                                    |
                                                    V
                                                Buffer
                                                    |
                ------------------------------------------------
                |                                              |
            ByteBuffer                                 CharBuffer
                |
        -----------------
        |               |
   MappedByteBuffer  DirectByteBuffer


threading lifecycle in java
* new
* runnable  
* running
* waiting / blocked 
* terminated
* synchronized keyword is used to lock a method or a block of code to prevent multiple threads from accessing it simultaneously


architecture of threading in java 
                                                object class 
                                                    |
                                                    |
                                                    V
                                                thread class 
                                                    |
                ------------------------------------------------
                |                                              |
            runnable interface                        thread group class

nio : file -> channel -> buffer -> selector
io : file -> stream -> reader/writer


serialization in java
fileoutputstream -> objectoutputstream -> writeobject()
used to store raw data of an object into a file doesent covert into bytes form

objectoutput/inputstream is used to covert the raw data of a file to byte file and via se versa .
