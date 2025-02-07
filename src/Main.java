import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        double itemPrice = 0;
        double SHIPPING_FEE = .02;
        double shippingPrice = 0;
        double totalPrice = 0;
        System.out.println("How much is your item? ");
        Scanner in = new Scanner(System.in);
        if (in.hasNextDouble())
             {itemPrice = in.nextDouble();
                 in.nextLine();
        }
        if (itemPrice >= 100)
        { totalPrice = itemPrice;
            System.out.println("Congrats! You qualify for free shipping. The total cost on your item is: " + totalPrice);}
        else
        {
            shippingPrice = itemPrice * SHIPPING_FEE;
            totalPrice = itemPrice + shippingPrice;
            System.out.println("The cost of shipping is " + shippingPrice + ", therefore making the total cost " + totalPrice + ".");
        }
    }
}