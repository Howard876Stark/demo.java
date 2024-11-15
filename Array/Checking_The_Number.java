
//5. Write a Java program to test if an array contains a specific value.
import java.util.*;

public class Checking_The_Number {
    public static void main(String[] args) {
        int[] array = { 53, 53, 76, 13, 42, 34 };

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = sc.nextInt();
     
        int Index= 0;
        for (int i : array) {
            if (num == i) {
                System.out.println("The number is on Index " + Index + ".");
                break;
            }
            Index++;
        }

    
    }

}
