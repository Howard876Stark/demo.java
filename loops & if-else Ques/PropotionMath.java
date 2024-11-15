import java.util.Scanner;

public class PropotionMath {
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        class xzy {
        Scanner obj = new Scanner(System.in);

        }

        System.out.println("what do you have find Direct Proprtion or Inverse Propotion.");
        @SuppressWarnings("resource")

        Scanner obj = new Scanner(System.in);

        System.out.print("For Direct propotion Enter D or for Inverse Propotion Enter I :");

        char choise = obj.next().charAt(0);

        int x1;
        System.out.print("Enter x1 :");
        x1 = obj.nextInt();
        System.out.print("Enter y1 :");
        int y1 = obj.nextInt();
        System.out.print("Enter y2 :");
        int y2 = obj.nextInt();
        int result;
        int result2;
        int result3;

        if (choise=='i'||choise=='I'){
            result = x1 * y1;
            result2 = result / y2;
        }else{
            result = x1/y1;
            result2 = result*y2;
        }
        System.out.println(result2);
    }
}
