package hw;

import java.util.Scanner;

public class MovieTicketWithScanner {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        double basePrice=12.00;
        double discount=0.0;
        double finalPrice = 0.0;

        System.out.println("Enter your age");
        int age= input.nextInt();

        System.out.println("Is this morning show(true/false)?");
        boolean morningShow=input.nextBoolean();

            if (age < 13) {
                System.out.println("Your discount is 50%");
              discount=0.5;
            } else if (age>=13&&age<17) {
                System.out.println("Your discount is 25%");
                discount=0.25;
            } else if (age>=65) {
                System.out.println("Your discount is 30%");
                discount=0.3;
            }

            if (morningShow){
                System.out.println("You got 10%=discount");
             discount+=0.1;
            }

        finalPrice=basePrice*(1-discount);
        System.out.println("Final prise is: $"+finalPrice);
        input.close();

    }
}
