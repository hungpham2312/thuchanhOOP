package baith2.bai2;

import java.util.ArrayList;

public class ShapeManager {
    private ArrayList<Shape> shapes;

    public ShapeManager() {
        shapes = new ArrayList<>();
    }

    // Thêm hình vào danh sách
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    // Hiển thị thông tin các hình
    public void displayShapes() {
        for (Shape shape : shapes) {
            shape.display();
        }
    }

    // Tính tổng diện tích
    public double totalArea() {
        double total = 0;
        for (Shape shape : shapes) {
            total += shape.getArea();
        }
        return total;
    }

    // Đếm số hình theo từng loại
    public void countShapes() {
        int ellipseCount = 0, circleCount = 0, rectangleCount = 0, squareCount = 0;
        for (Shape shape : shapes) {
            if (shape instanceof Square) squareCount++;
            else if (shape instanceof Rectangle) rectangleCount++;
            else if (shape instanceof Circle) circleCount++;
            else if (shape instanceof Ellipse) ellipseCount++;
        }
        System.out.println("Ellipse count: " + ellipseCount);
        System.out.println("Circle count: " + circleCount);
        System.out.println("Rectangle count: " + rectangleCount);
        System.out.println("Square count: " + squareCount);
    }
}

