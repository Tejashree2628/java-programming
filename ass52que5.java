import java.util.Scanner;

class MyArray
{
 public Boolean Palindrome(int arr1[])
 {
    int digit=0,no=0,temp=0,count=0;
    for(int i=0;i<arr1.length;i++) 
    {
      temp=arr1[i];
   while(temp!=0)
   {
     digit=temp%10;
     no=no*10+digit;
     temp=temp/10;
   }
      if(arr1[i]==no)
      {
         count++;
      }
      no=0;
    }
    if(count==arr1.length)
    {
       return true;
    }
    else
    {
       return false;
    }
 }
}

class ass52que5
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
      boolean ans= obj.Palindrome(arr1);
         System.out.println(ans);
   }
}