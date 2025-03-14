package baith2.bai2;

class Circle extends Ellipse {
    private double radius;

    public Circle(double radius) {
        super(radius, radius);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

