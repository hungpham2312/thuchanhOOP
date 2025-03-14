package baith5.bai1;

public class AdministrativeStaff extends Employee {
    private String position;

    public AdministrativeStaff(String name, String position) {
        super(name);
        this.position = position;
    }

    @Override
    public void printEmployeeCard() {
        System.out.println("Nhân viên hành chính: " + name + ", Chức vụ: " + position);
    }
}

