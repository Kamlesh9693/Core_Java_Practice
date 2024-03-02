public class Task7 {
    static int a=0;
    int b=0;
    Task7()
    {
        a++;
        b++;
        System.out.println("Static variable : "+a);
        System.out.println("instance variable : "+b);
        System.out.println("------");

    }
    void display()
    {
        System.out.println("*****Accessing static Variable ******");
        System.out.println(Task7.a);
        System.out.println(a);
        System.out.println(new Task7().a);
    }
    public static void main(String[] args) {
       new Task7();
       new Task7();
       new Task7();
       System.out.println("##################");
       new Task7().display();

                


    }
    
}
