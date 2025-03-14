package baith5.bai1;

import java.util.ArrayList;
import java.util.List;

public class Newspaper {
    private String name;
    private List<Employee> employees;

    public Newspaper(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println(employee.getName() + " đã được thêm vào tòa báo " + name);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
        System.out.println(employee.getName() + " đã bị sa thải khỏi tòa báo " + name);
    }

    public void printEmployeeList() {
        System.out.println("Danh sách nhân viên của tòa báo " + name + ":");
        for (Employee e : employees) {
            e.printEmployeeCard();
        }
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
