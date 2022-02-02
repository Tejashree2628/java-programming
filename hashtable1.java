import java.util.*;

public class hashtable1
{
    public static void main(String[] args) throws NoSuchElementException
    {
       Hashtable<String,Integer> hobj=new Hashtable<String,Integer>();
       hobj.put("PPA",1);
       hobj.put("LB",2);
       hobj.put("pythan",3);
       hobj.put("LSPUI",4);
       hobj.put("ANGULAR",5);
       hobj.remove("LB");
       System.out.println(hobj.get("LB"));
       System.out.println("size"+hobj.size());
       System.out.println("data from hashtable");
        Enumeration eobj=hobj.keys();
        while(eobj.hasMoreElements())
        {
            System.out.println(eobj.nextElement());
        }
       
       hobj=null;
       
    }
}
