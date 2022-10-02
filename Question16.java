import java.util.Scanner;

public class Question16
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);

        if (Character.isLetter(ch))
        {
            if (Character.isUpperCase(ch))
            {
                System.out.println("Upper Case Letter");
            }
            else
                System.out.println("Lower Case Letter");
        }
        else
            System.out.println("Not a letter");
    }
}