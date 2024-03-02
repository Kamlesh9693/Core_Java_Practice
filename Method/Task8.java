import java.util.Scanner;
public class Task8 {

    void meth1()
    {
        int kg;
        Scanner sc=new Scanner(System.in);
    System.out.println("welcome to our store");
    System.out.println("please choose");
    System.out.println("1.Onions");
    System.out.println("2.chilli");
    System.out.println("3.tomato");
    System.out.println("4. Bringal");
    System.out.println("5. Ldies Finger");
    String ch=sc.next();
    switch(ch)
    {
        case "Onions":
            System.out.println("1 kg onions is 30");
            System.out.println("How many kg need you");
             kg=sc.nextInt();
             System.out.println(kg+"kgs of onions cost is "+(30*kg));
             break;
         case "chilli":
            System.out.println("1 kg chilli is 40");
            System.out.println("How many kg need you");
             kg=sc.nextInt();
             System.out.println(kg+"kgs of chilli cost is "+(30*kg));
             break;

        case "tomato":
            System.out.println("1 kg tomato is 50");
            System.out.println("How many kg need you");
             kg=sc.nextInt();
             System.out.println(kg+"kgs of tomato cost is "+(50*kg));
             break;      
         case "Bringal":
            System.out.println("1 kg Bringal is 45");
            System.out.println("How many kg need you");
             kg=sc.nextInt();
             System.out.println(kg+"kgs of onions cost is "+(45*kg));
             break;
         case "Ladies Finger":
            System.out.println("1 kg ladies finger is 55");
            System.out.println("How many kg need you");
             kg=sc.nextInt();
             System.out.println(kg+"kgs of ladies finger cost is "+(55*kg));
             break;
        default:
        System.out.println("please select valid details (String)");
    }

    }
    public static void main(String[] args) {
        new Task8().meth1();
        System.out.println("Thank you for shopping with us-------");
    }
    
}
