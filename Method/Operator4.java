public class Operator4 {
    public static void main(String[] args) {
        int a=34;
        int b=21;
        int c=a++ + ++b;       // a=35 b=22
        int d=--a + --b + c--;    // a=34 b=21 c=55
        int e=a + +b + +c + d--;  // a=34 b=21 c=55 d=110
        int f=-a + b-- + -c - d++;  //a=34 b=20 c=55 d=111
        int sum = a+b+c+d+e+f;
        System.out.println("sum = "+sum);
    }
    
}
