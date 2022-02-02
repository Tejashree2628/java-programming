import java.awt.*;
import java.awt.event.*;

class Marvellouswindow extends Frame implements WindowListener
{
 

    public Marvellouswindow(String str,int x,int y)
    {
        super();
        setTitle(str);
        setSize(x,y);
        addWindowListener(this);
        setVisible(true);
        

    } 
    public void windowDeactivated(WindowEvent obj) {}
    public void windowActivated(WindowEvent obj) {}
    public void windowDeiconified(WindowEvent obj) {}
    public void windowIconified(WindowEvent obj) {}
    public void windowClosed(WindowEvent obj) {}
    public void windowClosing(WindowEvent obj) 
    {
        System.exit(0);
    }
    public void windowOpened(WindowEvent obj) {}
    
}
class GUI6
{
     public static void main(String[] args)
      {
      
        Marvellouswindow mobj1 = new Marvellouswindow("second",500,600);        

    }
}
   