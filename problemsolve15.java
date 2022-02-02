import java.util.*;
class marvellous
{
  public void charfrequency(String str)
  {

    String s2=str.trim().replaceAll("[ ]{2,}"," ");
      HashMap<String,Integer>hobj=new HashMap<String,Integer>();
      String arr[]=s2.split(" ");
      System.out.println("string array");
      int i=0;
      for (String c : arr) 
      {
         if(hobj.containsKey(c))
         {
           i=hobj.get(c);
           hobj.put(c, i+1);
           
         }
         else
         {
              hobj.put(c, 1);
         }
      }
      Set<String>sobj=hobj.keySet();
       for(String s: sobj)
       {
         if(hobj.get(s)>1)
         {
           System.out.println(s);
         }
       }
    }
}
class problemsolve15
{
  
  public static void main(String[] args) 
  {
    Scanner obj=new Scanner(System.in);
   
    System.out.println("enter string");
    String s=obj.nextLine();
    marvellous mobj= new marvellous();
    mobj.charfrequency(s);
       

  }
}