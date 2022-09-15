import java.util.Scanner;

public class RangeValue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] numArray = new int[n];
        for(int i=0; i<n; i++){
            numArray[i]=s.nextInt();
        }

        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for(int j=0; j<n; j++){
            if(numArray[j]>max){
                max = numArray[j];
            }
            if(numArray[j]<min){
                min = numArray[j];
            }
        }

        int res = max - min;

        System.out.println(res);
    }
}
