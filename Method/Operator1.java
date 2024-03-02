public class Operator1 {
    int a=10;
    void meth1()
    { 
        System.out.println(a++); //10 ==. post increment
        System.out.println(a);   //11
        System.out.println(++a);   //12 ===> pre increment
        System.out.println(a--);   //12 ===>post decrement
        System.out.println(a);     //11 
        System.out.println(--a);  //10 ===> pre decrement
    }
    public static void main(String[] args) {
        new Operator1().meth1();
    }
    
}
