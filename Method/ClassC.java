public class ClassC {
    void meth1(){
        System.out.println("meth1() called");

    }
    public static void main(String[] args) {
        ClassC aobj1=new ClassC();
        ClassC aobj2=new ClassC();
        System.out.println("aobj1 hashcode===>"+aobj1.hashCode());
        System.out.println("aobj2 hashCode===>"+aobj2.hashCode());

        System.out.println(aobj1.equals(aobj1));
        System.out.println(aobj1.equals(aobj2));
        System.out.println(aobj2.equals(aobj1));

        System.out.println(("getClass()==>"+aobj1.getClass()));
        System.out.println("toString()===>"+aobj1.toString());
        System.out.println("toString()"+aobj2.toString());
    }
}
