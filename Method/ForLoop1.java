public class ForLoop1 {
    void meth1(int num)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+ "*"+i+"="+(num*i));
        }
    }
    public static void main(String[] args) {
        new ForLoop1().meth1(5);
    }
    
}
