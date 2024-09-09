package main.ex.ex8.after;

public class Context {

    private File file;

    public Context(File file) {
        this.file = file;
    }

    public void open() {
        file.open();
    }

    public void save() {
        file.save();
    }
}
