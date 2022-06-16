package kz.halykacademy;


@ArithmeticAnnotation(isAreaCorrect = true, getOperationForFigure = Operation.ADD)
public class Figure {
    private double dimension;

    public Figure(double dimension) {
        this.dimension = dimension;
    }

    public void setDimension(double dimension) {
        this.dimension = dimension;
    }

    public double getDimension() {
        return dimension;
    }

    public double calculateArea() {
        return dimension * 2.5;
    }

    public String toString() {
        return "Area of figure = " + this.calculateArea();
    }

    public static void calculateDifAreas(Figure figure) {
        System.out.println(figure.calculateArea());
    }
}
