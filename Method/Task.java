public class Task {
    public Task()
    {
        System.out.println("sunday");
        Task obj=new Task(10);
        System.out.println("tuesday");
        String s=obj.display("challange accepted");
        System.out.println(s);
    }
    public Task(int temp)
    {
        System.out.println("saturday");
        new Task(10,20);
        System.out.println("monday");
    }
    String display(String s)
    {
        System.out.println("in the next statement i am returining string value");
        return s;

    }
    public Task(int data,int temp)
    {
        System.out.println("thursday");
    }
    public static void main(String[] args) {
        Task obj=new Task();
        System.out.println("output varified");
    }
    
}
