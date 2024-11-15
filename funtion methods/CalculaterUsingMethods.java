import java.util.Scanner;
// the function of adding the two number.
public class CalculaterUsingMethods {
    public static int sum() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the num 1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the num 2: ");
        int num2 = sc.nextInt();

        return num1 + num2;

    }
    //the funtion for multiply two number.
    public static int multiply() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the num 1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the num 2: ");
        int num2 = sc.nextInt();

        return num1 * num2;
    }

    // the funtion of dividing yhr two number .
    public static int divide() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the num 1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the num 2: ");
        int num2 = sc.nextInt();

        return num1 / num2;
    }

    // the funtion of substrating the two number .
    public static int substract() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the num 1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the num 2: ");
        int num2 = sc.nextInt();

        return num1 - num2;
    }

    public static void main(String[] args) {

        // taking input
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("press 1 for sum ");
        System.out.println();

        System.out.println("press 2 for substraction");
        System.out.println();

        System.out.println("press 3 for multiply");
        System.out.println();

        System.out.println("press 4 for divide");
        System.out.println();

        System.out.print("Enter your dision:");
        int dision = sc.nextInt();

        // showing the result
        System.out.println();
        if (dision == 1) {
            System.out.println(sum());
        } else if (dision == 2) {
            System.out.println(substract());
        } else if (dision == 3) {
            System.out.println(multiply());
        } else if (dision == 4) {
            System.out.println(divide());
        } else {
            System.out.println("Please enter only 1,2,3,4 .....");
        }

    }
}
