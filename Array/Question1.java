package Array;

public class Question1 {

    /*Give an int array length 3, if there is 2 in the array immediately followed by a 3, change the element 3 to 0 and return the changed array
    123--120
    234--204
    122--122
    int[] meth1()
    {
        //write your logic
    }

    
}
*/
int[] meth1()
{
    int arr[]={4,2,9};
    return arr;
}
public static void main(String[] args) {
    Question1 aobj=new Question1();
    int result[]=aobj.meth1();
    for(int x:result)
    {
        System.out.print(x+" ");
    }
}
}
