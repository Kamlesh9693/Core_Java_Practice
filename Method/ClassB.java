public class ClassB {
    String meth1(int a, int b){
        System.out.println(10);
        System.out.println((54+a)-b);
        int value=new ClassB().meth5();
        System.out.println(value);
        return "java";


    }    
    int meth2(int a){
        System.out.println(75);
        int b=5;
        System.out.println(b-a);
        return (5*5)-b;
    }
    void meth3(){
        System.out.println("start");
        System.out.println(new ClassB().meth4());
        System.out.println(40);
    }
    String meth4(){
        System.out.println("today is saturday");
        return new ClassB().meth1(4,8);
    }
    int meth5(){
        ClassB obj=new ClassB();
        System.out.println(99);
        return obj.meth2(5);

    }
    public static void main(String[] args) {
        ClassB aobj=new ClassB();
        aobj.meth3();
    }
}
