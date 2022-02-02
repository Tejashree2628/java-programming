import java.util.*;
import MarvellousStringx.Stringx;

class Marvellous extends Stringx
{
  public int CountVowel()
  {
    int iCnt=0,i=0;
    char arr[]=Str.toCharArray();
    for(i=0;i<arr.length;i++)
    {
      if((arr[i]=='a') || (arr[i]=='e') || (arr[i]=='i') || (arr[i]=='o') || (arr[i]=='u'))
      {
        iCnt++;
      }
    }
      return iCnt;
  }

} 

class prog102
{
  public static void main(String[] args)
  {
    int iRet=0;
     Marvellous mobj=new Marvellous();
     mobj.Accept();
     mobj.Display();
     iRet=mobj.CountVowel();
     System.out.println("count of vowels is "+iRet);    
  }
}
