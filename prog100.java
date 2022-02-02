import java.util.*;

class Marvellous
{
  public void Display(String data)
  {
    System.out.println("Welcome: "+data);

  } 
}
class prog100
{
  public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in);
    String Str;

    System.out.println("enter your name");
    Str=sc.nextLine();

    Marvellous mobj=new Marvellous();
    
    mobj.Display(Str);
  }
}
