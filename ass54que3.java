import java.util.Scanner;

class MyArray
{
 public int Search(char arr1[],char ch)
 {
    int count=0;
    for(int i=0;i<arr1.length;i++)
    {
     if((arr1[i]==ch) || (arr1[i]==ch+32))
       {
          count++;
       }
    }
    return count;
}
}
class ass54que3
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
      System.out.println("enter the character to search");
      char ch=sc.next().charAt(0);
      MyArray obj=new MyArray();
     int count=obj.Search(arr1,ch);
     System.out.println("count is"+count);
   }
}