package main.ex.test;

public enum Type {
    ONE("1"),
    TWO("2"),
    THREE("3");

    private String desc;

    Type(String desc) {
        this.desc = desc;
    }
}
