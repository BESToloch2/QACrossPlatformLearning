package hw.two;

import java.util.Scanner;

public class ReverseThePhrase {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter the line of text");
        String str=input.nextLine();
        StringBuilder sb= new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);

        input.close();
    }
}
