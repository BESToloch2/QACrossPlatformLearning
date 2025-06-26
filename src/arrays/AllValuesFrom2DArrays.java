package arrays;

public class AllValuesFrom2DArrays {
    public static void main(String[] args) {
        int[][] numbers = {
                {1, 2, 3},
                {10, 20, 30, 40, 50},
                {100, 200}
        };

        for(int[]r:numbers){

            for (int c:r){
                System.out.print(c+" ");

            }

            System.out.println();

        }


        String[][] countries={
                {"USA","Canada"},
                {"Peru","Brazil","Argentina"},
                {"France","Italy","Portugal","Belgium","Germany"},
                {"Japan","South Korea"}
        };

        for (String [] continent:countries){
            for (String country:continent){
                System.out.print(country+" ");
            }
            System.out.println();
        }




    }

}
