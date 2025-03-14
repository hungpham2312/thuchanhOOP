package baith5.bai1;

public abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract void printEmployeeCard();

    public String getName() {
        return name;
    }
}

