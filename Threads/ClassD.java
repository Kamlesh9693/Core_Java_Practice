package Threads;

public class ClassD extends Thread {
    public void run()
    {
        String name=Thread.currentThread().getName();
        int priority=Thread.currentThread().getPriority();
        for(int i=1;i<=5;i++)
        {
            System.out.println(name+"("+priority+")" +"executed run()==>"+i);
        }
    }
    public static void main(String[] args) {
        ClassD aobj=new ClassD();
        Thread t1=new Thread(aobj);
        Thread t2=new Thread(aobj);

        t1.setName("First Thread");
        t2.setName("second Thread");

        t1.setPriority(MIN_PRIORITY);
        t2.setPriority(10);

        t1.start();
        t2.start();
    }
    
}

/*
  Thread Schedular:
  ------------------
 1) in java thread schedular is responsilbe for
     starting the threads
 2) Thread schedular will decide which thread should
    start first basing upon 2 aspedt
     [ Thread schedular=Thread Priority+Underlying os]

 Thread Priority:
 ----------------
 1) Thread priorities varies between 1 to 10.
 1===> Minimium Priority
 5===> Default /Normal Priority
 10===> Maximium Priority
 * 
 * 
 */
