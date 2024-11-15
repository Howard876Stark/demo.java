import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string :");
        String str = sc.nextLine();
        System.out.println("You have enter :" + str );
    }
}
