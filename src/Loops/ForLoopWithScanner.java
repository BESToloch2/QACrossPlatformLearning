package Loops;

import java.util.Scanner;

public class ForLoopWithScanner {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter how many numbers you would like");

        int count = input.nextInt();
        int sum=0;
        for (int i=1;i<count;i++){
            System.out.println("Please enter a number");
            sum+=input.nextInt();
        }



    }
}
