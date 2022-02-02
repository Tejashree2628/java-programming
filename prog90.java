import java.util.*;

class logicbuilding
{
    public int Addition(int i,int j)
    {
        int iResult=0;
        iResult=i+j;
        return iResult;
    } 
}


class prog90
{
        public static void main(String[] args) 
    {
        Scanner sobj =new Scanner(System.in);
        int iNo1=0,iNo2=0,iAns=0;
        
        System.out.println("enter the first number");
        iNo1=sobj.nextInt();
        System.out.println("enter the second number");
        iNo2=sobj.nextInt();

        logicbuilding lbobj=new logicbuilding();

        iAns=lbobj.Addition(iNo1,iNo2);
        System.out.println("addition is "+iAns);
    }
   
}