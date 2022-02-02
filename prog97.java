import java.util.*;
import MarvellousArrayx.Arrayx;

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

class prog97
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