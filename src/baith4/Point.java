package baith4;

class Point extends Shape {
    private int x, y;

    public Point(int x, int y) {
        super("Point");
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    public Point(Point other) {
        super(other.name);
        this.x = other.x;
        this.y = other.y;
    }

    @Override
    public void Operation() {
        System.out.println(name + " at (" + x + ", " + y + ")");
    }

    @Override
    public Point clone() {
        return new Point(this);
    }
}

