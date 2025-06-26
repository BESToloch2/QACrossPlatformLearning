package hw;

import java.util.Scanner;

public class GradeBookAnalyzer {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int students;
        int exams;
        int count=1;


        System.out.println("How many students in a group?(1-30)");
        students= input.nextInt();

        System.out.println("How many exams?(1-10)");
        exams= input.nextInt();

        int[][] table=new int [students][exams];

        for (int i = 0; i < table.length; i++) {

            for (int j = 0; j <table[i].length ; j++) {
                System.out.println("Enter grade for student "+(i+1)+", exam "+(j+1)+": ");
                int grade=input.nextInt();

                if (grade<0||grade>100){
                    System.out.println("Invalid, try again");
                    j--;
                    continue;
                }

                table[i][j]=grade;
            }

        }

        for (int [] t:table){

            for (int r:t){
                System.out.println("Student "+count+": ");
                System.out.print("Exam "+count+": "+r+" ");
            }
            System.out.println();
            count++;
        }

        int min=table[0][0];
        int max=table[0][0];
        double sum=0;
        double avgStudent;
        double avgExam;
        int studentSum=0;
        int examSum=0;
        int aCount=0;

        for (int [] t:table){
            for (int r:t){
                if (r>=90)aCount++;
                if (r>max)max=r;
                if (r<min)min=r;
                sum+=r;
            }
        }

        System.out.println("Number of A grades: "+aCount);
        System.out.println("max grade: "+max);
        System.out.println("Min grade: "+min);


        input.close();
    }
}
