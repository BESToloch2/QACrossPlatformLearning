package hw;

import java.util.Scanner;

public class StudentAverages {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int n=-1;
        int numCheck=0;
        int sum=0;

        while(true){
            System.out.println("enter the number of exams(1-5)");
            n= input.nextInt();

            if (n>0&&n<6)break;

            System.out.println("Invalid number.It must be between 1 to 5. Try again");
        }


        int[]grades=new int[n];

        for (int i=0;i<grades.length;i++){
            System.out.println("Enter the grade");
            numCheck=input.nextInt();
            if (numCheck>100||numCheck<0){
                System.out.println("Invalid grade. Enter 1-100");
                i--;
                continue;
            }
            grades[i]=numCheck;
            sum+=grades[i];

        }

        double avg=0;

        avg=(double) sum/ grades.length;
        System.out.printf("Average grade is %.2f%n",avg);


        input.close();
    }
}
