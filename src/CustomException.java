import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomException {

    public static class MyException extends java.lang.Exception{
        public MyException(String s) {
            super(s);
        }
    }
    public static void eligibilityCheck(int age) throws MyException{
        if (age==0)
            throw new MyException("Given age is zero");
        else if (age<18)
            throw new MyException("Driving licence can not be issued ,You are below 18 years old");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            int age=sc.nextInt();
            eligibilityCheck(age);
            if (age>=18)
                System.out.println("Congrats, You are eligible for driving licence ");
        }
        catch (InputMismatchException e){
            System.out.println("Please enter proper age");
        }
        catch(Exception e){
            System.out.println("Exception occurred - "+e);
        }
        finally {
            System.out.println("Code execution completed");
        }
    }
}