package week2;
import java.util.Scanner;
 
/*
    Week 2: Module 2 Learning Activity - Practice Shell
    Concepts to Practice:
    - Variables & Constants
    - if / if…else / nested if
    - switch statements
    - while and for loops
    - Increment (++) / Decrement (--) / Compound Assignment (+=, -=)
    - Typecasting
*/
 
class Student {
    // STEP 1: Declare instance variables
    String name;
    int id;
    String program;
    int gradeLevel;
    double gpa;
 
    // STEP 2: Declare a constant (final)
    final double MIN_GPA = 0.0;
 
    // STEP 3: Method to display student info
    void displayInfo() {
        // TODO: Print all fields
        System.out.println("\n-- Student Information --");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Program: " + program);
        System.out.println("Grade Level: " + gradeLevel);
        System.out.println("GPA: " + gpa);
    }
 
    // STEP 4: Conditional statements (if…else)
    void checkGPA() {
        // TODO: Use if…else to check GPA ranges
        System.out.println("\n-- GPA Status --");
        if (gpa>=3.5) {
            System.out.println(name + " is an honor student.");
        } else if (gpa>=2.0) {
            System.out.println(name + " is in good academic standing.");
        } else {
            System.out.println(name + " is on academic probation.");
        }
    }
 
    // STEP 5: Nested if example
    void checkProgram() {
        // TODO: Nested if for program and GPA
        if(program.equalsIgnoreCase("Computer Science")){
            if(gpa >= 3.5){
                System.out.println(name + "is eligible for CS scholarship.");
            }else{
                System.out.println(name + "is not eligible.");
            }
        }
    }
 
    // STEP 6: Switch statement example
    void gradeDescription() {
        System.out.println("\n-- Grade Level Description --");
        // TODO: Use switch to print school type based on gradeLevel
        switch(gradeLevel){
            case 1: case 2: case 3:
            System.out.println(name+ "is in elementary school.");
            break;

            case 4: case 5: case 6:
            System.out.println(name+ "is in middle school.");
            break;

            case 7: case 8: case 9:
            System.out.println(name+ "is in junior high.");
            break;

            case 10: case 11: case 12:
            System.out.println(name+ "is in high school.");
            break;

            default:
            System.out.println("Invalid grade level");
        }
    }
 
    // STEP 7: While loop example
    void printNumbersUpToGPA() {
        // TODO: Use while loop, typecast GPA to int
        int count = 1;
        System.out.println("\n-- Print Numbers Up To GPA --");
        while (count <= (int)gpa) { 
            System.out.print(count+ " ");
            count++;
        }
        System.out.println();
    }

    //7.1 dowhile
    void enterGPAs(){
        Scanner input = new Scanner(System.in);
        double gpaInput;
        System.out.println("\n-- Enter GPAs --");
        do {
            System.out.print("Enter a GPA (-1 to stop): ");
            gpaInput = input.nextDouble();
            if(gpaInput != -1){
                System.out.println("Recorded GPA: " + gpaInput);
            }
        } while (gpaInput != -1);
        System.out.println("GPA entry ended.");
    }
 
 
    // STEP 8: For loop example
    void printMultiplesOfID() {
        // TODO: Use for loop to print multiples of ID
        System.out.println("\n-- Multiples of ID --");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Multiple " + i + ": " + (id * i));
        }
    }

    //8.1
    void printSemesterGPA(){
        double[] semesterGPA = {3.2, 3.5, 3.8, 4.0};
        System.out.println("\n-- Semester GPAs --");
        for (double g : semesterGPA) {
            System.out.println(g + "");
        }
        System.out.println();
    }
 
 
    // STEP 9: Increment / Decrement / Compound assignment example
    void updateGPA() {
        // TODO: Demonstrate ++, --, +=, -= with GPA
        System.out.println("-- Updating GPAs --");
        System.out.println("Original GPA: " + gpa);
        gpa++;
        System.out.println("GPA ++: " + gpa);
        gpa += 0.5;
        System.out.println("GPA +=: " + gpa);
        gpa--;
        System.out.println("GPA --: " + gpa);
        gpa -= 0.2;
        System.out.println("GPA -=: " + gpa);
    }
}
 
// MAIN CLASS -------------------------------------------------------------------
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("==== Week 2: Module 2 Learning Activity ====");
 
 
        // STEP 1: Create a Student object
        // Student s1 = new Student();
        Student s1 = new Student();
 
        // STEP 2: Assign values to fields (or use Scanner input)
        s1.name = "big chungus";
        s1.id = 1337;
        s1.program = "hack the planet";
        s1.gradeLevel = 8;
        s1.gpa = 4.2;
 
        // STEP 3: Call methods to practice all concepts
        s1.displayInfo();
        s1.checkGPA();
        s1.checkProgram();
        s1.gradeDescription();
        s1.printNumbersUpToGPA();
        s1.printMultiplesOfID();
        s1.printSemesterGPA();
        s1.updateGPA();
        s1.enterGPAs();
        
    }
}