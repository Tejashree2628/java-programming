import java.awt.*;
import java.awt.event.*;

class Marvellouswindow extends Frame implements ActionListener
{
   public Button b1;
    public TextField t1;


    public Marvellouswindow(String str,int x,int y)
    {
        super();
        setTitle(str);
        setSize(x,y);

        b1=new Button("marvellous");

        t1=new TextField();

        b1.setBounds(50,50,100,50);
        t1.setBounds(50,100,200,50);
        add(b1);
        add(t1);

        b1.addActionListener(this);
        setLayout(null);
        setVisible(true);
        

    }

    public void actionPerformed(ActionEvent obj)
    {
       t1.setText("welcome to java");
    }
}
class GUI5
{
     public static void main(String[] args)
      {
      
        Marvellouswindow mobj1 = new Marvellouswindow("second",500,600);
        Marvellouswindow mobj2 = new Marvellouswindow("first",200,300);
        

    }
}
   