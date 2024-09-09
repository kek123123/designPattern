package main.ex.ex12;

import main.ex.ex12.after.*;
import main.ex.ex12.before.FurnitureFactory;

public class Client {

    public static void main(String[] args) {
        FurnitureFactory factory = new FurnitureFactory();
        factory.createChair("modern");
        factory.createTable("modern");

        //브랜드가 추가되면?

        //after
        Factory mordenFactory = new ModernFactory();
        AfterChair chair = mordenFactory.createChair();
        AfterTable table = mordenFactory.createTable();
        chair.sitOn();
        table.eatOn();

        Factory victorianFactory = new VictorianFactory();
        AfterChair chair2 = victorianFactory.createChair();
        AfterTable table2 = victorianFactory.createTable();
        chair2.sitOn();
        table2.eatOn();
    }
}
