import java.util.*;

class logicbuilding
{
    public boolean armstrong(int no)
    {
        if(no <0)
        {
            no=-no;
        }
       int i=0,temp1=no,count=0,iDigit=0,power=1,iResult=0;
       boolean bFlag=true;
       while(temp1 != 0)
       {
          count++;
          temp1=temp1/10;
       }
        temp1=no;
       while(temp1 != 0)
       {
         iDigit=temp1%10;
         for(i=1;i<=count;i++)
         {
             power=power * iDigit;
         }
         iResult=iResult+power;
         power=1;
         temp1=temp1/10;
       } 
       if(iResult==no)
       {
          return true;
       } 
       else
       {
           return false;
       }
    } 
}


class prog93
{
        public static void main(String[] args) 
    {
        Scanner sobj =new Scanner(System.in);
        int iNo1=0,iAns=0;
        boolean bAns=false;
        System.out.println("enter the  number");
        iNo1=sobj.nextInt();       
        logicbuilding lbobj=new logicbuilding();

        bAns=lbobj.armstrong(iNo1);
        if(bAns==true)
        {
            System.out.println("number is armstrong");
        }
        else
        {
            System.out.println("number is not armstrong");
        }

    }
   
}