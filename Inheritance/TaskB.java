package Inheritance;

public class TaskB extends TaskA{
    void display()
    {
        System.out.println("hi");
        super.meth4();

    }
    public static void main(String[] args) {
        {
            new TaskB().display();
        }
    }
    
}
