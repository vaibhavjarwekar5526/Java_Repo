//import java.util.Scanner;

class NameMe{
    public String firstName;
    public String lastName;
    public String name;

    public NameMe(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.name = this.firstName + " " + this.lastName;
    }
}

public class CombinesFirstAndLastName {
    public static void main(String[] args) {
        /*Scanner s = new Scanner(System.in);
        String firstName = s.next();
        String lastName = s.next();*/
        NameMe fullName = new NameMe("John", "Doe");
        System.out.println(fullName.firstName);
        System.out.println(fullName.lastName);
        System.out.println(fullName.name);
    }
}
