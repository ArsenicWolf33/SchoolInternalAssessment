import java.util.Scanner;

public class Question17
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a name with 3 words");
        String st = sc.nextLine();
        String str = st.trim() + " ";
        int len = str.length();
        int prev = 0;

        for (int i=0; i<len; i++)
        {
            char ch = str.charAt(i);

            if (Character.isWhitespace(ch))
            {
                String s = str.substring(prev, i);
                prev = i+1;
                System.out.print(s.charAt(0) + " ");
            }
        }
    }
}
