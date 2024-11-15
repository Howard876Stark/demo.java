public class Finding_Max_and_Min {
    public static void main(String[] args) {
        int[] array = { 2, 6, 9, 7 };
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            } else if (min > array[i]) {

                min = array[i];
            }
           
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}
