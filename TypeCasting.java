public class TypeCasting {
//In Java, there are two types of casting:
//
//Widening Casting (automatically) - converting a smaller type to a larger type size
//byte -> short -> char -> int -> long -> float -> double
//
//Narrowing Casting (manually) - converting a larger type to a smaller size type
//double -> float -> long -> int -> char -> short -> byte
    public static void main(String[] args) {
//      Widening Casting
        int a =1 ;
        double b = a ;

        System.out.println(b);


//        Narrowing Casting
        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9
    }
}
