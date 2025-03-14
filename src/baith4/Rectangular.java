package baith4;

class Rectangular extends Shape {
    private Point topLeft;
    private double width, height;

    public Rectangular(Point topLeft, double width, double height) {
        super("Rectangular");
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
    }

    // Copy constructor
    public Rectangular(Rectangular other) {
        super(other.name);
        this.topLeft = other.topLeft.clone();
        this.width = other.width;
        this.height = other.height;
    }

    @Override
    public void Operation() {
        System.out.println(name + " with top-left at (" + topLeft + "), width " + width + ", height " + height);
    }

    @Override
    public Rectangular clone() {
        return new Rectangular(this);
    }
}

