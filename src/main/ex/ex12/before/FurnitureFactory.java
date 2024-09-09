package main.ex.ex12.before;

public class FurnitureFactory {
    public Chair createChair(String style) {
        if (style.equalsIgnoreCase("modern")) {
            return new ModernChair();
        } else if (style.equalsIgnoreCase("victorian")) {
            return new VictorianChair();
        } else {
            throw new IllegalArgumentException("Unknown chair style: " + style);
        }
    }

    public Table createTable(String style) {
        if (style.equalsIgnoreCase("modern")) {
            return new ModernTable();
        } else if (style.equalsIgnoreCase("victorian")) {
            return new VictorianTable();
        } else {
            throw new IllegalArgumentException("Unknown table style: " + style);
        }
    }

}
