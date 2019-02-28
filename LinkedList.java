class LinkedList<D> implements List<D> {
    ListObject<D> head,tail; Integer size;
    LinkedList(){
        head = null;
        tail = null;
        size = 0;
    }   
    public void add(D v){
        ListObject<D> ob = new ListObject(v);
        if(head == null){
            head = ob;
            tail = ob;
        }
        else{
            tail.next = ob;
            tail = ob;
        }
        size++;
    }   
    public void traverse(){
        ListObject ob = head;
        while(ob!=null){
            System.out.println(ob.val);
            ob = ob.next;
        }
    }
   public void add(D x, int pos)
    {
        BoundsException ob = new BoundsException();
        if(pos<=size && pos>=0)
        {
            if(pos==0)
            {
                ListObject temp=new ListObject(x,head);
                head = temp;
            }
            else if(pos==size)
            {
                ListObject temp=new ListObject(x);
                tail.next=temp;
                tail=temp;
            }
            else
            {
                ListObject temp= head;
                D t=null;
                for(int i=0;i<pos;i++)
                {
                    temp=temp.next;
                }
                ListObject tm=new ListObject(x,temp.next);
                temp.next=tm;
            }
             size++;
        }
        else{
        try{
            throw ob;
        }
        catch(BoundsException o){
            o.printer();
        }
    }
    }
    public void remove(D v){
        BoundsException ob = new BoundsException();
         int pos=search(v);
        if(pos!=-1)
        {
            if(pos==0)
                head = head.next;
            else if(pos==size-1)
            {
                ListObject Current= head;
                for(int i=0;i<size-1;i++)
                    Current=Current.next;
                Current.next=null;
            }
            else
            {
                ListObject Current = head;
                for(int i=0;i<pos;i++)
                Current =Current.next;
                Current.next=Current.next.next;
            }
            size--;
        }
        else{
        try{
            throw ob;
        }
        catch(BoundsException o){
            o.printer();
        }
    }
}
    public int search(D v){
         ListObject<D> temp= head;
        int pos=-1;
        for(int i=0;i<size;i++)
        {
            if(temp.val==v)
            {
                pos=i;
                break;
            }
            temp=temp.next;
        }
        return(pos);
    }
    public D getElementAt(int pos){
        BoundsException ob =  new BoundsException();
        if(pos>=0&&pos<size)
        {
            ListObject<D> temp= head;
            for(int i=0;i<pos;i++)
            {
                temp=temp.next;
            }
            return(temp.val);
        }
       else{
        try{
            throw ob;
        }
        catch(BoundsException o){
            o.printer();
            return null;
        }
    }
}
     public int size()
    {
        return size;
    }
    public boolean isEmpty()
    {
        return size==0;
    }
}
