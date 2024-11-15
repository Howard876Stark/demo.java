public class Finding_Common_In_Two_Array {
  public static void main(String[] args) {
    int[] array = { 51, 61, 21, 31, 41, 81, 71 };

    int[] array2 = { 31, 64, 25, 94, 78, 51, 69 };

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array2.length; j++) {

        if (array[i] == array2[j]) {
          System.out.println(array[i]);
        }

      }
    }
  }
}