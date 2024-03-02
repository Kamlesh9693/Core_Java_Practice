package FinalKeyword;

public class ClassB  extends ClassA{
    void meth1()
    {
        System.out.println("method overridden");
    }
    public static void main(String[] args) {
        ClassA aobj=new ClassB();
        aobj.meth1();

        //new ClassB().meth1();
    }

    
}
