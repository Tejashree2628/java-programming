import java.util.*;

class sorting
{
  public boolean checksort(int arr[])
  {
    int i=0;
     if(arr[0]>arr[((arr.length)-1)])
     {
      for(i=0;i<arr.length-1;i++)
      {
        if(arr[i]<arr[i+1])
        {
           break;
        }
      }
      if(i<(arr.length)-1)
      {
        return false;
      }
      else
      {
        return true;
      }
    }
    else
    { 
      int j=0;
      for(j=0;j<arr.length-1;j++)
      {
        if(arr[j]>arr[j+1])
        {
           break;
        }
      }
      if(j<(arr.length)-1)
      {
        return false;
      }
      else
      {
        return true;
      }
    }
  }
   public void bubblesort(int arr[])
   {
     int temp=0;
     for(int i=0;i<arr.length-1;i++) //pass
     {
      for(int j=0;j<arr.length-i-1;j++)
      {
         if(arr[j]>arr[j+1])
         {
           temp=arr[j];
           arr[j]=arr[j+1];
           arr[j+1]=temp;
         }
      }
      System.out.println("data after pass"+i+1);
      for(int k=0;k<arr.length-1;k++) //pass
       {
         System.out.print(arr[i]);
       }

    }
   }
}
class prog159
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
    sorting sr=new sorting();
       
       
     bret=sr.checksort(arr);
      if(bret==true)
      {
        System.out.println("array is sorted");
      }
      else
      {
        System.out.println("array is not sorted");
      }
    

      sr.bubblesort(arr);
       for(int i=0;i<arr.length;i++)
       {
         System.out.println(arr[i]);
       }
  
  }
}