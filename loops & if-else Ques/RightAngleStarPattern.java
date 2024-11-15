import java.util.Scanner;

public class RightAngleStarPattern {
    public static void main(String[] args) {
@SuppressWarnings("resource")
Scanner obj = new Scanner(System.in);  

System.out.print("Enter the number for making star formate:");
int row = obj.nextInt();

 // for the row 
for(int i=0; i<row; i++)   
{   // for printing the "*" 
for(int j=0; j<=i; j++)   
{    
System.out.print("*");   
}   
System.out.println();   
    }
}
}