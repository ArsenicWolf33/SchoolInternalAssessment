import java.util.Scanner;

public class FruitJuice
{
    int product_code;
    String flavour;
    String pack_type;
    int pack_size;
    int product_price;

    public static void main()
    {
        FruitJuice obj = new FruitJuice();
        obj.input();
        obj.discount();
        obj.display();
    }
    FruitJuice()
    {
        product_code = 0;
        flavour = "";
        pack_type = "";
        pack_size = 0;
        product_price = 0;
    }

    void input()
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter product code");
        product_code = sc.nextInt();
        System.out.println("Enter product flavour");
        flavour = sc.next();
        System.out.println("Enter pack type");
        pack_type = sc.next();
        System.out.println("Enter pack size");
        pack_size = sc.nextInt();
        System.out.println("Enter product price");
        product_price = sc.nextInt();
    }

    void discount()
    { 
        product_price -= 10;
    }

    void display()
    {
        System.out.println("Product code: " + product_code);
        System.out.println("Flavour: " + flavour);
        System.out.println("Pack type: " + pack_type);
        System.out.println("Pack size: " + pack_size);
        System.out.println("Product price: " + product_price);
    }
}
