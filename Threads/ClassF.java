package Threads;

public class ClassF extends Thread{
    public static void main(String[] args) throws InterruptedException
    {
        ClassE aobj=new ClassE();
        aobj.start();
        aobj.join();
        for(int i=1;i<=5;i++)
        {
            System.out.println("ClassF called");
        }
    }
    

    
}
//throw
    //throws
    //try
    //catch
    //finally
