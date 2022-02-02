import java.util.Scanner;

class MyArray
{
 public void Percentage(float arr1[])
 {
    int digit=0,no=0,temp=0;
    for(int i=0;i<arr1.length;i++) 
    {
      if(arr1[i]<35)
      {
         System.out.println(arr1[i]+"\tFail");
      }
      else if((arr1[i]>=35) &&(arr1[i]<=50))
      {
         System.out.println(arr1[i]+"\tPass Class");
      }
      else if((arr1[i]>50) &&(arr1[i]<=60))
      {
         System.out.println(arr1[i]+"\tSecond Class");
      }
      else if((arr1[i]>60) &&(arr1[i]<=70))
      {
         System.out.println(arr1[i]+"\tfirst Class");
      }
      else if(arr1[i]>70)
      {
         System.out.println(arr1[i]+"\tFirst Class with destinction");
      }
      
    }
}
}
class ass53que5
{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number of element in first array");
     int n1=sc.nextInt();
      
      float arr1[]=new float[n1];
      System.out.println("enter element in first array");
      
      for(int i=0;i<n1;i++)
      {
         arr1[i]=sc.nextFloat();
      }
      MyArray obj=new MyArray();
      obj.Percentage(arr1);
   }
}