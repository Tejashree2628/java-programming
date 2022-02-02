import java.text.StringCharacterIterator;

class Demo implements Cloneable
{
   public String Name;
   public String Batch; 

   public Demo(String x,String y)
   {
       this.Name=x;
       this.Batch=y;
   }
   public String toString()
   {
       return this.Name+" "+this.Batch;
   }
   protected void finalize()
   {
       System.out.println("inside finalise method");
   }
   public Object clone() throws CloneNotSupportedException
   {
       return super.clone();
   }     

}


class Objectclass 
{
    public static void main(String[] args) throws Exception
    {
        String s1="hello";
        String s2="hello";
        if(s1.equals(s2))
        {
            System.out.println("string are equal");
        }
       Demo obj1=new Demo("prasad", "LB");
       Demo obj2=new Demo("abhi", "PPA");
       System.out.println("hashcode of obj1 is"+obj1.hashCode());    
       System.out.println("hashcode of obj1 is"+obj2.hashCode());    
       System.out.println(obj1.toString());    
 
       Class cobj=obj1.getClass();
       System.out.println("name of class is"+cobj.getName());
       Demo objx=(Demo)obj1.clone();
       System.out.println(objx.toString());
       obj1=null;
       obj2=null;
       System.gc();
    }
}