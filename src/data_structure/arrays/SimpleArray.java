package data_structure.arrays;

public class SimpleArray {
    public static void main(String[] args) {
        int[] arr = {1, 22, 3, 4};
        System.out.println("Index 0: " + arr[0]);

        /* Using foreach loop */
        /*for (int printArr : arr) {
            System.out.println("All Array Data: " + printArr);
        }*/

        /* Using for loop */
        for (int i = 0; i < arr.length; i++) {
            System.out.println("All Array Data: " + arr[i]);
        }
        /* When we print index position 5 then we getting ArrayIndexOutOfBound exception
        System.out.println("Index 0: "+arr[5]);
         */
    }
}
