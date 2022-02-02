import java.util.*;
import java.lang.*;
import MarvellousStringx.Stringx;

class Marvellous extends Stringx
{
  public String Reversex()
  {

    int iCnt=0,j=Str.length()-1,i=0;
    char arr[]=Str.toCharArray();
    while(i<Str.length())
    {
      arr[i]=Str.charAt(j);
      i++;
      j--;
    }
  
   return new String(arr);
  }

} 

class prog104
{
  public static void main(String[] args)
  {
    int iRet=0;
    String Str;
     Marvellous mobj=new Marvellous();
     mobj.Accept();
     mobj.Display();
     Str=mobj.Reversex();
     System.out.println("reverse string is "+Str);
    
  }
}
