import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year");
        year = scanner.nextInt();

        if((year % 4 == 0) && ( year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year + " is leap year");
        }
        else{
            System.out.println(year + " is not a leap Year");
        }
    }
}
