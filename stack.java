import java.util.*;

public class stack 
{
  public static void main(String[] args) 
  {
     Stack <String> sobj=new Stack<String>();
     sobj.push("india");    
     sobj.push("US"); 
     sobj.push("pakistan");
     sobj.push("chaina");

     

       System.out.println(sobj);

       sobj.pop();
       sobj.pop();
       System.out.println(sobj);

       Iterator <String> iobj=sobj.iterator();
       while(iobj.hasNext())
       {
           System.out.println(iobj.next());
       }
       sobj=null;
    }    
}
