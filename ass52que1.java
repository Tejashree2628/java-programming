import java.util.Scanner;

class MyArray
{
 public int DiffArray(int arr1[],int arr2[])
 {
    int sum1=0,sum2=0;
    for (int i : arr1) 
    {
       sum1=sum1+i;
    }
    for (int i : arr2) 
    {
      sum2=sum2+i;
   }
     return sum1-sum2;
 }
}

class ass52que1
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
      int diff=obj.DiffArray(arr1, arr2);
      System.out.println("difference is"+diff);
   }
}