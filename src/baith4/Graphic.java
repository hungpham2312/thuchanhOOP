package baith4;

import java.util.ArrayList;
import java.util.List;

class Graphic extends Shape {
    private List<Shape> children = new ArrayList<>();

    public Graphic(String name) {
        super(name);
    }

    // Copy constructor
    public Graphic(Graphic other) {
        super(other.name);
        for (Shape child : other.children) {
            this.children.add(child.clone());
        }
    }

    @Override
    public void Operation() {
        System.out.println("Graphic: " + name + " contains:");
        for (Shape shape : children) {
            shape.Operation();
        }
    }

    public void Add(Shape shape) {
        children.add(shape);
    }

    public void Remove(Shape shape) {
        children.remove(shape);
    }

    public Shape GetChild(int index) {
        return children.get(index);
    }

    @Override
    public Graphic clone() {
        return new Graphic(this);
    }
}


