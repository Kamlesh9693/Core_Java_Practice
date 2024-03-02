public class This2 {
    void meth1()
    {
        System.out.println("meth1 called");
        this.meth2();   //we can also use direct meth2();
    }
    void meth2()
    {
        System.out.println("meth2() called");
        this.meth3();    //we can also use direct meth3();

        // we can call a static meth() this keyword 
        // but we cant use this keyword inside a static area
    }
    static void meth3()
    {        System.out.println("meth3() called");
    }
    public static void main(String[] args) {
        new This2().meth1();

        //this.meth1()  // we cant use this keyword under static area
    }
    
}
