package linked.list;

public class linkedList <T>{
    Node head;

    public void linkedList(){
        this.head = null;
    }

    public void insert(T value){

            Node newNode = new Node(value);
            newNode.nextNode= this.head;
            this.head=newNode;
    }

    public boolean includes(T value){
        Node pointer=this.head;

        while(pointer!=null)
        {
            if(pointer.value==value)
            {
                return true;
            }
            pointer=pointer.nextNode;
        }
        return false;
    }
    public void append (T value){
        Node pointer=this.head;
        Node newNode = new Node(value);


        while(true)
        {
            if(pointer.nextNode==null)
            {
                pointer.nextNode=newNode;
                break;
            }
            pointer=pointer.nextNode;
        }
    }
    public void insertBefore (T value , T newValue){
        Node pointer=this.head;
        Node newNode = new Node(newValue);

        if (pointer.nextNode.value==value)
        {
            insert(value);
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
                pointer.nextNode=newNode;
                return;
            }
            pointer=pointer.nextNode;
        }
        System.out.println("Sorry, value not found , new value could not be added!");
    }
    public void insertAfter (T value , T newValue){
        Node pointer=this.head;
        Node newNode = new Node(newValue);

        if(value == null)
        {
            System.out.println("Sorry , new value can't be added after a null");
            return;
        }
        while(pointer!=null)
        {
            if(pointer.value==value)
            {
                newNode.nextNode=pointer.nextNode;
                pointer.nextNode=newNode;
                return;
            }
            pointer=pointer.nextNode;
        }
        System.out.println("Sorry, value not found , new value could not be added!");

    }
    public void DeleteValue (T value ){ //problem of adding a non-existing number
        Node pointer=this.head;

        if(value == null)
        {
            System.out.println("Sorry , null value can't be deleted");
            return;
        }
        if(head.value==value)
        {
            this.head=this.head.nextNode;
            return;
        }
        try{
            while(pointer!=null) // must handel NullPointerException
            {

                if(pointer.nextNode.value==value)
                {
                    pointer.nextNode=pointer.nextNode.nextNode;
                    return;
                }
                pointer=pointer.nextNode;
            }
            System.out.println("Sorry, value not found ,value can not be deleted!");

        }catch(NullPointerException err){
            System.out.println(err);
        }


    }


    public String toString (){
        String stringArray = new String("");
        Node pointer=this.head;
        while(pointer!=null)
        {
            stringArray+="{"+pointer.value+"}->";
            pointer=pointer.nextNode;

        }
        stringArray+="{NULL}";

        return stringArray;
    }

}
