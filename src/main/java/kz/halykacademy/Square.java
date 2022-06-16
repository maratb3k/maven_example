package kz.halykacademy;

@ArithmeticAnnotation(isAreaCorrect = false, getOperationForFigure = Operation.MULTIPLY)
public class Square extends Figure {

    public Square(double dimension) {
        super(dimension);
    }

    public double getDimension() {
        return super.getDimension();
    }


    public double calculateArea() {
        return super.getDimension() * 4;
    }
}
