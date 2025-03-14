package baith2.bai2;

public class TestShape {
    public static void main(String[] args) {
        ShapeManager manager = new ShapeManager();

        // Thêm các đối tượng hình học vào danh sách
        manager.addShape(new Circle(5));
        manager.addShape(new Rectangle(4, 6));
        manager.addShape(new Square(4));
        manager.addShape(new Ellipse(3, 2));

        // Hiển thị thông tin
        System.out.println("Shapes in the list:");
        manager.displayShapes();

        // Tính tổng diện tích
        System.out.println("Total area: " + manager.totalArea());

        // Thống kê số lượng hình
        System.out.println("Shape statistics:");
        manager.countShapes();
    }
}

