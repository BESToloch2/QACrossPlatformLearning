package operators;

public class CompoundAssignmentOperators {
    public static void main(String[] args) {

        int result=5;
        result=result+10;
        System.out.println(result);

        result+=10;
        System.out.println(result);

        result-=20;
        System.out.println(result);

        result*=10;
        System.out.println(result);

        result/=5;
        System.out.println(result);

        result%=4;
        System.out.println(result);
    }
}
