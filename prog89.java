import java.util.*;

class prog89
{
    public static int Addition(int i,int j)
    {
        int iResult=0;
        iResult=i+j;
        return iResult;
    }
        public static void main(String[] args) 
    {
        Scanner sobj =new Scanner(System.in);
        int iNo1=0,iNo2=0,iAns=0;
        
        System.out.println("enter the first number");
        iNo1=sobj.nextInt();
        System.out.println("enter the second number");
        iNo2=sobj.nextInt();
        iAns=Addition(iNo1,iNo2);
        System.out.println("addition is "+iAns);
    }
   
}