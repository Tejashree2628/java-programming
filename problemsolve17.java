import java.util.*;
//variable numbers of parameter(varidic function)
class marvellous
{
  public void Addition(int ... a)
  {
    int ans=0;
    for(int no :a)
    {
            ans=no+ans;
    }
     System.out.println(ans);
  }
}

class problemsolve17
{
  
  public static void main(String[] args) 
  {
    Scanner obj=new Scanner(System.in);
   
   
    System.out.println("enter three number");
    
    marvellous mobj= new marvellous();
    mobj.Addition(11,21,51,71,101);

  }
}