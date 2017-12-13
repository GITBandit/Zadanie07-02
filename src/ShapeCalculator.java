public class ShapeCalculator {

    static double calculatePerimeter (Rectangle rect){
        return (rect.getSideA()*2)+(rect.getSideB()*2);
    }

    static double calculateArea(Rectangle rect){
        return rect.getSideA()*rect.getSideB();
    }

    static double calculatePerimeter (Circle circ){
        return 2*Math.PI*circ.getRadius();
    }

    static double calculateArea (Circle circ){
        return Math.PI*(Math.pow(circ.getRadius(),2));
    }
}
