import java.util.Scanner;

public class eleven {
    public static void main(String[] args) {
        System.out.print("Enter the number :");

        try (Scanner obj = new Scanner(System.in)) {
            int a = obj.nextInt();

            for (int i = 1; i <= 10; i++){
                System.out.println(a + " x " + i + " = " + a * i);
            }
        }
    }
}
