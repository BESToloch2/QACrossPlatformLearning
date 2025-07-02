package hw.two;

public class IDMasker {
    public static void main(String[] args) {

        String digits="1234567890";
        StringBuilder sb=new StringBuilder(digits);
        sb.delete(2,8);
        sb.insert(2,"*******");
        System.out.println(sb);
    }
}
