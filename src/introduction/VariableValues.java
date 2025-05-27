package introduction;

public class VariableValues {
    public static void main(String[] args) {

        String name, lastName,state;
        int age=40;
        name="Jane";
        lastName="Smith";
        state="Florida";

        System.out.println(name);
        System.out.println(lastName);
        System.out.println(state);
        System.out.println(age);

        lastName="Jackson"; //reassigning values
        age=41;
        state="California";

        System.out.println(name);
        System.out.println(lastName);
        System.out.println(state);
        System.out.println(age);



    }
}
