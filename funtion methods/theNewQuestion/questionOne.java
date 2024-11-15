import java.util.Scanner;

public class questionOne {
    public static int circumference (int r){
         int d = 2*r;
        int  pai = 22/7;

        int result = d*pai;

        return result;
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle :");
        int r = sc.nextInt();
        System.out.println(circumference(r));
    }
}
