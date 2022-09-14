import java.util.Scanner;

public class CollatzSequence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a Number: ");
        int num = s.nextInt();
        if(num == 1){
            System.out.println(num + "\n" + "0");
            return;
        }
        System.out.println(num);
        while(num>1){

            if(num%2==0){
                num = num / 2;
            }
            else{
                num = (num * 3) + 1;
            }
            System.out.println(num);
        }

    }
}
