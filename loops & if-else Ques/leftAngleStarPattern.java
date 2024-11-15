import java.util.Scanner;

public class leftAngleStarPattern {

  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter the number for making LeftAngleStarPattern :");
    int row = obj.nextInt();
    // for row
    for (int i = 0; i < row; i++) { // for space
      for (int j = row - i; j >= 0; j--) {
        System.out.print(" ");
      } // for printing *
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      } // for making bakance
      System.out.println();
    }
  }
}




