package baith5.bai2;

// Lớp ExecutableFile - Tập tin chạy được
class ExecutableFile extends File {
    public ExecutableFile(String name) {
        super(name);
    }

    @Override
    public void open() {
        System.out.println("Executing file: " + name);
    }
}

