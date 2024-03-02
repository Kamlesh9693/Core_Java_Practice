public class Parameter3 {
    public int meth1(int a){
        System.out.println("valling method 1");
        return 10+a;
       
        
    }
    public static void main(String[] args) {
        Parameter3 aobj=new Parameter3();
        int result=aobj.meth1(15);
        System.out.println("result is : "+result);
        
    }
}
