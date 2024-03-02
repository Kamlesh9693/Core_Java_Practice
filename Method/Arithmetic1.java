public class Arithmetic1{

    void meth1()
    {
        int a=10;
        int b=15;
        int c=a+b;
        System.out.println("addition : "+c);

    }
    void meth2(int a,int b)
    {
        int c=a-b;
        System.out.println("subtraction : "+c);

    }
    Arithmetic1()
    {
        new Arithmetic1(15,3).meth2(10,25);

        int a=10;
        int b=15;
        int c=a*b;
        System.out.println("Multiplication"+c);

    }
    Arithmetic1(int a,int b)
    {
        int c=a/b;
        System.out.println("division : "+c);

    }
   
    public static void main(String[] args)
    {
       new Arithmetic1().meth1();
        
    }
}
