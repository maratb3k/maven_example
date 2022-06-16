package kz.halykacademy;

@ArithmeticAnnotation(isAreaCorrect = true, getOperationForFigure = Operation.MULTIPLY)
public class Rectangle extends Figure {
    private Double secondDimension;

    public Rectangle(double dimension, double secondDimension) {
        super(dimension);
        this.secondDimension = secondDimension;
    }

    public void setSecondDimension(double secondDimension) {
        this.secondDimension = secondDimension;
    }

    public double getSecondDimension() {
        return this.secondDimension;
    }

    public double calculateArea() {
        return super.getDimension() * secondDimension;
    }

}
