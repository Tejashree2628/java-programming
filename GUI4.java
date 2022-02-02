import java.awt.*;
class Marvellouswindow extends Frame
{
    Button b1;
    TextField t1;


    public Marvellouswindow(String str,int x,int y)
    {
        super();
        setTitle(str);
        setSize(x,y);

        b1=new Button("marvellous");

        t1=new TextField();

        b1.setBounds(50,50,100,50);
        t1.setBounds(50,100,150,50);
        add(b1);
        add(t1);
        setLayout(null);
        setVisible(true);
        

    }
}
class GUI4
{
     public static void main(String[] args)
      {
      
        Marvellouswindow mobj1 = new Marvellouswindow("second",500,600);
        Marvellouswindow mobj2 = new Marvellouswindow("first",200,300);
        

    }
}
   