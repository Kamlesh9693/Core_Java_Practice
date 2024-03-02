public class This4 {
    This4()
    {
        //this(100);
        System.out.println("default constructor of This4");
        //new This4(100);
    }
    This4(int a)
    {
        this();
        this.meth1();
        System.out.println("parameterized constructor :"+a);
    }
    void meth1()
    {
        System.out.println("meth1() called");
    }
    public static void main(String[] args) {
        new This4(100);
    }
}
