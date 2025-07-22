public class Arrays {

    public static void main(String[] args) {
        String[] arr = {"Volvo", "BMW", "Ford", "Mazda"};

        System.out.println(arr[1]);


//        Change the array element

        arr[1] = "TEsla";

        System.out.println(arr[1]);

//        Length of array
        System.out.println(arr.length);

//        Loop Through the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

//      For each element
    }
}