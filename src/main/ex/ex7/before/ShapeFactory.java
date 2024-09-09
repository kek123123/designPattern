package main.ex.ex7.before;

public class ShapeFactory {
    public Shape createShape(String shapeType) {
        if (shapeType.equals("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equals("SQUARE")) {
            return new Square();
        } else if (shapeType.equals("RECTANGLE")) {
            return new Rectangle();
        } else {
            throw new IllegalArgumentException("Unknown shape type");
        }
    }
}