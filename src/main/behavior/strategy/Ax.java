package main.behavior.strategy;

public class Ax implements Weapon {

    @Override
    public void attack() {
        System.out.println("도끼로 공격");
    }

    @Override
    public void swap() {
        System.out.println("도끼 무기 교체");
    }
}
