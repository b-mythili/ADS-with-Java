import java.util.ArrayList;
public class Arraylistex {
public static void main(String[] args) {
        // Creating an ArrayList with generics
        ArrayList<String> list = new ArrayList<>();

        // Adding elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
System.out.println(list);
        // Accessing elements by index
        String fruit = list.get(0); // Retrieves the element at index 0 (the first element)
        System.out.println("First pos fruit: " + fruit);

        // Removing elements from the ArrayList
        list.remove("Banana"); // Removes the first occurrence of "Banana"
        System.out.println("After removing Banana: " + list);

        

        // Checking if ArrayList contains an element
        if (list.contains("Apple")) {
            System.out.println("List contains Apple");
        }

        // Getting the size of the ArrayList
        int size = list.size();
        System.out.println("Size of the ArrayList: " + size);

        // Clearing the ArrayList
        list.clear(); // Removes all elements from the list
        System.out.println("After clearing the ArrayList: " + list);

        // Checking if ArrayList is empty
        boolean isEmpty = list.isEmpty();
        System.out.println("Is ArrayList empty? " + isEmpty);
    }
}

