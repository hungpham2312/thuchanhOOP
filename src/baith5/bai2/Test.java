package baith5.bai2;

// Test class
public class Test {
    public static void main(String[] args) {
        Directory root = new Directory("Root");
        Directory docs = new Directory("Documents");
        Directory programs = new Directory("Programs");

        TextFile text1 = new TextFile("notes.txt", "Hello World!");
        TextFile text2 = new TextFile("report.txt", "Project report...");
        ExecutableFile exe1 = new ExecutableFile("setup.exe");
        ExecutableFile exe2 = new ExecutableFile("game.exe");

        docs.add(text1);
        docs.add(text2);
        programs.add(exe1);
        programs.add(exe2);
        root.add(docs);
        root.add(programs);

        // Mở các thư mục và tập tin
        root.open();
        System.out.println();
        FileSystemBrowser.traverse(root);
    }
}

