import java.util.Scanner;

/*
    Week 1 Comprehensive Program: Account Class
    Covers: Classes, Objects, Instance Variables, Constructors,
    Set/Get Methods, Reference Types, Constants, Methods,
    Abstract Class, Interface
*/ 
 
// ACCOUNT CLASS
class Account {
    // Instance variables (private for encapsulation)
    private String name;      // Account holder's name
    private double balance;   // Account balance

    // Constant: minimum balance. Constant values are typically static final in Java
    private static final double minBalance = 0.0;
     
    /** CONSTRUCTOR-----------------------------------------------------------------
     * initializes an object, setting initial values for instance variables
     * in this example, it sets the account holder's name and initial balance;
     * @param name Account holder's name
     * @param balance Initial balance (must be >= 0)
     */
    Account(String name, double balance){
        this.name = name;
        if(balance >= minBalance){
            this.balance = balance;
        }
        else{
            this.balance = minBalance;
        }
    }// end of account constructor
}// end of Account class

//SETTERS AND GETTERS---------------------------------------------------------------
//what is the point of getters and setters if values are already initialized in the constructor? 
    //when using constructors, you can only set values when the object is first created. with setters, you can change values later on. with getters, you can access private variables outside the class

    // Set Methods (Mutators) - sets the value of instance variables
    void setName(String name){
        this.name = name;
    }
    void setBalance(double balance){
        if(balance >= minBalance){
            this.balance = balance;
        }
    }
    // Get Methods (Accessors) - retrieves the value of instance variables
    String getName(){
        return name;
    }
    double getBalance(){
        return balance;
    }
    
    // Display Info Method - prints account information
    void displayInfo(){
        System.out.println("Account Holder: " + name);
        System.out.println("Account Balance: $" + balance);
    }
    
    // Method with parameter that returns value - deposits amount into account
    double deposit(double amount){
        if(amount > 0){
            balance += amount; // Increase balance by amount
        }
        return balance;
    }
    
// ABSTRACT CLASS--------------------------------------------------------------
    // abstract classes cannot be instantiated directly; they are meant to be subclassed
    // they can contain abstract methods (without implementation) and normal methods (with implementation)

abstract class AccountBase {
    // abstract method
    abstract double calculateInterest();
    // normal method
    void displayType(){
        System.out.println(x: "This is a base account type."); //soft adds this String under var x
    }
}// end of abstract class
 
// Subclass of AccountBase for Savings Account
    // SavingsAccount is a child class of the AccountBase parent class
    // SavingsAccount inherits from AccountBase and implements the abstract method
class SavingsAccount extends AccountBase {
    private double balance;
    private double rate; // interest rate as a decimal (e.g., 0.05 for 5%)
    SavingsAccount(double balance, double rate){ //constructor from parent
        this.balance = balance;
        this.rate = rate;
    }
    //use own calculateInterest method from abstract class
    @Override 
    double calculateInterest(){
        return balance * rate;
    }   
}// end of SavingsAccount subclass
 
// INTERFACE------------------------------------------------------------------
    // interfaces define methods that implementing classes must provide
    // they are used to achieve abstraction and multiple inheritance in Java
 
interface Printable {
    void print();
}

// Class that implements Printable interface
class AccountReport implements Printable {
    private Account account;
    // Constructor
    AccountReport(Account account) {
        this.account = account;
    }
    // use own print method from interface
    @Override
    public void print() {
        System.out.println("\n--- Account Report ---");
        account.displayInfo();
    }
}// end of interface implementation
 
// -------------------------
// MAIN CLASS
// -------------------------
public class Main {
    public static void main(String[] args) {
 
 
        System.out.println("==== Week 1: Account Class Demo ====");
 
 
       
        // 1. Creating Account Objects
               
        // 2. Using Set/Get Methods
      
        // 3. Primitive vs Reference Types
        
        // 4. Constants
      
        // 5. Methods with Parameters & Return Values
        
        // 6. Abstract Class
       
        // 7. Interface
        
        // 8. Scanner Example (Optional User Input)
       
    }
}