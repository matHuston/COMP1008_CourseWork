import java.util.Scanner;
 
 
/*
    Module 5 Activity: Inheritance with CommissionEmployee
    Build an Employee superclass and extend it with CommissionEmployee
    and BasePlusCommissionEmployee.
*/
 
 
// STEP 1: Define the Employee superclass
public abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
 
 
    // Constructor
    public Employee(String first, String last, String ssn) {
        // TODO: initialize fields
        this.firstName = first;
        this.lastName = last;
        this.socialSecurityNumber = ssn;
    }
 
 
    // Getters
    // TODO: add getFirstName(), getLastName(), getSocialSecurityNumber()
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public String getSocialSecurityNumber() {return socialSecurityNumber;}
 
 
    // earnings method placeholder
    public abstract double earnings();
 
 
    @Override
    public String toString() {
        // TODO: return formatted "first last\nssn: ###"
        //String.format is a convenient way to format strings with placeholders, the %s is for strings and %n is for a new line. So this returns a string that includes the first name, last name, and finally SSN, in the order the strings are listed, with the appropriate formatting.
        return String.format("%s %s%nSocial Security Number: %s", 
            getFirstName(), getLastName(), getSocialSecurityNumber());
    }
}
 
 
// STEP 2: Define CommissionEmployee as a subclass
public class CommissionEmployee extends Employee {
    private double grossSales;        // weekly sales
    private double commissionRate;    // percentage
 
 
    public CommissionEmployee(String first, String last, String ssn,
                              double sales, double rate) {
        super(first, last, ssn);
        // TODO: set grossSales and commissionRate with validation
    }
 
 
    // TODO: getters and setters for grossSales and commissionRate
 
 
    @Override
    public double earnings() {
        // TODO: return grossSales * commissionRate
        return 0.0;
    }
 
 
    @Override
    public String toString() {
        // TODO: include the super.toString() plus grossSales and commissionRate
        return "";
    }
}
 
 
// STEP 3: Define BasePlusCommissionEmployee subclass
public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;  // additional weekly salary
 
 
    public BasePlusCommissionEmployee(String first, String last, String ssn,
                                      double sales, double rate, double salary) {
        super(first, last, ssn, sales, rate);
        // TODO: validate and set baseSalary
    }
 
 
    // TODO: getter and setter for baseSalary
 
 
    @Override
    public double earnings() {
        // TODO: return baseSalary + super.earnings()
        return 0.0;
    }
 
 
    @Override
    public String toString() {
        // TODO: include "Base salary" and call super.toString()
        return "";
    }
}
 
 
// STEP 4: Main driver class
public class InheritanceDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
 
        // TODO: Create objects of CommissionEmployee and BasePlusCommissionEmployee
 
 
        // TODO: Print their earnings individually
    }
}