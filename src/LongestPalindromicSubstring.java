import java.util.Scanner;

public class LongestPalindromicSubstring {

    public static int PalindromeChecker(String currStr){
        int start=0, end=currStr.length()-1;
        while(start<end){
            if(currStr.charAt(start)!=currStr.charAt(end)){
                return 0;
            }
            start++;
            end--;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //String str = "";
        String str = s.next();
        int len = Integer.MIN_VALUE;
        String res = "";
        for(int i=0; i<str.length(); i++){
            String currStr="";
            for(int j=i; j<str.length(); j++){
                currStr = currStr + str.charAt(j);
                int isPalindrome = PalindromeChecker(currStr);
                if(isPalindrome==1 && currStr.length()>len){
                    res = currStr;
                    len = currStr.length();
                }
            }
        }
        System.out.println(res);
    }
}
