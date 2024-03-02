package Threads;

public class ClassA extends Thread {
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Run method execute===> "+i);
        }
    }
    public static void main(String[] args) {
        ClassA aobj=new ClassA();
        Thread t1=new Thread(aobj);
        t1.start();

        Thread t2=new Thread();
        //t2.start();
    }

    
}
