package kz.halykacademy;

public enum Operation {
    ADD{
        @Override
        double action(double x, double y) {
            return (x + y);
        }
    },
    SUBTRACT{
        @Override
        double action(double x, double y) {
            return (x - y);
        }
    },
    MULTIPLY{
        @Override
        double action(double x, double y) {
            return (x * y);
        }
    },
    DIVIDE{
        @Override
        double action(double x, double y) {
            return (x / y);
        }
    };

//    Operation() {
//
//    }

    abstract double action(double x, double y);
}
