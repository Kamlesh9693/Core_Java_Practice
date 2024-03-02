public class ForLoop2 {
    void display(int n)
    {
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print("*");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ForLoop2 obj=new ForLoop2();
        obj.display(5);

    }
    
}
