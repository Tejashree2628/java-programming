import java.util.Scanner;

class MyArray
{
 public void ReverseArray(int arr1[])
 {
    int digit=0,no=0,temp=0;
    for(int i=0;i<arr1.length;i++) 
    {
      temp=arr1[i];
   while(temp!=0)
   {
     digit=temp%10;
     no=no*10+digit;
     temp=temp/10;
   }
     arr1[i]=no;
      no=0;
    }
 }
}

class ass53que1
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
      obj.ReverseArray(arr1);
      System.out.println("reverse element are");
      for(int i=0;i<n1;i++)
      {
         System.out.println(arr1[i]);
      }  
   }
}