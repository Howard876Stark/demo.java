// 1. Write a function to calculate LCM of two numbers. (TSRS)

import java.util.Scanner;

public class QuestionOne {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int x = sc.nextInt();
        // reads an integer from the user
        System.out.print("Enter the second number: ");
        // reads an integer from the user
        int y = sc.nextInt();
        
       
        int i;
        
        int a = (x > y) ? x : y;

        for (i = a; i <= x * y; i = i + a) {
            // returns true if both conditions are true
            if (i % x == 0 && i % y == 0)
                break;
        }
        // prints the result
        System.out.println("LCM of " + x + " and " + y + " is: " + i);

    }

}
