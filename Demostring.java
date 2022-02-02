import java.awt.*;

class Demostring
{
   public static void main(String[] args)
      {
      String str1="hello";
      String str2=new String("hello");
      char arr[] = {'h','e','l','l','o'};
      String str3=new String(arr);

      System.out.println(str1);
      System.out.println(str2);
      System.out.println(str3);

      System.out.println("string length is:"+str1.length());
      
      System.out.println("arr length is"+arr.length);

      System.out.println("String lenth is : "+str1.length());


      String s1="demo";
      String s2="demo";
      String s3="demo";
     
       s2.concat(str1);
       System.out.println(s2);
      
       StringBuffer s4=new StringBuffer("demo");
       String s5=new String("demo");
       String s6=new String("demo");


       s4.append(str1);
       System.out.println(s4);
      
       System.out.println(s6.charAt(3));

       char brr[]=s6.toCharArray();
        for(int i=0;i<brr.length;i++)
        {
            System.out.println(brr[i]);
        }

    }
}
   