import java.util.*;

abstract class arrayx
{
  public int arr[];
  public arrayx(int size)
  {
    arr=new int[size];
  }

  public void accept()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the element");
    for(int i=0;i<arr.length;i++)
    {
      arr[i]=sc.nextInt();
    }
  }
  public void display()
  {
    System.out.println("element in array is");
    for(int i=0;i<arr.length;i++)
    {
      System.out.println(arr[i]);
    }
  }
  public abstract boolean search(int no);
  
}

class searching extends arrayx
{
  public searching(int size)
  {
    super(size);
  }
  public boolean search(int no)
  {
    int i=0;
    for(i=0;i<arr.length;i++)
    {
      if(arr[i]==no)
      {
        break;
      }
      
    }
    if(i==arr.length)
    {
      return false;
    }
    else
    {
      return true;
    }
  }


}
class prog156
{
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    boolean bret=false;
    System.out.println("enter the size of array");
    int size=sc.nextInt();
   
       searching sr=new searching(size);
       sr.accept();
       sr.display();
       System.out.println("enter the element to search");
       int no=sc.nextInt();
       bret=sr.search(no);
       if(bret==false)
       {
         System.out.println("element not found");
       }
       else
       {
        System.out.println("element found");

       }

    
  }
}