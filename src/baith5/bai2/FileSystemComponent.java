package baith5.bai2;

import java.util.Iterator;

// Abstract class FileSystemComponent - Đại diện cho cả tập tin và thư mục
abstract class FileSystemComponent {
    protected String name;

    public FileSystemComponent(String name) {
        this.name = name;
    }

    public abstract void open();
    public abstract Iterator<FileSystemComponent> iterator();
}
