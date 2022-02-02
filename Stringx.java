package MarvellousStringx;
import java.util.*;

public class Stringx
{
  public String Str;
  public void Accept()
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the string");
     Str=sc.nextLine();
  }
public void Display()
  {
     System.out.println("string is:"+Str);
  }
  
}