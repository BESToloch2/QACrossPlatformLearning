package conditionalStatements;

public class MoreIfElseIfExamples {
    public static void main(String[] args) {
        String language="french";

        if (language.equalsIgnoreCase("English")){
            System.out.println("Hello");
        }else if(language.equalsIgnoreCase("Spanish")){
            System.out.println("Hola");
        } else if (language.equalsIgnoreCase("French")){
            System.out.println("Bonjour");
        } else if (language.equalsIgnoreCase("Italian")) {
            System.out.println("Ciao");
        }else {
            System.out.println("I don`t know how to greet you");
        }



    }
}
