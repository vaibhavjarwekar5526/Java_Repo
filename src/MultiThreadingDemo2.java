class MyThread2 implements Runnable
{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getId() + " I have called");
    }
}




public class MultiThreadingDemo2 {
    public static void main(String[] args) {
        try{
            for(int i=0; i<10; i++)
            {

                Thread myThread2 = new Thread(new MyThread2());
                myThread2.start();
            }

        }
        catch (Exception e)
        {
            System.out.println("Caught an Exception");
        }
    }
}
