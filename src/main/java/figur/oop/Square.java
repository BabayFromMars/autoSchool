package figur.oop;

import java.util.Random;

public class Square extends Figure {
    private final Double side;

    public Square(String name, Double coordinateX, Double coordinateY, Double side) {
        super(name, coordinateX, coordinateY);
        this.side = side;
    }

    public static Square generateRandomeSquare() {
        Random random = new Random();
        Double x = random.nextDouble() * 100;
        Double y = random.nextDouble() * 100;
        Double side = random.nextDouble() * 20 + 1;
        return new Square("Square", x, y, side);
    }

    public Double getAreaCalculation() {
        return side * side;
    }
}
