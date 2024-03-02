package Interface;

public interface InterfaceA
 {
    void meth1();
 static void meth2()
 {
    System.out.println("i am static method in interface");
    System.out.println("i am available from java 1.8");
 }
 default void meth3()
 {
    System.out.println("i am default method in inherotance");
    System.out.println("i am availabe from java 1.8");
    System.out.println("--------------");
    this.meth4(); 
}
private void meth4()
{
    System.out.println("I am private method in interface");
    System.out.println("I am availabe from java 1.9");

}
public static void main(String[] args) {
    System.out.println("main() method called from interface A");
    InterfaceA.meth2();
}
    
}
