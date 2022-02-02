import java.util.*;

class problemsolve8
{
  
  public static void main(String[] args) 
  {
    Scanner obj=new Scanner(System.in);
   
    System.out.println("enter string");
    String s=obj.nextLine();
    System.out.println("lemgth of string"+s.length());
    

    String s1=s.replaceAll("[ ]{2,}", " ");
    System.out.println("after remove all spaces : "+s1);
    System.out.println("lemgth of string"+s1.length());


  }
}