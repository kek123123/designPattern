package main.behavior.strategy;

public class Client {

    public static void main(String[] args) {

        Warrior warrior = new Warrior(new Ax());
        warrior.attack();

        warrior.setWeapon(new Knife());
        warrior.attack();
    }
}
