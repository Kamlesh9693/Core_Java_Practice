package Exception;

import java.io.*;
public class ClassD {
    int avl_Amt=10000;
    void withdraw(int wd_Amt)
    {
        if(avl_Amt<wd_Amt)
        {
            throw new RuntimeException("Balance is not sufficient");

        }
        else{
            System.out.println("Transaction success");
        }

    }
    void meth2() throws Exception
    {
        FileInputStream fos=new FileInputStream("D:\study\test.txt");

        // we need to write the logic to read the file
        //which will be discussed in IO -streams

    }
    public static void main(String[] args) throws Exception
     {
        ClassD aobj=new ClassD();
        //aobj.withdraw(15000)
        aobj.meth2();
        
    }
    
}

/*
 1)try
 2) catch
 3) finally
 4) throw
 ----------
 ==> throw keyword is used to display user defined exception message
 ===> we can throw keyword for both checked exception and unchecked exceptions.
 ==> we nedd to use throw keyword only inside a method  body

 5) throws
 ----------
 ==> throws keyword is used to escape from exception handling
 ==> we need to use throws keyword only for checked exceptions
 ==> we need to use along with the method signature

 */