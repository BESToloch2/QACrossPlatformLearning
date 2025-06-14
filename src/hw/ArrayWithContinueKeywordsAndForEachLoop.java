package hw;

import java.util.Scanner;

public class ArrayWithContinueKeywordsAndForEachLoop {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("How many grades?");
        int n=input.nextInt();

        int [] grades=new int[n];

        System.out.println("Enter a grade (0–100): ");

        for (int i=0;i<grades.length;i++){

            System.out.print("Grade #" + (i + 1) + ": ");
            int g=input.nextInt();

            if (g<0||g>100) {
                System.out.println("Invalid grade, skipped.");
                i--;
                continue;
            }
            grades[i]=g;

        }

        for (int g:grades) System.out.print(g+" ");
        System.out.println();

        int sum=0;
        for (int g:grades) sum+=g;
        System.out.println("Sum of all nums is: "+sum);

        int min=grades[0],max=grades[0],countA=0;
        for (int g:grades){
            if (min>g) min=g;
            if (max<g) max=g;
            if (g>=90) countA++;
        }
        System.out.println("Min num is: "+min);
        System.out.println("Max num is: "+max);
        System.out.println("You have "+countA+" grades higher or equal 90");

        double avg=(double)sum/grades.length;
        System.out.printf("Avg num of an array is: %.2f%n",avg);

        input.close();
    }


}
