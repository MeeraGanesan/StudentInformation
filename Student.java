import java.util.*;
class Student
{
    int id;
    String name;
    int marks;
    
    public void setinfo()
    {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the name");
         name=SC.next();
        System.out.println("Enter the ID");
        id=SC.nextInt();
        System.out.println("Enter the marks");
        marks=SC.nextInt();
    }
    public void displayinfo()
    {
        System.out.println("Displaying student details");
        System.out.println("Name = " + name);
        System.out.println("Id = " + id);
        System.out.println("Marks = " + marks);
    }
}
        
  