package Interface;

public class ClassA extends ClassB implements InterfaceA,InterfaceB 
{   
    public void meth1()
    {
        System.out.println("Interface A abstract method implemented");
    }
    public void show()
    {
        System.out.println("Interface B abstract method implemented");
    }
    public static void main(String[] args) {
        InterfaceA aobj=new ClassA();
        aobj.meth1();
        aobj.meth3();  // calling dafault method

        //aobj.show(); // C.E because show() belong to interfaceB

        InterfaceB bobj=new ClassA();
        bobj.show();
        new ClassA().display();
    }
    
}


/*
 Functional Interface

 An interface which is hving only one abstract method easily known as functional interface
 2) inside a functional interface we can have default methods private methods static methods can main
 */
