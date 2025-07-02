package hw;

public class TwoDArraySmallTable {
    public static void main(String[] args) {


        int [][]m=new int[3][3];
        int count=1;


        for (int i = 0; i < m.length; i++) {

            for (int j = 0; j <m[i].length ; j++) {
                m[i][j]=count;
                count++;
            }
        }

        for (int [] r:m){

            for (int c:r){
                System.out.printf("%2d ",c);
            }
            System.out.println();
        }

    }

}
