import java.util.Scanner;

class MyArray
{
 public int Difference(char arr1[])
 {
    int count1=0,count2=0;
    for(int i=0;i<arr1.length;i++)
    {
     if((arr1[i]>='A') && (arr1[i]<='Z'))
       {
          count1++;
       }
       if((arr1[i]>='a') && (arr1[i]<='z'))
       {
          count2++;
       }
    }
    return count1-count2;
}
}
class ass54que4
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
     int diff= obj.Difference(arr1);
     System.out.println("difference is"+diff);
     
   }
}