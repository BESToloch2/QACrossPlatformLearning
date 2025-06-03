package hw;

import java.util.Scanner;

public class ScannerInputSummary {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name");
        String name= input.next();
        System.out.println("Enter your age");
        int age= input.nextInt();
        System.out.println("Enter your height");
        int height=input.nextInt();
        System.out.println(name+" "+age+" "+height);
        input.close();
    }
}
