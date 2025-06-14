package hw;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        double num1,num2;
        char operation;
        double result=0;
        String perfomAgain="";


        do {
            System.out.println("Enter first number: ");
            num1 = input.nextDouble();
            System.out.println("Enter second number: ");
            num2 = input.nextDouble();

            System.out.println("Enter operation you want to perform: (Example +,-,*,/");
            operation = input.next().charAt(0);

                switch (operation) {

                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if (num1==0||num2==0){
                            System.out.println("Cannot divide by zero!");
                            continue;
                        }
                        result = num1 / num2;
                        break;

                    default:
                        System.out.println("Invalid operation");
                        continue;
                }

                System.out.println(result);

                do {
                    System.out.println("Do you want to perform another operation?(yes/no)");
                    perfomAgain=input.next();

                }while (!perfomAgain.equalsIgnoreCase("yes")&&!perfomAgain.equalsIgnoreCase("no"));


        }while (perfomAgain.equalsIgnoreCase("yes"));
        input.close();







    }
}

