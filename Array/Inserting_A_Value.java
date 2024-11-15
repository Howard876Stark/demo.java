//9. Write a Java program to insert an element (specific position) into an array.
import java.util.*;

public class Inserting_A_Value {
    public static void main(String[] args) {
        //our Array
        int[] my_array = { 487, 885, 859, 195, 753, 984, 756, 159, 368, 145 };
        System.out.println("Now the Array is : " + Arrays.toString(my_array));

        int[] my_array2=new int[my_array.length+1];
        my_array2 = my_array.clone();
        
        @SuppressWarnings("resource")

        Scanner sc = new Scanner(System.in);
    
        //taking the new number 
        System.out.print("Which number you have replace on the place of " + my_array + ": ");
        int New_Value = sc.nextInt();
        int ed =my_array2.length;
         my_array2[ed]= New_Value; 

        System.out.println("New Array : " + Arrays.toString(my_array));
    }
}
