package hw;

import java.util.Scanner;

/*
Считай от пользователя N (сколько оценок будет введено).

Создай int[] grades = new int[N] и заполни его введёнными значениями (0 – 100).

Выведи:

минимальную и максимальную оценку;

среднее значение по классу (double, 2 знака после запятой);

        количество учеников, получивших оценку ≥ 90.

Что проверяет:
объявление/инициализацию массивов, проход циклом for, использование условных операторов, работу с double.

*/





public class SimpleArray {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("How many grades?");
        int n=input.nextInt();

        int [] grades=new int[n];                                             //Create a array

        for (int i=0;i<n;i++){                                  //Fill it
            System.out.println("Grade #"+(i+1)+": ");
            grades[i]=input.nextInt();
        }

        System.out.println("\nYou entered:");           //Printing it
        for (int g:grades){
            System.out.println(g+" ");
        }

        //Calculating sum n avg

        int sum=0;
        for (int g:grades) sum+=g;
        System.out.println("The sum of all grades is: "+sum);

        double avg=(double)sum/grades.length;
        System.out.printf("Avg number is: %.2f%n",avg);

        int min=grades[0];
        int max=grades[0];

        for(int g:grades){
            if (g<min) min=g;
            if (g>max) max=g;
        }
        System.out.println("Min grade is: "+min+", and max grade is: "+max);

        int moreThen90=0;
        for (int g:grades) {
            if (g >= 90) moreThen90++;
        }
        System.out.println("Number of A grades(>=90) is: "+moreThen90);

       /* int sum = 0;
        int min = grades[0];
        int max = grades[0];
        int countA = 0;

        for (int g : grades) {
            sum += g;
            if (g < min) min = g;
            if (g > max) max = g;
            if (g >= 90) countA++;
        }
*/
        input.close();
    }
}
