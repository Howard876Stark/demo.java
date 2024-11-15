import java.util.Scanner;

public class twentytwo {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner obj = new Scanner(System.in);
        char str;
        int sum_Positive = 0; 
        int sum_Negative = 0;
        int sum_Zero = 0; 
        do {
            System.out.println("Enter number : ");
            int num = obj.nextInt();
            
            if (num==0){
                sum_Zero++;
            }else if (num>0){
                sum_Positive++;
            }else if (num<0){
                sum_Negative++;
            }else {
                System.out.println("String is not allowed ...........");
            }
            System.out.println("Y/N");
            str = obj.next().charAt(0);
            
        } while (str == 'Y'||str == 'y');

        System.out.println("positive count  : " + sum_Positive);
        System.out.println("negative count  : " + sum_Negative);
        System.out.println("zero count  : " + sum_Zero);
    }   
}
