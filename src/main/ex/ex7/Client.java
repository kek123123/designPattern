package main.ex.ex7;

import main.ex.ex7.after.AfterShape;
import main.ex.ex7.after.CircleFactory;
import main.ex.ex7.after.Factory;
import main.ex.ex7.before.Shape;
import main.ex.ex7.before.ShapeFactory;

public class Client {

    public static void main(String[] args) {
        //befroe
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.createShape("CIRCLE");
        circle.draw();
        //다른 모양의 도형을 만드려면 팩토리클래스를 수정해야한다.


        Factory circleFactory = new CircleFactory();
        AfterShape afterCircle = circleFactory.create();
        afterCircle.draw();
    }
}
