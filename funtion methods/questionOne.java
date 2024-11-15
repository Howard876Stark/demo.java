//         Question 1
// Write a program with a method named getTotal that accepts two integers as an argument and return its sum. Call this method from main( ) and print the results.

import java.util.Scanner;

public class questionOne {
 
    public static int getTotal () {
         @SuppressWarnings("resource")
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int a = obj.nextInt();

        System.out.print("Enter the second number: ");
        int b = obj.nextInt();
        return a+b;
    }
    
    public static void main(String[] args) {

     
     System.out.println(getTotal());





    }
}
