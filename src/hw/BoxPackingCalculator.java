package hw;

import java.util.Scanner;

public class BoxPackingCalculator {
    public static void main(String[] args) {

        int totalItems= 57;
        int itemsPerBox=8;

        int fullBoxes=totalItems/itemsPerBox;
        int lastBoxItems=totalItems%itemsPerBox;
        int totalBoxes=(lastBoxItems>0)?fullBoxes+1:fullBoxes;
        System.out.println(totalBoxes);



    }
}
