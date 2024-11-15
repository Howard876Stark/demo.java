import java.util.Scanner;

public class SolidRectangle {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the length of rectangle :");
        int width = obj.nextInt();
        System.out.print("Enter the width of rectangle :");
        int length = obj.nextInt();

        for (int i = 0; i <=width ; i++) {
            for (int j = 0; j <= length; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
