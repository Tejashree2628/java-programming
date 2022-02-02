import java.util.*;

class sorting
{
  public void InsertionSort(int arr[])
  {
    int size=arr.length;
     int i=0,j=0,key=0;
     for(i=1;i<size;i++)
     {
       key=arr[i];
       for(j=i-1;(j>=0) && (arr[j]>key);j--)
       {
          arr[j+1]=arr[j];
       }
       arr[j+1]=key;
     }
  }
}   
class prog162
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
  
  
    sorting sr=new sorting();
       
      sr.InsertionSort(arr);
      System.out.println("element after sorted");  
      for(int i=0;i<arr.length;i++)
       {
         System.out.println(arr[i]);
       }
  
  }
}