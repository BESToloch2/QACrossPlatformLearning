package stringDemo;

public class E7StringDemo {
    public static void main(String[] args) {

        String str="Hello Syntax";
        System.out.println(str.indexOf('S'));

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i)=='l'){
                System.out.println(i);
            }

        }


    }
}
