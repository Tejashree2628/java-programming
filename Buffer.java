import java.io.*;

class Buffer
{
    public static void main(String[] args) throws Exception
    {
      //InputStreamReader iobj=new InputStreamReader(System.in);

     // BufferedReader bobj=new BufferedReader(iobj);
      
      BufferedReader bobj=new BufferedReader(new InputStreamReader((System.in)));

      System.out.println("enter your name");
      String str=bobj.readLine();
       
      System.out.println("enter your age");
      int age=Integer.parseInt(bobj.readLine());
     
      System.out.println("your name :"+str);
      System.out.println("your age :"+age);

    }
}

