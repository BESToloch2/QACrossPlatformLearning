package hw;

public class JavaTypeCastingLab {
    public static void main(String[] args) {

        int items=7;
        int totalWeight=16;

        double avgWeight=(double) totalWeight/items;
        System.out.println("Total weight: "+totalWeight+" kg");
        System.out.println("Number of items: "+items);
        System.out.println("Average weight per item "+avgWeight+" kg");

        int intAvgWeight=(int)avgWeight;
        System.out.println("Aproximate rounded weight per item: "+intAvgWeight+" kg");







    }
}
