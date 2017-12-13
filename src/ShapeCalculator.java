public class ShapeCalculator {

    static double rectPerimeter(Rectangle rect){
        return (rect.getSideA()*2)+(rect.getSideB()*2);
    }

    static double rectArea(Rectangle rect){
        return rect.getSideA()*rect.getSideB();
    }

    static double circlePerimeter (Circle circ){
        return 2*Math.PI*circ.getRadius();
    }

    static double circArea (Circle circ){
        return Math.PI*(Math.pow(circ.getRadius(),2));
    }
}
