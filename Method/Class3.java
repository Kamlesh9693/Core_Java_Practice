public class Class3 {
    public void meth1(){
        int a=5;
        int b=10;
        int c=a+b;
        System.out.println("sum of a+b is"+c);
        Class3 aobj=new Class3();
        aobj.meth2();

    }
    public void meth2(){
        System.out.println("java is awesome!!!");
        int a=13;
        int b=14;
        int c=a*b;
        System.out.println("multiplication of a and b is"+c);
    }
    public static void main(String[] args){
        System.out.println("call the method");
        Class3 aobj=new Class3();
        aobj.meth1();
        aobj.meth2();
    }
    
}
