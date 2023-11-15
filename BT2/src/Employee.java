package BT2.src;

public abstract class  Employee {
    protected String id;
    protected String name;
    protected int salary;
    public abstract double calculateBonus();
    public Employee(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
