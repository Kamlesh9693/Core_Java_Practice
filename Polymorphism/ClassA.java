package Polymorphism;

public class ClassA {
    public final void meth1()
    {
        System.out.println(10);
    }
    private int meth1(int a)
    {
        System.out.println(20);
        return a;
    }
    protected final void meth1(int a,int b)
    {
        System.out.println(30);
    }
    String meth1(String s,int a)
    {
        System.out.println(40);
        return s;
    }
    void meth1(int a,String s)
    {
        System.out.println(50);
    }
    public static void main(String[] args) {
        ClassA aobj=new ClassA();
        aobj.meth1();
        aobj.meth1(100);
        aobj.meth1(100,100);
        aobj.meth1("java",2000);
        aobj.meth1(6000,"java is awsome");
        System.out.println("----------");
        ClassA.main("java");
        ClassA.main(1500);
    }
    public static void main(String s) {
        System.out.println("are you amezing");
        
    }
    public static void main(int a) {
        System.out.println("we can overload any method in java");
        
    }
    
}
