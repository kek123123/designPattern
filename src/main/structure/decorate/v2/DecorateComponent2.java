package main.structure.decorate.v2;

public class DecorateComponent2 implements Component {

    Component component;

    public DecorateComponent2(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        System.out.println("꾸미기..222222");
        component.operation();
    }
}
