/**
 * Created by christian on 5/1/17.
 */
public class Node {

    private String name, matric;
    private int year;
    private Node next;
    //this is the node class constructor.
    //however we are not going to the getNext()methode
    //in the constructor because we want to make it more readable and
    //explicit


    public void setName(String n){
        name = n;
    }
    public void setMatric(String n){
        name = n;
    }
    public void setYear(int y){
        year = y;
    }
    public void setNext(Node n){
        next = n;
    }
    public String getName(){
        return name;
    }
    public String getMatric(){
        return matric;
    }
    public int getYear(){
        return year;
    }
    public Node getNext(){
        return next;
    }
}
