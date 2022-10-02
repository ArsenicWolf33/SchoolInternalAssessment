import java.util.Scanner;

public class PhoneBill
{
    String customerName;
    long phoneNumber;
    int no_of_units;
    int rent;
    float amount;

    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        PhoneBill obj = new PhoneBill();

        obj.accept();
        obj.display();
    }

    void calculate()
    {
        float cost = 1;

        if (no_of_units <= 50)
        {
            cost = 0;
        }
        else if (no_of_units>50 && no_of_units<=150)
        {
            cost = (no_of_units - 50) * 0.8f;
        }
        else if (no_of_units>150 && no_of_units<=350)
        {
            cost = (no_of_units-50) + (100 * 0.8f) + ((no_of_units - 150) * 1.0f);
        }
        else if (no_of_units>350)
        {
            cost = (no_of_units-50) + (100 * 0.8f) + ((no_of_units - 150) * 1.0f) + ((no_of_units - 350) * 1.2f);
        }
    }

    PhoneBill()
    {
        customerName = "Raju";
        phoneNumber = 259461;
        no_of_units = 50;
        rent = 100;
        amount = 100;
    }

    void accept()
    {
        PhoneBill obj = new PhoneBill();
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter customer name");
        customerName = sc.nextLine();
        System.out.println("Enter phone number");
        phoneNumber = sc.nextInt();
        System.out.println("Enter number of units");
        no_of_units = sc.nextInt();
        System.out.println("Enter rent");
        rent = sc.nextInt();
        obj.calculate();
    }

    void display()
    {
        System.out.println("Name: " + customerName);  
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Number of Units: " + no_of_units);
        System.out.println("Rent: " + rent);
        System.out.println("Amount: " + amount);
    }
}
