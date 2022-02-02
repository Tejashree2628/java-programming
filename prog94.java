import java.util.*;

class prog94
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int iSize=0,i=0;
    System.out.println("enter number of element");
    iSize=sc.nextInt();

    int arr[]=new int[iSize];
    
    System.out.println("enter the numbers");

    for(i=0;i<arr.length;i++)
    {
      arr[i]=sc.nextInt();
    }
 
     System.out.println("enter element are");
     for(i=0;i<arr.length;i++)
    {
      System.out.println(arr[i]);
    }

  } 
}





