package hw;

import java.util.Scanner;

public class SearchWithContinue {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[]arr={3,5,7,3,9,3};
        System.out.println("Enter the number");
        int x= input.nextInt();
        boolean found=false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]!=x) continue;
            System.out.println("Index: "+i);
            found=true;
        }

        if (found!=true) System.out.println("Not found");

        input.close();
    }
}
