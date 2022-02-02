package CollectionX;

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