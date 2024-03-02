package Strings;

public class String1 {
    void meth1()
    {
        String s1="java";
        String s2 = new String("java");
        char arr[]={'j','a','v','a'};
        String s3=new String(arr);
        String s4=new String(arr,1,3);

        System.out.println("s1 :"+s1); 
        System.out.println("s2 :"+s2);
         System.out.println("s3 :"+s3);
          System.out.println("s4 :"+s4);
          System.out.println("--------------");

    }
    void meth2()
    {
        String s="java";
        System.out.println("s value beforee conatanation:"+s);
        System.out.println(s.concat(" is awesome"));
        s=s.concat(" is awesome");
        System.out.println("s value after concatanation:"+s);

    }
    public static void main(String[] args) {
        String1 aobj=new String1();
        aobj.meth1();
        aobj.meth2();
    }
    
}
