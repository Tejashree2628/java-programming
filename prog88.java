import java.util.*;

class prog88
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        int iNo1=0,iNo2=0,iAns=0;
        
        System.out.println("enter the first number");
        iNo1=sc.nextInt();
        System.out.println("enter the second number");
        iNo2=sc.nextInt();
        iAns=iNo1+iNo2;

        System.out.println("addition is "+iAns);
    }
   
}