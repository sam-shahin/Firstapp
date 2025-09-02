import java.net.SocketTimeoutException;
import java.text.NumberFormat;
import java.util.Scanner;

public class SamsClub {
    public static void main(String[] args){
        double purchaseAmount = 0.00;
        double paymentAmount = 0.00;
        Changer ch;

        final double TOLERANCE = 0.001;
        Scanner scan = new Scanner(System.in);
        NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();

        System.out.print("Insert the purchase amount: ");
        purchaseAmount = scan.nextDouble();
        System.out.print("Insert the payment amount: ");
        paymentAmount = scan.nextDouble();

        while(paymentAmount < purchaseAmount) {
            System.out.println("That's not enough money! Try again");
            paymentAmount = scan.nextDouble();
        }
        ch = new Changer(purchaseAmount, paymentAmount, TOLERANCE);

        System.out.print("Your changes is");
        System.out.println(moneyFormat.format(paymentAmount - purchaseAmount));
        System.out.println("That's: ");

        ch.printChanges();
    }
}
