package baith5.bai1;


public class Main {
    public static void main(String[] args) {
        Newspaper newspaper1 = new Newspaper("Toà báo A");
        Newspaper newspaper2 = new Newspaper("Toà báo B");

        AdministrativeStaff admin1 = new AdministrativeStaff("Nguyễn Văn A", "Trưởng phòng hành chính");
        Journalist journalist1 = new Journalist("Trần Thị B", 50);
        Journalist journalist2 = new Journalist("Lê Minh C", 30);

        NewspaperManagement management = new NewspaperManagement();

        management.transferEmployeeToNewspaper(admin1, newspaper1);
        management.transferEmployeeToNewspaper(journalist1, newspaper1);
        management.transferEmployeeToNewspaper(journalist2, newspaper2);

        newspaper1.printEmployeeList();
        newspaper2.printEmployeeList();

        management.printEmployeesByType(newspaper1, "nhà báo");
        management.printEmployeesByType(newspaper1, "hành chính");

        management.dismissEmployeeFromNewspaper(journalist1, newspaper1);
        newspaper1.printEmployeeList();
    }
}

