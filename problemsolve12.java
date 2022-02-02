import java.util.*;
class marvellous
{
  public String reverseword(String str)
  {
    String s1=str.trim().replaceAll("[ ]{2,}", " ");
    
    String arr[]=s1.split(" ");
    for(int i=0;i<arr.length;i++)
    {
      System.out.println(arr[i]);
    }
    
     
    System.out.println("numbers of words"+arr.length);
  
    StringBuffer output=new StringBuffer(" ");
    
    for (String str1 : arr) 
    {
      StringBuffer sobj=new StringBuffer(str1);
       output=output.append((sobj.reverse()));
    }
    String ret=new String(output);
    return (ret.trim());
  }
}

class problemsolve12
{
  
  public static void main(String[] args) 
  {
    Scanner obj=new Scanner(System.in);
   
    System.out.println("enter string");
    String s=obj.nextLine();
    System.out.println("lemgth of string"+s.length());
    marvellous mobj= new marvellous();
    String output = mobj.reverseword(s);
     System.out.println(output);
   

  }
}