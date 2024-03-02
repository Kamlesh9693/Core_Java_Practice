public class Operator {
    void meth1()
    {
        int a=15;
        System.out.println(a++);
        a++;
        System.out.println(a--);
        System.out.println(++a);
        a--;
        System.out.println(a--);
        --a;
        System.out.println(a++);
        System.out.println(--a);
        a++;
        System.out.println(a--);
        a--;
        --a;
        System.out.println(a++);
        System.out.println(a);
    }
    public static void main(String[] args) {
        new Operator().meth1();
    }
    
}
