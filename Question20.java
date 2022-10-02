import java.util.Scanner;

public class Question20
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter year of graduation");
        int year = sc.nextInt();
        int years[] = {1982,1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010};

        int high = 9;
        int low = 0;
        int flag = 0;

        while (low <= high)
        {
            int mid = (low+high)/2;            

            if (years[mid] == year)
            {
                flag = 1;
                break;
            }

            else if (years[mid] < year)
                low = mid+1;

            else if (years[mid] > year)
                high = mid-1;
        }

        if (flag == 1)
            System.out.println("Year found in list");
        else
            System.out.println("Not found");
    }
}
