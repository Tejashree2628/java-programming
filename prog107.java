import java.util.*;
import MarvellousStringx.Stringx;

class Marvellous extends Stringx
{
  public boolean CheckPalindrom()
  {

    int iCnt=0,j=Str.length()-1,i=0;
    char arr[]=new char[Str.length()];
    boolean bRet=false;
    while(i<Str.length())
    {
      arr[i]=Str.charAt(j);
      i++;
      j--;
    }
    String newstr=new String(arr);
    bRet=newstr.equals(Str);
    return bRet;
  
  }

} 

class prog107
{
  public static void main(String[] args)
  {
    int iRet=0;
    boolean bRet=false;
     Marvellous mobj=new Marvellous();
     mobj.Accept();
     mobj.Display();
     bRet=mobj.CheckPalindrom();
     if(bRet==true)
     {
     System.out.println("string is palindrom");
     }
     else
     {
       System.out.println("string is not palindrom");
     }
    
  }
}
