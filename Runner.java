import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list
        scottishIslands.add("Coll");
        System.out.println(scottishIslands);

//        2. Add "Tiree" to the start of the list
        scottishIslands.add("Tiree");
        String tiree = "Tiree";
        int tireePos = scottishIslands.indexOf(tiree);
        scottishIslands.remove(tireePos);
        scottishIslands.add(0,tiree);
        System.out.println(scottishIslands);

//        3. Add "Islay" after "Jura" and before "Mull"
        scottishIslands.add("Islay");
        String islay = "Islay";
        int islayPos = scottishIslands.indexOf(islay);
        scottishIslands.remove(islayPos);
        scottishIslands.add(2, islay);
        System.out.println(scottishIslands);

//        4. Print out the index position of "Skye"
        int pos=scottishIslands.indexOf("Skye");
        System.out.println("The index position of Skye is " + pos);

//        5. Remove "Tresco" from the list by name
        scottishIslands.remove("Tresco");
        System.out.println(scottishIslands);

//        6. Remove "Arran" from the list by index
        scottishIslands.remove(5);
        System.out.println(scottishIslands);

//        7. Print the number of islands in your arraylist
        System.out.println("There are " + scottishIslands.size() + " islands in the arraylist.");

//        8. Sort the list alphabetically
        Collections.sort(scottishIslands);
        System.out.println("Alphabetically sorted " + scottishIslands);

//        9. Print out all the islands using a for loop
        System.out.println("Using enhanced for loop...");
        for (String island : scottishIslands){
            System.out.println(island);
        }

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers
//        ArrayList<Integer> even = new ArrayList<Integer>();
//        for (int i = 0; i < numbers.size(); i++){
//            if(i % 2 == 0){
//                even.add(i);
//                System.out.println(even);
//            }
//        } // THIS IS INCORRECT BUT I'M STUCK, HAVE BEEN GOOGLING FOR AN HOUR AND MOVING ON

//        2. Print the difference between the largest and smallest value


//        3. Print True if the list contains a 1 next to a 1 somewhere.
//        4. Print the sum of the numbers,
//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [7, 13, 2] would have sum of 9.

    }

}
