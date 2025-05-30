package conditionalStatements;

public class NestedIf {
    public static void main(String[] args) {
        boolean shipped=false;
        boolean delivered=true;

        if(shipped){
            System.out.println("Order has been shipped");

            if(delivered){
                System.out.println("Product has been delivered");
            }else {
                System.out.println("Product is in transit");
            }

        }else {
            System.out.println("Order has`t been shipped yet");
        }





    }
}
