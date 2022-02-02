import java.util.Scanner;

class MyArray
{
 public int[] ArrayConcat(int arr1[],int n1,int arr2[],int n2)
 {
    int arr3[]=new int[n1+n2];
    for(int i=0;i<n1;i++)
    {
         arr3[i]=arr1[i];
    }

    for (int i=0;i<n2;i++) 
    {
      arr3[n1+i]=arr2[i];
    }
    return arr3;
 }
}

class ass51que4
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
      int arr3[]=new int[n1+n2];
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
      arr3=obj.ArrayConcat(arr1,n1, arr2,n2);
      System.out.println("element in concated array");
      for (int i : arr3) 
    {
       System.out.println(i+"\t");
    }
   }
}