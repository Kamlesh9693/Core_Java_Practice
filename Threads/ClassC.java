package Threads;

public class ClassC extends Thread {
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Run method executed: "+i);
        }
        
    }
    public static void main(String[] args) {
        ClassC aobj=new ClassC();
        Thread t1=new Thread(aobj);
        //t1.start();
        // A new thread will be created which is responsible for running the class C run method
        //t1.run();
        //No thread will be created just run method which is presenting Class C will be executed because of overridding
        
        Thread t2=new Thread();
        //t2.start();
               // A new thread will be created which is responsible for running the class C run method
       // t2.run();
               //No thread will be created just run method which is presenting Class C will be executed because of overridding
                             

    }
}
