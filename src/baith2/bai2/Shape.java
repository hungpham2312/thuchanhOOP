package baith2.bai2;

abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double getArea();

    public void display() {
        System.out.println("Shape: " + name + ", Area: " + getArea());
    }
}

