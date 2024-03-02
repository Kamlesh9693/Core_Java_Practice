package Strings;

public class String6 {
    public String extraEnd(String str)
    {
        String s=str.substring(str.length()-2);
        return s+s+s;
    }
    
    public static void main(String[] args) {
        String result=new String6().extraEnd("Kamlesh");
        System.out.println(result);
    }
}
