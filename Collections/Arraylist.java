package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        // dynamic array - flexibility in size
        // ArrayList is a class implementing list interface.
        ArrayList<String> studentsName = new ArrayList<>();
        studentsName.add("Chandrakant");
        for (int i = 0; i < 10; i++) {
            studentsName.add(i, "Chandrakant");
        }
        System.out.println(studentsName);
        // add function adds to the end of the list if no index & add(index,value)
        // addAll(newList) copies entire list to current list.
        ArrayList<String> studentsName2 = new ArrayList<>();
        studentsName2.add("Hello");
        studentsName2.addAll(studentsName);
        System.out.println(studentsName2);

        // get function is used to get an index from a following index
        System.out.println(studentsName.get(0));
        // Removes the element at the specified position in this list. Shifts any
        // subsequent elements to the left (subtracts one from their indices).
        System.out.println(studentsName.remove(0));
        System.out.println(studentsName.set(2, "King"));
        System.out.println(studentsName);
        System.out.println(studentsName.contains("King"));
        System.out.println(studentsName.size());
        studentsName2.clear();
        System.out.println(studentsName2);

        // iterating over the ArrayList
        Iterator<String> it = studentsName.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
