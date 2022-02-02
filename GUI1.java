import java.awt.*;

class Marvellouswindow extends Frame
{
    public Marvellouswindow(String str)
    {
        super(str);
    }
}
class GUI1
{
     public static void main(String[] args)
      {
      
        Marvellouswindow mobj = new Marvellouswindow("marvellous");
        mobj.setSize(300,300);
        mobj.setVisible(true);
    }
}