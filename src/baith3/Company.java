package baith3;

import java.util.Date;

public class Company {
    private String name;
    private Date dateCreate;
    private Employee[] employees;
    private int employeeCount; // Số lượng nhân viên hiện tại

    // Constructor
    public Company(String name, Date dateCreate) {
        this.name = name;
        this.dateCreate = dateCreate;
        this.employees = new Employee[10]; // Tối đa 10 nhân viên
        this.employeeCount = 0;
    }

    // Getter cho Name
    public String getName() {
        return name;
    }

    // Thêm một nhân viên mới
    public void addNewEmployee(Employee e) {
        if (employeeCount < 10) {
            employees[employeeCount++] = e;
            System.out.println("Employee added: " + e.getName());
        } else {
            info();
        }
    }

    // Hiển thị danh sách nhân viên
    public void showListEmployees() {
        System.out.println("Company: " + name + " | Established: " + dateCreate);
        System.out.println("Employee List:");
        for (int i = 0; i < employeeCount; i++) {
            employees[i].display();
            System.out.println("--------------------------------");
        }
    }

    // Thông báo công ty đã đủ nhân viên
    public void info() {
        System.out.println("The company has reached the maximum number of employees.");
    }
}

