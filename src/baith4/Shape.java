package baith4;

abstract class Shape implements Cloneable{
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    // Thực hiện một số thao tác trên đối tượng
    public abstract void Operation();

    // Các phương thức dùng cho Composite (mặc định không hỗ trợ cho Leaf)
    public void Add(Shape shape) {
        throw new UnsupportedOperationException("Add operation not supported.");
    }

    public void Remove(Shape shape) {
        throw new UnsupportedOperationException("Remove operation not supported.");
    }

    public Shape GetChild(int index) {
        throw new UnsupportedOperationException("GetChild operation not supported.");
    }

    @Override
    public abstract Shape clone();
}

