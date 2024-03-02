package Threads;

public class ClassI extends Thread{
  public static void main(String[] args) {
    ClassJ aobj=new ClassJ();
    aobj.start();
    Thread.yield();
    for(int i=1;i<=5;i++)
    {
        System.out.println("classj");
    }
  }
}
