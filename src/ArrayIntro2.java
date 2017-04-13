/**
 * Created by christian on 3/22/17.
 */
public class ArrayIntro2 {



        public static void main(String[] args) {
            // TODO Auto-generated method stub

            int[] intArray = {1, 3, 5, 6, 7};
            int[] sizes = new int[5]; // This is the same as {0, 0, 0, 0, 0}

            String[] stringArray = {"hello", "bye", "something"};
            String[] phrases = new String[3];//this is the same as {null, null,null}
            phrases[1] = "somestring";

            System.out.println(stringArray[0]);
            System.out.println(intArray[3]);
            System.out.println(sizes[2]);
            if (phrases[1] !=null)
                System.out.println(phrases[1]);

            for (int i = 0; i < intArray.length; i++) {
                System.out.println(intArray[i]);

            }

            System.out.println(Integer.toBinaryString(156));

            for (int j = 0; j < stringArray.length; j++) {
                System.out.println(stringArray[j]);

            }
        /*
		 * Primitive and ArrayLists
		 * we cannot use primitives with ArrayLists
		 * so we have to use their classes instead
		 * -List<Double> temps = new ArrayList<Double>();
		 * -List<Boolean> on_Off = new ArrayList<Boolean>();
		 * */
        }


    }


