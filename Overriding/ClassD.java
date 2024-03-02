package Overriding;

public class ClassD extends ClassC{
    ClassC meth1()
    {
        System.out.println("Class D method");
        return this;
    }
    static void meth2()
    {
        System.out.println("hello");
    }
    public static void main(String[] args) {
        ClassC aobj=new ClassD();
        aobj.meth1();
        aobj.meth2();
    }
    
}



    
/*
 1) without using inheritance we cannot achieve method overriding.
 2) if we cant inherit a method we cant override that method.[ex: private method]
 3)overriding method(child class) should not
 */
