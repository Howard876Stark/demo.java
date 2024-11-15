public class Finding_Common_In_Two_String {
  
  public static void main(String[] args) {
    String[] array = { "Tony", "Banner", "Captain", "Doctor", "Loki", "Thor" };

    String[] array2 = { "Thanos", "Loki", "Hella", "Wonda", "Fantastic", "Elumminaunty" };

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array2.length; j++) {

        if (array[i] == array2[j]) {
          System.out.println(array[i]);
        }

      }
    }


  }
}