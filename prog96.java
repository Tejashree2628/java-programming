import java.util.*;

class Arrayx
{
   public int arr[];
   
   public Arrayx(int iSize)
   {
     arr= new int[iSize]; 
   }
 
   public void Accept()
   {
    Scanner sc= new Scanner(System.in);
    int iCnt=0; 
    System.out.println("enter element");
    for(iCnt=0;iCnt<arr.length;iCnt++)
    {
       arr[iCnt]=sc.nextInt();
    }
     
   }
 
   public void Display()
   {
     int iCnt=0;
     System.out.println("entered element are");
    for(iCnt=0;iCnt<arr.length;iCnt++)
    {
       System.out.println(arr[iCnt]);
    }
   }
}

class Marvellous extends Arrayx
{
  public Marvellous(int iValue)
  {
  super(iValue);
  }

  public int Add()
  {
    int iSum=0,iCnt=0;
    for(iCnt=0;iCnt<arr.length;iCnt++)
     {
       iSum=iSum+arr[iCnt];
     }
     return iSum;
  } 

}

class prog96
{
  public static void main(String[] args)
  {
    Scanner sobj=new Scanner(System.in);
    int iLength=0,iRet=0;
    
    System.out.println("enter the size of array");
    iLength=sobj.nextInt();
    Marvellous mobj=new Marvellous(iLength);
    mobj.Accept();
    mobj.Display();
    iRet=mobj.Add();
    System.out.println("addition is"+iRet);
  }
}