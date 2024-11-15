// Question 2

// Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise. Also write a program to test your method.

import java.util.Scanner;

public class questionSecond {
    public static boolean even() {
        @SuppressWarnings("resource")
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        if (a % 2 == 0) {
        return true;
        }else{
        return false;
        }
    } 

    public static void main(String[] args) {
        System.out.println("We are testing our funtion.");

        System.out.println();

        System.out.println(even());
        
        System.out.println();

        @SuppressWarnings("resource")
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the number for testing:");
        int a = obj.nextInt();

        if (a%2 == 0) {
            System.out.println("THE NUMBER IS EVEN. ");
        } else {
            System.out.println("THE NUMBER IS ODD.");
        }
    }
}
