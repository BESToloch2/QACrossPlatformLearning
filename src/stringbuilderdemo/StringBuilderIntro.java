package stringbuilderdemo;

public class StringBuilderIntro {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Java");
        String s= sb.toString();
        sb= new StringBuilder(s);



    }
}
