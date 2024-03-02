public class Task6 {
    static int x=m1();

    public static void main(String[] args) {
        System.out.println(Task6.x);
        
    }
    static {
        System.out.println(x); 
    Task6.x=x+20;
  }
  static int m1()
  {
    Task6.x=50;
    return m2();
  }
  static int m2()
  {
    System.out.println(Task6.x);
    return 100;
  }
    

}
