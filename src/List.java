/**
 * Created by christian on 5/1/17.
 * this class creates Linked List fundamentality.
 * It has two main methods
 * addToList(Node) that creates a new Node in the List
 * find(Strinf), that finds the first Node with a given name
 *
 */
public class List {

    private Node head;
        //the constructor for the list class
    public List(Node h){
        head = h;
    }

    public void setHead(Node h){
        head = h;

    }
    public Node getHead(){
        return head;
    }
    public void addToList(Node newOne){
        if(head == null){
            head = newOne;
        } else {
            newOne.setNext(head);
            head = newOne;
        }
    }
    public Node find(String name){
        Node marker = head;
        while (marker != null){
            if(marker.getName().equals(name)){
                return marker;
            }
            marker = marker.getNext();
        }
        return null;
    }
}
