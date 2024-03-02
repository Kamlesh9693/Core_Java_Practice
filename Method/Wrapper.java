public class Wrapper {
    void meth1()
    {
        int i=50;
        Integer ival=Integer.valueOf(50);
        System.out.println("PDT value===>"+i);  
        System.out.println("WCO value===>"+ival); 
        
        long l=100L;
        Long Lval=Long.valueOf(l);
        System.out.println("long PDT value===>"+l);
         System.out.println("long wco value===>"+Lval);
         
         Integer ival2=Integer.valueOf("500");
         System.out.println("============");
         System.out.println("integer WCO value ===>"+ival2);

         Character cval=Character.valueOf('j');
         System.out.println("character WCO value ===>"+cval);
         System.out.println("======== ");

    }
    
    void meth2()
    {
        Integer ival=new Integer(50);
        Byte bval=new Byte((byte)100);
        Boolean booleanval=new Boolean("kishan");

        int x=ival.intValue();
        byte y=bval.byteValue();
        boolean flag=booleanval.booleanValue();
        System.out.println("Integer WCO value===>"+ival);
        System.out.println("Byte WCO value===>"+bval);
        System.out.println("Boolean WCO value==>"+booleanval);
        System.out.println("-------------");
        System.out.println("int PDT value===>"+x);
        System.out.println("byte PDT value===>"+y);
        System.out.println("boolean PDT value ===>"+flag);

    }
    public static void main(String[] args) {
        Wrapper aobj=new Wrapper();
        aobj.meth1();
        aobj.meth2();
    }
}
