package Threads.synchronization;

public class ClassE {
    int amount =10000;
    synchronized void with_draw(int amount) throws InterruptedException
    {
        if (this.amount<amount)
        {
            System.out.println("Insufficient balance");
            wait(5000,500);
            System.out.println("amount credited");
            this.amount-=amount;
            System.out.println("withraw successful \nbalance is "+this.amount);
        }
        else{
            this.amount-=amount;
            System.out.println("withraw successful \nBalance is"+this.amount);
        }
    }
    synchronized void deposit(int amount)
    {
        this.amount+=amount;
        System.out.println("Deposited successfuly \nBalance is"+this.amount);
        //notify();
        //notifyAll();
    }
    
}
