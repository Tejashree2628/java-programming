import java.util.Scanner;

class MyArray
{
 public void Pattern(int arr1[])
 {
    for(int i=0;i<arr1.length;i++)
    {
     if(arr1[i]%2==0)
       {
         for(int j=0;j<arr1[i];j++)
         {
            System.out.printf("*\t");
         }
         System.out.print("\n");
       }
    }
}
}
class ass54que5
{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number of element in first array");
     int n1=sc.nextInt();
      
      int arr1[]=new int[n1];
      System.out.println("enter element in first array");
      
      for(int i=0;i<n1;i++)
      {
         arr1[i]=sc.nextInt();
      }
      MyArray obj=new MyArray();
     obj.Pattern(arr1);
     
   }
}