public class Arr {
public static void main(String[] args) {
    int[] arr = {32,26,48,98,87,45,65};
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int i ;
    for (i = 0; i < 6; i++) {
      if (max < arr[i]) {
        max = arr[i];
      } else if (min > arr[i]){
        min = arr[i];
      }else {

      }
    }
    System.out.println("The biggest number is : " + max);
    System.out.println("The smallest number is : " + min);

  }
}