import java.util.*;

class Marvellous
{
  public int Add(int brr[])
  {
      int i=0,iAns=0;
    for(int element:brr)
    {
       iAns=iAns+element;
    }
   return iAns;
  }
}
class prog95
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int iSize=0,i=0,iRet=0;
    System.out.println("enter number of element");
    iSize=sc.nextInt();

    int arr[]=new int[iSize];
    
    System.out.println("enter the numbers");

    for(i=0;i<arr.length;i++)
    {
      arr[i]=sc.nextInt();
    }

    Marvellous mobj=new Marvellous();
     iRet=mobj.Add(arr);

     System.out.println("addition of element is"+iRet);
  } 
}
