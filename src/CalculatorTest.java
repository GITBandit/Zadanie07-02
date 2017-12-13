public class CalculatorTest {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(2,4);
        Circle circle1 = new Circle(5);

        System.out.println("Pole powierzchni prostokąta o bokach 2 i 4 wynosi " + ShapeCalculator.rectArea(rectangle1));
        System.out.println("Obwód prostokąta o bokach 2 i 4 wynosi " + ShapeCalculator.rectPerimeter(rectangle1));
        System.out.println("Pole powierzchnikoła o promieniu 5 wynosi " + ShapeCalculator.circArea(circle1));
        System.out.println("Obwód koła o powierzchni 5 wynosi " + ShapeCalculator.circlePerimeter(circle1));

    }

}
