package hw;

import java.util.Scanner;

public class BasicSalaryTaxCalculator {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        double salary;
        double finalSalary=0.0;
        double taxes=0.0;
        double taxAmount;



        System.out.println("What is your monthly salary?");
        salary=input.nextDouble();


        if (salary<1000){
            System.out.println("Your salary is not taxed.");

        } else if (salary>=1000&&salary<4999) {
            System.out.println("Your salary is taxed at 10%");
            taxes=0.1;

        } else if (salary>=5000&&salary<9999) {
            System.out.println("Your salary is taxed at 20%");
            taxes=0.2;

        } else if (salary>=10000) {
            System.out.println("Your salary is taxed at 30%");
            taxes=0.3;

        }

        finalSalary=salary*(1-taxes);
        taxAmount=salary-finalSalary;
        input.close();


        System.out.println("Your tax amount is: $"+taxAmount+". Your final salary is: $"+finalSalary);





    }
}
