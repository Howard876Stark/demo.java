public class five {
    public static void main(String[] args) {

        int digit1,digit2,digit3;
        for(int number = 1; number <= 500; number++)
	{
        int temp = number;
    digit1 = temp % 10;

        temp = temp / 10;
        digit2 = temp % 10;
        
        temp = temp / 10;
        digit3 = temp % 10;

    if(digit1*digit1*digit1 + digit2*digit2*digit2 + digit3*digit3*digit3 == number)
    // 1    *  1    *   1   +  5    *  5    *   5   +  3   *   3   *  3   == 153
        {
        System.out.println(number);
        }
}

    }
}
