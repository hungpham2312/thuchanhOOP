package baith3;

import java.util.Date;

public class TestCompany {
    public static void main(String[] args) {
        // Tạo công ty
        Company company = new Company("Tech Corp", new Date());

        // Tạo nhân viên
        Employee emp1 = new Employee("Alice", 1990, Gender.FEMALE, new Date(), "Developer", 2.0);
        Employee emp2 = new Employee("Bob", 1985, Gender.MALE, new Date(), "Manager", 3.5);
        Employee emp3 = new Employee("Charlie", 1995, Gender.MALE, new Date(), "Tester", 1.8);

        // Thêm nhân viên vào công ty
        company.addNewEmployee(emp1);
        company.addNewEmployee(emp2);
        company.addNewEmployee(emp3);

        // Hiển thị danh sách nhân viên
        company.showListEmployees();

        // In ra thông tin chi tiết của một nhân viên
        System.out.println("Employee Detail:");
        emp2.display();
    }
}

