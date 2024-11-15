//Question 4

// A prime number is a number that is evenly divisible only by itself and 1. For example, the number 5 is prime because it can be evenly divided only by 1 and 5. The number 6, however, is not prime because it can be divided evenly by 1, 2, 4, and 6.
// Write a method named isPrime, which takes an integer as an argument and returns true if the argument is a prime number, or false otherwise. Also write main method that displays prime numbers between 1 to 500.

import java.util.Scanner;

public class questionfour {

    // funtion for cheking the prime number.
    public static boolean Prime() {

        // taking the number from user.
        @SuppressWarnings("resource")
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the number :");
        int num1 = obj.nextInt();

        // cheking the prime number.

        if (num1 % 2 == 0 || num1 % 3 == 0 || num1 % 4 == 0 || num1 % 5 == 0 || num1 % 6 == 0 || num1 % 7 == 0
                || num1 % 8 == 0 || num1 % 11 == 0) {
            System.out.println("It is not a prime number.");
            return false;

        } else {
            System.out.println("It is a prime number.");
            return true;

        }

    }

    // public static void allPrime() {
        // the prime number between 1 to 500 .
    //     System.out.println("1 is prime number between 1 to 500.");
    //     System.out.println("2 is prime number between 1 to 500.");
    //     System.out.println("3 is prime number between 1 to 500.");
    //     System.out.println("5 is prime number between 1 to 500.");
    //     System.out.println("7 is prime number between 1 to 500.");
    //     System.out.println("11 is prime number between 1 to 500.");
    //     for (int i = 2; i < 500; i++) {
    //         if (i % 2 == 0 || i % 3 == 0 || i % 4 == 0 || i % 5 == 0 || i % 6 == 0 || i % 7 == 0 || i % 8 == 0
    //                 || i % 11 == 0) {

    //         } else {
    //             System.out.println(i + "is prime number between 1 to 500.");

    //         }
    //     }
    // }

    public static void main(String[] args) {
        System.out.println(Prime());
        // allPrime();
    }

}
