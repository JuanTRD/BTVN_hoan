package BT2.src;

public class Manager extends Employee implements Promotable {
    
    public Manager(String id, String name, int salary){
        super(id, name, salary);
    }
    @Override
    public int promote(int salaryIncrease) {
        return salaryIncrease+this.salary;
        
    }

    @Override
    public double calculateBonus() {
        
        return this.salary*0.1;
        
    }
    
}
