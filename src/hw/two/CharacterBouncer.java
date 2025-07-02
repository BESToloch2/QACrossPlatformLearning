package hw.two;

public class CharacterBouncer {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("abcdefghij");

        for (int i = 2; i < sb.length(); i+=3) {

            sb.deleteCharAt(i);

        }
        System.out.println(sb);

    }
}
