import java.util.*;
import MarvellousArrayx.Arrayx;

class Marvellous extends Arrayx
{
  public Marvellous(int iValue)
  {
  super(iValue);
  }

  public float Average()
  {
    int iSum=0,iCnt=0;
    float fAvg=0.0f;
    for(iCnt=0;iCnt<arr.length;iCnt++)
     {
         iSum=iSum+arr[iCnt];
     }
     fAvg=(iSum/arr.length);
     return fAvg;
  } 

}

class prog98
{
  public static void main(String[] args)
  {
    Scanner sobj=new Scanner(System.in);
    int iLength=0;
    float fRet=0.0f;
    
    System.out.println("enter the size of array");
    iLength=sobj.nextInt();
    Marvellous mobj=new Marvellous(iLength);
    mobj.Accept();
    mobj.Display();
    fRet=mobj.Average();
    System.out.println("average is"+fRet);
  }
}