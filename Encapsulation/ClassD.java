package Encapsulation;
import java.util.*;
public class ClassD {
    void display(){
         Scanner sc=new Scanner(System.in);
         ClassC aobj=new ClassC();

         System.out.println("please enter employ name");
         aobj.setempName(sc.next());

          System.out.println("please enter employ id");
         aobj.setempId(sc.nextInt());

         System.out.println("please enter employee salary");
         aobj.setempSal(sc.nextInt());

        

         System.out.println("please enter employee department");
        aobj.setempDept(sc.next());

        System.out.println("enter employee address");
        aobj.setempAdd(sc.next());

        System.out.println("empName : "+aobj.getempName());
        System.out.println("empId : " +aobj.getempId());
        System.out.println("empSal : "+aobj.getempSal());
        System.out.println("empDept : "+aobj.getempDept());
        System.out.println("empAdd : "+aobj.getempAdd());



    }
    public static void main(String[] args) {
        new ClassD().display();
    }
   
    
}
