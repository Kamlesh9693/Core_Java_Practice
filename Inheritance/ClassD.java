package Inheritance;

public class ClassD extends ClassC {
    void meth2()
    {
        System.out.println("Class D method");
        super.meth1();
    }
    void meth3()
    {
        System.out.println("meth3() called");

    }
    ClassD()
    {
        super("java is awesome");
        //this(10); //C.E
        System.out.println("Class-D default constructor");
        super.meth1();
        this.meth3();
    }
    ClassD(int a)
    {
        //super();
        System.out.println("Class D parameterized constructor : "+a);
    }
    public static void main(String[] args) {
        ClassD bobj=new ClassD();
        bobj.meth2();
    }


    /*
     1) super() is used to call the parent class cinstructor
     2)super() should be used only inside a constructor
     3) super should be the first statement inside a constructor
     4) in every java constructor be default compiler will automatically 
        add super() as its first statement
     5) we cannot use this() and super() both inside a constructor
     6) we can use this and super keyword both inside a constructor
     7) just like this keyword  we cannot use super keyword also inside a static area.
     8) just like this() we cannot use supet() also inside a static area  
     */

    
}
