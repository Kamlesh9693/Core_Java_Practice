package Abstraction;

public class ClassB extends ClassA{
    @Override
    void meth1()

    {
        System.out.println("abstract method overridden");
    }
    public static void main(String[] args) {
        ClassA aobj=new ClassB();
        aobj.meth1();  //method overridding
        aobj.meth2();
    }
    
}
