package conditionalStatements;

public class SwitchStatement {
    public static void main(String[] args) {

        String choise="juice";

        switch (choise){

            case "water":
                System.out.println("Dispensing water");
                break;
            case "soda":
                System.out.println("Dispensing soda");
                break;
            case "juice":
                System.out.println("Dispensing juice");
                break;
            case "coffee":
                System.out.println("Dispensing coffee");
            default:
                System.out.println("Your drink isn`t available");
                break;

        }





    }
}
