//11. Write a Java program to reverse an array of integer values.
import java.util.Arrays;

public class Reverse_The_Array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("The original array : "+Arrays.toString(arr) );
        
        // int[] copy = arr.clone();
        
        // int len = arr.length - 1;
        
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = copy[len];
        //     len--;
            
        // }
        for (int i = 0; i < arr.length / 2; i++) {
            // Swap the elements at positions 'i' and 'length - i - 1'.
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println("The array : "+Arrays.toString(arr) );


        // System.out.println(Arrays.toString(arr));

    }
}
