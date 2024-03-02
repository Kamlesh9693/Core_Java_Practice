public class Parameter2{
    public void math1(int a){
        System.out.println(("mathed 1 is : "+a));
    }
    void math2(String s,int a){
        
        System.out.println("S value is : "+s);
        System.out.println("a value is : "+a);

    }
    public static void main(String[] args) {
        Parameter2 aobj=new Parameter2();
        aobj.math1(10);
        aobj.math2("kamlesh",10);
    }
}