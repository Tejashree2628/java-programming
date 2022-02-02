

class Node2<T3>
{
  public T3 data;
  public Node2<T3> next;
  public Node2<T3> prev;

}

class DoublyLL<T3>
{
  private Node2<T3> first;
  private int size;

  public DoublyLL()
  {
    this.first=null;
    this.size=0;
  }
  public void InsertFirst(T3 no)
  {
    Node2<T3> newn=null;
    newn=new Node2<T3>();

    newn.data=no;
    newn.next=null;
    newn.prev=null;

    if(first==null)
    {
       first=newn;
    }
    else
    {
       newn.next=first;
       first.prev=newn;
       first=newn;
    }
    this.size++;
  }

  public void display()
  {
    Node2<T3> temp=null;
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

  public void InsertLast(T3 no)
  {
    Node2<T3> newn=null;
    newn=new Node2<T3>();

    newn.data=no;
    newn.next=null;
    newn.prev=null;

    if(first==null)
    {
       first=newn;
    }
    else
    {
       Node2<T3> temp=first;
       while(temp.next!=null)
       {
         temp=temp.next;
       }
       temp.next=newn;
       newn.prev=temp;
    }
    this.size++;
  }

   public void InsertATPos(T3 no,int pos)
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
       Node2<T3> newn=new Node2<T3>();
       newn.data=no;
       newn.next=null;
       Node2<T3> temp=first;
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
    }
    else
    {
    first=first.next;
    first.prev=null;
    }
    this.size--;
  }

  public void DeleteLast()
  {
    Node2<T3> temp=first;
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
       
       Node2<T3> temp=first;
       for(int i=1;i<pos-1;i++)
       {
         temp=temp.next;
       }
       
       temp.next=temp.next.next;
       this.size--;
      }
   }
}
class prog165
{
  public static void main(String[] args) 
  {
    DoublyLL <Integer>obj=new DoublyLL<Integer>();

    obj.InsertFirst(51);
    obj.InsertFirst(21);
   obj.InsertFirst(11);
    obj.InsertLast(101);
    obj.InsertATPos(41, 3);

   int icnt=obj.count();
    System.out.println("count is"+icnt);
    obj.display();
    obj.DeleteATPos(3);
    obj.DeleteLast();
    obj.display();
 
  }
}