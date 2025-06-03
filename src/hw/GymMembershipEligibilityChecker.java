package hw;

import java.util.Scanner;

public class GymMembershipEligibilityChecker {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your age");
        int age= input.nextInt();

        System.out.println("Do you have a medical certificate?(true/false)");
        boolean hasDocs=input.nextBoolean();

        System.out.println("Do you prefer a group training(true/false)");
        boolean group=input.nextBoolean();

        if(!hasDocs){
            System.out.println("Not eligible");

        } else if (age>=18) {
            System.out.println("Eligible");

        } else if (group) {
            System.out.println("Eligible");

        }else {
            System.out.println("Not eligible");
            }

        input.close();
        }
}
