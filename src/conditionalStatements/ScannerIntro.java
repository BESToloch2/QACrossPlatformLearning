package conditionalStatements;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your full name");
        String fullName=input.nextLine();
        System.out.println("Your name is "+fullName);


        System.out.println("Please enter your age");
        int age=input.nextInt();
        System.out.println("My age is "+age);

        System.out.println("Which school you are currently study?");
        String school=input.next();
        System.out.println(school);

        System.out.println("Please enter your grade");
        char grade=input.next().charAt(0);

        System.out.println(grade);

        System.out.println("Do you like?");
        boolean like=input.nextBoolean();
        input.close();


    }
}
