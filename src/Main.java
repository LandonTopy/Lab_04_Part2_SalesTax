import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double productPrice;
        double salesTax = 1.05;
        double totalPrice;

        System.out.println("What was the price?");
        productPrice = scan.nextDouble();
        totalPrice = productPrice * salesTax;
        System.out.println("The total price is $" + totalPrice);

    }
}