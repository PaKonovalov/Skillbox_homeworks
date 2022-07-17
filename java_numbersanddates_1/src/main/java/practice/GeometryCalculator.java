package practice;

public class GeometryCalculator {

    // если значение radius меньше 0, метод должен вернуть -1
    public static double getCircleSquare(double radius) {
        if (radius < 0) {
            return -1;
        }
        radius = Math.PI * Math.pow(radius, 2);
        return radius;
    }

    // если значение radius меньше 0, метод должен вернуть -1
    public static double getSphereVolume(double radius) {
        if (radius < 0) {
            return -1;
        }
        double sphereVolume = ((double) 4/3) * Math.PI * Math.pow(radius, 3);
        return sphereVolume;
    }


    public static boolean isTrianglePossible(double a, double b, double c) {
        return (a > 0) & (b > 0) & (c > 0) &
                (a + b > c) & (a + c > b) & (c + b > a);
    }

    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTrianglePossible, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) {
        if (isTrianglePossible(a, b, c)) {
            double halfMeter = (double) (a + b + c) / 2;
            double triangleSquare = Math.sqrt(halfMeter * (halfMeter - a) * (halfMeter - b) * (halfMeter - c));
            return triangleSquare;
        } else {
            return -1;
        }
    }
}
