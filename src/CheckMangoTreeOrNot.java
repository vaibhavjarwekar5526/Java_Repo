import java.util.Scanner;

public class CheckMangoTreeOrNot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter rows, columns & tree number: ");

        int rows = s.nextInt();
        int cols = s.nextInt();
        int treeNumber = s.nextInt();

        if( (treeNumber >= 1 && treeNumber <= cols) || (treeNumber % cols == 0) || (treeNumber % cols == 1) ){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
