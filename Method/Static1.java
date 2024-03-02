public class Static1 {
    int x=10; //instance
    static int y=20; //static
    void meth1()
    {
        System.out.println("Instance Variable==." +x);
        System.out.println("static variable : "+y);

    }
    static void meth2()
    {
        System.out.println("instance variable : "+new Static().x);
        System.out.println("static variable : "+y);

    }
    public static void main(String[] args) {
        Static1 aobj=new Static1();
        aobj.meth1();
        System.out.println("--------");
        //aobj.meth2();  //accessing with class object
        //meth2();  //accessing with identifier name
        Static1.meth2(); //accessing with Classname

        //ClassA.meth1();   //C.E because instance methods cant be
        // calles with the help of className
    }
    
}
