package hw;

public class FitnessTrackerDiscount {
    public static void main(String[] args) {


        int age=22;
        double basePrice=49.99;
        boolean vip=true;
        double finalPrice=0.0;
        double cashback=0.0;
        int ageDiscount=0;

        if (age < 18) {
            ageDiscount=30;
            finalPrice=basePrice*0.7;
            System.out.println("You hava a 30% discount");
        } else if (age>=18&&age<=25) {
            ageDiscount=20;
            finalPrice=basePrice*0.8;
            System.out.println("You hava a 20% discount");
        } else if (age>=26&&age<=40) {
            ageDiscount=10;
            System.out.println("You hava a 10% discount");
            finalPrice=basePrice*0.9;
        }else {
            ageDiscount=0;
            System.out.println("You don`t have a discount");
        }

        if (vip&&finalPrice>35){
            cashback=finalPrice-finalPrice*0.95;
            finalPrice-=cashback;
        }

        System.out.println("Base price: $"+basePrice);
        System.out.println("Age discount: "+ageDiscount+"%");
        System.out.println("Cashback: $"+cashback);
        System.out.println("Final payment: $"+finalPrice);



    }
}
