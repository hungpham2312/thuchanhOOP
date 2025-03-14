package baith5.bai2;

import java.util.Iterator;

// Class FileSystemBrowser - Duyệt qua toàn bộ cây thư mục
class FileSystemBrowser {
    public static void traverse(FileSystemComponent root) {
        if (root instanceof File) {
            root.open();
        } else if (root instanceof Directory) {
            System.out.println("Browsing directory: " + root.name);
            for (Iterator<FileSystemComponent> it = root.iterator(); it.hasNext(); ) {
                FileSystemComponent component = it.next();
                traverse(component);
            }
        }
    }
}
