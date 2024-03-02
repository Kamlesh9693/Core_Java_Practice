package FinalKeyword;

public final class ClassA   //final classes cant be inerited
 {
    final int a=110;
    final void meth1()  // final methods cant be overridden   //private void meth1()
    {
        System.out.println("ClassA meth1() called");
     //   System.out.println(a++); // c.E because final variables are constants
        System.out.println(a);  //10

    }
    public static void main(String[] args) {
        
        new ClassA().meth1();
    }

    /*
     private method===>
     we cannot inherit a private method so we cannot perform method overridden
     final keyword==> we can inherit a final method but we cannot perform method overridden
     */
    
}
