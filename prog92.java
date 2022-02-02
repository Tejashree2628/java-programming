import java.util.*;

class logicbuilding
{
    public boolean prime(int no)
    {
       int i=0;
       boolean bFlag=true;
       for(i=2;i<=no/2;i++)
       {
        if((no%i)==0)
        {
        bFlag=false;
         break;
        }
       } 
       return bFlag; 
    } 
}


class prog92
{
        public static void main(String[] args) 
    {
        Scanner sobj =new Scanner(System.in);
        int iNo1=0,iAns=0;
        boolean bAns=false;
        System.out.println("enter the  number");
        iNo1=sobj.nextInt();       
        logicbuilding lbobj=new logicbuilding();

        bAns=lbobj.prime(iNo1);
        if(bAns==true)
        {
            System.out.println("number is prime");
        }
        else
        {
            System.out.println("number is not prime");
        }

    }
   
}