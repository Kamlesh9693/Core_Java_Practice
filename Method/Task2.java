public class Task2 {
    int x=10;   //instance
    public static void main(String[] args) {
        int x=20;   //local
        System.out.println(x);
    }
    static{
        int x=30;   //local
        System.out.println(x + " ");
    }
    
}
