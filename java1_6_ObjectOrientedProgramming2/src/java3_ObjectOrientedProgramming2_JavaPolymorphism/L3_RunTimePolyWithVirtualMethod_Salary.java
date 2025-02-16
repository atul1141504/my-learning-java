package java3_ObjectOrientedProgramming2_JavaPolymorphism;

/* File name : Salary.java */
public class L3_RunTimePolyWithVirtualMethod_Salary extends L3_RunTimePolyWithVirtualMethod_Employee {
   private double salary; // Annual salary
   
   public L3_RunTimePolyWithVirtualMethod_Salary(String name, String address, int number, double salary) {
      super(name, address, number);
      setSalary(salary);
   }
   
   public void mailCheck() {
      System.out.println("Within mailCheck of Salary class ");
      System.out.println("Mailing check to " + getName()
      + " with salary " + salary);
   }
   
   public double getSalary() {
      return salary;
   }
   
   public void setSalary(double newSalary) {
      if(newSalary >= 0.0) {
         salary = newSalary;
      }
   }
   
   public double computePay() {
      System.out.println("Computing salary pay for " + getName());
      return salary/52;
   }
}