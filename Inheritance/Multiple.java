package Inheritance;
import Inheritance.ClassB;
public class Multiple extends ClassB {
  
    // in multiple inheritance child class should be able to grand parent class
    void meth3()
    {
        System.out.println("Class Multiple inheritance");

    }
    public static void main(String[] args) {
        Multiple xobj=new Multiple();
        xobj.meth3();
        xobj.meth2();
        xobj.meth1();
    }

    
}
