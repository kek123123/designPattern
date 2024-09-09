package main.ex.ex12.after;

public class ModernFactory implements Factory {
    @Override
    public AfterChair createChair() {
        return new AfterModernChair();
    }

    @Override
    public AfterTable createTable() {
        return new AfterModernTable();
    }
}
