package baith1.bai1;

public class TestPoint {
    public static void main(String[] args) {
        // Khởi tạo bằng constructor không tham số
        Point p1 = new Point();
        System.out.print("p1: ");
        p1.display();

        // Khởi tạo bằng constructor có 3 tham số
        Point p2 = new Point(1.5, 2.5, 3.5);
        System.out.print("p2: ");
        p2.display();

        // Khởi tạo bằng constructor sao chép
        Point p3 = new Point(p2);
        System.out.print("p3 (copy of p2): ");
        p3.display();

        // Sử dụng setter để thay đổi giá trị
        p1.setX(4.0);
        p1.setY(5.0);
        p1.setZ(6.0);
        System.out.print("p1 after setting new values: ");
        p1.display();
    }
}
