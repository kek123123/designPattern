package main.structure.decorate.v2;

public class DecorateComponent implements Component {

    Component component;

    public DecorateComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        System.out.println("꾸미기..");
        component.operation();
    }
}
