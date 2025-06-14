package hw;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayWithBreakKeywordsAndForEachLoop {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int [] grades=new int[100];
        int count=0;

        System.out.println("Enter a grade (0–100): ");

        while (count<grades.length){

            System.out.print("Grade #" + (count + 1) + ": ");
            int g=input.nextInt();

            if (g==-1) break;

            if (g < 0 || g > 100) {
                System.out.println("Invalid grade, skipped.");
                continue;
            }
            grades[count]=g;
            count++;
        }

        if (count==0) {
            System.out.println("No grades entered. Program terminated.");
            return;
        }

        int [] actual= Arrays.copyOf(grades,count);



        System.out.println("You entered: "+Arrays.toString(actual));

        int sum=0;
        for (int a:actual) sum+=a;
        System.out.println("Sum of all nums is: "+sum);

        int min=actual[0],max=actual[0],countA=0;

        for (int a:actual){
            if (min>a) min=a;
            if (max<a) max=a;
            if (a>=90) countA++;
        }

        System.out.println("Min num is: "+min);
        System.out.println("Max num is: "+max);
        System.out.println("You have "+countA+" grades higher or equal 90");

        double avg=(double)sum/actual.length;
        System.out.printf("Avg num of an array is: %.2f%n",avg);

        input.close();
    }
}
