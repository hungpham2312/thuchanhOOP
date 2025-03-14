package baith2.bai2;

class Ellipse extends Shape {
    private double semiMajorAxis, semiMinorAxis;

    public Ellipse(double semiMajorAxis, double semiMinorAxis) {
        super("Ellipse");
        this.semiMajorAxis = semiMajorAxis;
        this.semiMinorAxis = semiMinorAxis;
    }

    @Override
    public double getArea() {
        return Math.PI * semiMajorAxis * semiMinorAxis;
    }
}

