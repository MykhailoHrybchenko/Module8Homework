package Module8Homework;

public class Main {

    public static void main(String[] args) {
        ShapePrinter shapePrinter = new ShapePrinter();
        shapePrinter.printName(new Quad());
        shapePrinter.printName(new Hexagon());
        shapePrinter.printName(new Heptagon());
        shapePrinter.printName(new Triangle());
        shapePrinter.printName(new Circle());
    }
}
