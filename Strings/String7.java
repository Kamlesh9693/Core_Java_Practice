package Strings;

public class String7 {
    public String firstTwo(String str)
    {
        if (str.length()>=2)
        return str.substring(0,2);
        return str;
      
    }
    public static void main(String[] args) {
        String result=new String7().firstTwo("kamlesh");
        System.out.println(result);
    }
    
}
