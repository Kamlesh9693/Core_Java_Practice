public class This1 {
    int a=10;
    static int b=20;

    void meth1()
    {
        int a=30;
        System.out.println("instance variable :"+this.a);   // with the help of this keyword
        System.out.println("static variable :"+This1.b);   //with the help of class name
        System.out.println("local variable :"+a);
    }
    public static void main(String[] args) {
        new This1().meth1();
    }
}
