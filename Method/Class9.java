public class Class9 {
    static int x=Class9.meth1();
    static int meth1()
    {
        System.out.println("meth1() called");
        return 100;

    }
    static{
        System.out.println("1st static block  : "+x);

    }
    static String meth2()
    {
        System.out.println("meth2() called");
        return "java";
    }
    public static void main(String[] args) {
        System.out.println("main() called");
    }
    static String data=meth2();
    static{
        System.out.println("2nd static block : "+data);
    }
    
}
