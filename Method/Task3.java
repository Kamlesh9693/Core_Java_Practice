public class Task3 {
    int x=10;
    public static void main(String[] args) {
        //System.out.println(Task3.x);  //we can not access instance variable  in the class name 
   System.out.println(new Task3().x);
    }
    static{
        int x=30;
        System.out.println(x+ "");
    }
}
