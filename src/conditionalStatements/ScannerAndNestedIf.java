package conditionalStatements;

import java.util.Scanner;

public class ScannerAndNestedIf {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        double balance=0.0;
        System.out.println("Do you have a credit card?");
        String cardAvailability=input.next();

        if (cardAvailability.equalsIgnoreCase("yes")){
            System.out.println("Wha is the balance on your CC?");
            balance=input.nextDouble();
            if (balance>1000){
                System.out.println("Please pay off your balance immediately");
            }else {
                System.out.println("You are in a good standing");
            }


        } else if (cardAvailability.equalsIgnoreCase("no")) {
            System.out.println("Woud you like to apply to get one?");
        }else {
            System.out.println("Invalid input");
        }
        input.close();


    }
}
