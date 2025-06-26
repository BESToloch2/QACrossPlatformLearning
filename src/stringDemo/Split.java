package stringDemo;

public class Split {
    public static void main(String[] args) {


        String str="Java is easy. Java is fun";
        str.split("[.]");
        String[] strArr=str.split("[.]");
        System.out.println(strArr.length);

        for (String s:strArr) System.out.println(s.trim());
    }
}
