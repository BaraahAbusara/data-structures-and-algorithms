package linked.list;

public class linkedList <T>{
    Node head;

    public void linkedList(){
        this.head = null;
    }

    public void Insert(T value){

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
