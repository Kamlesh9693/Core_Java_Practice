package Polymorphism;

public class ClassB {
    ClassB()
    { 
        this("java is awesome");
        System.out.println(10);
    }
    ClassB(int a , String s)
    {
       
        System.out.println(20);
    }
    ClassB(String s)
    
    {
         this(5000,"java");
        System.out.println("HI");
    }
    public static void main(String[] args) {
        new ClassB();
    }
    
}
