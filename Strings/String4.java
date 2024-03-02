package Strings;
import java.util.Scanner;
public class String4 {

    public String makeAbba(String a,String b)
    {
       return a.concat(b).concat(b).concat(a);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("put your order");
        String result=new String4().makeAbba(sc.next(),sc.next());
        System.out.println(result);

    }
    
}
