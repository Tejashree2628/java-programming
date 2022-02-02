import java.util.*;

class searching
{
   public boolean binarysearch(int arr[],int no)
   {
     int start,end,mid;
     start=0;
     end=arr.length-1;
     mid=(start+end)/2;

     while(start<=end)
     {
       if(arr[mid]==no)
       {
         break;
       }
       else if(no>arr[mid])
       {
          start=mid+1;
       }
       else if(no<arr[mid])
       {
         end=mid-1;
       }
       mid=(start+end)/2;
     }
     if(arr[mid]==no)
     {
       return true;
     }
     else
     {
       return false;
     }
   }
}
class prog157
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
    for(int i=0;i<arr.length;i++)
    {
      System.out.println(arr[i]);
    }

       searching sr=new searching();
       System.out.println("enter the element to search");
       int no=sc.nextInt();
       bret=sr.binarysearch(arr,no);
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