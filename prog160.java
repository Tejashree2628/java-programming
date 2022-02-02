import java.util.*;

class sorting
{
   boolean flag=false;
   public void bubblesort(int arr[])
   {
     int temp=0;
     flag=false;
     for(int i=0;i<arr.length;i++)
     {
       flag=false;
      for(int j=0;j<arr.length-i-1;j++)
      {
         if(arr[j]>arr[j+1])
         {
           flag=true;
           temp=arr[j];
           arr[j]=arr[j+1];
           arr[j+1]=temp;
         }
      }
      if(flag==false)
      break;
      System.out.println("data after pass"+i+1);
      for(int k=0;k<arr.length;k++) //pass
       {
         System.out.print(arr[k]+" ");
       }
       System.out.println();
    }
   }
}
class prog160
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
       
      sr.bubblesort(arr);
      System.out.println("element after sorted");  
      for(int i=0;i<arr.length;i++)
       {
         System.out.println(arr[i]);
       }
  
  }
}