import java.util.Scanner;

public class twentythree {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner obj = new Scanner(System.in); 
        System.out.println("enter th enumber ");
        String num = obj.nextLine();
        int len = num.length();
        System.out.println(len);
        System.out.println(num); 
    }
}
