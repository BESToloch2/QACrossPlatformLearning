package operators;

public class TypeCasting {
    public static void main(String[] args) {

        byte bNum=10;
        short sNum=bNum;
        System.out.println(sNum);

        int integer=20;
        double decimal=integer;
        System.out.println(decimal);

        double price = 10.5;
        int intNum =(int)price;
        System.out.println(intNum);

        short sValue=129;
        byte byteNum=(byte) sValue;
        System.out.println(byteNum);
    }
}
