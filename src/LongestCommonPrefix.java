import java.util.Arrays;
import java.util.Scanner;


public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String[] strArray = new String[n];

        for(int i=0; i<n; i++){
            strArray[i]=s.next();
        }

        StringBuilder result = new StringBuilder();

        Arrays.sort(strArray);
        /*for(String str: strArray){
            System.out.println(str);
        }*/

        char[] first = strArray[0].toCharArray();
        char[] last = strArray[strArray.length-1].toCharArray();

        for(int i=0; i<first.length; i++){
            if(first[i]!=last[i])
                break;
            result.append(first[i]);
        }

        if(result.length()==0){
            System.out.println("Empty String");
            return;
        }

        System.out.println(result);



    }
}
