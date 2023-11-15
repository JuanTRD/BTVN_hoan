package BT2;

import BT2.src.Manager;
import BT2.src.Employee;
import BT2.src.Promotable;

public class App {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
    employees[0] = new Manager("01","Hoan",50000000);
    employees[1] = new Manager("02","Hung",15000000);
    employees[2] = new Manager("03","Hoa",12000000);
    for(Employee employee : employees) {
        System.out.println("Bonus:" + employee.calculateBonus());
    }
    Promotable pr = (Manager) employees[0];
    System.out.println("Salary after promote 2000000 is " + ((Manager) employees[0]).promote(2000000));
    System.out.println("Bonus:" + employees[0].calculateBonus());
    
    }
    
    
}
