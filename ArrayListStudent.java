import java.util.*;
class ArrayListStudent
{
    public static void main()
    {
        Scanner SC=new Scanner(System.in);
        ArrayList<Student> SA = new ArrayList<Student>();
        while (true)
        {
            System.out.println("Input student information");
            Student S = new Student();
            S.setinfo();
            SA.add(S);
            System.out.println("Do you want to stop? Yes/No");
            String ch = SC.next();
            if (ch.equals("Yes"))
                break;
        }
        for (Student St: SA)
        {
            St.displayinfo();
        }
    }
}