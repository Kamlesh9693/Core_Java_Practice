package Array;
import java.util.Scanner;

public class Array2 
{
    void meth1()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter length :");
        int length=sc.nextInt();
        int arr[]=new int[length];

        //int arr[]=new int[sc.nextInt()]; valid

        System.out.println("length of arr :"+arr.length);

        System.out.println("please enter  "+arr.length+"elements into the array");
        for(int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();

        }
       
        System.out.println("data entered");

        System.out.println("----------");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);

        }
        System.out.println("----------");
        for(int i=arr.length-2;i>=0;i--)
        {
            System.out.println(arr[i]);
        }

        System.out.println("--- for each---");

        for(int x:arr)
        {
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        new Array2().meth1();
    }
    
}
