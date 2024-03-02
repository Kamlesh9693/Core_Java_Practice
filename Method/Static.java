public class Static {
    static int count;
    int x;
    Static() {
        {
            count++;  //there will be only one copy of static variable
            x++;      //for every instance a separate copy will be maintained
            
            System.out.println("static variable : "+count);
            System.out.println("instance variable : "+x);
            System.out.println("-----------------");
        }
    }
    public static void main(String[] args) {
        new Static();
        new Static();
        new Static();
    }
    
}
