package Inheritance;

public class ClassB extends ClassA{
    void meth2()
    {
        System.out.println("Child Class method");

    }
    public static void main(String[] args) {
        ClassA aobj=new ClassA();  //HAS-A-RELATION
        aobj.meth1();
        //aobj.meth2(); // C.E
        System.out.println("---------");
        ClassA aobj2=new ClassB();
        aobj.meth1();

        //aobj2.meth2(); //C.E
        System.out.println("---------");

        ClassB bobj=new ClassB();  //IS-A-RELATION
        bobj.meth1();  //parent class method

        bobj.meth2();   //child class method
        //ClassB bobj2=new ClassA(); //invalid


    }
    
}
