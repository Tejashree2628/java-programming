import java.util.*;
public class Arraylist
{
    public static void main(String[] args) 
    {
        ArrayList <Integer> obj=new ArrayList<Integer>();

        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(1,55);
        System.out.println("data in link list");
        System.out.println(obj);
      
        Iterator <Integer> iobj=obj.iterator();

        System.out.println("data from link list using iterator");
        int isum=0;
        while(iobj.hasNext())
        {
            int no=0;
            System.out.println(no=iobj.next());
           isum=isum+no;
        }
        System.out.println(isum);

           obj=null;
    }
}
