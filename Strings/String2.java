package Strings;

public class String2 {
    void meth1()
    {
        System.out.println("implementing string class methods");
        String s1="java";
        String s2=new String("java");
        String s3="java";
        String s4=new String("java");

        /*Inorder to compare two strings we having 2 operations

        == ----> it will compare the address locations of the Strings
        .equals() --> it will compare the CONTENTS present in the Strings 
        */

        System.out.println(s1.equals(s2));
        System.out.println("java".equals("java"));
        System.out.println(s1.equals("java"));
        System.out.println(s1.equals("java"));
        System.out.println(s1.equalsIgnoreCase("java"));
        System.out.println("---------");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s2==s4);
        System.out.println(s1=="java");
        System.out.println(s1==new String("java"));
        System.out.println("==============");
        System.out.println("concat()===>"+s1.concat("is awesome"));
        System.out.println("s1: "+s1);
        System.out.println("java is awesome".equals(s1.concat("is awesome")));
        System.out.println("=========");
        String s5=s1.concat("is awesome");
        System.out.println(s5+ "length() is :"+s5.length());
        System.out.println("charAt()===>"+s5.charAt(12));
        System.out.println("startsWith===> "+s5.startsWith(" java"));
        System.out.println("startsWith()====>"+s5.startsWith(s1));
        System.out.println("toLowerCase===> "+s5.toLowerCase());
        System.out.println("s5 : "+s5);
        System.out.println("=============");
        String s6="I Love India";
        System.out.println("------substring()-------");
        System.out.println("subString()===>"+s6.substring(7));
        System.out.println("substring()===>"+s6.substring(2,6));
        System.out.println("substring()===>"+s6.substring(4,8));
        System.out.println("=========");
        String s7="java";
        System.out.println("replace()===>"+s7.replace('a','A'));
        System.out.println("s7 : "+s7);
        String s8="Hello World";
        System.out.println("s8 length is : "+s8.length());
        System.out.println("s8 length after trim() : "+s8.trim().length());
        System.out.println("indexOf()===>"+s7.indexOf('a'));
        System.out.println("lastIndexOf()===>"+s7.lastIndexOf('a'));






    }
    public static void main(String[] args) {
        new String2().meth1();
    }
    
}
