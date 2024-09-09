package main.structure.decorate.v2;

public class RealComponent implements Component {

    @Override
    public void operation() {
        System.out.println("real component");
    }
}
