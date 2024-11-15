//1. Write a Java program to sort a numeric array and a string array.
import java.util.*;

public class Shorting_Array {

    public static void main(String[] args) {
        Integer[] int_array = { 53, 86, 21, 84, 76, 46 };
        String String_array[] = { "Dhoni", "Kholi", "Hardik", "Banner", "Stark", "Captain" };
        // System.out.println("Original numeric array : " + Arrays.toString(int_array));

        Arrays.sort(int_array);


        System.out.println("Sorted numeric array : " + Arrays.toString(int_array));

        System.out.println("Original string array : " + Arrays.toString(String_array));

        Arrays.sort(String_array);
        System.out.println("Sorted string array : " + Arrays.toString(String_array));
    }



}
