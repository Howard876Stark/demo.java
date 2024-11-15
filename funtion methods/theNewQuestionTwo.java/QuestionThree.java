//Write a function to check whether a given number is Prime or not. (TSRS)

import java.util.Scanner;

public class QuestionThree {
  public static int prime(int num1) {

    if (num1 % 2 == 0 || num1 % 3 == 0 || num1 % 4 == 0 || num1 % 5 == 0 || num1 % 6 == 0 || num1 % 7 == 0 || num1 % 8 == 0 || num1 % 11 == 0) {
      return 0 ;
    } else {
      return num1 ;
    }

  }
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number :");
    int num1 = sc.nextInt();
    System.out.println();
    System.out.println("If the number is prime we will return the same number Else We will return 0.");
    System.out.println();
    System.out.println(prime(num1));
  }
}
