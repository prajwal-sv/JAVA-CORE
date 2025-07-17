public class Math {
    public static void main(String[] args) {
        int a= 10;
        int b = 20 ;
//        Math.max(x,y)
//The Math.max(x,y) method can be used to find the highest value of x and y:
        System.out.println(java.lang.Math.max(a,b));

//        Math.min(x,y)
//The Math.min(x,y) method can be used to find the lowest value of x and y:
        System.out.println(java.lang.Math.min(a,b));
//        Random Numbers
//Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):4
        int randomNum = (int)(java.lang.Math.random() * 101);  // 0 to 100
        System.out.println(randomNum);
    }
}
