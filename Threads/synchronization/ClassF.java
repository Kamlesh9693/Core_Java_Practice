package Threads.synchronization;

public class ClassF {
    public static void main(String[] args) {
        ClassE fobj=new ClassE();
        new Thread(){
            public void run()
            {
                try{
                    fobj.with_draw(15000);
                }
                catch(InterruptedException e)
                { 
                    e.printStackTrace();

                }
            }
        }
        .start();
        new Thread(){
            public void run()
            {
                fobj.deposit(10000);
            }
        }
        .start();
    }
    
}
