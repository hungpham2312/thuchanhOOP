package baith1.bai1;

public class Point {
    private double x; // Hoành độ
    private double y; // Tung độ
    private double z; // Cao độ

    // Phương thức khởi tạo không có tham số
    public Point() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    // Phương thức khởi tạo với 3 tham số
    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Phương thức khởi tạo sao chép từ một đối tượng khác
    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
        this.z = other.z;
    }

    // Getter và Setter cho x
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    // Getter và Setter cho y
    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Getter và Setter cho z
    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    // Phương thức hiển thị thông tin điểm
    public void display() {
        System.out.println("Point(" + x + ", " + y + ", " + z + ")");
    }
}
