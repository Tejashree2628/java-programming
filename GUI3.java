import java.awt.*;

class Marvellouswindow extends Frame
{
    public Marvellouswindow(String str,int x,int y)
    {
        super();
        setTitle(str);
        setSize(x,y);
        setVisible(true);
    }
}
class GUI3
{
     public static void main(String[] args)
      {
      
        Marvellouswindow mobj1 = new Marvellouswindow("second",500,600);
        Marvellouswindow mobj2 = new Marvellouswindow("first",200,300);
        

    }
}