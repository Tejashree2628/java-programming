

class Node1<T2>
{
  public T2 data;
  public Node1<T2> next;

}

class SinglyCL<T2>
{
  private Node1<T2> first;
  private Node1<T2> last;
  private int size;

  public SinglyCL()
  {
    this.first=null;
    this.last=null;
    this.size=0;
  }
  public void InsertFirst(T2 no)
  {
    Node1<T2> newn=null;
    newn=new Node1<T2>();

    newn.data=no;
    newn.next=null;

    if((first==null) && (last==null))
    {
       first=newn;
       last=newn;
    }
    else
    {
       newn.next=first;
       first=newn;
    }
     last.next=first;
    this.size++;
  }

  public void display()
  {
    Node1<T2> temp=null;
    temp=first;
    do
    {
      System.out.print("|"+temp.data+"|->");
      temp=temp.next;
    }while(temp!=last.next);
    System.out.print("null");
    System.out.println();

  }
  public int count()
  {
    return this.size;
  }

  public void InsertLast(T2 no)
  {
    Node1<T2> newn=null;
    newn=new Node1<T2>();

    newn.data=no;
    newn.next=null;

    if((first==null) &&(last==null))
    {
       first=newn;
       last=newn;
    }
    else
    {
       last.next=newn;
       last=newn;
    }
    last.next=first;
    this.size++;
  }

   public void InsertATPos(T2 no,int pos)
   {
     if((pos<0) || (pos>size+1))
     {
       System.out.println("linked list empty");

     }
     if(pos==1)
     {
       InsertFirst(no);
     }
     else if(pos==size+1)
     {
       InsertLast(no);
     }
     else
     {
       Node1<T2> newn=new Node1<T2>();
       newn.data=no;
       newn.next=null;
       Node1<T2> temp=first;
       for(int i=1;i<pos-1;i++)
       {
         temp=temp.next;
       }
       newn.next=temp.next;
       temp.next=newn;
       this.size++;
      }
   }
  public void DeleteFirst()
  {
    if(size==0)
    {
      return;
    }
    else if(size==1)
    {
      first=null;
      last=null;
    }
    else
    {
    first=first.next;
    last.next=first;
    }
    this.size--;
  }

  public void DeleteLast()
  {
    Node1<T2> temp=first;
    if(size==0)
    {
      return;
    }
    else if(size==1)
    {
      first=null;
      last=null;
    }
    else
    {
       while(temp.next!=last)
       {
         temp=temp.next;
       }
          last=temp;
          last.next=first;
      }
    this.size--;
  }
  public void DeleteATPos(int pos)
   {
     if((pos<0) || (pos>size))
     {
       System.out.println("linked list empty");

     }
     if(pos==1)
     {
       DeleteFirst();
     }
     else if(pos==size)
     {
        DeleteLast();
    }
     else
     {
       
       Node1<T2> temp=first;
       for(int i=1;i<pos-1;i++)
       {
         temp=temp.next;
       }
       
       temp.next=temp.next.next;
       this.size--;
      }
   }
}
class prog164
{
  public static void main(String[] args) 
  {
    SinglyCL <Character>obj=new SinglyCL<Character>();

    obj.InsertFirst('a');
    obj.InsertFirst('e');
   obj.InsertFirst('k');
    obj.InsertLast('l');
    obj.InsertATPos('h', 3);
   

   int icnt=obj.count();
    System.out.println("count is"+icnt);
    obj.display();
    obj.DeleteATPos(5);
    obj.DeleteFirst();
    obj.display();

 
  }
}