public class FinalizeA {
    void show()
    {
        System.out.println("hello world");

    }
    protected void finalize()
    {
        System.out.println("garbage has been collected");

    }
    public static void main(String[] args) {
        FinalizeA aobj1=new FinalizeA();
        FinalizeA aobj2=new FinalizeA();

        aobj1.show();
        
        aobj1=null;
        //aobj1.show(); //null pointer exception
        System.gc();
    }
    
}
