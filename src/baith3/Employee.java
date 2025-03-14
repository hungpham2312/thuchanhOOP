package baith3;

import java.util.Date;

public class Employee extends Person {
    private Date dateJoin;
    private String position;
    private double salaryLevel;
    private static double basicSalary = 5000; // Lương cơ bản chung cho mọi nhân viên

    // Constructor
    public Employee(String name, int yearOfBirth, Gender gender, Date dateJoin, String position, double salaryLevel) {
        super(name, yearOfBirth, gender);
        this.dateJoin = dateJoin;
        this.position = position;
        this.salaryLevel = salaryLevel;
    }

    // Getter và Setter cho DateJoin
    public Date getDateJoin() {
        return dateJoin;
    }

    public void setDateJoin(Date dateJoin) {
        this.dateJoin = dateJoin;
    }

    // Getter và Setter cho Position
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    // Getter và Setter cho SalaryLevel
    public double getSalaryLevel() {
        return salaryLevel;
    }

    public void setSalaryLevel(double salaryLevel) {
        this.salaryLevel = salaryLevel;
    }

    // Getter và Setter cho BasicSalary (static)
    public static double getBasicSalary() {
        return basicSalary;
    }

    public static void setBasicSalary(double basicSalary) {
        Employee.basicSalary = basicSalary;
    }

    // Phương thức tính thu nhập
    public double getIncome() {
        return salaryLevel * basicSalary;
    }

    // Phương thức hiển thị thông tin nhân viên
    @Override
    public void display() {
        super.display();
        System.out.println("Date Joined: " + dateJoin + ", Position: " + position +
                ", Salary Level: " + salaryLevel + ", Income: " + getIncome());
    }
}
