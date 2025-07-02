package hw.two;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter text");
        String test=input.nextLine();
        String toLow=test.toLowerCase().replace(" ","").replace(",","").
                replace(".","").replace("!","").replace("?","");


        for (int i = 0; i < test.length(); i++) {

            for (int j = test.length(); j ==toLow.length() ; j--) {

            }


        }





        input.close();


    }
}
