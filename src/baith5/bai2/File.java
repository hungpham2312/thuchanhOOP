package baith5.bai2;

import java.util.ArrayList;
import java.util.Iterator;

// Lớp File - Đại diện cho tập tin
class File extends FileSystemComponent {
    public File(String name) {
        super(name);
    }

    @Override
    public void open() {
        System.out.println("Opening file: " + name);
    }

    @Override
    public Iterator<FileSystemComponent> iterator() {
        return new ArrayList<FileSystemComponent>().iterator(); // Không có gì để duyệt
    }
}
