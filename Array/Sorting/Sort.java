package Array.Sorting;

public class Sort {
    public static void sorting(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int index=i;
            for(int j=i;j<arr.length;j++)
            {
                if(arr[j]<arr[index])
                {
                    index=j;
                }
            }
            int smallNumber=arr[index];
            arr[index]=arr[i];
            arr[i]=smallNumber;
        }
    }
    public static void main(String[] args) {
        int arr1[]={10,2,5,15,20,3};
        System.out.println("before sorting");
        for (int i : arr1) {
            System.out.print(i+" ");
            
        }
        System.out.println();
        sorting(arr1);
        System.out.println("after sort");
        for (int i : arr1) {
            System.out.print(i+" ");
            
        }
    }
    
}
