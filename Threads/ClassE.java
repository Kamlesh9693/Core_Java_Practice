package Threads;

public class ClassE extends Thread {
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("ClassE method executed");
        }
    }
    
}
