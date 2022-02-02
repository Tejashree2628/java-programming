import java.util.Scanner;

class MyArray
{
 public void ArrayReplace(char arr1[])
 {
    int count=0;
    for(int i=0;i<arr1.length;i++)
    {
     if((arr1[i]>='A') && (arr1[i]<='Z'))
       {
          arr1[i]+=32;
       }
    }
}
}
class ass54que1
{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number of element in first array");
     int n1=sc.nextInt();
      
      char arr1[]=new char[n1];
      System.out.println("enter element in first array");
      
      for(int i=0;i<n1;i++)
      {
         arr1[i]=sc.next().charAt(0);
      }
      MyArray obj=new MyArray();
     obj.ArrayReplace(arr1);
     System.out.println("element in array");

     for(int i=0;i<n1;i++)
      {
       System.out.println(arr1[i]);
      }
   }
}