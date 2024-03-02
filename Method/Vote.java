public class Vote {
    void voteeligible(int age)
    { 
        if(age>=18)
        {
            System.out.println("eligible");
        }
        else{
            System.out.println("not eligible");
        }
    }
    public static void main(String[] args) {
        Vote aobj=new Vote();
        aobj.voteeligible(18);
    }
    
}
