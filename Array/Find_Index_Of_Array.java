//6. Write a Java program to find the index of an array element.    
import java.util.*;

public class Find_Index_Of_Array {
    public static OptionalInt findIndex(int[] my_array, int num) {
        if (my_array == null) {
            return OptionalInt.empty();
        }
        for (int i = 0; i < my_array.length; i++) {

            if (my_array[i] == num)
                return OptionalInt.of(i);
            else {

            }
        }
        return OptionalInt.empty();
    }

    public static void main(String[] args) {
        int[] my_array = { 11, 52, 23, 21, 63, 96, 45, 41, 14, 25 };
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        findIndex(my_array, num).ifPresent(index -> System.out.println("Index position of " + num + " is: " + index));

    } 
}
