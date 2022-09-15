import java.util.Scanner;

public class OddEvenMixed {
    public static int myMethod(int numArray[], int n){
        boolean odd = false;
        boolean even = false;

        for(int i=0; i<n; i++){
            if(numArray[i]%2 == 0){
                even = true;
            }
            else{
                odd = true;
            }
        }

        if(even == true && odd == true){
            return 3;
        }
        else if(even == true){
            return 1;
        }
        else if(odd == true){
            return 2;
        }
        return 0;
    }



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int numArray[] = new int[n];


        for(int i=0; i<n; i++){
            numArray[i]=s.nextInt();
        }

        int res = myMethod(numArray,n);

        if(res==1){
            System.out.println("even");
        }
        else if(res == 2){
            System.out.println("odd");
        }
        else if(res == 3){
            System.out.println("mixed");
        }
    }
}
