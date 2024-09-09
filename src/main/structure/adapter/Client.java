package main.structure.adapter;

public class Client {

    public static void main(String[] args) {
        Adapter adapter = new AdapterImpl();

        Float halfNum = adapter.halfOf(2f);
        System.out.println("halfNum = " + halfNum);

        Float twiceNum = adapter.twiceOf(4f);
        System.out.println("twiceNum = " + twiceNum);
    }
}
