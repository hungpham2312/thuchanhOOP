package baith4;

class Circle extends Shape {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        super("Circle");
        this.center = center;
        this.radius = radius;
    }

    // Copy constructor
    public Circle(Circle other) {
        super(other.name);
        this.center = other.center.clone();
        this.radius = other.radius;
    }

    @Override
    public void Operation() {
        System.out.println(name + " with center at (" + center + ") and radius " + radius);
    }

    @Override
    public Circle clone() {
        return new Circle(this);
    }
}

