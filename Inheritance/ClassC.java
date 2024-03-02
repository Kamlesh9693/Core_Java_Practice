package Inheritance;

public class ClassC {
    void meth1()
    {
        System.out.println("Class C method");

    }
    ClassC()
    {
        System.out.println("Class-C default Constructor");
    }
    ClassC(String s)
    {
        this();
        System.out.println(s);
    }
    
}
