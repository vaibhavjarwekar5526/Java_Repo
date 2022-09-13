import java.util.Scanner;

public class GreatestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();

        if( num1 > num2 ){
            if( num1 > num3 ){
                System.out.println( num1 + " is greatest out of 3 numbers");
            }
            else{
                System.out.println( num3 + " is greatest out of 3 numbers");
            }
        }
        else{
            if( num2 > num3){
                System.out.println( num2 + " is greatest out of 3 numbers");
            }
            else{
                System.out.println( num3 + " is greatest out of 3 numbers");
            }
        }
    }
}
