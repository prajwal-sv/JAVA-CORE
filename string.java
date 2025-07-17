public class string {

    public static void main(String[] args) {
        String  name = "Prajwal";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());


//        String Concatenation
//The + operator can be used between strings to combine them. This is called concatenation:

        String lastName = "Wankhede";

        System.out.println(name.toUpperCase()+" "+lastName.toUpperCase());

//        You can also use the concat() method to concatenate two strings:

        System.out.println(lastName.concat(name));


        String x = "10" ;
        int y = 20 ;
        System.out.println(x+y);
    }
}
