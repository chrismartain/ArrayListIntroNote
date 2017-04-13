import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * This class introduces some concept of
 * ArrayList
 * Created by @christian on 3/22/17.
 */
public class ArrayListIntro {
    public static void main(String[] args) {

        List<String> phrases = new ArrayList<String>();
        phrases.add("Hello");
        phrases.add("Byebye");
        phrases.add("Something else");

        System.out.println(phrases.size());

       /* List<String> phrases2 = new ArrayList<String>();
        phrases.add("Hello");
        phrases.add("Byebye");
        phrases.add("Something else");


        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);// Java will convert this into this:(new Integer(5)) by default
        numbers.add(10);
        numbers.add(29);


        System.out.println(phrases.get(0));
        System.out.println(phrases.get(1));
        System.out.println(phrases.get(2));

        phrases.addAll(phrases2);
        System.out.println(phrases);
        System.out.println(phrases.isEmpty());*/


        //it is important to know that Array, ArrayList and List and known as collection in Java.
        Iterator itr = phrases.iterator();//while an Iterator has the next element
        while (itr.hasNext()) { // We can get a String Object. This is casting and it temporary
            String str = (String) itr.next();
            if (str.equals("Byebye")) {
                itr.remove();
            } else {
                System.out.println(str);
/*
       Iterator itrInt = numbers.iterator();
        while (itrInt.hasNext()){// while an Iterator has the next element/Object
            Integer Int = (Integer)itrInt.next(); // We get an Integer Object, cast it
                                                //to an integer and store in into Int variable
                                                // that we created
            System.out.println(Int);        // and then We print it out same for other types*/
            }
            System.out.println(phrases.size());
        }
    }

}