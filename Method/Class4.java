public class Class4 {
   
        int meth1(int a,int b){
            System.out.println(50);
            Class4 aobj=new Class4();
            System.out.println(45);
            int x=aobj.meth2(100,"java");
            System.out.println(x+1);
            return a+b;
    
        }
        int meth2(int a,String s){
            System.out.println(a+a);
            System.out.println(65);
            System.out.println(s);
            return a;
        }
        public static void main(String[] args){
            System.out.println("Start");
            System.out.println(new Class4().meth1(10,20)+100);
            System.out.println("end");
        }
    
    
    
}
