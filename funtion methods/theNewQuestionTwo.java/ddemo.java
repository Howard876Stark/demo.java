public class ddemo {
    
    public static void main(String[] args) {

        int arr[] = { 10, 12, 13 };
    

        int arr2[] = arr.clone();

        arr2[1] = 55;
      
       System.out.println("arr 1 ");
       // for (int i = 0; i < arr.length; i++) {
       //     System.out.println(arr[i]);
       // }.
       for (int i : arr) {
    
           System.out.println(i);
    
   }
       System.out.println("arr 2 ");
       for (int i = 0; i < arr2.length; i++) {
    
           System.out.println(arr2[i]);
    
  }
    }

}
