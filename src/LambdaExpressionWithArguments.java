interface Addition
{
    int add(int a,int b);
}


public class LambdaExpressionWithArguments {
    public static void main(String[] args) {
         Addition res=(int a,int b)->(a+b);
        System.out.println(res.add(100,200));
        /*Addition res=(int a,int b)-> {return a+b;};

        System.out.println(res.add(2,8));*/

    }
}
