//javac filename -d .

package MarvellousArrayx;
import java.util.*;

public class Arrayx
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
