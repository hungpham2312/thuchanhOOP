package baith4;

public class TestPrototype {
    public static void main(String[] args) {
        // Tạo đối tượng gốc
        Point p1 = new Point(1, 1);
        Line line = new Line(new Point(2, 2), new Point(5, 5));
        Circle circle = new Circle(new Point(3, 3), 2.5);
        Rectangular rect = new Rectangular(new Point(2, 2), 4, 6);

        // Tạo Graphic (Composite)
        Graphic graphic1 = new Graphic("Group 1");
        graphic1.Add(p1);
        graphic1.Add(line);

        Graphic graphic2 = new Graphic("Group 2");
        graphic2.Add(circle);
        graphic2.Add(rect);

        // Tạo Graphic tổng hợp
        Graphic mainGraphic = new Graphic("Main Graphic");
        mainGraphic.Add(graphic1);
        mainGraphic.Add(graphic2);

        // Hiển thị Graphic gốc
        System.out.println("Original Graphic:");
        mainGraphic.Operation();

        // Sao chép đối tượng bằng Prototype
        Graphic clonedGraphic = mainGraphic.clone();

        // Hiển thị Graphic đã sao chép
        System.out.println("\nCloned Graphic:");
        clonedGraphic.Operation();
    }
}

