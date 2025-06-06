package hw;

import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter amount");
        double amount=input.nextDouble();
        double exchangeRate=0.0;
        double exchangeResult=0.0;

        System.out.println("Enter currency code(Example: eur, uah, gbp, yen)");
        String currencyCode=input.next().toLowerCase(Locale.ROOT);

        switch (currencyCode){

            case "eur":
                exchangeRate=1.07;
                break;
            case "uah":
                exchangeRate=0.027;
                break;
            case "gbp":
                exchangeRate=1.25;
                break;
            case "yen":
                exchangeRate=0.0064;
                break;
            default:
                System.out.println("Unknown currency");
                input.close();
                return;

        }

        exchangeResult = amount * exchangeRate;
        System.out.printf("Result: $%.2f%n",exchangeResult);

        input.close();

    }
}
