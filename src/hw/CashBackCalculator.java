package hw;

public class CashBackCalculator {
    public static void main(String[] args) {

        double unitPrice = 17.99;
        int quantity = 4;
        double taxRate = 0.0825;
        boolean vipCustomer = true;

        double subtotal = unitPrice * quantity;

        if(quantity>5){
            subtotal*=0.09;
            System.out.println("Your discount is 10%");
        }

        subtotal+=subtotal*taxRate;//add taxes to subtotal

        double cashback = 0.0;

        if(vipCustomer&&subtotal>100){
            cashback=subtotal*0.05;
            subtotal-=cashback;
            System.out.println("You have a 5% cashback");
        }else {
            System.out.println("You don`t have a cashback");
        }


        System.out.println("Final total: $" + subtotal + " (Quantity: " + quantity + ", Cashback: " + cashback + ")");
    }
}