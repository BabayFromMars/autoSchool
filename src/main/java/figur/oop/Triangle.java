package figur.oop;

import java.util.Random;

public class Triangle extends Figure {
    private Double base;
    private Double height;

    public Triangle(String name, Double coordinateX, Double coordinateY, Double base, Double height) {
        super(name, coordinateX, coordinateY);
        this.base = base;
        this.height = height;
    }

    public static Triangle generateRandomeTriangle() {
        Random random = new Random();
        Double x = random.nextDouble() * 100;
        Double y = random.nextDouble() * 100;
        Double base = random.nextDouble() * 10 + 1;
        Double height = random.nextDouble() * 20 + 1;
        return new Triangle("Triangle", x, y, base, height);
    }

    public Double getAreaCalculation() {
        return (base * height / 2);
    }
}
