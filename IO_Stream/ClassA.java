package IO_Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
public class ClassA {
    
    void fileOperation1() throws Exception
    {
        FileInputStream fis=new FileInputStream("D:\\study\\java live training\\CORE JAVA\\New folder\\t1.txt");
        System.out.println("connection created");
        int x;
        while((x=fis.read()) !=-1)
        {
            System.out.println((char)x);
        }
        System.out.println();
        System.out.println("data retrieved");
        fis.close();
    }
    void fileOperation2() throws Exception
    {
        FileOutputStream fos=new FileOutputStream("D:\\study\\java live training\\CORE JAVA\\New folder\\t2.txt",true);
        System.out.println("connection created");
        String data =", so i like it.";
        byte arr[]=data.getBytes();
        fos.write(arr);
        System.out.println("data retrieved");
        fos.close();
    }
    void fileOperation3() throws Exception
    {
        FileInputStream fis=new FileInputStream("D:\\study\\java live training\\CORE JAVA\\New folder\\t1.txt");
        FileOutputStream fos=new FileOutputStream("D:\\study\\java live training\\CORE JAVA\\New folder\\t3.txt");
        System.out.println("connection created");
        int x;
        while((x=fis.read()) !=-1)
        {
            fos.write(x);
        }
       System.out.println("data copied");
        fis.close();
        fos.close();

    }
    public static void main(String[] args) throws Exception
     {
        ClassA aobj=new ClassA();
        aobj.fileOperation1();
        aobj.fileOperation2();
       aobj.fileOperation3();

    }
}
