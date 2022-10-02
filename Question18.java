import java.util.Scanner;

public class Question18
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a string");
        String inp = sc.nextLine();
        String str = inp.trim() + " ";
        int len = str.length();
        int prev = 0;

        System.out.println("Enter a word to search for");
        String word = sc.next();
        int counter = 0;

        for (int i=0; i<len; i++)
        {
            char ch = str.charAt(i);

            if (Character.isWhitespace(ch))
            {
                String st = str.substring(prev, i);
                prev = i+1;

                if (st.equalsIgnoreCase(word))
                    counter++;
            }
        }

        System.out.println("The word " + word + "appears in the given string " + counter + " times");
    }
}
