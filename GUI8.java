import java.awt.*;
import java.awt.event.*;

class Marvellouswindow 
{
 
    Frame fobj;
    public Marvellouswindow(String str,int x,int y)
    {
       fobj=new Frame();
       fobj.setSize(x,y);
       fobj.setVisible(true);
       fobj.setTitle(str);
       
       fobj.addWindowListener(new WindowAdapter()
       {
           public void windowClosing(WindowEvent obj)
           {
               System.exit(0);
           }
       });

    }


}
class GUI8
{
   public static void main(String[] args)
      {
      
        Marvellouswindow mobj1 = new Marvellouswindow("second",500,600);        

    }
}
   