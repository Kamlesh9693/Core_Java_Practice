package Garbage_Collector;

public class ClassA {
    void meth1()
    {
        System.out.println("meth1() called");
        ClassA aobj=new ClassA(); // 3rd case==> all the objects presents inside the method

    }
    protected void meth2()
    {
        System.out.println("garbage has been collected");
    }
    
    public static void main(String[] args) {
        ClassA aobj1= new ClassA(); //1st object
        ClassA aobj2=new ClassA();  //2nd object

        aobj1.meth1();

        //aobj1=null, //1st case==> if we are nullifying the reference
        //aobj1.meth1(); // raises an NullpointerException

        //aobj2=aobj1; //2nd case==> if we are assigning the reference to another reference
        System.gc();
    }
}
