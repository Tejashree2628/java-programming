import java.util.*;

public class Vector1
{
    public static void main(String[] args) throws NoSuchElementException
    {
      Vector <Integer> vobj=new Vector<Integer>();
      System.out.println("size of vector "+vobj.size());
      System.out.println("capacity of vector "+vobj.capacity());

      Vector <Integer> vobj2=new Vector<Integer>(20);
      System.out.println("size of vector vobj2 "+vobj2.size());
      System.out.println("capacity of vector vobj2 "+vobj2.capacity());
      
      Vector <Integer> vobj3=new Vector<Integer>(40,30);
      System.out.println("size of vector vobj3 "+vobj3.size());
      System.out.println("capacity of vector vobj3 "+vobj3.capacity());
      
     vobj.add(11);
     vobj.add(21);
     vobj.add(51);
     vobj.add(101);
     System.out.println("size of vector "+vobj.size());
      vobj.remove(2);
      vobj.set(0, 12);
     Iterator<Integer> iobj=vobj.iterator();
     while(iobj.hasNext())
     {
         System.out.println(iobj.next());
     } 
       
     vobj.clear();
    }
}
