package Overriding;

public class ClassB extends ClassA{
    void meth1()  //OVERRIDDING METHOD
    {
        System.out.println("Class B method");

    }
    public static void main(String[] args) {
        ClassA aobj1=new ClassB();
        aobj1.meth1();  //method present in ClassB
        ClassA aobj2=new ClassA();
        aobj2.meth1(); //method present in ClassA
    }
    
}
