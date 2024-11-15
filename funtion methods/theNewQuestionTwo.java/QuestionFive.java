import java.util.Scanner;

public class QuestionFive {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num1 = sc.nextInt();
        int num2 = num1 + 1;
        // first prime number condition statment 
      if (num1 % 2 == 0 ||num1 % 3 == 0 || num1 % 5 == 0 || num1 % 6 == 0 || num1 % 7 == 0|| num1 % 8 == 0 || num1 % 11 == 0) {
            System.out.println(num1 + " this number is not a prime number.");
            //second prime number condition statment 
            if (num2 % 2 == 0 || num2 % 3 == 0 || num2 % 4 == 0 || num2 % 5 == 0 || num2 % 6 == 0 || num2 % 7 == 0 || num2 % 8 == 0 || num2 % 11 == 0) {
            
            }
            else {
                System.out.println("The next prime number is " + num2);
            }
        } else {
            if (num2  % 2 == 0 || num2 % 3 == 0 || num2 % 4 == 0 || num2 % 5 == 0 || num2 % 6 == 0 || num2 % 7 == 0 || num2 % 8 == 0 || num2 % 11 == 0) {
                System.out.println(num1 + " this number is prime number.");
                //
            }
            else {
                System.out.println("The next prime number is " + num2);
            }
        
      }
    }
}
