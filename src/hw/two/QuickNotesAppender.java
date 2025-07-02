package hw.two;

import java.util.Scanner;

public class QuickNotesAppender {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        StringBuilder note=new StringBuilder();
        String str="";
        do {
            System.out.println("Enter note");
            str=input.nextLine();

            if (str.equalsIgnoreCase("exit")) break;
            if (str.isBlank())continue;
            note.append(str).append("\n");

        }while(true);

        System.out.println(note);


        input.close();
    }
}
