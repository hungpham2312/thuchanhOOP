package baith5.bai2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Lớp Directory - Đại diện cho thư mục
class Directory extends FileSystemComponent {
    private List<FileSystemComponent> children = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    public void add(FileSystemComponent component) {
        children.add(component);
    }

    @Override
    public void open() {
        System.out.println("Opening directory: " + name);
        for (FileSystemComponent component : children) {
            System.out.println(" - " + component.name);
        }
    }

    @Override
    public Iterator<FileSystemComponent> iterator() {
        return children.iterator();
    }
}
