import java.util.Scanner;

class MyArray
{
 public void DisplayOdd(int arr1[],int arr2[])
 {
   System.out.println(" even element in first array");

    for (int i : arr1) 
    {
       if(i%2!=0)
       {
       System.out.println(i+"\t");
       }
    }
    System.out.println("even element in second array");

    for (int i : arr2) 
    {
       if(i%2!=0)
       {
      System.out.println(i+"\t");
       }
    }
 }
}

class ass51que3
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
      obj.DisplayOdd(arr1, arr2);
   }
}