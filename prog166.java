

class Node3<T4>
{
  public T4 data;
  public Node3<T4> next;
  public Node3<T4> prev;

}

class DoublyCL<T4>
{
  private Node3<T4> first;
  private Node3<T4> last;
  private int size;

  public DoublyCL()
  {
    this.first=null;
    this.last=null;
        this.size=0;
  }
  public void InsertFirst(T4 no)
  {
    Node3<T4> newn=null;
    newn=new Node3<T4>();

    newn.data=no;
    newn.next=null;
    newn.prev=null;

    if((first==null) && (last==null))
    {
       first=newn;
       last=newn;
    }
    else
    {
       newn.next=first;
       first.prev=newn;
       first=newn;
    }
    last.next=first;
    first.prev=last;
    this.size++;
  }

  public void display()
  {
    Node3<T4> temp=null;
    temp=first;
    if((first==null) &&(last==null))
    {
      return;
    }
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

  public void InsertLast(T4 no)
  {
    Node3<T4> newn=null;
    newn=new Node3<T4>();

    newn.data=no;
    newn.next=null;
    newn.prev=null;

    if((first==null) && (last==null))
    {
       first=newn;
       last=newn;
    }
    else
    {
       last.next=newn;
       newn.prev=last;
       last=newn;
    }
     last.next=first;
     first.prev=last;
    this.size++;
  }

   public void InsertATPos(T4 no,int pos)
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
       Node3<T4> newn=new Node3<T4>();
       newn.data=no;
       newn.next=null;
       newn.prev=null;
       Node3<T4> temp=first;
       for(int i=1;i<pos-1;i++)
       {
         temp=temp.next;
       }
       newn.next=temp.next;
       temp.next.prev=newn;
       newn.prev=temp;
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
    first.prev=last;
    last.next=first;
    }
    this.size--;
  }

  public void DeleteLast()
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
       last=last.prev;
       last.next=first;
       first.prev=last;
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
       
       Node3<T4> temp=first;
       for(int i=1;i<pos-1;i++)
       {
         temp=temp.next;
       }
       
       temp.next=temp.next.next;
       this.size--;
      }
   }
}
class prog166
{
  public static void main(String[] args) 
  {
    DoublyCL <Character>obj=new DoublyCL<Character>();

    obj.InsertFirst('a');
    obj.InsertFirst('z');
   obj.InsertFirst('A');
    obj.InsertLast('Q');
    obj.InsertATPos('h', 2);

   int icnt=obj.count();
    System.out.println("count is"+icnt);
    obj.display();
    obj.DeleteATPos(3);
    obj.DeleteLast();
    obj.display();
 
  }
}