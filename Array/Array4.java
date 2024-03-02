package Array;

public class Array4 {

    int[] meth1(int arr[])
    {
        System.out.println("meth1 called");
        return arr;
    }
    public static void main(String[] args) {
        Array4 aobj=new Array4();
        int input[]={10,20,30};
        int result[]=aobj.meth1(input);
        for(int x:result)
        {
            System.out.println(x);
        }
    }
    
}
