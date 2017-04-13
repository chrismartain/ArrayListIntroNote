import java.util.LinkedList;
import java.util.Arrays;

/**
 * Created by christian on 4/13/2017.
 */
public class LinkedListIntro {
    public static void main(String[] args){

        LinkedList linkedListOne = new LinkedList();
        LinkedList<String> names = new LinkedList<String>();

        names.add("Ahmed Bennani");
        names.add("Ben Shlomo");
        names.add("Tony Stark");

        //if you want to add a name at the end of the above Linked
        // your method should be the following.
        names.addLast("Christian Martin");
        //if you want add an object wish for it to be
        // first on your list you will use the following

        names.addFirst("Rachel  Aldridge");

        //You can also define the position on which you will like to place
        //the object, we use the index strategy to target a particular place
        // in our list, like the following example
        names.add(0,"Ngoie Martin");
        /*we can replace an element in a list by targeting if know if it index
        * position on the list like in the example below*/
        names.set(2, "Paul Newman");
        //remove by using the index or string
       // names.remove(0); // this will remove Ngoie Martin
        names.remove("Ben Shlomo");

        //Another way to retrieve values is:
        System.out.println("\nFirst Index: " + names.get(0));
        System.out.println("Second Index: " + names.get(1));
        //to get a the last index in your list:
        System.out.println("");


        for(String name : names){
            System.out.println(name);
        }
    }
}
