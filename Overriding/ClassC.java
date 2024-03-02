package Overriding;

public class ClassC {
    ClassC meth1()
    {
        System.out.println("Class C method");
        return this;
    }
    static void meth2()
    {
        System.out.println("hi");
    }
    
}
