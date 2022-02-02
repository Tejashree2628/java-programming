import java.awt.*;
import java.awt.event.*;

class Marvellouswindow extends WindowAdapter
{
 
    Frame fobj;
    public Marvellouswindow(String str,int x,int y)
    {
       fobj=new Frame();
       fobj.setSize(x,y);
       fobj.setVisible(true);
       fobj.addWindowListener(this);
       fobj.setTitle(str);
    }
     public void windowClosing(WindowEvent obj)
     {
         System.exit(0);
     }


}
class GUI7
{
   public static void main(String[] args)
      {
      
        Marvellouswindow mobj1 = new Marvellouswindow("second",500,600);        

    }
}
   