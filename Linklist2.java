import java.util.*;

class Student
{
    public String name;
    public int RID;
    public int Age;
    
    Student(String a,int b,int c)
    {
        this.name=a;
        this.RID=b;
        this.Age=c;
    }

    public void Display()
    {
        System.out.println("student name:"+this.name+"RID:"+this.RID+"age:"+this.Age);
    }
}
public class Linklist2
{
    public static void main(String[] args) throws NoSuchElementException
    {
      LinkedList <Student> sobj = new LinkedList<Student>();           
        sobj.add(new Student("Amit", 121, 21));
        sobj.add(new Student("Sagar", 221, 25));
        sobj.add(new Student("Pooja", 251, 26));

         Student ref=null;
        Iterator<Student> iobj=sobj.iterator();
        while(iobj.hasNext())
        {
          ref=iobj.next();
          ref.Display();
        }
        sobj=null;
        iobj=null;
    }
}
