package baith4;

class Line extends Shape {
    private Point start, end;

    public Line(Point start, Point end) {
        super("Line");
        this.start = start;
        this.end = end;
    }

    // Copy constructor
    public Line(Line other) {
        super(other.name);
        this.start = other.start.clone();
        this.end = other.end.clone();
    }

    @Override
    public void Operation() {
        System.out.println(name + " from (" + start + ") to (" + end + ")");
    }

    @Override
    public Line clone() {
        return new Line(this);
    }

}

