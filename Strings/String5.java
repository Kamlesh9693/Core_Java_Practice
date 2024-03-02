package Strings;
import java.util.*;
public class String5 {

    public String makeOutWord(String out,String word)
    {
       return out.substring(0,2)+word+out.substring(2);  
    }
    public static void main(String[] args) {
         String result= new String5().makeOutWord("<<>>","java");
         System.out.println(result);
    }
}
