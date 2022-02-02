import java.util.*;

class sorting
{
  public void SelectionSort(int arr[])
  {
     int i=0,j=0,minindex=0,temp=0;
     int size=arr.length;
     for(i=0;i<size;i++)
     {
       minindex=i;
       for(j=i;j<size;j++)
       {
         if(arr[minindex]>arr[j])
         {
         minindex=j;
         }
      }
        temp=arr[i];
        arr[i]=arr[minindex];
        arr[minindex]=temp;
     }
  }
}
   
class prog161
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
       
      sr.SelectionSort(arr);
      System.out.println("element after sorted");  
      for(int i=0;i<arr.length;i++)
       {
         System.out.println(arr[i]);
       }
  
  }
}