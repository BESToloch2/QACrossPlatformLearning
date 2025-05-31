package conditionalStatements;

public class MoreNestedIf {
    public static void main(String[] args) {

        boolean member=false;
        double purchaseAmount=12;

        if(member){

            if(purchaseAmount>100){
                System.out.println("You have 15% discount");
            }else {
                System.out.println("You have 10% discount");
            }

        }else{
            if(purchaseAmount>100){
                System.out.println("you have a 5% discount");
            }else {
                System.out.println("You dont have a discount");
            }



        }


    }
}
