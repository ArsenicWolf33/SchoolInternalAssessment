import java.util.Scanner;

public class Question19
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter 10 names");
        String names[] = new String[10];

        for (int i=0; i<10; i++)
        {
            names[i] = sc.nextLine();
        }

        for (int i=0; i<10-1; i++)
        {
            for (int j=0; j<10-1-i; j++)
            {
                if (names[j].compareToIgnoreCase(names[j+1]) > 0)
                {
                    String temp = names[j];
                    names[j] = names[j+1];
                    names[j+1] = temp;
                }
            }
        }

        for ( int i=0; i<10; i++)
        {
            System.out.println(names[i]);
        }
    }
}
