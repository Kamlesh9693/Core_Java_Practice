package Strings;

public class String8 {

    void display()
    {
        String s=new String("java");
        StringBuffer buffer=new StringBuffer("java");
        StringBuilder builder=new StringBuilder("java");

        //every method present in StringBuffer class is also present in StrinBuilder

        s.concat("is awesome");    //immutable
        buffer.append("is awesome"); //mutable
        builder.append("is awesome");  //mutable

        System.out.println("string s==>"+s);
        System.out.println("stringBuffer buffer==>"+buffer);
        System.out.println("StringBuilder builder==>"+builder);
        
        String s2=new String("java");
        StringBuffer buffer2=new StringBuffer("java");
        StringBuilder builder2=new StringBuilder("java");

        System.out.println("String Class:"+s.equals(s2));   // check content and match it
        System.out.println("StringBuffer Class: "+buffer.equals(buffer2)); //check address location and match it
        System.out.println("StringBuilder class : "+builder.equals(builder2)); //check address location and match it

    }
    void show()
    {
        StringBuffer sb=new StringBuffer();
        System.out.println("capacity : "+sb.capacity());
        sb.append("abcdefghijklmnop");
        System.out.println(sb+"===>"+sb.capacity());
        System.out.println("length"+sb.length());
        sb.append("q");
        sb.append("r");
        System.out.println("length : "+sb.length());

        //(currentcapacity+1)*2

        System.out.println(sb+"==>"+sb.capacity());

        System.out.println("=====Methods======");
        System.out.println("charAt : "+sb.charAt(5));
        System.out.println("reverse() :"+ sb.reverse());
    }
    public static void main(String[] args) {
        new String8().display();
        System.out.println("-------");
        new String8().show();
    }
    
}
