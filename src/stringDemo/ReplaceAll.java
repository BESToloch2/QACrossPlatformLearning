package stringDemo;

public class ReplaceAll {
    public static void main(String[] args) {

        String str="SAD FHJKS sdf193410() *#$";
        System.out.println(str.replaceAll("[A-Z]","*"));
        System.out.println(str.replaceAll("[^A-Z]",""));
        System.out.println(str.replaceAll("[^A-Za-z0-9]",""));
        System.out.println(str.replaceAll("[\\s]",""));
        System.out.println(str.replaceAll(" ",""));
    }
}
