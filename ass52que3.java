import java.util.Scanner;

class MyArray
{
 public int[] ArrayRev(int arr1[])
 {
    int arr2[]=new int[arr1.length];
    int j=0;
    for (int i=(arr1.length)-1;i>=0;i--)
    {
       arr2[j]=arr1[i];
       j++;
    }
    return arr2;

 }
}

class ass52que3
{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number of element in first array");
     int n1=sc.nextInt();
       int arr1[]=new int[n1];
       int arr2[]=new int[n1];
       
      System.out.println("enter element in first array");
      
      for(int i=0;i<n1;i++)
      {
         arr1[i]=sc.nextInt();
      }
      MyArray obj=new MyArray();
      arr2=obj.ArrayRev(arr1);
      System.out.println("reverse array is");

      for (int i : arr2) 
      {
        System.out.println(i+"\t");   
      }
   }
}