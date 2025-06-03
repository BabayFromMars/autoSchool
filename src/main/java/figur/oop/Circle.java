package figur.oop;

import java.util.Random;

public class Circle extends Figure {
    private Double radius;

    public Circle(String name, Double coordinateX, Double coordinateY, Double radius) {
        super(name, coordinateX, coordinateY);
        this.radius = radius;
    }

    public static Circle generateRandomeCircle() {
        Random random = new Random();
        Double x = random.nextDouble() * 100;
        Double y = random.nextDouble() * 100;
        Double radius = random.nextDouble() * 20 + 1;
        return new Circle("Circle", x, y, radius);
    }

    public Double getAreaCalculation() {
        return Math.PI * radius * radius;
    }
}
