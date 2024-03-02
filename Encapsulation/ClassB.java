package Encapsulation;
import java.util.*;
public class ClassB {
    void display()
    {
        Scanner sc =new Scanner(System.in);
        ClassA aobj=new ClassA();

        System.out.println("PLEASE ENTER YOUR ROLL NUMBER");
        aobj.setstudentRollNo(sc.nextInt());

        System.out.println("PLEASE ENTER YOUR NAME");
        aobj.setstudentName(sc.next());
        System.out.println("studentRollNO : "+aobj.getstudentRollNo());
        System.out.println("studentName : "+aobj.getstudentName());

        sc.close();

    }
    public static void main(String[] args) {
        new ClassB().display();
    }
    
}
