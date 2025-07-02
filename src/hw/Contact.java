package hw;

public class Contact {
    String name;
    String  phone;

    void infoLine(){
        System.out.println(name.trim());
        System.out.println(phone.replaceAll("[^0-9]",""));
    }


    public static void main(String[] args) {

        Contact sasha=new Contact();
        sasha.name="   Oleksandr Mazin  ";
        sasha.phone="asd12345adw4123";

        Contact liza=new Contact();
        liza.name="Elizaveta Flores  ";
        liza.phone="123!@#$fsdSAF12345";

        sasha.infoLine();
        liza.infoLine();

    }

}
