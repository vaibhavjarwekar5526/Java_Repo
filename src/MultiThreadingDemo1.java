class MyThread1 extends Thread
{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getId() + " I have called");
    }
}


public class MultiThreadingDemo1 {
    public static void main(String[] args) {
        try{
            for(int i=0; i<10; i++)
            {
                MyThread1 myThread1 = new MyThread1();
                myThread1.start();
            }

        }
        catch (Exception e)
        {
            System.out.println("Caught an Exception");
        }
    }
}
