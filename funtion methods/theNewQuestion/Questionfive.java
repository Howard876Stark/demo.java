import java.util.Scanner;

public class Questionfive {
    public static void odd(int num) {
        if (num % 2 == 0) {

        } else {
            System.out.println("N");
        }

    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        odd(num);
    }

}
