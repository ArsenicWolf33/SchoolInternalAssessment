import java.util.Scanner;

public class Question8
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        Question8 obj = new Question8();

        for (int i=100; i<=999; i++)
        {
            int sum = obj.Armstrong(i);
            if (sum == i)
                System.out.print(i + " ");
        }
    }

    public int Armstrong(int num)
    {
        int sum = 0;
        while (num > 0)
        {
            int digit = num%10;
            sum += Math.pow(digit, 3);
            num /= 10;
        }

        return sum;
    }
}
