public class Task9 {
    public int meth1(int a,int b)
    {
        System.out.println("meth1 called()");
        System.out.println(100);
        return (a+b)+10+(a-b);
    }
    public int meth2()
    {
        System.out.println("meth2() called");
        return this.meth3()+8;
    }
    public Task9()
    {
        this("java is awesome");
        System.out.println(50);
    }
    int meth3()
    {
        System.out.println("meth3() called");
        return 10;

    }
    public String meth4(int a, String s)
    {
        System.out.println("meth4 called");
        a=a+4;
        System.out.println("a value :"+a);
        System.out.println("s value :"+s);
        return s+"is object oriented programming language";

    }
    public Task9(String s)
    {
        String result =this.meth4(this.meth1(this.meth2(),5),"java");
        System.out.println(result);
        System.out.println(s);
    }
    public static void main(String[] args) {
        new Task9();
    }
    
}
