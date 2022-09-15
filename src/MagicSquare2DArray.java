import java.util.Scanner;

public class MagicSquare2DArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[][] twoDimArray = new int[n][n];

        for(int i=0; i<twoDimArray.length; i++){
            for(int j=0; j<twoDimArray.length; j++){
                twoDimArray[i][j]= s.nextInt();
            }
        }

        int fDiagonal = 0, bDiagonal = 0;
        for(int i=0; i<n; i++){
            fDiagonal = fDiagonal + twoDimArray[i][i];
        }

        for(int i=0; i<n; i++){
            bDiagonal = bDiagonal + twoDimArray[i][(n-1)-i];
        }

        if(fDiagonal!=bDiagonal){
            System.out.println("No");
            return;
        }

        for(int i=0; i<n; i++){
            int rSum=0;
            for(int j=0; j<n; j++){
                rSum = rSum + twoDimArray[i][j];
            }

            if(rSum!=fDiagonal){
                System.out.println("No");
                return;
            }
        }

        for(int i=0; i<n; i++){
            int cSum=0;
            for(int j=0; j<n; j++){
                cSum = cSum + twoDimArray[j][i];
            }

            if(cSum!=fDiagonal){
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");

    }
}
