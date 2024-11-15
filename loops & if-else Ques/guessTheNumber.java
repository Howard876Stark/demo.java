import java.util.Scanner;

public class guessTheNumber {
  public static void main(String[] args) {
    // question 17
    // Write a program that generates a random number and asks the user to guess
    // what the number is. If the user's guess is higher than the random number, the
    // program should display "Too high, try again." If the user's guess is lower
    // than the random number, the program should display "Too low, try again." The
    // program should use a loop that repeats until the user correctly guesses the
    // random number.
    
    int num = (int) Math.floor((Math.random() * 100) + 1);
    System.out.println("Now, let's play the game");
    System.out.println("Guess the number what is in the my mind");
   
    
    do {
      @SuppressWarnings("resource")
      Scanner obj = new Scanner(System.in);
      System.out.print("Enter the number :");
      int guess = obj.nextInt();

      if (guess == num) {
        System.out.println("Wow , you guess the right number.");
        break;
      } else if (guess < num) {
        System.out.println("You are guessing So, low.");
      }else {
        System.out.println("You are guessing So, high.");
      }
    } while (true);

  }
}