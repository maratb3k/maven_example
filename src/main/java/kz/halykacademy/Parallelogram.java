package kz.halykacademy;

public class Parallelogram extends Figure {

    private Double height;

    public Parallelogram(double dimension, double height) {
        super(dimension);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }


    public double calculateArea() {
        return super.getDimension() * height;
    }

}
