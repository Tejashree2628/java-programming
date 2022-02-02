import java.util.*;

class searching
{
   public void change(int arr[])
   {
     for(int i=0;i<arr.length;i++)
     {
       arr[i]++;
     }
   }
}
class prog158
{
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    boolean bret=false;
    System.out.println("enter the size of array");
    int size=sc.nextInt();
    int arr[]=new int[size];
    System.out.println("enter the element");
    for(int i=0;i<arr.length;i++)
    {
      arr[i]=sc.nextInt();
    }
  
  
    System.out.println("element in array is");
    searching sr=new searching();
       
       sr.change(arr);
       for(int i=0;i<arr.length;i++)
       {
         System.out.println(arr[i]);
       }
    
  
  }
}