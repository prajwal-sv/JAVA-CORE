public class For {
    public static void main(String[] args) {
//        Java For Loop
//When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop:
//  Statement 1 is executed (one time) before the execution of the code block.
//
//Statement 2 defines the condition for executing the code block.
//
//Statement 3 is executed (every time) after the code block has been executed.




        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }


//        The for-each Loop
//There is also a "for-each" loop, which is used exclusively to loop through elements in an array (or other data structures):
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }


//Java Break
//You have already seen the break statement used in an earlier chapter of this tutorial. It was used to "jump out" of a switch statement.
//
//The break statement can also be used to jump out of a loop.
//
//This example stops the loop when i is equal to 4:
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
    }
}
