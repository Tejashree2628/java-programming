import java.util.Scanner;

class MyArray
{
 public void MinArray(int arr1[],int arr2[])
 {
    int min1=arr1[0],min2=arr2[0];
    for (int i : arr1) 
    {
       if(min1>i)
       {
          min1=i;
       }
    }
    for (int i : arr2) 
    {
      if(min2>i)
      {
         min2=i;
      }
   }
   System.out.println("minimum element in first array"+min1);
   System.out.println("minimum element in second array"+min2);

 }
}

class ass52que2
{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number of element in first array");
     int n1=sc.nextInt();
      
      System.out.println("enter number of element in second array");
      int n2=sc.nextInt();
      int arr1[]=new int[n1];
      int arr2[]=new int[n2];
      System.out.println("enter element in first array");
      
      for(int i=0;i<n1;i++)
      {
         arr1[i]=sc.nextInt();
      }
      System.out.println("enter element in second array");

      for(int i=0;i<n2;i++)
      {
          arr2[i]=sc.nextInt();
      }
      MyArray obj=new MyArray();
      obj.MinArray(arr1, arr2);
   }
}