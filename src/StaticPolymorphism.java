class MultiplyGivenNum
{
    int multiplication(int fIntNum, int sIntNum, int tIntNum){
        return fIntNum * sIntNum * tIntNum;
    }

    float multiplication(float fFloatNum, float sFloatNum){
        return fFloatNum * sFloatNum;
    }
}


public class StaticPolymorphism {
    public static void main(String[] args) {
        MultiplyGivenNum multiplyGivenNum = new MultiplyGivenNum();
        System.out.println("Multiplication of three Integer Numbers:");
        System.out.println(multiplyGivenNum.multiplication(12, 13, 14));
        System.out.println("Multiplication of two Float Numbers:");
        System.out.println(multiplyGivenNum.multiplication(1.7f, 2.4f));


    }
}