import java.util.Scanner;

class MyArray
{
 public int Capital(char arr1[])
 {
    int count=0;
    for(int i=0;i<arr1.length;i++)
    {
     if((arr1[i]>='A') && (arr1[i]<='Z'))
       {
          count++;
       }
    }
    return count;
}
}
class ass53que4
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
     int capital= obj.Capital(arr1);
     System.out.println("uppercase element in first array"+capital);
     
   }
}