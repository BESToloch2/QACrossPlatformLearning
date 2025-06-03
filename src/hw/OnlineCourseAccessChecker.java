package hw;

import java.util.Scanner;

public class OnlineCourseAccessChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int age;
        boolean hasPaid;
        boolean wantsCertificate;

        System.out.println("What is your age?");
        age = input.nextInt();

        System.out.println("Did you pay for the course?");
        hasPaid = input.nextBoolean();

        System.out.println("Do you want to get the certificate");
        wantsCertificate = input.nextBoolean();

        if (!hasPaid) {
            System.out.println("Access denied - you need to pay for the course first");

        } else if (age >= 18) {
            System.out.println("You have full access");

        } else {

            if (!wantsCertificate) {
                System.out.println("You have limited access");
            } else {
                System.out.println("Access denied - certificate not allowed for under 18");
            }
        }
        input.close();


    }
}
