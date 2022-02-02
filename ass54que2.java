import java.util.Scanner;

class MyArray
{
 public int Vowel(char arr1[])
 {
    int count=0;
    for(int i=0;i<arr1.length;i++)
    {
     if((arr1[i]=='A') || (arr1[i]=='E') || (arr1[i]=='I') || (arr1[i]=='O') || (arr1[i]=='U') || (arr1[i]=='a') || (arr1[i]=='e') || (arr1[i]=='i') || (arr1[i]=='o') || (arr1[i]=='u'))
       {
          count++;
       }
    }
    return count;
}
}
class ass54que2
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
     int count=obj.Vowel(arr1);
     System.out.println("vowels are"+count);
   }
}