package baith5.bai1;

public class NewspaperManagement {
    public void transferEmployeeToNewspaper(Employee employee, Newspaper newspaper) {
        newspaper.addEmployee(employee);
    }

    public void dismissEmployeeFromNewspaper(Employee employee, Newspaper newspaper) {
        newspaper.removeEmployee(employee);
    }

    public void printEmployeesByType(Newspaper newspaper, String type) {
        System.out.println("Danh sách " + type + " tại tòa báo " + newspaper.getName() + ":");
        for (Employee e : newspaper.getEmployees()) {
            if (type.equals("hành chính") && e instanceof AdministrativeStaff) {
                e.printEmployeeCard();
            } else if (type.equals("nhà báo") && e instanceof Journalist) {
                e.printEmployeeCard();
            }
        }
    }
}
