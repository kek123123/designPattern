package main.behavior.strategy;

public class Knife implements Weapon {

    @Override
    public void attack() {
        System.out.println("나이프 공격");
    }

    @Override
    public void swap() {
        System.out.println("나이프 무기 교체");
    }
}
