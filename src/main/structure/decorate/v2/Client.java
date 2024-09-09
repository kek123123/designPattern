package main.structure.decorate.v2;

public class Client {

    public static void main(String[] args) {
        Component realComponent = new RealComponent();
        Component deco1 = new DecorateComponent(realComponent);
        Component deco2 = new DecorateComponent2(deco1);

        deco2.operation();
    }
}
