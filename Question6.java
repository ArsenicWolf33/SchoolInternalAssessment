import java.util.Scanner;

public class Question6
{
    public static void main()
    {
        for (int i=1; i<=2; i++)
        {

            Scanner sc = new Scanner (System.in);

            System.out.println("Enter the month");
            String month = sc.next();
            float charge = 0.0f;

            if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May"))
                charge = 13f;
            else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August"))
                charge = 19.50f;
            else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November"))
                charge = 8.75f;
            else if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February"))
                charge = 5.00f;
            else 
                System.out.println("Wrong month");

            System.out.println("Enter the number of days rented");
            int days = sc.nextInt();

            double amount = 0d;

            if (days > 7)
            {
                amount = (0.75f) * charge * days;
            }

            else 
                amount = days * charge;

            System.out.println("Deposit =  1000 \nFinal Amount = " + (amount+1000)); 
        }
    }
}

