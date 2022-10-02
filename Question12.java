import java.util.Scanner;

public class Question12
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        Question12 obj = new Question12();
        
        System.out.println("Enter the number of terms for the series");
        double n = sc.nextDouble();
        double sum1 = obj.series(n);
        System.out.println(sum1);
        System.out.println();
        
        System.out.println("Enter the numerator for the second series");
        double x = sc.nextDouble();
        System.out.println("Enter the number of terms for the second series");
        int n1 = sc.nextInt();
        double sum2 = obj.series(x, n1);
        System.out.println(sum2);
        System.out.println();
    }
    
    public double series (double n)
    {
        double sum = 0;
        
        for (int i=1; i<=n; i++)
        {
            double current_term = (1.0)/findfact(i);
            sum += current_term;
        }
        return sum;
    }
    
    public double series (double x, int n)
    {
        double sum = 0;
        
        for (int i=1; i<=n; i++)
        {
            double current_term = Math.pow(x, i)/findfact(i);
            sum += current_term;
        }
        return sum;
    }
    
    public static int findfact (int num)
    {
      int fact = 1;
        for (int i=1; i<=num; i++)
      {
          fact *= i;
      }
      return fact;
    }
}
