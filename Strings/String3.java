package Strings;
import java.util.Scanner;
public class String3 {
    
    public String helloName(String name)
    {

        return "Hello ".concat(name).concat(" !");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("what is your name ?");
        String result=new String3().helloName(sc.next());
        System.out.println(result);
        
    }
}
