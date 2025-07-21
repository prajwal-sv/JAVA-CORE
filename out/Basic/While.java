public class While {

    public static void main(String[] args) {

//Loops can execute a block of code as long as a specified condition is reached.
//
//Loops are handy because they save time, reduce errors, and they make code more readable.

//        Java While Loop
//The while loop loops through a block of code as long as a specified condition is true:

        int i = 0;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

//        Do/While Example
//The example below uses a do/while loop. The loop will always be executed at least once, even if the condition is false, because the code block is executed before the condition is tested:
        int j = 0;
        do {
            System.out.println(j);
            j++;
        }
        while (j < 5);


    }


}
