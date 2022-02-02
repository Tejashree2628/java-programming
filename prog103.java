import java.util.*;
import MarvellousStringx.Stringx;

class Marvellous extends Stringx
{
  public int CountVowel()
  {
    int iCnt=0,i=0;
    while(i<Str.length())
    {
      if((Str.charAt(i)=='a') || (Str.charAt(i)=='e') || (Str.charAt(i)=='i') || (Str.charAt(i)=='o') || (Str.charAt(i)=='u'))
      {
        iCnt++;
      }
      i++;
    }
      return iCnt;
  }

} 

class prog103
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
