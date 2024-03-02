package Array;

public class Array1 {
    void meth1()
    {
        int arr1[];
        arr1=new int[5];
        
        int arr2[]=new int[5];

        int arr3[]={10,20,30,40,50};

        int arr4[]=new int[] {15,25,35,45,55};

        String s="java";
        System.out.println("Array  Length : "+arr1.length);
        System.out.println("string length :"+s.length());
  

        // difference beteen length vs length()
        //length: it is used to get the length  of an Array
        //length() : it is used toget the length of string

        System.out.println("-----arr2-----");
        arr2[2]=200;
        System.out.println(arr2[2-1]);
        System.out.println(arr2[2]);

        System.out.println(arr2[arr2.length-1]);

      System.out.println("------arr3-----");
      System.out.println(arr3[arr3.length-2]);
      System.out.println(arr3[arr1.length-3]);

      System.out.println("_-------arr4----");

      System.out.println("retriving the data using for loop");
      for (int i=0;i<arr4.length;i++)
      {
        System.out.println(arr4[i]);
      }
    }
    public static void main(String[] args) {
        new Array1().meth1();
    }
    
}
