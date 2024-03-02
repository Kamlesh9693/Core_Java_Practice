public class ClassE {
    void meth1()
    {
        System.out.println("meth1() called");

    }
    void meth2(int a)
    {
        System.out.println("meth2() called : "+a);
    }
    ClassE()
    {
        new ClassE(1000);
        System.out.println("Non-Parameterized constructor");
        new ClassE(999).meth2(500);

    }
    ClassE(int a)
    {
        System.out.println("parameterized constructor : "+a);

    }
    public static void main(String[] args) {
        System.out.println("start");
        new ClassE().meth1();
        System.out.println("End");
    }
    
}
