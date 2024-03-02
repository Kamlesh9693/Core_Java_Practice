package Threads.synchronization;

public class ClassA extends Thread{
    public void run()
    {
        criticalResourse();
    }
    synchronized void criticalResourse()
    {
        String name=Thread.currentThread().getName();
        System.out.println(name+"has entered the method");
        for(int i=1;i<=5;i++)
        {
            System.out.println(name+"is executing "+i);
        }
        System.out.println(name+"has completed its execution");


    }
    
    public static void main(String[] args) {
        ClassA aobj=new ClassA();
        Thread t1=new Thread(aobj);
        Thread t2=new Thread(aobj);

        t1.setName("first-Thread");
        t2.setName("second-thread");

        t1.start();
        t2.start();

    }
}
