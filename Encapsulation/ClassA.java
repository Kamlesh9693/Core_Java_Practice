package Encapsulation;

public class ClassA {
   private int studentRollNo;
    private String studentName;

    public int getstudentRollNo()
    {
        
        return studentRollNo;
    }
    public void setstudentRollNo(int studentRollNo)
    {
       
        this.studentRollNo=studentRollNo;
    }
    public String getstudentName()
    {

        return studentName;
    }
    public void setstudentName(String studentName)
    {

        this.studentName=studentName;
    }

    //getters & setters methods ==> alt +shift +s
    
}
