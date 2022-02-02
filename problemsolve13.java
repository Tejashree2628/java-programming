import java.util.*;
class marvellous
{
  public void charfrequency(String str)
  {
    String s2=str.replaceAll(" ","");
      System.out.println(s2);

      HashMap<Character,Integer>hobj=new HashMap<Character,Integer>();
      char arr[]=s2.toCharArray();
      System.out.println("character array");
      int i=0;
      for (char c : arr) 
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
      System.out.println(hobj);
  }
}
class problemsolve13
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