public class CalculatorTest {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(2,4);
        shapes[1] = new Circle(5);

        System.out.println("Pole powierzchni prostokąta o bokach 2 i 4 wynosi " + ShapeCalculator.calculateArea((Rectangle) shapes[0]));
        System.out.println("Obwód prostokąta o bokach 2 i 4 wynosi " + ShapeCalculator.calculatePerimeter((Rectangle) shapes[0]));
        System.out.println("Pole powierzchni koła o promieniu 5 wynosi " + ShapeCalculator.calculateArea((Circle) shapes[1]));
        System.out.println("Obwód koła o powierzchni 5 wynosi " + ShapeCalculator.calculatePerimeter((Circle) shapes[1]));

    }

}
