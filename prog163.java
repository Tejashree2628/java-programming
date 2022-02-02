

class Node<T1>
{
  public T1 data;
  public Node<T1> next;
}

class SinglyLL<T1>
{
  private Node<T1> first;
  private int size;

  public SinglyLL()
  {
    this.first=null;
    this.size=0;
  }
  public void InsertFirst(T1 no)
  {
    Node<T1> newn=null;
    newn=new Node<T1>();

    newn.data=no;
    newn.next=null;

    if(first==null)
    {
       first=newn;
    }
    else
    {
       newn.next=first;
       first=newn;
    }
    this.size++;
  }

  public void display()
  {
    Node<T1> temp=null;
    temp=first;
    while(temp!=null)
    {
      System.out.print("|"+temp.data+"|->");
      temp=temp.next;
    }
    System.out.print("null");
    System.out.println();

  }
  public int count()
  {
    return this.size;
  }

  public void InsertLast(T1 no)
  {
    Node<T1> newn=null;
    newn=new Node<T1>();

    newn.data=no;
    newn.next=null;

    if(first==null)
    {
       first=newn;
    }
    else
    {
       Node<T1> temp=first;
       while(temp.next!=null)
       {
         temp=temp.next;
       }
       temp.next=newn;
    }
    this.size++;
  }

   public void InsertATPos(T1 no,int pos)
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
       Node<T1> newn=new Node<T1>();
       newn.data=no;
       newn.next=null;
       Node<T1> temp=first;
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
    }
    else
    {
    first=first.next;
    }
    this.size--;
  }

  public void DeleteLast()
  {
    Node<T1> temp=first;
    if(size==0)
    {
      return;
    }
    else if(size==1)
    {
      first=null;
    }
    else
    {
       while(temp.next.next!=null)
       {
         temp=temp.next;
       }
       temp.next=null;
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
       
       Node<T1> temp=first;
       for(int i=1;i<pos-1;i++)
       {
         temp=temp.next;
       }
       
       temp.next=temp.next.next;
       this.size--;
      }
   }
}
class prog163
{
  public static void main(String[] args) 
  {
    SinglyLL <Float>obj=new SinglyLL<Float>();

    obj.InsertFirst(51.2f);
    obj.InsertFirst(21.47f);
   obj.InsertFirst(11.14f);
    obj.InsertLast(101.47f);
    obj.InsertATPos(41.12f, 3);
    obj.DeleteATPos(3);

   int icnt=obj.count();
    System.out.println("count is"+icnt);
    obj.display();
    obj.DeleteFirst();
    obj.DeleteLast();
    obj.display();
 
  }
}