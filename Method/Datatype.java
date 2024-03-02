public class Datatype {
    int i;
    byte b;
    short s;
    long l;

    float f;
    double d;

    char c;
    boolean flag;
    void meth1(){
        System.out.println("int value ===>"+i);
        System.out.println("byte value ===>"+b);
        System.out.println("shortvalue ===>"+s);
        System.out.println("long value ===>"+l);
        System.out.println("float value ===>"+f);
        System.out.println("double value ===>"+d);
        System.out.println("char value ===>"+c);
        System.out.println("boolean value ===>"+flag);
    
}

void meth2(){
    byte b1=10;
    byte b2=20;
    byte b3=(byte)(b1+b2);
    System.out.println("byte b3 is :"+b3);
    float f=10.5f;
    System.out.println("float value is : "+f);
}
public static void main(String[] args) {
    new Datatype().meth1();
    new Datatype().meth2();
}
}
