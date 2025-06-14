package arrays;

public class BreakKeyWord {
    public static void main(String[] args) {

        String[]actionCars={"Toyota","Tesla","Ford","Mercedes","Kia","Honda"};

        for (String c:actionCars){

            System.out.println(c);

            if (c.equalsIgnoreCase("Mercedes")) break;

        }



    }
}
