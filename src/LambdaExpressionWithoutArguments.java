interface CheckLength
{
    void test();
}


public class LambdaExpressionWithoutArguments {
    public static void main(String[] args) {
        CheckLength l=()->
                System.out.println("Hello");

        l.test();
    }
}
