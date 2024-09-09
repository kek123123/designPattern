package main.ex.ex12.after;

public class VictorianFactory implements Factory {
    @Override
    public AfterChair createChair() {
        return new AfterVictorianChair();
    }

    @Override
    public AfterTable createTable() {
        return new AfterVictorianTable();
    }
}
