package linked.list;

public class linkedList <T>{
    Node <T> head;
    Node <T> tail;

    public linkedList(){
        this.head = null;
        this.tail=null;
    }

    public void insert(T value){ //insert a value to the beginning

            Node <T> newNode = new Node<T>(value);
            newNode.nextNode= this.head;
            try{
                if(this.head==null) {
                    this.tail = newNode;
                }
                else
                {
                    this.head.previousNode=newNode;
                }

                this.head=newNode;

            }catch(NullPointerException err)
            {
                System.out.println(err.getMessage());
            }


    }

    public boolean includes(T value){
        Node <T> pointer=this.head;

        while(pointer!=null)
        {
            if(pointer.value==value)
            {
                return true;
            }
            pointer=pointer.nextNode ;
        }
        return false;
    }

    public void append (T value){ //adds an element to the end
        Node<T> pointer=this.tail;
        Node <T> newNode = new Node<T>(value);

        try{
            if(this.head == null)
            {
                insert(value);
            }
            newNode.previousNode=pointer;
            pointer.nextNode=newNode;
            this.tail=newNode;

        } catch(NullPointerException err){
            System.out.println(err.getMessage());
        }


//---------------------------------------------------------
//        Node pointer=this.head;
//        Node newNode = new Node(value);
//        if(pointer==null)
//        {
//            insert(value);
//        }
//
//        try {
//            while(true)
//            {
//                if(pointer.nextNode==null)
//                {
//                    pointer.nextNode=newNode;
//                    break;
//                }
//                pointer=pointer.nextNode;
//            }
//        }catch (NullPointerException err){
//            System.out.println(err.getMessage());
//
//        }

    }
    public void insertBefore (T value , T newValue){
        Node <T> pointer=this.head;
        Node <T> newNode = new Node <T>(newValue);
        if(!includes(value) && value!=null)
        {
            System.out.println("Sorry, value not found , new value could not be added!");
            return;

        }

        if (pointer.value==value)
        {
            insert(newValue);
            return;
        }
        if(value==null)
        {
            append(newValue);
            return;
        }
        while(pointer!=null)
        {
            if(pointer.nextNode.value==value)
            {
                newNode.nextNode=pointer.nextNode;
                newNode.previousNode=pointer;

                pointer.nextNode.previousNode=newNode;
                pointer.nextNode=newNode;
                return;
            }
            pointer=pointer.nextNode;
        }
        System.out.println("Sorry, value not found , new value could not be added!");

    }

    public void insertAfter (T value , T newValue){
        Node <T> pointer=this.head;
        Node <T> newNode = new Node<T>(newValue);
        try{
            if(!includes(value))
            {
                System.out.println("Sorry, value not found , new value could not be added!");
                return;
            }

            if(value == null)
            {
                System.out.println("Sorry ,new value can't be added after a null");
                return;
            }

            while(pointer!=null)
            {
                if(pointer.value==value)
                {
                    if(pointer.nextNode!=null)
                    {
                        newNode.nextNode=pointer.nextNode;
                        newNode.previousNode=pointer;

                        pointer.nextNode.previousNode=newNode;
                        pointer.nextNode=newNode;
                        return;

                    }
                    else
                    {
                        newNode.nextNode=pointer.nextNode;
                        newNode.previousNode=pointer;
                        pointer.nextNode=newNode;

                    }

                }
                pointer=pointer.nextNode;
            }


        }catch(NullPointerException err){
            System.out.println(err.getMessage());
        }

    }
    public void deleteValue (T value ){
        Node <T> pointer=this.head;

        if(value == null)
        {
            System.out.println("Sorry , null value can't be deleted");
            return;
        }
        if(head.value==value)
        {
            this.head=this.head.nextNode;
            this.head.previousNode=null;
            return;
        }
        try{
            while(pointer!=null)
            {

                if(pointer.nextNode.value==value)
                {
                    pointer.nextNode=pointer.nextNode.nextNode;
                    pointer.nextNode.previousNode=pointer;
                    return;
                }
                pointer=pointer.nextNode;
            }

        }catch(NullPointerException err){
            System.out.println(err.getMessage());
        }


    }


    public String toString (){
        String stringArray = new String("");
        Node <T> pointer=this.head;
        while(pointer!=null)
        {
            stringArray+="{"+pointer.value+"}->";
            pointer=pointer.nextNode;

        }
        stringArray+="{NULL}";

        return stringArray;
    }

    public T kthFromEnd (int kIndex){
        Node <T> pointer=this.tail;
        int counter = 0;
        while (pointer!=null)
        {
            if(counter==kIndex)
            {
                return (T) pointer.value;
            }
            counter++;
            pointer=pointer.previousNode;
        }


        return (T) "We have no kth element";
    }

    public boolean ifPalindrome (linkedList<T> list){
        Node <T> pointer1 = list.head;
        Node <T> pointer2 = list.tail;

        while(pointer1!=null && pointer2!=null){
            if(pointer1.value ==pointer2.value )
            {
                pointer1=pointer1.nextNode;
                pointer2=pointer2.previousNode;
            }else {
                return false;
            }
        }
        return true;
    }

}
