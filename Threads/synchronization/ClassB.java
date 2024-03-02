package Threads.synchronization;

public class ClassB extends Thread {

    public void run()
    {
        
        String name=Thread.currentThread().getName();
        synchronized(this)
        {
            System.out.println(name+"has entered the method");
            for(int i=1;i<=5;i++)
           
            {
                System.out.println(name+"is executing "+i);
            }
            System.out.println(name+"has completed its execution");
    
    
        }
        
      
            for(int i=1;i<=5;i++)
           
            {
                System.out.println("2nd  "+name+"is executing "+i);
            }
           

        
        
           
        

    }   
   
}

