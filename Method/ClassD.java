public class ClassD {
    void meth1(int a){
        System.out.println(10);
        if (a<10)
        {
            System.out.println(20);
            return;

        }
        else{
            System.out.println(30);
            return;

        }
    }
    int meth2()
    {
        System.out.println("meth2() called");
        return 100;
         
    }
    String meth3(int a){
        System.out.println("meth3() called");
        if(a<10){
            System.out.println("if block executed");
            return "hi";

        }
        else{
            System.out.println("else block is executed");
            return "hello";
        }
    }
    public static void main(String[] args) {
        System.out.println("start");
        ClassD aobj=new ClassD();
        aobj.meth1(5);
        System.out.println("==>"+aobj.meth2());
        aobj.meth3(5);
        System.out.println("end");
    }
    
}
