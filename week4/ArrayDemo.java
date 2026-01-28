// LESSON 4 - PART 1
public class ArrayDemo {
    public static void main(String[] args) {
        // STEP 1: Declare and initialize an integer array
            int[] numbers = {10, 30, 50, 70, 90};
        // STEP 2: Access and print each element
            System.out.println("Accessing array elements: ");
            for(int i=0; i<numbers.length;i++){
                System.out.println("Index: " + i + ":" + numbers[i]);
            }
        // STEP 3: Modify an element
            numbers[1] = 35;
            //Enhanced for loop - aka for each loop
                /*
                    for(type variable : array/collection){
                        insert code here
                    }
                */
               for(int num : numbers){
                System.out.println(num);
               }
    
        // STEP 4: Find the sum of all elements
            int total = 0;
            for(int num : numbers){
                total += num;
            }
            System.out.println(total);
    }
}
 