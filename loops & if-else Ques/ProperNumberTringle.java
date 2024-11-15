import java.util.Scanner;

public class ProperNumberTringle {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number for ProprerTriangle :");
        int row = obj.nextInt();
        int i;
        // for row
        for ( i = 0; i < row; i++) { 
              
            // for space.
            
            
            for (int j = row - i; j >= 0; j--) {
                // System.out.print(" ");
                
            } 
            
            // for printing i.
            
            for (int j = 0; j <= i; j++) {
                 System.out.print(i + " " );
                
                }
                
                // for making balance
                
                System.out.println();
                
        }//<it is first loop closed curve.
    }
}
