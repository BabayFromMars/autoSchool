package figur.oop;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Oop {
    public static void main(String[] args) {
        task1();
    }

    /*In a separate figure package you need to create a class structure and implement the necessary methods.
There must be a base abstract class and its descendants.
All functions must be implemented.
In the Main class with the main method main, the task must be implemented.

Class Description:
Create a class structure for circle, square and triangle. Each of them should have the following fields (private) and methods (public)
- name
- coordinates
- function to get coordinates
- area calculation function

Task
The following items should be implemented in the main function:
- creating an array of random shapes with the size of 10 elements.
- sort the shapes by area (ASC/DESC - it doesn't matter)
- output the sorted array on the console in the form : Name, S=area*/
    public static void task1() {
        Random random = new Random();
        Figure[] randomFigures = new Figure[10];
        System.out.println("Initial array:");
        for (int i = 0; i < 10; i++) {
            int type = random.nextInt(3);
            switch (type) {
                case 0:
                    randomFigures[i] = Circle.generateRandomeCircle();
                    break;
                case 1:
                    randomFigures[i] = Triangle.generateRandomeTriangle();
                    break;
                case 2:
                    randomFigures[i] = Square.generateRandomeSquare();
                    break;
            }
            System.out.println(randomFigures[i].toString());
        }
        System.out.println("\nArea of shapes in ASC order:");
        Arrays.sort(randomFigures, Comparator.comparingDouble(Figure::getAreaCalculation));
        for (int i = 0; i < 10; i++) {
            System.out.println(randomFigures[i].getName() + ", S = " + String.format("%.2f", randomFigures[i].getAreaCalculation()));
        }
    }
}
