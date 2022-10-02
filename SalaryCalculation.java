import java.util.Scanner;

public class SalaryCalculation
{
    String name;
    double basicPay, specialAlw, conveyanceAlw, gross, pf, netSalary, AnnualSal;

    public static void main()
    {
        SalaryCalculation obj = new SalaryCalculation();

        obj.SalaryCal();
        obj.display();
    }

    SalaryCalculation()
    {
        name = ("Robert Langdon");
        basicPay = 400000;
        conveyanceAlw = 10000;        
    }

    void SalaryCal()
    {
        specialAlw = 0.25f * basicPay;
        gross = basicPay + specialAlw + conveyanceAlw;
        netSalary = gross - pf;
        AnnualSal = 12 * netSalary;
    }

    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("Special Allowance: " + specialAlw);
        System.out.println("Gross Salary: " + gross);
        System.out.println("Net Salary: " + netSalary);
        System.out.println("Annual Salary: " + AnnualSal);
    }
}
