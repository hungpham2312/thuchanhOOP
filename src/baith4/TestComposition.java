package baith4;

public class TestComposition {
    public static void main(String[] args) {
        // Tạo các hình cơ bản (Leaf)
        Point p1 = new Point(1, 1);
        Point p2 = new Point(5, 5);
        Line line = new Line(p1, p2);
        Circle circle = new Circle(new Point(3, 3), 2.5);
        Rectangular rect = new Rectangular(new Point(2, 2), 4, 6);

        // Tạo Graphic (Composite)
        Graphic graphic1 = new Graphic("Group 1");
        graphic1.Add(p1);
        graphic1.Add(line);

        System.out.println("Get child 1:" + graphic1.GetChild(0).toString());

        Graphic graphic2 = new Graphic("Group 2");
        graphic2.Add(circle);
        graphic2.Add(rect);

        // Tạo Graphic tổng hợp
        Graphic mainGraphic = new Graphic("Main Graphic");
        mainGraphic.Add(graphic1);
        mainGraphic.Add(graphic2);

        // Hiển thị cấu trúc
        System.out.println("Displaying main graphic:");
        mainGraphic.Operation();
    }
}

