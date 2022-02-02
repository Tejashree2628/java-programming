import java.util.*;

class prog155
{
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of array");
    int size=sc.nextInt();
       
    int arr[]=new int[size];

    System.out.println("enter the element");
    for(int i=0;i<arr.length;i++)
    {
      arr[i]=sc.nextInt();
    }

    System.out.println("element in array is");
    for(int i=0;i<arr.length;i++)
    {
      System.out.println(arr[i]);
    }
    
  }
}