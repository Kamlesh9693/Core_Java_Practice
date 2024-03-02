public class Final {
    final static int x=50; //final static variables should be initilized 
    void meth1()
    {
        int a; //local
        System.out.println("hi");
        //System.out.println(a); //C.E
        System.out.println(x);  //0
    } 
    public static void main(String[] args) {
        new Final().meth1();
    }
    
}
