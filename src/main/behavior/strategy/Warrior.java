package main.behavior.strategy;

public class Warrior implements Character {

    private final Weapon weapon;

    public Warrior(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void attack() {
        weapon.attack();
    }
}
