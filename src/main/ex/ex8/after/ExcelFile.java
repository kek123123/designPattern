package main.ex.ex8.after;

public class ExcelFile implements File {
    @Override
    public void open() {
        System.out.println("Opening PDF document");
    }

    @Override
    public void save() {
        System.out.println("Saving PDF document");
    }
}
