 // LESSON 4 - PART 2
import java.util.ArrayList;
 
public class ArrayListDemo {
    public static void main(String[] args) {
 
        // STEP 1: Create an ArrayList of Strings
            // <> - type safety
            // dynamic list - can grow, can shrink, add and remove items from array and thus from memory
            System.out.println("\n");
            ArrayList<String> fruits = new ArrayList<>();
 
        // STEP 2: Add elements to the ArrayList
            fruits.add("Strawberry");
            fruits.add("Watermelon");
            fruits.add("Green Apple");
            fruits.add("Orange");
 
        // STEP 3: Print all elements
            for(String fruit : fruits){
                System.out.println(fruit);
            }
 
        // STEP 4: Remove an element
            //fruits.remove("Orange");
            //fruits.remove(3);
            //System.out.println(fruits);
        // STEP 5: Access element by index
            System.out.println("\nFirst fruit: " + fruits.get(0));
 
        // STEP 6: Check if a fruit exists
            if(fruits.contains("Watermelon")){
                System.out.println("\nWatermelon is in the list");
            }
    }
}