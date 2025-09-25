import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ship cost: ");
        int shipCost = input.nextInt();
        double itemPrice = input.nextDouble();
        double shippingCost;
        if (itemPrice >= 100) {

            shippingCost = shipCost * 0.02; // 2% of the itemPrice
            double totalCost = shippingCost + itemPrice;
            System.out.println("Shipping cost: " + 2 % shippingCost);
            System.out.println("Total Price: " + 2 % totalCost);
        }
    }
}