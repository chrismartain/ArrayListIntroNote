import java.util.Scanner;

/**
 * Created by christian on 5/1/17.
 * this class is the test controller for
 * our students list.
 */
public class Controller {

        private List list;

        public static void main(String[] args){

        }
        public void askNode{
            /**his method is going to:
            * 1. Ask the user for student details
            * 2. Create a new Node with them,
            * 3. Give this Node to List's addToList(Node)method
            * */

    }
    public void find(){
        /***
         *1Ask the user for the name of the student
         * Call the list's find(String) method with this
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("");

    }
    private void printDetails(Node n){
        System.out.println("Name: " + n.getName());
        System.out.println("Matriculation number: " + n.getMatric());
        System.out.println("Year: " + n.getYear());
        //for the testing purpose

        System.out.println("Next Node " + n.getNext());
    }

}
