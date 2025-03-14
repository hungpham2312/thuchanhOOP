package baith5.bai1;

public class Journalist extends Employee {
    private int numberOfArticles;

    public Journalist(String name, int numberOfArticles) {
        super(name);
        this.numberOfArticles = numberOfArticles;
    }

    @Override
    public void printEmployeeCard() {
        System.out.println("Nhà báo: " + name + ", Số bài đã đăng: " + numberOfArticles);
    }
}

