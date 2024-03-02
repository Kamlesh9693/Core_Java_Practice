package Exception;
import java.util.Scanner;
public class ClassA {
    void meth1()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(10);
        try{
            System.out.println("try block executed");
            System.out.println("please enter the number");
            System.out.println(20/sc.nextInt());
        }
        catch(Exception e)
        {
            System.out.println("catch block executed");
           // System.out.println(e.getMessage()); //reason of the exception
            //getMessage()===>Throwable
           // System.out.println(e.toString()); //Name+reason of the exception
            //toString()===> Throwable

            e.printStackTrace(); // it will give the complete information about the exception
            //printStackTrace()==> Throwable [which is highly recommended]
        }
        finally{
            System.out.println("finally block executed");
            sc.close();
        }
        System.out.println("====>"+30);
    }
    public static void main(String[] args) {
        new ClassA().meth1();
    }
}

/*
 1)Catch block willl be executed only if there is an exception inside
 the try block. if there is no exception occured inside the try block
 then catch block will never gets executed

 2) Irrespective of the exception finally block will always gets
 executed . finally block is used to close the resourse /connections
 */
