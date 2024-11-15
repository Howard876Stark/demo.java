import java.util.Scanner;

public class QuestionFour {
    public static void main(String[] args) {
      
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();

        natural(num);
    }

    public static void natural(int num) {

        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }

    }
}
