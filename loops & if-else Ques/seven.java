public class seven {
    public static void main(String[] args) {
        int a = 4 ;
        for (int row = 1; row <= a; row++  ){
              
        // space 
        for ( int space = (a - row); space >= 0; space--) {
            System.out.print(" ");
        }
         
        // star 
        for (int col = 1 ;col <= row ; col++){
            System.out.print("*");
        }
         System.out.println();

        }
    }
}
