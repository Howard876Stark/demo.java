
//7. Write a Java program to remove a specific element from an array.
import java.util.*;

public class Remove_The_Element {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("Arr = [ 57, 65, 23, 78, 59, 89, 45, 54, 879, 123 ]");

        System.out.println("Enter the Index number's : ");
        int index = sc.nextInt();

        int[] Arr = { 57, 65, 23, 78, 59, 89, 45, 54, 879, 123 };

        int[] Copy = new int[Arr.length - 1];

        for (int i = 0, k = 0; i < Arr.length; i++) {

            if (index == i) {
                continue;
            } else {
                Copy[k] = Arr[i];
            }
            k++;
        }

        System.out.println(Arrays.toString(Copy));

    }
}
