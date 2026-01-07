import java.util.Scanner;

/*
    Week 1 Comprehensive Program: Account Class
    Covers: Classes, Objects, Instance Variables, Constructors,
    Set/Get Methods, Reference Types, Constants, Methods,
    Abstract Class, Interface
*/ 
 
//ACCOUNT CLASS---------------------------------------------------------------------
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
    
//ABSTRACT CLASS---------------------------------------------------------------
    // abstract classes cannot be instantiated directly; they are meant to be subclassed
    // they can contain abstract methods (without implementation) and normal methods (with implementation)

abstract class AccountBase {
    // abstract method
    abstract double calculateInterest();
    // normal method
    void displayType(){
        System.out.println("This is a base account type.");
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
 
//INTERFACE--------------------------------------------------------------------
    // interfaces define methods that implementing classes must provide
    // they are used to achieve abstraction and multiple inheritance in Java
interface Printable {
    void print();
}

// Class that implements Printable interface
class AccountReport implements Printable {
    private final Account account;
    // Constructor
    AccountReport(Account account){
        this.account = account;
    }
    // use own print method from interface
    @Override
    public void print() {
        System.out.println("\n--- Account Report ---");
        account.displayInfo();
    }
}// end of interface implementation
 
//MAIN CLASS-------------------------------------------------------------------
public class Main {
    public static void main(String[] args) {
        System.out.println("==== Week 1: Account Class Demo ====");
        //scanner object for user input
        Scanner input = new Scanner(System.in);
       
        // 1. Creating Account Objects
        Account acc1 = new Account("Moreberry", 420.0);
        Account acc2 = new Account("Jabae Newvelle", 1337.0);

        // 2. Using Set/Get Methods
        acc1.setName("Moreberry!");
        System.out.println(acc1.getName());
      
        // 3. Primitive vs Reference Types
            //example
            int a = 10; // primitive type
            int b = a; // reference type
            b = 20; // changing reference b does not affect primitive a
            //end of example
        Account acc3 = acc1; // reference type
        acc3.setBalance(117.0);

        // 4. Constants
        System.out.println("\nMinimum Balance Constant: $" + 0.0);
      
        // 5. Methods with Parameters & Return Values
        double newBalance = acc2.deposit(69.67);
        System.out.println("\nNew Balance after Deposit: $" + newBalance);
        // 6. Abstract Class
        SavingsAccount savingsAcc = new SavingsAccount(1000.0, 0.05);
        savingsAcc.displayType();
        System.err.println("Interest Earned: $" + savingsAcc.calculateInterest());

        // 7. Interface
        AccountReport report = new AccountReport(acc1);
        report.print();
        
        // 8. Scanner Example (Optional User Input)
        System.err.println("\nEnter new name for Account 2:");
        String newName = input.nextLine();
        acc2.setName(newName);
        acc2.displayInfo();
        //scanner input must be closed with the following line;
        input.close();
    }
}