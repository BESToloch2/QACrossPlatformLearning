package hw;

public class WUStringQuickTools {
    public static void main(String[] args) {

        String s="  hello WORLD";
        System.out.println(s.trim().length());
        System.out.println(s.trim().toLowerCase());
        System.out.println(s.trim().toUpperCase());
        System.out.println(s.trim().toLowerCase().replace("h","H"));
        System.out.println(s.trim().startsWith("he"));
        System.out.println(s.trim().toLowerCase().endsWith("ld"));

    }
}
