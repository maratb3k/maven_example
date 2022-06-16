package kz.halykacademy;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static void calculationOfArea (Figure figure, double x, double y) {
        Annotation areaAnnotation = figure.getClass().getAnnotation(ArithmeticAnnotation.class);
        ArithmeticAnnotation arithmeticAnnotation = (ArithmeticAnnotation) areaAnnotation;

        if(arithmeticAnnotation == null) {
            System.out.println(figure.calculateArea());
        }
        else {
            if (arithmeticAnnotation.isAreaCorrect() == true) {
                System.out.println(figure.calculateArea());
            }
            else {
                if(arithmeticAnnotation.getOperationForFigure() == Operation.ADD) {
                    System.out.println(Operation.ADD.action(x, y));
                }
                else if(arithmeticAnnotation.getOperationForFigure() == Operation.SUBTRACT) {
                    System.out.println(Operation.SUBTRACT.action(x, y));
                }
                else if(arithmeticAnnotation.getOperationForFigure() == Operation.MULTIPLY) {
                    System.out.println(Operation.MULTIPLY.action(x, y));
                }
                else {
                    System.out.println(Operation.DIVIDE.action(x, y));
                }
            }
        }
    }

    static void getAnnotationsOfClass(Method invokedMethod) {
        Class<?> type = invokedMethod.getDeclaringClass();
        while (type != null) {
            for (Annotation annotation : type.getDeclaredAnnotations()) {
                System.out.println("Annotations of class " + type + ": " + annotation.toString());
            }
            type = type.getSuperclass();
        }
    }

    public static void main(String[] args) throws Exception {
//        Rectangle rectangle = new Rectangle(2, 5);
//        Square square = new Square(4);
//        Parallelogram parallelogram = new Parallelogram(1, 5);
//
//        calculationOfArea(rectangle, rectangle.getDimension(), rectangle.getSecondDimension());
//        calculationOfArea(square, square.getDimension(), 4);
//        calculationOfArea(parallelogram, parallelogram.getDimension(), parallelogram.getHeight());


        Map<String, Figure> figureMap = new HashMap<>();
        figureMap.put("rec1", new Rectangle(5,2));
        figureMap.put("par1", new Parallelogram(4, 5));
        figureMap.put("square1", new Square(3));


        Scanner scanner = new Scanner(System.in);
        String className = scanner.nextLine();

        if (figureMap.containsKey(className)) {
            getAnnotationsOfClass(figureMap.get(className).getClass().getMethod("calculateArea"));
        }
        else {
            System.out.println("No object with name: " + className);
        }

    }
}
