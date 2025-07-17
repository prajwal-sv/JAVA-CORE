// first class   where  "firstCode" is class name which is identifier and "class" is the keyword
class FirstCode{

// It tells the Java Virtual Machine (JVM) where to begin execution
//public:
//Makes the main method accessible from anywhere. This is necessary for the JVM to be able to call it from outside the class.
//static:
//Allows the main method to be called without creating an instance of the class. This means the method belongs to the class itself, not to any specific object of that class.
//void:
//Indicates that the main method does not return any value.
//main:
//This is a reserved keyword that the JVM uses to identify the starting point of the program.
//String[] args:
//This is an array of String objects, which is used to store command-line arguments that can be passed to the program when it's run
public static void main(String[] args) {

//        "System.out.println" it says that print some thing to the screen
      System.out.println("this is first program :) ");

//    There is also a print() method, which is similar to println().
//    The only difference is that it does not insert a new line at the end of the output:  System.out.print("hello ");
    System.out.print("hello");
    System.out.print("world");

//    output: hello world



//    now lets print the number
    System.out.println(90202);
//    you can also do calculation in and print it directly

    System.out.println(50+50);
    }

}
