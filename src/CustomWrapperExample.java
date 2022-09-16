import java.util.Scanner;

class CustomWrapper{
    private int number;
    CustomWrapper(int n){
        number=n;
    }
    public int getInt(){
        return number;
    }
    public String getString(){
        return Integer.toString(number);
    }
    public String getBinary(){
        return Integer.toBinaryString(number);
    }
    public boolean getBoolean(){
        if (number!=0)
            return true;
        else
            return false;
    }


}

public class CustomWrapperExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        CustomWrapper value=new CustomWrapper(n);
        System.out.println("In Binary : " + value.getBinary() );
        System.out.println("In Integer : " + value.getInt());
        System.out.println("In String : " + value.getString());
        System.out.println("In Boolean : " + value.getBoolean());
    }
}
