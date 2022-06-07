package Module8Homework;

public class ShapePrinter {

    public String getShape(Shape shape) {
        return shape.getShapeName();
    }

    public static void main(String[] args) {
        ShapePrinter shapePrinter = new ShapePrinter();
        System.out.println(shapePrinter.getShape(new Circle()));
        System.out.println(shapePrinter.getShape(new Heptagon()));
        System.out.println(shapePrinter.getShape(new Quad()));
        System.out.println(shapePrinter.getShape(new Triangle()));
        System.out.println(shapePrinter.getShape(new Hexagon()));
    }
}
