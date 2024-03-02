
import java.util.Scanner;
public class Scanner1 {
    Scanner sc=new Scanner(System.in);
    void meth1()
    {
        System.out.println("please enter 1st number");
        int a=sc.nextInt();
         System.out.println("please enter 2nd number");
        int b=sc.nextInt();
        System.out.println("a : "+a);
        System.out.println("b :"+b);
        System.out.println("addition value ==>"+(a+b));


    }
    int meth2()
    {
        System.out.println("meth2 called");
        System.out.println("please enter a numberto return from the method");
        return sc.nextInt();
    }
    void meth3(int a,int b)
    {
        System.out.println("meth3() called");
        System.out.println("multiplication value :"+(a*b));
    }
    void meth4()
    {
        System.out.println("enter your name");
        String name=sc.next();
        System.out.println("name :"+name);
    }

    public static void main(String[] args) {
        Scanner1 obj=new Scanner1();
        obj.meth1();
        System.out.println("-------");
        System.out.println("meth2 is running :"+obj.meth2());
        System.out.println("enter 2 int parameters for the meth3()");
        obj.meth3(obj.sc.nextInt(),obj.sc.nextInt());
        obj.meth4();
    }
    
    
}
