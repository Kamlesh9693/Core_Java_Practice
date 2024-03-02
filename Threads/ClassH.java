package Threads;

public class ClassH implements Runnable
{
    public void run()
    {
        System.out.println("I am ready to go to interviews");
         for(int i=1;i<=5;i++)
         {
            System.out.println("this is my "+i+"interview");
         }
         System.out.println("i got placed now i am relax");
         try{
            Thread.sleep(10000);

         }
         catch(Exception e)
         {
            System.out.println("some one distrubed my sleep");

         }
         System.out.println("time to go to office");
    }
    public static void main(String[] args) {
        ClassH aobj=new ClassH();
        Thread t=new Thread(aobj);
        t.start();
        t.interrupt();
    }
    
}

/*
 interrupt();
 ------------
interrupt() will act only if thread is in sleeping state. if there is no thread is in sleep
state then interrupt() will wait until the thread went into sleeping mode. in entire program if there 
is no thread is in sleeping state then there will not be any impact of interrupt method 
 * 
 * 
 */