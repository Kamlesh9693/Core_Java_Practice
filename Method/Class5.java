public class Class5 {
    void meth1(){
        System.out.println(10);
        System.out.println(64);
        System.out.println("End");
    }
    int meth2(int a,int b, int c){
        System.out.println(a);
        Class5 bobj=new Class5();
        String s=bobj.meth5(100,"java is awesome");
        System.out.println(s);
        return a-b;

    }
    String meth3(String s, int b, int d){
        System.out.println(b+d);
        return s;
    }
    int meth4(int c, int k){
        System.out.println(k);
        Class5 bobj=new Class5();
        int result=bobj.meth2(50,50,50);
        System.out.println(result);
        return k+10;
    }
    String meth5(int a,String L){
        System.out.println(a+a);
        Class5 bobj=new Class5();
        String s=bobj.meth3("hi",15,10);
        System.out.println(s);
        return L;

    }
    public static void main(String[] args) {
        {
            Class5 bobj=new Class5();
            System.out.println("Start");
            int result=bobj.meth4(20,10);
            System.out.println(result);
            bobj.meth1();
        }
    }
    
}
