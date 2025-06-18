JVM : converts byte code to machine code

type of memory :
stack = stores primitive data types 
heap = stores non primitive data types


stack => local vars , obj reference
heap => oject , arrays , actual values
w
MDN- refer memory management 

static : does not require obj to call static funtion 
non static : does require obj to call static funtion 

1) Find Maximum of Three Numbers:done
2) Check Even or Odd Number:done
3) Factorial of a Number:done
4) Print Pattern in Java:done
5) Add Two Binary Numbers in Java:
6) Add Two Complex Numbers in Java:
7) Multiply Two Numbers in Java:
8) Check Leap Year in Java:
9) Check Vowel or Consonant in Java:
10) Calculate Compound Interest in Java:done
CI=A−P
A=(1+r/n)^nt
11) Java Program to Calculate Simple Interest:done
12) Java Program to Find Quotient and Remainder:



string methods: 
🔹 Commonly Used String Methods:
Method	                                                             Description
length()	                                                Returns the length of the string.
charAt(int index)	                                        Returns the character at the specified index.
substring(int beginIndex)	                                Returns substring from the given index to end.
substring(int start, int end)	                            Returns substring between two indices.
equals(String s)	                                        Compares two strings (case-sensitive).
equalsIgnoreCase(String s)	                                Compares two strings ignoring case.
compareTo(String s)	                                        Lexicographically compares two strings.
toLowerCase()	                                            Converts all characters to lowercase.
toUpperCase()	                                            Converts all characters to uppercase.
trim()	Removes                                             leading and trailing whitespaces.
replace(char old, char new)	                                Replaces all occurrences of a character.
contains(CharSequence s)	                                Checks if string contains a sequence.
startsWith(String prefix)	                                Checks if string starts with given prefix.
endsWith(String suffix)	                                    Checks if string ends with given suffix.
indexOf(char ch)	                                        Returns index of first occurrence of character.
lastIndexOf(char ch)	                                    Returns index of last occurrence.
isEmpty()	                                                Checks if string is empty.
split(String regex)	                                        Splits the string around matches of the regex.
concat(String str)	                                        Concatenates the specified string to the end.




question :
Program Question   :Create a Java Singleton class
The singleton pattern is a design pattern that restricts the instantiation of an object to only one instance. To do this, you’ll need to create a Singleton class that has a non-parameterized constructor.

The class should have one public variable called str. It should also have a static method called getSingleInstance that’ll return the single instance of the class

2) Write a phone number word decoder :
Write a program in Java that’ll accept a phone number with letters and convert it to a phone number with only digits. For example, if you sent the program a phone number like 800888TEST, it should return (800) 8

not done :
-do while loop 
-switch case 
-fuctions
-2D arrays(matrix)
-string 
-string builder
-sub_string
-cocatination
-types of constructor
-this keyword



Inheritance :
mechanism of one class to acquire features of other class . for the purpose of code reusablity , code redundancy is not happening , additional features code maintaince easier to manage

types of Inheritance:
single level Inheritance
multilevel Inheritance





polymorphism :
polymorphism is using same name methods with different parameter to avoid using and remembering too many names 
poly - many 
morph - forms

types:
1 - compile time poly 
2 - run time poly 

codition of compile time poly:
    parameter must differ in :
        * no of methods 
        * type of params
        * order of params
    -> you cannot change the methods by changing the return type alone



run time polymorphism:
    * It is also known as method overriding 
    * It is type of polymorphism where the specific method to be callled is determined at runtime and not at compile time .
    * This is achived through method overriding, 
    -where subclass provides a specific implimentation of method inherited from its parent class.
    * The JVM (java virtual machine) decides which method to execute based on the actuall object type and runtime.
    
    "run time pe decide hoga konsa method call hoga based on input/value"

    rules of method overiding:
        - only possible with inheritance 
        - method must be overridden not overloaded
        - only instance methods are polymorphic (non static & private method)
        --the static method resolved at compile time thats why not possible
        -private or final methods cannot be overridden
        
    benefit:
        - flexibility 
        - loose coupling 
        - scalebility 
        

OOPS remaining : 
* encapsulation 
* abstraction 
* interface 
other things : 
-> final and static keyword 

Abstraction is one of the four pillar of object oriented programing in java .
-> It means hiding internal implimentation details and showing only essential features to the user .
->hide 


* key points : 
    * It hides complex code and show only the necessary parts.
    * Implimentation is done using abstract classes and interface.
    * User only sees whats necessary 
    example:
        driving a car -you use the steering , brake , gear but dont know the internal engine funtion 
    
Why use abstraction:
    * It improves code maintainabilty.
    * Achive loose coupling (dependency)
    * Enchanced security.
    * It encouraged modular programing. 

Properties:
    * An abstract class must be declared with abstract keyword.
    * It can have abstract as well as non abstract methods.
    * It can not be instantiated.
    * It can have constructors and static methods also.
    * It can have final methods .
    * which will force the subclass not to change the body of the methods.
    * jab bhi hum derive class ke constructor ko call karte toh pehle base class constructor call hota hai phir derive ka hota hai .
    * It extends one class only 
    * non-abstract method is also known as concrete methods
    
    Question : Create a java program using abstraction to model a payment system ?
    que.requirements:
        create and abstract class name payment 
        add and abstract method called process payment (double type)
        create two sub_classes :
            credit card payment 
            UPI payment
        Impliment the process_payment method in both sub_classes with custom logic (eg print statements)
        In the main method :
            use abstract class reference to call the method of both payment types (animal d1 = new dog(); reference of animal)


INTERFACE :
    what is and interface in java ?
    ->An interface in java is completely abstract class that is used to group related abstract  methods it defines  what class must do, but not how it does it .

key features :
    * It uses interface keyword.
    * All the methods are public and abstract by default.(till java 7)
    * All the fields(variables) int interface are public static and final by default. 
    * For inherit we use impliments keyword not extends.
    * We can impliment multiple inheritance.
    * for java 8+ it can have default and static methods 
    * interface ke andar koi bhi non static method nhi hona chahiye
    * interface ke construtor nhi ho sakte

    why interface cant have construtor ?
    ->an interface is not a class , its just a contract( blueprint) for what a class should do .
        since interfaces cannot be instantiated ,they dont need constructors.


                        ABSTRACT CLASS                                                                          INTERFACE
DEFINATION              It cannot be instantiated                                                               It specifies a set of methods a class must impliment
                        It contains both abstract as well as non abstract methods                               Methods are abstract by default
                                
IMPLIMENTATION          It can have both implimented and abstract methods                                       methods are abstract by default
method                                                                                                          for java 8+ it can have static and default methods

INHERITACE              Class can inherit from only one abstract class                                          class can impliment multiple interfaces 

ACCESS modifiers        Methods and Properties can have any accesss modifiers                                   methods and Properties are implicitly public
                        (public , protected and private)

VARIABLES               It can have member variables (final , non final , static , non static)                  variables are implicitly public , static and final


#FINAL keyword
-> in java final keyword is a modifier that can be used wtih variables , methods , classes and it has different meaning depending on the context.

final variable : once assigned the value of the final variable cannot be changed 
    * It can be applied to instance , local or static variable 
    * It often used to create constants
    * use final with static for constants 
    * a method marked as final cannot be overridden in subclasses .
    * it used to prevent method behaviour from being changed.

final class : a class marked as a final cannot be inherited 
    * it used to prevent subclassing (to create subclass)
    
STATIC keyword :
it is used for memory management and defines members (variables, methods, blocks, or nested classes ) that belong to the class rather then instances of class 

static variable (class variable) : 
* it shared among all instances of class .
* only one copy exist in memory,regardless of the number of objects created.

static method : 
* static methods belongs to the class not the instance (objext)
* it can be called without creating an object 
* it can accesss only static data directly (know "this" keyword)

static class :
* only nested classes can be static (not top level)
* it can access only static members of the class 

static block : 
* used for static initialisation 
* execute once when the class is loaded (before the main method or any object is created)

Quiz: what is Armstrong number ?
-> it is a number that is equal to sum of its own digits each raised to the power of number of digits

#_DBMS_ - database management system

Database : 
* A database is a organised collection of data that can be easily accessed , managed and updated

Ques :what is DBMS ?
-> A DBMS is software that allows user to interact with databases for storeing , retriving and manipulating data.
* examples of DBMS :
    MYSQL , ORACLE , MONGODB (nosql) , SQLserver , POSTgress SQL , Firebase , SQL lite

Why use DBMS ?
-> Efficient data management 
* Easy data retrival 
* less redundancy
* security and access control 
* backup and recovery

Types of DBMS :
* Heirarchical : data in tree like structure 
    example : IBM , IMS
* Network : data has many to many relationship 
    example : IDS , TurboIMAGE
* Relational : data in tables (rows , column) mostly used 
    example : MYSQL , ORACLE
* NOSQL : this is not tabular , used for big data 
    example : MONGODB 