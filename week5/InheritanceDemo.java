import java.lang.classfile.Superclass;
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
 
 
// STEP 2: Define CommissionEmployee as a subclass with extends keyword
public class CommissionEmployee extends Employee {
    private double grossSales;        // weekly sales
    private double commissionRate;    // percentage
 
 
    public CommissionEmployee(String first, String last, String ssn,
                              double sales, double rate) {
        super(first, last, ssn); // this calls the superclass constructor from Employee
        // TODO: set grossSales and commissionRate with validation
        setGrossSales(sales);
        setCommissionRate(rate);
    }
 
 
    // TODO: getters and setters for grossSales and commissionRate - getters assign the value of the private variable to a public variable, and setters assign the value of the public variable to the private variable. The setter also includes validation to ensure that the values are within acceptable ranges.

    //setters
    public void setGrossSales(double sales) {
        if(sales < 0.0) throw new IllegalArgumentException(
            "Gross sales must be >= 0.0");
        grossSales = sales;
    }
    public void setComissionRate(double rate) {
        if (rate <= 0.0 || rate >=1.0) throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");
        commissionRate = rate;
    }

    // getters
    public double getGrossSales() {return grossSales;}
    public double getCommissionRate() {return commissionRate;}
 
    @Override
    public double earnings() {
        // TODO: return grossSales * commissionRate
        return getCommissionRate() * getGrossSales();
    }
 
 
    @Override
    public String toString() {
        // TODO: include the super.toString() plus grossSales and commissionRate
        return String.format("%s%n%s: $%, .2f; %s: %.2f", 
        // this format includes the string from the superclass toString() method, then adds the gross sales and commission rate with appropriate labels and formatting. The %n is for a new line, $%, .2f formats the gross sales as currency with two decimal places, and %.2f formats the commission rate as a decimal with two decimal places.
            "commision employee: " + super.toString(), 
            "gross sales", getGrossSales(), 
            "commission rate", getCommissionRate());
    }
}
 
 
// STEP 3: Define BasePlusCommissionEmployee subclass, this is multilevel inheritance since it extends CommissionEmployee which extends Employee
public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;  // additional weekly salary
 
 
    public BasePlusCommissionEmployee(String first, String last, String ssn,
                                      double sales, double rate, double salary) {
        super(first, last, ssn, sales, rate);
        // TODO: validate and set baseSalary
        setBaseSalary(salary);
    }
 
    public void setBaseSalary(double salary) {
        if (salary < 0.0) throw new IllegalArgumentException(
            "Base salary must be >= 0.0");
        baseSalary = salary;
    }
 
    // TODO: getter and setter for baseSalary
    public double getBaseSalary() {return baseSalary;}
 
 
    @Override
    public double earnings() {
        // TODO: return baseSalary + super.earnings()
        return getBaseSalary() + super.earnings();
    }
 
 
    @Override
    public String toString() {
        // TODO: include "Base salary" and call super.toString() - this super.toString() will call the toString() method from CommissionEmployee, which in turn calls the toString() method from Employee, so the final output will include information from all three classes in the inheritance hierarchy.
        return String.format("base-salaried %s%n%s: $%,.2f", 
            super.toString(), "base salary", getBaseSalary());
    }
}
 
 
// STEP 4: Main driver class
public class InheritanceDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
 
        // TODO: Create objects of CommissionEmployee and BasePlusCommissionEmployee
        CommissionEmployee cEmployee = new CommissionEmployee(
            "Sue", "Jones", "222-22-2222", 10000.0, 0.06);
        BasePlusCommissionEmployee bpEmployee = new BasePlusCommissionEmployee(
            "Bob", "Smith", "333-33-3333", 5000.0, 0.04, 300.0);
 
        // TODO: Print their earnings individually
        System.out.printf("%s%nearned: $%,.2f%n%n", 
            cEmployee.toString(), cEmployee.earnings());
        System.out.printf("%s%nearned: $%,.2f%n%n", 
            bpEmployee.toString(), bpEmployee.earnings());

        input.close();
    }
}