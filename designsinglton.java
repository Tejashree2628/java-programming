

final class Singlton
{
  public int x,y;
  private static Singlton obj = new Singlton();
  private Singlton()
  {
        System.out.println("inside constructor");        
  } 
 
   public static Singlton GetObject()
   {
     return obj;

   }
  
}

class designsinglton
{
   public static void main(String[] args) 
   {
 // NOT ALLOW 
 // Singlton obj=new Singlton();  
      Singlton sobj2=Singlton.GetObject();
      Singlton sobj1=Singlton.GetObject();
        
   }        
}