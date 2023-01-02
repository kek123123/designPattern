package main.behavior.strategy;

public class Client {

    public static void main(String[] args) {

        Weapon ax = new Ax();

        Character warrior = new Warrior(ax);

        warrior.attack();

    }
}
