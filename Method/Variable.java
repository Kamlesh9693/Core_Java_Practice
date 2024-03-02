public class Variable {
    int a; //instance
    static int b;  //static
    int m=99;
    static int n=50;
    void meth1(){
        int c=30; //local
        int m=1000; //local
        int n=2000;  //local
        
        System.out.println("instance variable :"+a); //10
        System.out.println("instance variable : "+new Variable().a);  //10
        System.out.println("local variable : "+m);

        System.out.println("--------");
        System.out.println("Instance variable m value  : "+new Variable().m); 
        System.out.println("Local variable m value: "+m);

        System.out.println("-------Static Variable--------");
        System.out.println("static variable : " +b);
        System.out.println("static variable : "+new Variable().b);
        System.out.println("static variable : "+Variable.b);

        System.out.println("-----------------------");
        System.out.println("static variable n value: "+new Variable().n);
        System.out.println("static variable n value: "+Variable.n);
        System.out.println("Local Variable n value: "+n);

    }
    void meth2()
    {
        int x;
        System.out.println("Instance variable : "+m);
        System.out.println("static variable : "+n);

       // System.out.println("local variable : "+c); //CE
       //System.out.println(x); //
    
    }
    
    public static void main(String[] args) {
        Variable aobj=new Variable();
        aobj.meth1();
        System.out.println("##########");
        aobj.meth2();
    }
}
